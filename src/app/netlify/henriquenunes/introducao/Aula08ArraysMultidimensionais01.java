package app.netlify.henriquenunes.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //1,2,3,4,5 meses
        // 31,28,31,30 dias

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 30;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);

            }

        }
        System.out.println("_-----------------");
        for (int[] arrayBase: dias) {
            for (int i: arrayBase){
                System.out.println(i);
            }
        }



    }
}
