package com.company;

public abstract class Aday {
    private int türkce;
    private int matematik;
    private int edebiyat;
    private  int fizik;





    public Aday(int türkce, int matematik, int edebiyat, int fizik) {
        this.türkce = türkce;
        this.matematik = matematik;
        this.edebiyat = edebiyat;
        this.fizik = fizik;
    }

    public int getTürkce() {
        return türkce;
    }

    public void setTürkce(int türkce) {
        this.türkce = türkce;
    }

    public int getMatematik() {
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }
    public  abstract int puaanhesapla();




}
