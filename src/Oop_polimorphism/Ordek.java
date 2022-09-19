package Oop_polimorphism;

public class Ordek implements Animal {

    @Override
    public void sesiCikar() {
        System.out.println("Vak vak diye ses cikardi");

    }

    @Override
    public void hareketEt() {
        System.out.println("Ordek paytak yurudu");
    }
}
