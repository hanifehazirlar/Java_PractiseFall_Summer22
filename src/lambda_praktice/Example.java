package lambda_praktice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
      ArrayList<String> names=new ArrayList<>(Arrays.asList("Tulay", "zekeriya", "hasan", "ismail", "osman", "fatih","Ersin","Mevlit"));
      List<Integer> numbers=new ArrayList<>(Arrays.asList(25,65,-56,55,98,-89,65,55,21,54,9,35,35,34));
      List<String> menu = new ArrayList<>(Arrays.asList("kusleme", "adana", "trilice", "havucdilim", "buryan",
                "kokorec", "kuzutandir", "guvec"));

        //icinde 'a' harfi bulunanlari silen bir code create ediniz.
        //     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
        //     * OUTPUT : [Veli,Omer]
        ArrayList<String> names1 = new ArrayList<String>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        System.out.println(names1.stream().map(t -> t.toLowerCase()).
                           filter(t -> !t.contains("a")).collect(Collectors.toList()));//[veli, omer]
        //2.yol
        names1.removeIf(t->t.contains("a")||t.contains("A"));
        System.out.println(names);//[Veli, Omer]

        //numbers in en buyyk elemani bulun
      System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).findFirst().get());//98
      System.out.println(numbers.stream().reduce(Math::max));//Optional[98]
      System.out.println(numbers.stream().reduce(Math::max).get());//98

    }
}
