package models;

public class Ders {
    private String DersAdi;
    private String DersKodu;
    private String DersDonemi;
    private int Kredi;
    private boolean ZorunluMu;
    
     public Ders() {
    }

    public String getDersAdi() {
        return DersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.DersAdi = dersAdi;
    }

    public String getDersKodu() {
        return DersKodu;
    }

    public void setDersKodu(String dersKodu) {
        this.DersKodu = dersKodu;
    }

    public String getDersDonemi() {
        return DersDonemi;
    }

    public void setDersDonemi(String dersDonemi) {
        this.DersDonemi = dersDonemi;
    }

    public int getKredi() {
        return Kredi;
    }

    public void setKredi(int kredi) {
        this.Kredi = kredi;
    }

    public boolean isZorunluMu() {
        return ZorunluMu;
    }

    public void setZorunluMu(boolean zorunluMu) {
        this.ZorunluMu = zorunluMu;
    }
}
