package Attractions;
import Visitor;

public interface ISecurity {

    public boolean isAllowedTo(Visitor visitor);

}
