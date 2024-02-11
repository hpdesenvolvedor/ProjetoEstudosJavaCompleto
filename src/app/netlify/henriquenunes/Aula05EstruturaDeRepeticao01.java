package app.netlify.henriquenunes;

public class Aula05EstruturaDeRepeticao01 {
    public static void main(String[] args) {

        int count = 12;
        while (count < 10){
            System.out.println(++count);
        }
        do {
            System.out.println("Dentro do do-while");

        }while (count < 10);

        for (int i = 0; i <= 10; i++){
            System.out.println("For " +i);
        }
    }
}
