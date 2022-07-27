package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
matematik.faktoriyal faktoriyal1=new matematik().new faktoriyal();//matematik calssından faktoriyal classını çağırıp obje oluştur;
matematik.Asal asal1=new matematik().new Asal();
matematik.Alan alan1=new matematik().new Alan();


        Scanner scanner1=new Scanner(System.in);
        System.out.println("bir sayi giriniz");

        int sayi=scanner1.nextInt();


        if (asal1.asal_mi(sayi)){
            System.out.println("Bu sayi asldir");



        }
        else {
            System.out.println("asal değildir");
        }
        faktoriyal1.faktoriyal();
        alan1.daire_alan(5);




    }
}
