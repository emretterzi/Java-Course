public class Main {
    public static void main(String[] args) {

        Worker worker1=new Engineer("emre",1000,"chef engineer");//kullanımı hatalı
        Engineer engineer1=new Engineer("emre",10000,"chef engineer");//kullanımı doğru


        System.out.println("engineer test ="+engineer1.title);
        //System.out.println("engineer test ="+worker1.title);// title a erişim sağlayamıyorsun aslında worker1
        //bir engineer değil sadece engiinerın özelliklerni almış bir worker

sca







    }
}