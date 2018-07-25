package pl.kamilF.market.model;

public class Market {
    private String nazwa;
    private String kategoria;
    private String opis;
    private Integer cena;
    private Integer ilosc;

    public Market(String nazwa, String kategoria, String opis, Integer cena, Integer ilosc) {
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.opis = opis;
        this.cena = cena;
        this.ilosc = ilosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    public Integer getIlosc() {
        return ilosc;
    }

    public void setIlosc(Integer ilosc) {
        this.ilosc = ilosc;
    }

    @Override
    public String toString() {
        return "Market{" +
                "nazwa='" + nazwa + '\'' +
                ", kategoria='" + kategoria + '\'' +
                ", opis='" + opis + '\'' +
                ", cena=" + cena +
                ", ilosc=" + ilosc +
                '}';
    }
}
