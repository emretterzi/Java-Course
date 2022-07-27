import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<String>hashSets= new HashSet<>();
        hashSets.add("emre");
        hashSets.add("sıla");
       // hashSets.remove("emre");  //  kaldırma işlemi
        //hashSets.add("emre");//emreyi ikinci kez eklememiz bir şey fark ettirmiyor kümeler unik yapıda


        System.out.println(hashSets.contains("emre"));//  "emre"   var mı yok muyu döndürüyor

        System.out.println("for each ile yazdırma  ");
        for (String a:hashSets
             ) {
            System.out.println(a);

        }

        System.out.println("iterator ile gezinerek yazdırma");

        Iterator<String>itr=hashSets.iterator();
        while(itr.hasNext()){

            System.out.println(itr.next());
        }
        //bir sonrasi olana kadar geziciyi yazdır
        // itr gezicimiz


    }
}