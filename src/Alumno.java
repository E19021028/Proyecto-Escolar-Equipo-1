public class Alumno {
    private int numControl;
    private String nombre;
    private Especialidad especialidad;

    public Alumno(int numControl, String nombre,Especialidad especialidad) {
        this.numControl=new numControl;
        this.nombre= new nombre;
        this.especialidad= new especialidad;
    }
    public int getNumControl() {
        return numControl;
    }
    public void setNumControl(int numControl) {
        this.numControl = numControl;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

}
