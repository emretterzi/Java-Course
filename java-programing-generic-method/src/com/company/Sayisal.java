package com.company;

public class Sayisal extends Aday {
    public Sayisal(int türkce, int matematik, int edebiyat, int fizik) {
        super(türkce, matematik, edebiyat, fizik);
    }

    @Override
    public int puaanhesapla() {
        return getTürkce()*5+getMatematik()*5+getEdebiyat()*1+getFizik()*5;

    }
}
