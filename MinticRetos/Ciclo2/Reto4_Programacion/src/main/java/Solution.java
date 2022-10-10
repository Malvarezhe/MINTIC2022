import java.util.ArrayList;
public class Solution{
    //ESTA CLASE NO TIENE MAIN
    
    public static Object[] reportes(ArrayList <Cliente> tienda){
        //EN ESTE ESPACIO PONER SU LÓGICA
        Object[] solucion = new Object[5];

        double promedioTotalPagado = 0;
        String nombreClienteMasPago = "";
        int totalPagadoMasAlto = 0;
        int suma = 0;

        for (Cliente c : tienda) {
            System.out.println(c.getTotalAPagar());
            suma += c.getTotalAPagar();

            if (c.getTotalAPagar() > totalPagadoMasAlto) {
                totalPagadoMasAlto = c.getTotalAPagar();
                nombreClienteMasPago = c.getNombreCompleto();
            }
        }

        int totalPagadoMasBajo = totalPagadoMasAlto;
        String nombreClienteMenosPago = nombreClienteMasPago;
        
        for (Cliente c : tienda) {
            if (c.getTotalAPagar() < totalPagadoMasBajo) {
                totalPagadoMasBajo = c.getTotalAPagar();
                nombreClienteMenosPago = c.getNombreCompleto();
            }
        }

        promedioTotalPagado = suma / tienda.size();
        
        solucion[0] = promedioTotalPagado;
        solucion[1] = nombreClienteMenosPago;
        solucion[2] = totalPagadoMasBajo;
        solucion[3] = nombreClienteMasPago;
        solucion[4] = totalPagadoMasAlto;
        
        return solucion;
    }
}