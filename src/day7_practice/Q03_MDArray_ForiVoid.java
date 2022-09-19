package day7_practice;

public class Q03_MDArray_ForiVoid {

    /*
     * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
     * yaziniz
     * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
     *
     * OUTPUT : Arraydeki cift sayilarin toplami : 30
     */
    public static void main(String[] args) {
        int[][] input = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};
        ciftSayilarToplam(input);
    }


   public static void ciftSayilarToplam(int [][] input) {

        int ciftToplam=0;
       for (int i = 0; i <input.length; i++) {
           for (int j = 0; j <input[i].length; j++) {
               if (input[i][j]%2==0){
                   ciftToplam+=input[i][j];
               }
           }
       }
       System.out.println("Arraydeki cift sayilarin toplami : " + ciftToplam);
    }

}
