package day09_practice.restourant;

public class Musteri {
    public static void main(String[] args) {
        Mutfak menu = new Mutfak();
        System.out.println("menu.toString() = " + menu.toString());
        /*
        menu.toString() = Mutfak{
                          yemekler='urfaciger',
                          arasicak='yaylacorba',
                          tatlilar='baklava',
                          icecekler='ayran'}
         */
        Mutfak siparisim= new Mutfak("adanakebab","mercimek","kunefe","salgam");
        System.out.println("siparisim = "+siparisim);
        /*
        siparisim = Mutfak{
                    yemekler='adanakebab',
                    arasicak='mercimek',
                    tatlilar='kunefe',
                    icecekler='salgam'}
         */
    }
}
