package com.company;

public class Main {

    public static void main(String[] args) {
        Sayisal ogrenci1=new Sayisal(21,25,41,20);
        Sayisal ogrenci2=new Sayisal(23,24,59,35);
        Sayisal birinci=birinci(ogrenci1,ogrenci2);
        System.out.println();
        System.out.println("birinci sayisal öğrencinin puanı= "+birinci.puaanhesapla() );
        Esitagırlık ogrenci3=new Esitagırlık(25,25,32,4);
        Esitagırlık ogrenci4=new Esitagırlık(20,30,20,10);

       Esitagırlık birinci2=birinci(ogrenci3,ogrenci4);


        System.out.println("birinci sayisal öğrencinin puanı= "+birinci2.puaanhesapla() );


        Character[] char_dizi={'A','B','C','D'};
        Integer[] integr_dizi={1,2,3,4,5,6};


        String[] string_dizi={"aysu","emre","neriman"};


        yazdir(char_dizi);
        yazdir(integr_dizi);
        yazdir(string_dizi);




    }
    public static <E extends Aday> E birinci(E e1,E e2){
        if(e1.puaanhesapla()>e2.puaanhesapla()){
            return e1;

        }
        else{
            return e2;
        }





    }

    public static <E> void yazdir(E[] dizi){

        for (E e:dizi
             ) {
            System.out.println(e);

        }



    }


}
