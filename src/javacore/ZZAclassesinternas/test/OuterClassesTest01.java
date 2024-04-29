package javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Power Rangers";
    //Nested

    class Inner{
        public void printOutClassAttribute(){
            System.out.println(name);
            System.out.println(OuterClassesTest01.this);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.printOutClassAttribute();
        inner2.printOutClassAttribute();


        inner.printOutClassAttribute();
    }
}
