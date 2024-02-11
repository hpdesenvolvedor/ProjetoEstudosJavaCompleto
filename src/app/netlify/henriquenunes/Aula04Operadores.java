package app.netlify.henriquenunes;

public class Aula04Operadores {
    public static void main(String[]arg) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 - numero02;
        System.out.println(resultado);

        // % Operador de resto
        int resto = 20 % 2;
        System.out.println(resto);

        // <>,><, <=, >=, ==, != Operadores Lógicos (valores booleanos)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezDiferenteVinte " + isDezDiferenteVinte);


        // && (AND), ||(or), !(not) - Operadores Lógicos
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        boolean isDentroDaLeiOuMenorQueTrinta = idade < 30 || salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiOuMenorQueTrinta);

        // =, +=, -=, *=, /=, %= Operadores de atribuição
        double bonus = 1800; //1800
        bonus += 1000;       //2800
        bonus -= 1000;       //1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ , --
        int contador = 0;
        contador += 1;  // contador = contador + 1;
        contador++;
        contador--;
        System.out.println(contador);



    }
}
