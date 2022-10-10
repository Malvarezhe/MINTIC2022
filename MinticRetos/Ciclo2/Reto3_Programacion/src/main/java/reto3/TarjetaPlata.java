package reto3;

public class TarjetaPlata extends TarjetaCine {
    //Atributos
    private int cantidadVisitas = 0;
    private boolean elegibleOro = false;

    //Constructor
    public TarjetaPlata(String idTarjeta, String nombreCompleto, String email, String telefono, int edad) {
        super(idTarjeta, nombreCompleto, email, telefono, edad, 10);
    }
    
    //Método
    @Override
    public double pagar(String[] cuenta){
        double cuentaCine = 0;
        double total = 0;
        
        for (int i = 0; i < cuenta.length; i++) {
            if (cuenta[i].equals("Boleta")){
                total += 6000;
            } else if (cuenta[i].equals("Combo 1 - Crispetas + Gaseosa")){
                total += 8000;
            } else if (cuenta[i].equals("Combo 2 - Perro + Gaseosa")){
                total += 12000;
            }
        }
        this.cantidadVisitas += 1;
        if (this.cantidadVisitas == 5){
            this.elegibleOro = true;
        }
        
        cuentaCine = total * (1- super.getPorcentajeDescuento() / 100);
        return cuentaCine;
    }

    //Getters y Setters
    public int getCantidadVisitas() {
        return cantidadVisitas;
    }

    public void setCantidadVisitas(int cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }

    public boolean isElegibleOro() {
        return elegibleOro;
    }

    public void setElegibleOro(boolean elegibleOro) {
        this.elegibleOro = elegibleOro;
    }
}