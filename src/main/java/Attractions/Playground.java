package Attractions;

public class Playground extends Attraction implements ISecurity{

    Visitor visitor;

    public Playground(String name){
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor){

    }
}
