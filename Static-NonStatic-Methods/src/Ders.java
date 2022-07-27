public class Ders {

    public String isim;
    public String kod;
    public double not;



    public Ders(String isim,String kod,double not){

        this.isim=isim;
        this.kod=kod;
        this.not=not;

    }
    public  void hesapla_ort2(int[] notlar){

        double toplam=0;

        for (int i:notlar
        ) {toplam+=i;


        }

        System.out.println("ders ortalamsı ="+(toplam/notlar.length));



    }







}
