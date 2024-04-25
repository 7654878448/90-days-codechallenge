package nativesql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nativecricketers")
public class Cricketer {
    @Id
    @Column(name="jn")
    private int jn;

    @Column(name="adress", length = 30)
    private String adress;

    @Column(name="salery") // Corrected column name to "salery"
    private int salery;

    public Cricketer() {
        // Default constructor
    }

    public Cricketer(int jn, String adress, int salery) {
        this.jn = jn;
        this.adress = adress;
        this.salery = salery;
    }

    public int getJn() {
        return jn;
    }

    public void setJn(int jn) {
        this.jn = jn;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getSalery() {
        return salery;
    }

    public void setSalery(int salery) {
        this.salery = salery;
    }

    @Override
    public String toString() {
        return "Cricketer [jn=" + jn + ", adress=" + adress + ", salery=" + salery + "]";
    }
}
