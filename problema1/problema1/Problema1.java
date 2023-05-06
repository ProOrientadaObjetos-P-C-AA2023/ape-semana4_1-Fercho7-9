package Dber2.problema1;
class Estudiante {
    private  String nombreEstudiante;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;

    public Estudiante(){}

    public Estudiante(String nombreEstudiante, double nota1, double nota2, double nota3) {
        this.nombreEstudiante = nombreEstudiante;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public void CalcularPromedio(){
        this.promedio =(this.nota1+this.nota2+this.nota3)/3;
    }
    public double getPromedio(){
        return this.promedio;
    }

    @Override
    public String toString() {
        return String.format("\t"+"\t"+"\t"+"Estudiante"
                        +"\nNombre del Estdudiante:%.100s"
                        +"\nNota1:%.2f"
                        +"\nNota2:%.2f "
                        +"\nNota3:%.2f"
                        +"\nPromedio:%.2f"
                ,this.getNombreEstudiante()
                ,this.getNota1()
                ,this.getNota1()
                ,this.getNota3()
                ,this.getPromedio());
    }
}
public class Problema1 {

    public static void main(String[] args) {
        Estudiante estudiante =new Estudiante("Eddy Ordoñez",9,10,9);
        estudiante.CalcularPromedio();
        System.out.println(estudiante);
    }
}
