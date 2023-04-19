public class Grupo {

private String clave;
private Materia materia;
private catedratico Catedratico;
private int hora;
private int salon;
public Alumno alumnos [];

public Grupo (String clave, Materia materia, catedratico Catedratico, int hora, int salon, Alumno alumnos){
    this.clave=new clave;
    this.materia=new materia;
    this.Catedratico=new catedratico;
    this.hora=new hora;
    this.salon=new salon;
    this.alumnos=new alumnos;

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

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }
}
