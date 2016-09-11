package escuelaperros;

public class Dia {

    private int idDias;
    private String Dia;

    public int getIdDias() {
        return idDias;
    }

    public void setIdDias(int idDias) {
        this.idDias = idDias;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String toString() {
        return this.getDia();
    }

}
