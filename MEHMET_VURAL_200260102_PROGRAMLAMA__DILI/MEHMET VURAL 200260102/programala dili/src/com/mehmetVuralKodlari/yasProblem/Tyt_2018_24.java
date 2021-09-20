package com.mehmetVuralKodlari.yasProblem;

import java.util.Scanner;

public class Tyt_2018_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double gramYasi;
        System.out.println("MISIRININ KURUTULDUGU AGIRLIGI ORANI GIRIN: SORUDAN %20");
        int x=input.nextInt();
        System.out.println("MISIRININ PATALADIGNDA  AGIRLIGI ORANI GIRIN: SORUDAN %10");
        int y=input.nextInt();
        System.out.println("Girdigni oranlara uygun yas misir Satin almak grami ne kadar: sorudan 720");
        int z=input.nextInt();



        // gram yas bulmak
        double m=Math.round( (((100-x)/100.00) * ((100-y)/100.00)) *100.00)/100.00;
        System.out.println(m);
        gramYasi=z/ m;
        System.out.println("GRAM YASI: " +gramYasi);


        // hatadan kaynaklandigin oranlari
        System.out.println("Kurutuldugunda hata: sorundan %20");
        int hataX= input.nextInt();
        System.out.println("patlandignda hata: sorundan %30");
        int hataY= input.nextInt();
        double sonuc=gramYasi*Math.round(( (100-hataY)/100.00*(100-(hataY-hataX))/100.00 )*100.00)/100.00;


        System.out.println("CEVABI\nGram patlanmis misir = "+ (int)sonuc);


    }
}
