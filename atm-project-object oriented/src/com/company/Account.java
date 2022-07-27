package com.company;

public class Account
{
private String kullaniciAdi;
private String şifre;
private double bakiye;



    public Account(String kullaniciAdi, String şifre, double bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.şifre = şifre;
        this.bakiye = bakiye;
    }



    public void parayatir(int tutar){


        bakiye+=tutar;
        System.out.println("yeni bakiyeniz"+bakiye);

    }
public void paracek(int tutar){

        if (bakiye-tutar<0){

            System.out.println("yeterli bakiyeniz yok");

        }
           else
        {

            bakiye-=tutar;
            System.out.println("yeni bakiyeniz"+bakiye);
        }



}

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getŞifre() {
        return şifre;
    }

    public void setŞifre(String şifre) {
        this.şifre = şifre;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}
