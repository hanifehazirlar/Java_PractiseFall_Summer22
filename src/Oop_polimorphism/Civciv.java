package Oop_polimorphism;

public class Civciv implements Animal{
    @Override
    public void sesiCikar() {
        System.out.println("Cik cik diye ses cikardi");

    }

    @Override
    public void hareketEt() {
        System.out.println("Civ civ yurudu");
    }
}
