package com.company;

import java.util.Scanner;

public class Login {

    public boolean login(Account account1){
        Scanner scanner=new Scanner(System.in);
        String kullaniciAdi;
        String sifre;


        System.out.println("kullanıcı adi : ");

        kullaniciAdi=scanner.nextLine();
        System.out.println("sifre  : ");
        sifre=scanner.nextLine();



        if (account1.getKullaniciAdi().equals(kullaniciAdi) && account1.getŞifre().equals(sifre)){


            return true;


        }
        else
            return false;

    }




}
