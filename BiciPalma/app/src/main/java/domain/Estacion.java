package domain;

public class Estacion {
    private int id;
    private String direccion;
    private int numAnclajes;
    private final Anclajes anclajes;

    public Estacion(int id, String direccion, int numAnclajes){
        this.id = id;
        this.direccion = direccion;
        this.numAnclajes = numAnclajes;
        this.anclajes = new Anclajes(numAnclajes);
    }

    private int getId(){
        return this.id;
    }
    private String getDireccion(){
        return this.direccion;
    }

    @Override
    public String toString(){
        return "id: "+this.id+" \ndireccion: "+this.direccion+" \nanclajes: "+this.numAnclajes;
    }

    public Anclaje[] anclajes(){
        return this.anclajes.anclajes();
    }

    public void consultarEstacion(){
        System.out.println(this);
        
    }
    public int anclajesLibres() {
        int anclajesLibres = 0;
        for (int i = 0; i < this.numAnclajes; i++){
            if (this.anclajes.anclajes()[i].isOcupado() == false){
                anclajesLibres++;
            }
        }
        return anclajesLibres;
    }

    public void anclarBicicleta(Bicicleta bicicleta) {
        if (this.anclajesLibres() > 0) {
            this.getAnclajeLibre().anclarBici(bicicleta);
        }else{
            System.out.println("No hay anclajes libres");
        }

    }



    public boolean leerTarjetaUsuario(TarjetaUsuario tarjeta) {
        return tarjeta.isActivada();
    }

    public void retirarBicicleta(TarjetaUsuario tarjeta) {
        if (this.leerTarjetaUsuario(tarjeta) != true) {
            System.out.println("La tarjeta no está activada");
        } else if (this.numAnclajes - this.anclajesLibres() > 0) {
            this.getAnclajeOcupado().liberarBici();
        } else {
            System.out.println("No hay bicicletas disponibles");
        }
    }


    public void consultarAnclajes() {
        for (int i = 0; i < this.numAnclajes; i++){
            System.out.println(this.anclajes.anclajes()[i]);
        }
    }
    private Anclaje getAnclajeLibre() {
        for (int i = 0; i < this.numAnclajes; i++) {
            if (this.anclajes.anclajes()[i].isOcupado() == false) {
                return this.anclajes.anclajes()[i];
            }
        }
        return null;
    }

    private Anclaje getAnclajeOcupado() {
        for (int i = 0; i < this.numAnclajes; i++) {
            if (this.anclajes.anclajes()[i].isOcupado() == true) {
                return this.anclajes.anclajes()[i];
            }
        }
        return null;
    }
}