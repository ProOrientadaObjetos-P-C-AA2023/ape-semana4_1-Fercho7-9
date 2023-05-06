package Dber2.problema3;
class AutorMotor{
    private int idDuenio;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public  AutorMotor(){}
    public AutorMotor(int idDuenio, String marcaVehiculo, int anioFabricacion, double valorVehiculo) {
        this.idDuenio = idDuenio;
        this.marcaVehiculo = marcaVehiculo;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }
    public  void  CalcularValorMatricula(){
        this.valorMatricula=(valorVehiculo/(100/0.002))*anioFabricacion;
    }
    public double getValorMatricula(){
        return this.valorMatricula;
    }
    public String toString(){
        return String.format("\t"+"\t"+"AUTOMOVIL"
            +"\nNúmero de Cédula: %d"
            +"\nNúmero de la Marca del Vehiculo: %s"
            +"\nAño del Vehiculo: %d"
            +"\nValor del Vehiculo: %.2f"
            +"\nValor de la Matricula del Vehiculo:%.2f"
            ,this.getIdDuenio()
            ,this.getMarcaVehiculo()
            ,this.getAnioFabricacion()
            ,this.getValorVehiculo()
            ,this.getValorMatricula()
        );
    }
}
public class Problema3 {
    public static void main(String[] args) {
            AutorMotor autorMotor = new AutorMotor(1150084661,"PVP 869",2023,38420.50);
            autorMotor.CalcularValorMatricula();
        System.out.println(autorMotor);
    }
}
