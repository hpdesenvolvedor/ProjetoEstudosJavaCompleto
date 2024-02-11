package app.netlify.henriquenunes;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando Switch e Dados os valores de 1 a 7, imprima se é dia de semana ou final de semana
        // Considerando 1 como domingo

        byte dia = 7;

        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");


        }

    }
}
