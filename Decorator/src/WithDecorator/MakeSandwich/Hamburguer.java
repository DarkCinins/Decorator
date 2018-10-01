package WithDecorator.MakeSandwich;

import java.util.Scanner;

public class Hamburguer extends SandwichDecorator
{
    String type;
    int quantity;

    public Hamburguer(Sandwich sandwich)
    {
        super(sandwich);
        this.type = setType();
        this.quantity = setQuantity();
    }

    public String setType()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Tipo do hamburguer: ");
        return input.nextLine();
    }

    public int setQuantity()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantidade de hamburguers: ");
        return input.nextInt();
    }

    @Override
    public Sandwich getSandwich()
    {
        return super.getSandwich();
    }

    @Override
    public String toString()
    {
        return super.toString() + "- " + quantity + " hamburguer(s) de tipo " + type + ".\n";
    }
}
