import java.io.Serializable;
import java.util.Vector;

public class Grupo implements Serializable {

    private String clave;
    private Materia materia;
    private catedratico Catedratico;
    private int hora;
    private int salon;
    public Vector<Alumno> alumnos;

    public Grupo(){
    this.alumnos=new Vector<Alumno>();
    }

    public Grupo (String clave, Materia materia, catedratico catedratico, int hora, int salon, Vector<Alumno> alumnos){
        this.clave= clave;
        this.materia= materia;
        this.Catedratico= catedratico;
        this.hora= hora;
        this.salon= salon;
        this.alumnos= new Vector<Alumno>();
        this.alumnos= alumnos;
    }

    public String getClave() {

    return clave;
    }

    public void setClave(String clave) {

    this.clave = clave;
    }

    public Materia getMateria() {

    return materia;
    }

    public void setMateria(Materia materia) {

    this.materia = materia;
    }

    public catedratico getCatedratico() {

    return Catedratico;
    }

    public void setCatedratico(catedratico catedratico) {

    Catedratico = catedratico;
    }

    public int getHora() {

    return hora;
    }

    public void setHora(int hora) {

    this.hora = hora;
    }

    public int getSalon() {

    return salon;
    }

    public void setSalon(int salon) {

    this.salon = salon;
    }

}
