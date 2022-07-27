package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Character[] char_dizi={'a','b','c'};
        Integer[] sayilar={1,2,3,4,5,};
        String [] strings={"aysu","emre","terzi","ahmet"};

         Ogrenci[] ögrenciler={new Ogrenci("emre"),new Ogrenci("aysu"),new Ogrenci("neriman")  };


         CharYazdir.charyazdir1(char_dizi);//4 farklı class yazmak zorunda kaldık
        System.out.println("------------------------------------------");
         StringYazdir.stringyazdir1(strings);//4 farklı class yazmak zorunda kaldık
        System.out.println("------------------------------------------");
         IntegerYazdir.Integeryazdir1(sayilar);//4 farklı class yazmak zorunda kaldık
        System.out.println("------------------------------------------");
         OgrenciYazdir.ogrenci_yazdir(ögrenciler);//4 farklı class yazmak zorunda kaldık
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");
        System.out.println("-----------genericler--------------");

         YazdirmaSinifi<Character> yazdirchar=new YazdirmaSinifi<Character>();//generic sınıf yazarak sınıftan obje oluşturduk

        YazdirmaSinifi<Integer> yazdirinteger=new YazdirmaSinifi<Integer>();//generic sınıf yazarak sınıftan obje oluşturduk

        YazdirmaSinifi<String> yazdirdtring=new YazdirmaSinifi<String>();//generic sınıf yazarak sınıftan obje oluşturduk

        YazdirmaSinifi<Ogrenci> yazdirogrenci=new YazdirmaSinifi<Ogrenci>();//generic sınıf yazarak sınıftan obje oluşturduk


yazdirchar.yazdir(char_dizi);
        System.out.println("------------------------------------------");
yazdirinteger.yazdir(sayilar);
        System.out.println("------------------------------------------");
yazdirogrenci.yazdir(ögrenciler);
        System.out.println("------------------------------------------");
yazdirdtring.yazdir(strings);

        System.out.println("------------------------------------------");



















	// write your code here
    }
}
