package javacore.Oexception.test.runtime;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1, 0);

        System.out.println("Código finalizado");
    }
    private static int divisao(int a, int b){

        try{

        }catch (ArithmeticException e){

        }
        return a/b;
    }
}
