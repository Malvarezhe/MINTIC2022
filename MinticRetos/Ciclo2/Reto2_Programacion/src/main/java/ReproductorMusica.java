public class ReproductorMusica {
    
    //ATRIBUTOS
    private String[] canciones;
    private int[] cancionesFavoritas;
    private boolean pausado;
    private int cancionReproduciendo;
        
    
    //MÉTODOS
    public ReproductorMusica(String[] canciones) {
        //COMPLETE AQUÍ LA LÓGICA DEL CONSTRUCTOR SEGÚN EL ENUNCIADO
        this.canciones = canciones;
        this.cancionesFavoritas = new int[this.canciones.length];
        this.pausado = true;
        this.cancionReproduciendo = 0;
        for(int i = 0; i < cancionesFavoritas.length; i++){
            this.cancionesFavoritas[i] = -1;
        }
    }
    
    public void proximaCancion(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
        this.cancionReproduciendo = (this.cancionReproduciendo + 1)%this.canciones.length;
    }
    
    public void devolverCancion(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
        this.cancionReproduciendo = (this.cancionReproduciendo + this.canciones.length - 1)%this.canciones.length;
    }
    
    public void cambiarEstadoReproduccion(){
        //COMPLETE AQUÍ LA LÓGICA DE ESTE MÉTODO SEGÚN EL ENUNCIADO
        
        if (this.pausado == true){
            this.pausado = false;
        }else {
            this.pausado = true;
        }
    }
    
    //NO SE DEBE PREOCUPAR POR DESARROLLAR ESTE MÉTODO. ¡NO ELIMINARLO NI MODIFICARLO!
    public void agregarCancionesFavoritas(){
        for(int i = 0; i < cancionesFavoritas.length; i++)
            /*En caso de que encuentre que cancionReproduciendo está en el banco de cancionesFavoritas
            no seguimos buscando espacio libre para agregarla, y salimos del método*/
            if(cancionesFavoritas[i] == cancionReproduciendo)
                return;
            //Pero si no la encontró, y además encuentra un espacio donde añadirlo, lo hace
            else if(cancionesFavoritas[i] == -1){
                cancionesFavoritas[i] = cancionReproduciendo;
                return;
            }                
    }

    public String[] getCanciones() {
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
        return canciones;
    }

    public void setCanciones(String[] canciones) {
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
        this.canciones = canciones;
    }

    public int[] getCancionesFavoritas() {
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
        return cancionesFavoritas;
    }

    public void setCancionesFavoritas(int[] cancionesFavoritas) {
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
        this.cancionesFavoritas = cancionesFavoritas;
    }

    public boolean isPausado() {
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
        return pausado;
    }

    public void setPausado(boolean pausado) {
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
        this.pausado = pausado;
    }

    public int getCancionReproduciendo() {
        //COMPLETE AQUÍ EL GETTER CORRESPONDIENTE
        return cancionReproduciendo;
    }

    public void setCancionReproduciendo(int cancionReproduciendo) {
        //COMPLETE AQUÍ EL SETTER CORRESPONDIENTE
        this.cancionReproduciendo = cancionReproduciendo;
    }
    
}