package lambda_praktice;

public class Methodlarim {//seed(tohum) methodlar create edildi

    public static boolean ciftElemaniBul(int x) {
        return x % 2 == 0;
    }

    public static boolean tekElemanlariBul(int x) {
        return x % 2 != 0;
    }

    public static int karesiniBul(int x) {
        return x * x;
    }

    public static void ayniSatirdaBosluklaYazdir(Object obj) {

        System.out.print(obj + " ");
    }
    public static void farkliSatirdaYazdir(Object obj) {

        System.out.println(obj + " ");
    }

}
