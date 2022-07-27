import java.util.Scanner;

public class Main {

    public  static void checkAge(int age){

        if(age<18){

            throw new ArithmeticException("Yaşınız uygun değildir"); //Hata olarak yazdırma

        }
        System.out.println("yaşınız uygundur");

    }
    
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);

        System.out.println("lütfen bir yaş giriniz");
        int age=scanner1.nextInt();


        try{
            checkAge(age);
        }
        catch (Exception e){

            System.out.println("Hata yaşınız 18 yaşından küçük"); //terminale yazdırma



        }

checkAge(age);


    }
}