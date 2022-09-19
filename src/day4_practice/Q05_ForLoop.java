package day4_practice;

public class Q05_ForLoop {

    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
    public static void main(String[] args) {

        for (int i = 0; i <= 255; i++) {
            char ascii = (char) i;
            System.out.println(ascii + " = " + i);

        }
        int bas = 0;
        while (bas <= 255) {
            char ascii = (char) bas;
            System.out.println(ascii + " = " + bas);
            bas++;
        }


            int i = 0;
            do {
                char ascii = (char) i;
                System.out.println(ascii + " = " + i);
                i++;

            } while (i <= 255);
        }
    }


