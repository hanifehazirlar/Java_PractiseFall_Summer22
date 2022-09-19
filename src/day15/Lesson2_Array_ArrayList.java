package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson2_Array_ArrayList {
    public static void main(String[] args) {
        String[] pazarSepeti=new String[5];
        String[] pazarSepeti2={"elma","patates","kivi","karpuz","muz"};
        String[] pazarSepeti3;
        //pazarSepeti3[0]="elma"; bu sekilde olusturamiyoruz, ya uzunluk bildirerek olusturmali ya da elemanlarini yazarak
        //olusturmaliyiz.
        pazarSepeti3=new String[6]; //bu sekilde yapabiliriz sonradan uzunluk atayabiliyoruz ama elemani sonradan atayamiyoruz

        List<String> listPazarSepeti=new ArrayList<>();//List interface oldugu icin List`in ilk concreate child class`i
                                                       // ArrayList`tir bu yuzden ArrayList`ten obje olusturarak List
                                                       // ozelliklerini(abstract methodlari) override eder.
        listPazarSepeti.add("elma");
        listPazarSepeti.add("patates");
        listPazarSepeti.remove("patates");

        List<String> listPazarSepeti2 = Arrays.asList(pazarSepeti2); //pazarSepeti2 array`ini Arrays class`indan asList
                                                                    //methodu ile ListPazarSepeti2 objesine atadik
        System.out.println(listPazarSepeti2.size());//5
       // listPazarSepeti2.add(0,"cikolata");//0.index` e cikolata ekler.0.index`te eleman varsa RTE verir
        listPazarSepeti2.set(0,"pasta"); //o.index`deki degeri pasta ile update eder.0.index`te eleman yoksa run time exception verir
        System.out.println(listPazarSepeti2.get(0));//Pasta //0.index` de deger varsa onu dondurur yoksa RTE verir

        if(listPazarSepeti2.contains("ketcap")) listPazarSepeti2.add("ketcap");

    }
}
