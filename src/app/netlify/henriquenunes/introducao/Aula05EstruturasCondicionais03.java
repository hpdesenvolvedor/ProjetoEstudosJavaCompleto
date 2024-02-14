package app.netlify.henriquenunes.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
//OPERADOR TERNÁRIO
// (condicao) ? verdadeiro : falso

        //Doar salario > 5000;

        double salario = 5000;

        String mensagemDoar = "Eu vou doar 500 reais";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

// (condicao) ? verdadeiro : falso


        System.out.println(resultado);
    }
}
