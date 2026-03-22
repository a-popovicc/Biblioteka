package biblioteka;

public class Knjiga {
    private String naslov;
    private String autor;
    private String izdavac;
    private int izdanje;
    private  double isbn;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getIsbn() {
        return isbn;
    }

    public void setIsbn(double isbn) {
        this.isbn = isbn;
    }

    public int getIzdanje() {
        return izdanje;
    }

    public void setIzdanje(int izdanje) {
        this.izdanje = izdanje;
    }

    public String getIzdavac() {
        return izdavac;
    }

    public void setIzdavac(String izdavac) {
        this.izdavac = izdavac;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }
}
