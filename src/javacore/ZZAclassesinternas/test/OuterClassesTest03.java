package javacore.ZZAclassesinternas.test;



public class OuterClassesTest03 {
    private String name = "Henrique";
    static class Nested{
        private String lastanme = "Nunes";
       void print(){
           System.out.println(new OuterClassesTest03().name+ " " + lastanme);
       }

    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
