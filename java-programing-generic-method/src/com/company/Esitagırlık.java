package com.company;

public class Esitagırlık extends Aday{
    public Esitagırlık(int türkce, int matematik, int edebiyat, int fizik) {
        super(türkce, matematik, edebiyat, fizik);
    }

    @Override
    public int puaanhesapla() {
        return  getTürkce()*5+getMatematik()*5+getEdebiyat()*4+getFizik()*1;
    }
}
