package javacore.Oexception.test.runtime;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");

        } catch (Exception e) {
            System.out.println("Fechando recurso liberado pelo sistema operacional");
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo sistema operacional");
        }

    }

    private static void extracted2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");

        } catch (Exception e) {
            System.out.println("Fechando recurso liberado pelo sistema operacional");
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo sistema operacional");
        }
    }
}
