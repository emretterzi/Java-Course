public class TopOfListDoping extends Doping {

    public TopOfListDoping(double price)
    {
        super.setPrice(price);
    }






    // "Doping" soyut sınıfından kalıtımla gelen, "calculate" isimli soyut metodu metot ezmesi yöntemiyle alt sınıf kendi ihtiyacına göre dolduruyor.
    // "TopOfList" isimli doping tipinde vergiler olmadığı için komisyon oranı eklenip ücret hesaplanıyor. Fakat, başka doping çeşitlerinde hesaplama farklı olabilir.
    @Override
    public double calculate() {

        return super.getPrice() + super.getPrice() * 0.35;
    }

}
