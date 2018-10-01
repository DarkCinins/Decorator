package WithDecorator.MakeSandwich;

public class SandwichDecorator implements Sandwich
{
    private Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich)
    {
        this.sandwich = sandwich;
    }

    public Sandwich getSandwich()
    {
        return sandwich;
    }

    @Override
    public String toString()
    {
        return this.sandwich.toString();
    }
}