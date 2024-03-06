package domain;

public class Anclaje {
    private boolean ocupado = false;
    private Bicicleta bici;

    public Anclaje(){
    }

    public boolean isOcupado() {
        return this.ocupado;
    }

    public Bicicleta getBici(){
        return this.bici;
    }

    public void anclarBici(Bicicleta bicicleta){
        this.bici = bicicleta;
        this.ocupado = true;
    }

    public void liberarBici(){
        this.bici = null;
        this.ocupado = false;
    }

    @Override
    public String toString() {
        return "El anclaje se encuentra ocupado? "+this.ocupado;
    }
}
