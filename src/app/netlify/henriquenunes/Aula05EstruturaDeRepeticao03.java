package app.netlify.henriquenunes;

public class Aula05EstruturaDeRepeticao03 {
    public static void main(String[] args) {
        // Imprima os primeiros 25 números  de um dado valor. Por exemplo, 50.

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);

        }
    }
}
