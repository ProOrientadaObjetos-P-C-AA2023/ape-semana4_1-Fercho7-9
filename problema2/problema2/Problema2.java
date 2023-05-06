package Dber2.problema2;
class  Profesor{
    private String nombreProfesor;
    private String apellidoProfesor;
    private double suelodBasico ;
    private double sueldoTodal;
    private int id;

    public Profesor(){}

    public Profesor(String nombreProfesor, String apellidoProfesor, double suelodBasico, int id) {
        this.nombreProfesor = nombreProfesor;
        this.apellidoProfesor = apellidoProfesor;
        this.suelodBasico = suelodBasico;
        this.id = id;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getApellidoProfesor() {
        return apellidoProfesor;
    }

    public void setApellidoProfesor(String apellidoProfesor) {
        this.apellidoProfesor = apellidoProfesor;
    }

    public double getSuelodBasico() {
        return suelodBasico;
    }

    public void setSuelodBasico(double suelodBasico) {
        this.suelodBasico = suelodBasico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public  void  CalcularSueldoTotal(){
        this.sueldoTodal=suelodBasico*0.2;
    }
    public double getSueldoTodal(){
        return this.sueldoTodal;
    }

    @Override
    public  String toString(){
        return String.format("\t"+"Profesor"
                        +"\nNombre Profesor:%s"
                        +"\nApellido Profesor:%s"
                        +"\nSueldo Basico Profesor:%.2f"
                        +"\nSueldo Total Profesor:%.2f"
                        +"\nID Profesor:%d"
                ,this.getNombreProfesor()
                ,this.getApellidoProfesor()
                ,this.getSuelodBasico()
                ,this.getSueldoTodal()
                ,this.getId()
        );
    }
}
public class Problema2 {
    public static void main(String[] args) {
        Profesor profesor = new Profesor("Richar","Guaya",445.8,1150084661);
        profesor.CalcularSueldoTotal();
        System.out.println(profesor);
    }
}
