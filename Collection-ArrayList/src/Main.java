import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<>();
       // arrayList.add("emre");// indeks beliremediğimiz için
       // arrayList.add("sila");
        //arrayList.add("aysu");
        //arrayList.add(4,"nilay");//4.indekse nilayı atadı
        // arrayList.remove(5);

     



       





      //  System.out.println(arrayList.get(1)); //1. indeksteki ismi getirir


        Scanner scanner1=new Scanner(System.in);
        System.out.println("lütfen girilcek isim sayısını giriiniz");
        int isimSayisi=scanner1.nextInt();


        for (int i=0;i<=isimSayisi;i++){

            arrayList.add(scanner1.nextLine());

        }

        System.out.println("arraylistemiz aşağıdaki gibidir");
        for (String a:arrayList
             ) {

            System.out.println(a);

        }

        System.out.println(arrayList);


        System.out.println(arrayList.get(4));





    }
}