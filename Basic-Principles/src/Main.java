public class Main {
    public static void main(String[] args){



        Book book1=new Book("Lord of rings",-100);
        book1.numberControl(book1.getPageNumber());//en baştaki kontrol

        //System.out.println(book1);//sayfa sayısını -100 girdiğimizde sayfa değiştir metotdu çağırıcak



        System.out.println("sayfa sayısını test etme= "+ book1.getPageNumber());



    }





}