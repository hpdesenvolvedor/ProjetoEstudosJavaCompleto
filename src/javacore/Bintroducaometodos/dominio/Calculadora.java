package javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(20 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        return num1/num2;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+num1);
        System.out.println("NUm2 "+num2);
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros ) {
         soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num: numeros ) {
            soma += num;
        }
        System.out.println(soma);
    }
}

