package ejercicios.reto1_programacion;

public class Reto1_Programacion {
    
    public static int[] reporte(int[] compra){
        int [] solucion = new int[3];
        int suma = 0;
        int mayor = compra[0]; 
        int menor = compra[0];
        
        for (int i = 0; i < compra.length; i++) {
            suma += compra[i];
            if (compra[i] < menor){
                menor = compra[i];
            }
            if (compra[i] > mayor){
                mayor = compra[i];
            }
        }
        solucion[0] = suma;
        solucion[1] = menor;
        solucion[2] = mayor;
        return  solucion;
    }
    
    public static void main(String[] args) {
        int [] arreglo = {2700, 9500, 300, 15000, 1800, 10000, 400, 3000, 400};
        //int [] arreglo = {6700};
        int [] solucion = reporte(arreglo);
        
        for (int i:solucion) {
            System.out.println(i);
        }
    }
}
