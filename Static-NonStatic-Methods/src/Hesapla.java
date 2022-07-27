public class Hesapla {


    public static void hesapla_ort1(int[] notlar){
        
        double toplam=0;

        for (int i:notlar
             ) {toplam+=i;

            
        }

        System.out.println("ders ortalamsı ="+(toplam/notlar.length));


        
    }


}
