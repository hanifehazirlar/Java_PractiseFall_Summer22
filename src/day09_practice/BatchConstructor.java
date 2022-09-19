package day09_practice;

public class BatchConstructor {
    public static void main(String[] args) {
        Batch batch=new Batch();

        System.out.println("batch = " + batch.str1);// batch = Batch 81 82 83 Constructor i anladi

        batch.batch(); // str1 = Batch 81 82 83 Constructor i anladi
        // batch sınıfından batch() methodunu call ediyor.
    }
}
