package javacore.ZZGconcorrencia.test;

import javacore.ZZGconcorrencia.service.StoreService;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPricesSync(storeService);
    }

    private static void searchPricesSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d%n", (end-start));
    }
    private static void searchPricesAsyncFuture(StoreService storeService){
        long start = System.currentTimeMillis();
        storeService.getPriceSync("Store 1");
        storeService.getPriceSync("Store 2");
        storeService.getPriceSync("Store 3");
        storeService.getPriceSync("Store 4");
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPriceSync %d%n", (end-start));
    }
}
