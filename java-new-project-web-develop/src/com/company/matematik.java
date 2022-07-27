package com.company;

import java.util.Scanner;

public class matematik {

    private double PI =Math.PI;

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public class faktoriyal{

        public void faktoriyal(){
            Scanner scanner1=new Scanner(System.in);
            System.out.println("bir sayi giriniz");
            int sayi=scanner1.nextInt();
            int faktoriyal=1;



            for(int i=1;i<sayi+1;i++){
            faktoriyal *=i;



            }
            System.out.println("faktoriyal sonucu"+faktoriyal);






        }








    }
    public class Asal{
        public boolean asal_mi(int sayi){

            int i=2;

            while (i<sayi){


                if (sayi % i==0){
                    return false;

                }
                i++;



            }
            return true;





        }


    }
    public class Alan{
        public void daire_alan(int yaricap){
            System.out.println("dairenin alanı"+(yaricap*yaricap)*getPI());






        }





    }



}
