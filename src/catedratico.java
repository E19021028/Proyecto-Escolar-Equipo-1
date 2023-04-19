import java.io.Serializable;

public class Catedratico implements Serializable {

    private String RFC;

    private String nombre;

    public  Catedratico(String RFC,String nombre){
        this.RFC= RFC;
        this.nombre= nombre;

    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
