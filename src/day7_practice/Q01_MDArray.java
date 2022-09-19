package day7_practice;

public class Q01_MDArray {

    /*
     * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
     *  2D arrayinden min number print et
     */
    public static void main(String[] args) {
        int [][] sayilar={{1,2,3}, {2,3,1} , {5,5,5} , {2,1,-1}};

        int min=sayilar[0][0];


        for (int i = 0; i <sayilar.length; i++) { // outer for (dıs for)
            System.out.println("sayilar["+i +"].lenght i : "+sayilar[i].length);
            for (int j = 0; j <sayilar[i].length; j++) { // inner for

                if (sayilar[i][j]<min){
                   min=sayilar[i][j];

                }
            }
        }
        System.out.println("min = " + min);

    }
}
