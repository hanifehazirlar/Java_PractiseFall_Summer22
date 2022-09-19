package day14_practice;

public class C04 {
    /*  4.SORU :
      En Varlıklı Müşteriyi Bulma :
      m x n boyutlarında integer bir dizi verilecek, accounts[i][j] değeri bize i.müşterinin j bankasındaki
      parasının miktarını tutacak, Böyle bir yapıda oluşan dizideki en zengin müşterinin hesaplarındaki para miktarını
      döndüren maximumWealth isminde bir metod yazınız.
      Input   : {{1,2,4},{3,2,1}}
      Output  : 7
    */
    public static void main(String[] args) {
        int accounts[][] = {{1, 2, 4}, {3, 2, 1}};
        maximumWealth(accounts);
    }
    private static void maximumWealth(int[][] accounts) {
        int enZengin=0;
        int toplam=0;
        for (int i = 0; i < accounts.length; i++) {
            toplam=0;
            for (int j = 0; j < accounts[i].length; j++) {
                toplam += accounts[i][j];
                if (toplam > enZengin) {
                    enZengin = toplam;
                }
            }
        }
        System.out.println(enZengin);
    }
}
