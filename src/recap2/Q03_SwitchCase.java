package recap2;

public class Q03_SwitchCase {
    // Girilen uc haneli bir sayının okunusunu yazı ile yazdırınız.
    public static void main(String[] args) {
        int sayi = 983;
        int birlerB = sayi % 10; // 3
        int onlarB = (sayi / 10) % 10; // 52'nin 10'a bolumunden kalan 2
        int yüzlerB = sayi / 100; // 5
        if (99 < sayi && sayi < 1000) {
            switch (yüzlerB) {
                case 1: System.out.print("yuz\t"); break;
                case 2: System.out.print("ikiyuz\t"); break;
                case 3: System.out.print("ucyuz\t"); break;
                case 4: System.out.print("dortyuz\t"); break;
                case 5: System.out.print("besyuz\t"); break;
                case 6: System.out.print("altiyuz\t"); break;
                case 7: System.out.print("yediyuz\t"); break;
                case 8: System.out.print("sekizyuz\t"); break;
                case 9: System.out.print("dokuzyuz\t"); break;
            }
            switch (onlarB) {
                case 0: System.out.print (""); break;
                case 1: System.out.print("on\t"); break;
                case 2: System.out.print("yirmi\t"); break;
                case 3: System.out.print("otuz\t"); break;
                case 4: System.out.print("kirk\t"); break;
                case 5: System.out.print("elli\t"); break;
                case 6: System.out.print("altmis\t"); break;
                case 7: System.out.print("yetmis\t"); break;
                case 8: System.out.print("seksen\t"); break;
                case 9: System.out.print("doksan\t"); break;
            }
            switch (birlerB) {
                case 0: System.out.print(""); break;
                case 1: System.out.print("bir"); break;
                case 2: System.out.print("iki"); break;
                case 3: System.out.print("uc"); break;
                case 4: System.out.print("dort"); break;
                case 5: System.out.print("bes"); break;
                case 6: System.out.print("alti"); break;
                case 7: System.out.print("yedi"); break;
                case 8: System.out.print("sekiz"); break;
                case 9: System.out.print("dokuz"); break;
        }
        }else{System.out.println("Gecerli bir sayi giriniz");
        }
    }
}
