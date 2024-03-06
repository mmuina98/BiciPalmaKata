package domain;

public class TarjetaUsuario {

    private String id;
    private Boolean activada;


    public TarjetaUsuario(String id, Boolean activada){
        this.id = id;
        this.activada = activada;
    }

    public Boolean isActivada(){
        return this.activada;
    }

    public void setActivada(Boolean modificacion){
        this.activada = modificacion;
    }
    @Override
    public String toString(){
        return "Esta tarjeta pertenece a: "+ this.id+ "y se encuentra: "+this.activada;
    }

}
