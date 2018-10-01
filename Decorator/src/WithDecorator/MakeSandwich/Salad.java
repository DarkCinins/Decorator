package WithDecorator.MakeSandwich;

import java.util.Scanner;

public class Salad extends SandwichDecorator
{
    String type;

    public Salad(Sandwich sandwich)
    {
        super(sandwich);
        this.type = setType();
    }

    public String setType()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Tipo de salada: ");
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
        return super.toString() + "- Salada de " + type + ".\n";
    }
}
