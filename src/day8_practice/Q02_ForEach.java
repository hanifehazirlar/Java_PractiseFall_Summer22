package day8_practice;

public class Q02_ForEach {

    // String[] list = {"fruits", "vegetables", "meat", "milk"};
    // print array with for each loop
    // print length of each element

    // Part 2:
    // Print all the elements from array using for eachLoop
    // If an element starts with 'v' then quit the loop
    public static void main(String[] args) {
        String[] list = {"fruits", "vegetables", "meat", "milk"};
        String length="";
        for (String each:list) {
            System.out.print(each+" : "+each.length()+" ");

        }
        System.out.println();

        for (String each : list) {
            if(each.startsWith("v")){
                break;
            }
            System.out.print(each+" ");
        }
        /*
        2.yontem
         for (String each3:list) {
            if ((each3.charAt(0)!='v')){
                System.out.print(each3+" ");
            }else {
                break;
            }
         */
    }
}
