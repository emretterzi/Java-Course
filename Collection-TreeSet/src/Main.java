import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Integer>numbers=new TreeSet<>();

        //Treesetler küçükten büyüğe doğru siralayıp yazdırıyor
        //daha doğrusu sıralanabilir  unik yapıları,  kümeleri yazdırıyor

        numbers.add(10);
        numbers.add(-10);
        numbers.add(100);
        numbers.add(35);
        numbers.add(25);
        numbers.add(10);

        //2. kez 10 sayısını yazdırmıcak

        for (Integer a:numbers
             ) {
            System.out.print(" "+a);
        }


    }
}