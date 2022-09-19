package day09_practice.restourant;

public class Mutfak {
  public String yemekler="adanakebab, urfaciger, kusbasi, kusleme";
  public String arasicak="yaylacorba, mercimek, duguncorba,corba";
  public String tatlilar="baklava, sutlac, gullac, kazandibi, kunefe";
  public String icecekler="ayran, salgam, kola";

  public Mutfak(String yemekler, String corba, String tatlilar, String icecekler) {
  this.yemekler=yemekler;
  this.arasicak=corba;
  this.tatlilar=tatlilar;
  this.icecekler=icecekler;
  }

  public Mutfak() {
    this("urfaciger","yaylacorba","baklava","ayran");

  }


  @Override
  public String toString() {
    return "Mutfak{" +
            "\nyemekler='" + yemekler + '\'' +
            ", \narasicak='" + arasicak + '\'' +
            ", \ntatlilar='" + tatlilar + '\'' +
            ", \nicecekler='" + icecekler + '\'' +
            '}';
  }
}
