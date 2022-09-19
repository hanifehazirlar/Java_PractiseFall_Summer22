package day1Andday2_practice;

public class Q13_Ternary {
    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */
    public static void main(String[] args) {
        double fiyat=60;
        if (fiyat<0){
            System.out.println("Lutfen gecerli bir fiyat giriniz");
        }else if (fiyat<10){
            System.out.println("ucuz");
        }else if (fiyat<20){
            System.out.println("normal");
        }else{
            System.out.println("pahali");
        }

        String result=(fiyat<0)?"Lutfen gecerli bir fiyat giriniz":(fiyat<10)?"ucuz":(fiyat<20)?"normal":"pahali";
        System.out.println(result);

    }

}
