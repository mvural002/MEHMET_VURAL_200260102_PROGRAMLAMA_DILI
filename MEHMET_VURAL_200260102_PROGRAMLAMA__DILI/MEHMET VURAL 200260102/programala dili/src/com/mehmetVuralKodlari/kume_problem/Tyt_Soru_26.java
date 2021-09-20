package com.mehmetVuralKodlari.kume_problem;

public class Tyt_Soru_26 {
    public static void main(String[] args) {
        int acilia =25;
        int nar=8;
        int mandalina=7;
        int portakal=9;
        // kumeleri isit old.
        String narKume=25-nar +"-x";
        String mandlianKume=25-mandalina +"-x";
        String portacalKume=25-portakal +"-x";
        // bulundg denklem
        System.out.println(narKume +" + "+mandlianKume+"+"+portacalKume+"+ x=25");
        int sonuc=(25-((25-nar)+(25-portakal)+(25-mandalina)))/-2;
        System.out.println("Cevabi: "+sonuc);
    }
}
