package Dber2.problema4;
class EntidadFinanciera{
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionCobroBanco;

    public EntidadFinanciera(){}
    public EntidadFinanciera(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }
    public void CalcularComisionCobroBanco(){
        this.comisionCobroBanco=valorCheque*0.003;
    }
    public double getComisionCobroBanco(){
        return this.comisionCobroBanco;
    }
   public String toString(){
        return String.format("Edentidad Financiera"
                            +"\nNombre del cliente:%s"
                            +"\nEntidad Financiera%s: "
                            +"\nValor que tiene el Cheque:%.2f "
                            +"\nInteres de la comisión%.2f"
                            ,this.getNombreCliente()
                            ,this.getNombreBanco()
                            ,this.getValorCheque()
                            ,this.getComisionCobroBanco());
   }
}

public class Problema4 {
    public static void main(String[] args) {
        EntidadFinanciera entidadFinanciera = new EntidadFinanciera("Eddy Fernando Ordoñez Cuenca","Banco de Loja",259.6);
        entidadFinanciera.CalcularComisionCobroBanco();
        System.out.println(entidadFinanciera);
    }
}
