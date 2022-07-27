public class Main {
    public static void main(String[] args) {

        Player player1=new Player("emre",22);

        System.out.println(Player.count);//Static kullnıldığı için Playerdan count ı çağırabildik.//
       // System.out.println(Player.id);//id tek başına nesne kullanılmadan oluşturulduğu için,
        // non Static olduğu için Player classı üzerinden çağıralamad oysaki ıd yi 10 diye belirtmiştik.//

        System.out.println(player1.id);//id 22 yazdırdı






        //Static erişim belirlemede nesne üzerinden değil direk class üzerinden çağırılma oluyor//


    }
}