package domain;

public class Anclajes {

    private Integer numeroAnclajes;
    private Anclaje[] anclajes;

    public Anclajes(Integer numeroAnclajes){
        this.numeroAnclajes = numeroAnclajes;
        this.anclajes = new Anclaje[numeroAnclajes];
        this.crearAnclajes();
    }

    public void crearAnclajes(){
        for(int i = 0; i < this.anclajes.length; i++){
            Anclaje anclaje = new Anclaje();
            this.anclajes[i] = anclaje;
        }
    }

    public Anclaje[] anclajes(){
        return this.anclajes;
    }

    int numAnclajes(){
        return this.numeroAnclajes;
    }
    public void ocuparAnclaje(int numAnclaje, Bicicleta bici){
        if (this.isAnclajeOcupado(numAnclaje) == false) {
            this.anclajes[numAnclaje].anclarBici(bici);
        }

    }

    public boolean isAnclajeOcupado(int numAnclaje){
        return this.anclajes[numAnclaje].isOcupado();
    }

    public void liberarAnclaje(int numAnclaje){
        this.anclajes[numAnclaje].liberarBici();
    }

    public Bicicleta getBiciAt(int numAnclaje){
        return this.anclajes[numAnclaje].getBici();
    }

    /* public int seleccionarAnclaje(){

    }*/

    @Override
    public String toString(){
        return "Numero de anclajes: "+ this.numAnclajes();
    }

}
