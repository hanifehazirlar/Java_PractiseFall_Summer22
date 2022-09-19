package day8_practice;

public class Q09_SurviveMonkey {
    /*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		Adada yalnız bir maymun var Her gün 4 muz yemesi gerekiyor o adada sadece 165 muz var
		Aşağıdaki değişkenleri oluşturun ve maymunun kaç gün hayatta kalabileceğini bulun.
		Do while döngüsü, artırma ve eksiltme ve if deyimleri
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/
    public static void main(String[] args) {
        int numberOfBananas =165;
        int survivalDays = 1;
        int gunlukMuzIhtiyaci=4;
        int kalanMuzSayisi=numberOfBananas;
        boolean monkeyAlive = true;
        do {
            kalanMuzSayisi=kalanMuzSayisi-gunlukMuzIhtiyaci;
            if (kalanMuzSayisi >=4){
                survivalDays++;
            }else{
                monkeyAlive=false;
            }

        }while(monkeyAlive);
        System.out.println("Bir maymun "+numberOfBananas+" muz ile "+survivalDays+" gun hayatta kalabilir");

    }


}
