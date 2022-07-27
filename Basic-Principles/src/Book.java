import java.util.Scanner;

public class Book {

    public String name;

   private int pageNumber;//private yapıp  shownumberpage metotundan return edip çağıırıcaz ve sadce show number pageden
    // kapsülleme olucak
    //ama gerek kalmadı sildim ve aslında kapüllemeyi getter setter metotları yapabiliyor





    public Book(String name,int pageNumber){
        this.name=name;
        this.pageNumber=pageNumber;
    }

    public void numberControl(int pageNumber){

        if (pageNumber<0){
            System.out.println("hata sayfa numarası negatif olamaz");
            System.out.println("sayfa değştirme fonskiyonu çalıştırılıyor");
            System.out.println("lütfen sayfa sayısını giriniz");
            changePageNumber();// burda zaten içinde constructer üzerinden scannerla veri alıyoruz  nesnemizin yerine geçiyor.
            System.out.println("kitabımızın yeni sayfa sayısı="+getPageNumber());


        }
        else

        {
            System.out.println("sayfa sayiniz ="+getPageNumber());
        }








    }


    //kapsülleme getter setterlarla yapılıyor
    //public int ShowNumberPAge pageNumber kapsülledi page numbera main içinden ulaşmamızı engelledi
    public void changePageNumber(){
        Scanner scanner1=new Scanner(System.in);
        this.pageNumber=scanner1.nextInt();
        setPageNumber(pageNumber);


       // this.pageNumber=pageNumber; yapmamıza gerek kalmadı direkt scannerşa alınan değeri thisledik

    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
