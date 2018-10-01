package WithDecorator.MakeSandwich;

import java.util.Scanner;

public class Cheese extends SandwichDecorator
{
    int slices;
    String type;

    public Cheese(Sandwich sandwich)
    {
        super(sandwich);
        this.slices = setSlices();
        this.type = setType();
    }

    public int setSlices()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Fatias de queijo: ");
        return input.nextInt();
    }

    public String setType()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Tipo de queijo: ");
        return input.nextLine();
    }

    @Override
    public Sandwich getSandwich()
    {
        return super.getSandwich();
    }

    @Override
    public String toString()
    {
        return super.toString() + "- "
                + slices + " fatias de queijo " + type + ".\n";
    }
}
