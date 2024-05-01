package javacore.Zgenerics.test;

class Animals {
    public void walk(){
        System.out.println("Animal walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animals animal = new Animals(){
            @Override
            public void walk() {
                System.out.println("Walking in the shadows|");
            }
        };
        animal.walk();
    }
}
