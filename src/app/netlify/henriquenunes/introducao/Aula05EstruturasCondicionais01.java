package app.netlify.henriquenunes.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        //IF
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

         if(isAutorizadoComprarBebida){
             System.out.println("Autorizado a comprar bebida alcoólica!");
         }
         if (!isAutorizadoComprarBebida) {
             System.out.println("NÃO autorizado comprar bebida alcoólica");
         }
    }
}
