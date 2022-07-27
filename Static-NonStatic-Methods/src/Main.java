public class Main {
    public static void main(String[] args) {







        int []notlar={100,200,300,400};


        //Ders.hesapla_ort2(notlar);  //Ders classından nesne oluşturmamız gerekli çünkü hesapla_ort2 de static deyimi kullanılmadı
        //ve bu yüzden Ders clasının içinden direkt çağıralamadı


        Hesapla.hesapla_ort1(notlar);//hesapla_ort adlı fonksiyon için Hesapla classından nesne oluşturmamıza gerek kalmadı
        //direkt olarak hesapla_ort yi çağırdık

















    }
}