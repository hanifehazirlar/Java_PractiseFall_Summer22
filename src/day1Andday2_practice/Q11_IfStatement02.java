package day1Andday2_practice;

public class Q11_IfStatement02 {
    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
    public static void main(String[] args) {
        int input=70;
        if (input<0||input>100){
            System.out.println("Lutfen 0 ile 100 arasi bir not giriniz");
        }else if (input<60){
            System.out.println("F");
        }else if (input<70){
            System.out.println("D");
        }else if (input<80){
            System.out.println("C");
        }else if (input<90){
            System.out.println("B");
        }else{
            System.out.println("A");
        }


    }
}
