package animals;

public class Eagle extends Predator{

    //constructor for Eagle
    //id is a unique identifier
    //x is the initial row position
    //y is the initial column position
    public Eagle(int id, int x, int y)
    {
        super(id, x, y, 6); //initilized with the power level 4
    }
    @Override
    public char getSymbol()
    {
        return 'E'; //polymprohism used to override the getSymbol to match this subclass
    }
    @Override
    public String toString() ////polymprohism used to override the toString to match this subclass
    {
        return String.format("Eagle #%d @(%d, %d)", getId(), getX(), getY());
    }

}