import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static Scanner dato=new Scanner(System.in);
    public static ArrayList<Especialidad> especialidades=new ArrayList<Especialidad>();
    public static ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
    public static ArrayList<Catedratico> catedraticos=new ArrayList<Catedratico>();
    public static ArrayList<Materia> materias=new ArrayList<Materia>();
    public static ArrayList<Grupo> grupos=new ArrayList<Grupo>();
    public static int opc;
    public static void main(String[] args) {
        do{
            opc=menuPrincipal();
            switch(opc){
                case 1:
                    AltaEspecialidad();
                    break;
                case 2:
                    AltaAlumno();
                    break;
                case 3:
                    AltaCatedratico();
                    break;
                case 4:
                    AltaMateria();
                    break;
                case 5:
                    AltaGrupo();
                    break;
                default:
                    System.out.println("Cerrando");
                    break;
            }
        }while(opc!=6);
    }

    public static int menuPrincipal(){
        System.out.println("==Menu principal==");
        System.out.println("1.-Especialidad.");
        System.out.println("2.-Alumno.");
        System.out.println("3.-Catedratico");
        System.out.println("4.-Materia");
        System.out.println("5.-Grupo");
        System.out.println("6.-Salir");
        opc=dato.nextInt();
        return opc;
    }
    public static void AltaAlumno(){
        int id=1,idE;
        String nombre;
        Especialidad especialidad=null;

        System.out.println("==Alumno==");
        for(int i=0;i<alumnos.size();i++){
            if(alumnos.get(i).getNumControl()>=id){
                id=alumnos.get(i).getNumControl()+1;
            }
        }
        System.out.println("Id: "+id);
        System.out.println("Nombre: ");
        nombre=dato.next();

        for(int i=0;i<especialidades.size();i++){
            System.out.println(especialidades.get(i).getId()+" - "+especialidades.get(i).getNombre());
        }
        System.out.println("Id de la especialidad");
        idE=dato.nextInt();

        for(int i=0;i<especialidades.size();i++){
            if(especialidades.get(i).getId()==idE){
                System.out.println("Especialidad: "+especialidades.get(i).getNombre());
                especialidad=especialidades.get(i);
                break;
            }
        }
        alumnos.add(new Alumno(id,nombre,especialidad));
    }
    public static void AltaEspecialidad(){
        int id=1;
        String nombre;
        System.out.println("==Especialidad==");
        for(int i=0;i<especialidades.size();i++){
            if(especialidades.get(i).getId()>=id){
                id=especialidades.get(i).getId()+1;
            }
        }
        System.out.println("Id: "+id);
        System.out.println("Nombre: ");
        nombre=dato.next();
        especialidades.add(new Especialidad(id,nombre));
    }
    public static void AltaCatedratico(){
        String nombre;
        String rfc;
        System.out.println("==Catedratico==");
        System.out.println("Nombre: ");
        nombre=dato.next();
        System.out.println("RFC: ");
        rfc=dato.next();
        catedraticos.add(new Catedratico(rfc,nombre));
    }
    public static void AltaMateria(){
        System.out.println("==Materia==");
        int id=1;
        String nombre;
        for(int i=0;i<materias.size();i++){
            if(materias.get(i).getId()>=id){
                id=materias.get(i).getId()+1;
            }
        }
        System.out.println("Nombre: ");
        nombre=dato.next();
        materias.add(new Materia(id,nombre));
    }
    public static void AltaGrupo() {
        String clave;
        Materia materiaG=null;
        Catedratico catedraticoG=null;
        int hora;
        int salon;
        int idM,idA;
        char w='s';
        String rfcM;

        Vector<Alumno> alumnosG= new Vector<Alumno>();
        System.out.println("==Grupo==");
        System.out.println("Clave: ");
        clave=dato.next();
        System.out.println("Materias:");
        for(int i=0;i<materias.size();i++) {
            System.out.println(materias.get(i).getId() + " - " + materias.get(i).getNombre());
        }
        System.out.println("id de la materia: ");
        idM=dato.nextInt();
        for(int i=0;i<materias.size();i++){
            if(materias.get(i).getId()==idM){
                System.out.println("materia:"+materias.get(i).getNombre());
                materiaG=materias.get(i);
                break;
            }
        }
        for(int i=0;i<catedraticos.size();i++) {
            System.out.println(catedraticos.get(i).getRFC() + " - " + catedraticos.get(i).getNombre());
        }
        System.out.println("RFC del Catedratico: ");
        rfcM=dato.next();
        for(int i=0;i<catedraticos.size();i++){
            if(catedraticos.get(i).getRFC()==rfcM) {
                System.out.println("Catedratico: " + catedraticos.get(i).getNombre());
                catedraticoG = catedraticos.get(i);
            }
        }
        System.out.println("Hora: ");
        hora=dato.nextInt();
        System.out.println("Salon: ");
        salon=dato.nextInt();
        System.out.println("Alumnos: ");

        while (w=='s'||w=='S'){
            System.out.println("==Alumnos==");
            for(int i=0;i<alumnos.size();i++) {
                System.out.println(alumnos.get(i).getNumControl() + " - " + alumnos.get(i).getNombre()+ " - "+ alumnos.get(i).getEspecialidad().getNombre());
            }
            System.out.println("Id del alumno a ingresar");
            idA=dato.nextInt();
            for(int j=0;j<alumnos.size();j++){
                if(alumnos.get(j).getNumControl()==idA){
                    alumnosG.addElement(alumnos.get(j));
                }
            }
            System.out.println("Quiere agregar otro articulo?s/n:");
            w=dato.next().charAt(0);
        }
        grupos.add(new Grupo(clave,materiaG,catedraticoG,hora,salon,alumnosG));
    }
    /*public static void Imprimir(){
        System.out.println("==Grupos==");
        for (int i = 0; i < grupos.size(); i++) {

            System.out.println("Clave: "+grupos.get(i).getClave());
            System.out.println("Materia: "+grupos.get(i).getMateria().getNombre());
            System.out.println("Catedratico: "+grupos.get(i).getCatedratico().getNombre());
            System.out.println("Hora: "+grupos.get(i).getHora());
            System.out.println("Salon: "+grupos.get(i).getSalon());
            System.out.println("Alumnos");
            for(int j=0;j< grupos.get(i).getAlumnos().size();i++){
                System.out.println("Id: "+grupos.get(i).getAlumnos().get(j).getNumControl());
                System.out.println("Nombre: "+grupos.get(i).getAlumnos().get(j).getNombre());
                System.out.println("Esoecialidad: "+grupos.get(i).getAlumnos().get(j).getEspecialidad().getNombre());
            }
        }
    }*/
}