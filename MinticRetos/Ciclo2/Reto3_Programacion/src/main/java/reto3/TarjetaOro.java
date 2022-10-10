package reto3;

public class TarjetaOro extends TarjetaCine{
    //Atributos
    private String [] beneficiosDescripcion = {"Boleto Gratis", "Crispetas Gratis", "Gaseosa Gratis"};
    private boolean [] beneficiosEstado = {true, true, true};

    //Constructor
    public TarjetaOro(String idTarjeta, String nombreCompleto, String email, String telefono, int edad) {
        super(idTarjeta, nombreCompleto, email, telefono, edad, 20);
    }
    
    //Método
    public boolean redimirBeneficio(int posicionBeneficio){
        if (this.beneficiosEstado[posicionBeneficio] == true){
            this.beneficiosEstado[posicionBeneficio] = false;
            return true;
        } else {
            return false;
        } 
    }

    //Getters y Setters
    public String[] getBeneficiosDescripcion() {
        return beneficiosDescripcion;
    }

    public void setBeneficiosDescripcion(String[] beneficiosDescripcion) {
        this.beneficiosDescripcion = beneficiosDescripcion;
    }

    public boolean[] getBeneficiosEstado() {
        return beneficiosEstado;
    }

    public void setBeneficiosEstado(boolean[] beneficiosEstado) {
        this.beneficiosEstado = beneficiosEstado;
    }
    
}
