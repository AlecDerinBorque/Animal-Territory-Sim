package animals;

public class Fox extends Predator{  //

    //constructor for Fox
    //id is a unique identifier
    //x is the initial row position
    //y is the initial column position
    public Fox(int id, int x, int y)
    {
        super(id, x, y, 4); //initilized with the power level 4
    }
    @Override
    public char getSymbol()
    {
        return 'F'; //polymprohism used to override the getSymbol to match this subclass
    }
    @Override
    public String toString() //polymprohism used to override the toString method to match this subclass
    {
        return String.format("Fox #%d @(%d, %d)", getId(), getX(), getY());
    }
}
