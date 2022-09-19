package Oop_polimorphism;

public class Runner {
    public static void main(String[] args) {
        Civciv civciv1=new Civciv();
        hayvanSesCikar(civciv1);


        Ordek ordek1=new Ordek();
        hayvanSesCikar(ordek1);
        //methodu olustururken icine yazdiklarimiz parametre,method calistirirken icine yazdigimiz deger arguman
    }
    public static void hayvanSesCikar(Animal animal){
        animal.sesiCikar();

    }
    public static void hayvanHareketEt(Animal animal){
        animal.hareketEt();
    }

}
