package day8_practice;

import java.util.Scanner;

public class Q04_HackerLanguage {

    // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String str = scan.nextLine().toLowerCase();
        str = str.replace("s", "5");
        str = str.replace("a", "4");
        str = str.replace("e", "3");
        str = str.replace("i", "1");
        str = str.replace("o", "0");
        System.out.println(str);

        //2.yontem
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("s")) {
                arr[i] = "5";
            }
            if (arr[i].equals("a")) {
                arr[i] = "4";
            }
            if (arr[i].equals("e")) {
                arr[i] = "3";
            }
            if (arr[i].equals("i")) {
                arr[i] = "1";
            }
            if (arr[i].equals("o")) {
                arr[i] = "0";
            }
            System.out.print(arr[i]);
        }

    }
}
