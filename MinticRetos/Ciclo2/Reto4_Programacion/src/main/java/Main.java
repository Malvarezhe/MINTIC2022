
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cliente> t3 = new ArrayList<>();

        t3.add(new Cliente("Valeria Di", "10367876345", 9653, "03/07/2022", "0004"));
        t3.add(new Cliente("Johan   Doe", "1037645345", 3918, "03/07/2022", "0005"));
        t3.add(new Cliente("Maurice   Doe", "987652 34", 6048, "03/07/2022", "0006"));
        t3.add(new Cliente("Matthew   Doe", "1036789453", 5840, "03/07/2022", "0007"));
        t3.add(new Cliente("Agustina Doe", "10003456", 3940, "03/07/2022", "0008"));
        t3.add(new Cliente("Agustina Doe", "10003456", 3840, "03/07/2022", "0009"));
        t3.add(new Cliente("Milena   Doe", "20003456", 3696, "03/07/2022", "0010"));
        t3.add(new Cliente("Carla Di", "103789762", 2432, "03/07/2022", "00011"));
        //reportes(t3);
    }

//    public static Object[] reportes(ArrayList<Cliente> tienda) {
//        //EN ESTE ESPACIO PONER SU LÓGICA
//        Object[] solucion = new Object[5];
//
//        double promedioTotalPagado = 0;
//        String nombreClienteMasPago = "";
//        int totalPagadoMasAlto = 0;
//        int suma = 0;
//
//        for (Cliente c : tienda) {
//            System.out.println(c.getTotalAPagar());
//            suma += c.getTotalAPagar();
//
//            if (c.getTotalAPagar() > totalPagadoMasAlto) {
//                totalPagadoMasAlto = c.getTotalAPagar();
//                nombreClienteMasPago = c.getNombreCompleto();
//            }
//        }
//
//        int totalPagadoMasBajo = totalPagadoMasAlto;
//        String nombreClienteMenosPago = nombreClienteMasPago;
//        for (Cliente c : tienda) {
//            if (c.getTotalAPagar() < totalPagadoMasBajo) {
//                totalPagadoMasBajo = c.getTotalAPagar();
//                nombreClienteMenosPago = c.getNombreCompleto();
//            }
//        }
//
//        promedioTotalPagado = suma / tienda.size();
//        System.out.println("la suma: " + suma);
//        System.out.println("Promedio: " + promedioTotalPagado);
//        System.out.println("Menos pago: " + totalPagadoMasBajo);
//        System.out.println("Persona menos pago: " + nombreClienteMenosPago);
//        System.out.println("Mas pago: " + totalPagadoMasAlto);
//        System.out.println("Persona Mas pago: " + nombreClienteMasPago);
//        
//        solucion[0] = promedioTotalPagado;
//        solucion[1] = nombreClienteMenosPago;
//        solucion[2] = totalPagadoMasBajo;
//        solucion[3] = nombreClienteMasPago;
//        solucion[4] = totalPagadoMasAlto;
//        
//        return solucion;
//    }

}
