package domain;

public class Bicicleta {

    final Integer id;

    public Bicicleta(int id){
        this.id = id;
    }

    public int getId(){
        return this.id.intValue();
    }

    @Override
    public String toString(){
        return this.id.toString();

    }


}
