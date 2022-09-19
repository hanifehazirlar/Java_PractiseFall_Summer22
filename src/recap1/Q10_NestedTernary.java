package recap1;

public class Q10_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */
    public static void main(String[] args) {
        String finalNotu="F";
        finalNotu=finalNotu.toUpperCase();
        System.out.println(finalNotu.equals("A") ?"Gayet Basarili":
                           finalNotu.equals("B") ? "Basarili": finalNotu.equals("C") ? "Ha Gayret":"gecerli bir not giriniz");


    }

}
