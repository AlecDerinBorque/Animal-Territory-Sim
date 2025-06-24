package animals;

public class Rabbit extends Prey{

    //constructor for Rabbit
    //id is a unique identifier
    //x is the initial row position
    //y is the initial column position

    public Rabbit(int id, int x, int y)
    {
        super(id,x,y);
    }

    @Override
    public char getSymbol()
    {
        return 'R'; //polymprohism used to override the getSymbol to match this subclass
    }

    @Override
    public String toString() //polymprohism used to override the toString method to match this subclass
    {
        return String.format("Rabbit #%d @(%d, %d)", getId(), getX(), getY());
    }
}
