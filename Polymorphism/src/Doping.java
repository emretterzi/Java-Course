public  abstract  class Doping {

    protected double price;
    protected double [] taxes;
    public abstract double calculate();//bu sınıfda kullanılmmıyor ve soyut ama diğer sınıflarda
    //isteğe bağlı override edilip kullanalıbilir ve implement etmesi zorunlu hale geliyor







    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double[] getTaxes() {
        return taxes;
    }

    public void setTaxes(double[] taxes) {
        this.taxes = taxes;
    }
}


