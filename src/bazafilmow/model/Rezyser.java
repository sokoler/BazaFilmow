/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bazafilmow.model;

/**
 *
 * @author Daniel
 */
public class Rezyser {
    private Long id;
    private String imie;
    private String nazwisko;
    private String narodowosc;
    private String dataUrodzenia;

    public Rezyser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNarodowosc() {
        return narodowosc;
    }

    public void setNarodowosc(String narodowosc) {
        this.narodowosc = narodowosc;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return "Rezyser{" + "id=" + id + ", imie=" + imie + ", nazwisko=" + nazwisko + ", narodowosc=" + narodowosc + ", dataUrodzenia=" + dataUrodzenia + '}';
    }
    
    
    
}