package javacore.Zgenerics.test;



public class OuterClassesTest01 {
    private String name = "Henrique";
    static class Nested{
        private String lastanme = "Nunes";
       void print(){
           System.out.println(new OuterClassesTest01().name+ " " + lastanme);
       }

    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
