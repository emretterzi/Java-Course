package com.company;

import java.util.Scanner;

public class ATM

{
   public void calis(Account account) {


Login login1=new Login();
      Scanner scanner=new Scanner(System.in);
      System.out.println("Bankamıza hoşgeldiniz");
      System.out.println("------------------------");
      System.out.println("Kullanıcı girişi");


      int girishakki=3;

      while (true){
         if (login1.login(account)){
            System.out.println("kullanıcı girişi basarili");
break;


         }
else
         {
            System.out.println("giris basarisiz");
            girishakki-=1;
            System.out.println("kalan giris hakkı"+girishakki);
         }
if (girishakki==0){


   System.out.println("giris hakkınız bitti ");
   return;
}






      }

      System.out.println("-------------------");
      String islemler="1. bakiye görüntüle\n"
                      +"2.parayi yatırma\n"
                      +"3.parayi çekme\n"
                      +"çıkmak için q ya basiniz";
      System.out.println(islemler);
      System.out.println("-------------------");

      while (true){


         System.out.println("işlemi seçiniz ");
         String islem=scanner.nextLine();
         if (islem.equals("q")){

            break;

         }
         else if (islem.equals("1")){
            System.out.println("bakiyeniz:  "+account.getBakiye());




         }
         else if (islem.equals("2")){
            System.out.println("yatırmakn isteidiğiniz miktar=  ");
            int tutar=scanner.nextInt();
            scanner.nextLine();
            account.parayatir(tutar);

         }
         else if (islem.equals("3")){
            System.out.println("çekmek isteidğiniz miktar=");
            int tutar=scanner.nextInt();
            scanner.nextLine();
            account.paracek(tutar);




         }
         else
         {
            System.out.println("geçersiz işlem");

         }










      }







   }





}
