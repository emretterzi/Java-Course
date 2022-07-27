import java.util.Scanner;

public class UptodateDoping extends  Doping{

    Scanner scaner1= new Scanner(System.in);
    String a=scaner1.nextLine();


    public UptodateDoping(double price, double[] taxes) {
        super.setPrice(price);
        super.setTaxes(taxes);
    }


    @Override
    public double calculate() {
        return 0;
    }
}
n