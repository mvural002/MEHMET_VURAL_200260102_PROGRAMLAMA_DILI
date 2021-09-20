package com.mehmetVuralKodlari.yasProblem;

import java.util.Scanner;

public class Tyt_2018_19_Soru {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("kac tane arkadasi: sorudan  3 kisi: ");
        int arkadasSayisi=input.nextInt();

        System.out.println("Tanistiklari zamanki yas ortalamasi: sorudan 20 girin: ");
        int tanistikortamayas=input.nextInt();
        int tanistikZamanToplamYasi=tanistikortamayas*arkadasSayisi;


     //  x yil sonra yaslari toplam
        System.out.print( " X yil sonra yaslari toplam= ");
        String xyilsonra=tanistikZamanToplamYasi+ "+"+arkadasSayisi+"x";
        System.out.println(xyilsonra);

//        cocuklar birer cocuguyla birlikte bir araya gelmis ve bu alti kisi oluyor
        System.out.println("\nCocuklarin birer arkadarin Toplam kisinin yas ortlamasi : sorudan 20 girin: ");
        int toplamcocukYasOrtalamsi=input.nextInt();

        System.out.println(" uc kisin yaslari: sorudan 28, 30 , 32 girin");
        int x=input.nextInt();
        int y=input.nextInt();
        int z=input.nextInt();
        int tanistikzmanCocuklarinYasi=tanistikZamanToplamYasi-(x+y+z);


//       x yil sonra toplam cocuklarin yaslari
        System.out.print("\nx yil sonra toplam cocuklarin yaslari = ");
        String xYilSonraCocuklarinYasi=tanistikzmanCocuklarinYasi+ "+"+arkadasSayisi+"x";
        System.out.println(xYilSonraCocuklarinYasi);

//      bu denklem bulunmus
        System.out.print("x bulun bu denklemden: ");
        String YENi="( "+xyilsonra+" + "+xYilSonraCocuklarinYasi +" ) / "+(arkadasSayisi*2)+" ) = "+toplamcocukYasOrtalamsi;
        System.out.println(YENi);

//      denklemin cozumu
        int sonuc=((arkadasSayisi*2*toplamcocukYasOrtalamsi)-(tanistikZamanToplamYasi+tanistikzmanCocuklarinYasi) )/(arkadasSayisi*2);
        System.out.println("ARKADAS TANISTIKTAN SONRA KAC YIL SONRA  BIR ARAYA GELMSTIR :   "+sonuc+" YIL ");



    }
}
