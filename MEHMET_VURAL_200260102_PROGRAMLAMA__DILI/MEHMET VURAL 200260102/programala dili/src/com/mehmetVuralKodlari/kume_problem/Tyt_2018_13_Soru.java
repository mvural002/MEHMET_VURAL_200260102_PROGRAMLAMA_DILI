package com.mehmetVuralKodlari.kume_problem;

public class Tyt_2018_13_Soru {
    public static void main(String[] args) {
        String K[]={"AÇELYA", "AHMET", "AYSUN", "BEREN", "KENAN" ,"NERMİN"};
        //bes harfli, A harfi ile baslayan ama N ile bitmeyen metodundan gelen rekam
        int x=besHarfli_AharfIleBaslayan_N_ile_Bitmeyen(K);

        //bes harfli, A harfi ile baslamayan ama N ile biten metodundan gelen rekam
        int y=besHarfli_AharfIleBaslamayan_N_ile_Biten(K);
        int toplam=x+y;
        System.out.println("TOPLAM=: "+toplam);
    }

    //bes harfli, A harfi ile baslayan ama N ile bitmeyen metodu
    public  static int besHarfli_AharfIleBaslayan_N_ile_Bitmeyen(String K[]){
        int kactane=0;
        for(int i=0; i<K.length; i++){

            //bes harfi
            if(K[i].length()==5){
                //A baslayan N bitmeyen
                if(K[i].charAt(0)=='A'&& K[i].charAt(K[i].length()-1)!='N'){
                    kactane=kactane+1;

                }
            }
        }
        return kactane;
    }

    //bes harfli, A harfi ile baslamayan ama N ile biten metodu
    public  static int besHarfli_AharfIleBaslamayan_N_ile_Biten(String K[]){
        int kactane=0;
        for(int i=0; i<K.length; i++){
            //bes harfi
            if(K[i].length()==5){

                //A baslamayan N biten
                if(K[i].charAt(0)!='A'&& K[i].charAt(K[i].length()-1)=='N'){
                    kactane=kactane+1;

                }
            }
        }
        return kactane;
    }
}
