package javacore.ZZGconcorrencia.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite {
    private final Map<String, String> map = new LinkedHashMap<>();
    private final ReentrantReadWriteLock rwl;

    public MapReadWrite(ReentrantReadWriteLock rwl) {
        this.rwl = rwl;
    }
    public void put(String vey, String value, String key){
        rwl.writeLock().lock();
        try {
            if(rwl.isWriteLocked()){
                System.out.printf("%s obteve o WRITE lock", Thread.currentThread().getName());
            }
            map.put(key, value);
            Thread.sleep(500);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rwl.writeLock().unlock();
        }
    }
    public Set<String> allKeys(){
        rwl.readLock().lock();
        try {
            return map.keySet();
        }finally {
            rwl.readLock().unlock();
        }
    }
}
public class ReentrantReadWriteLockTest01 {
    public static void main(String[] args) {
        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        MapReadWrite mapReadWrite = new MapReadWrite(rwl);

        Runnable write = () -> {
            for (int i = 0; i < 20; i++) {
                String key = null;
                mapReadWrite.put(String.valueOf(i), String.valueOf(i), key);
            }
        };

        Runnable reader = () -> {
            if (rwl.isWriteLocked()){
                System.out.printf("Write Locked");
            }
            rwl.readLock().lock();
            System.out.printf("Finally I got The Damn Lock");
            try {
                System.out.printf(Thread.currentThread().getName() + " " + mapReadWrite.allKeys());
            }finally {
                rwl.readLock().unlock();
            }
        };
        Thread t1 = new Thread(write);
        Thread t2 = new Thread(reader);
        Thread t3 = new Thread(reader);
        t1.start();
        t2.start();
        t3.start();
    }
}
