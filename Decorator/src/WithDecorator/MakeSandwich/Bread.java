package WithDecorator.MakeSandwich;

import java.util.Scanner;

public class Bread implements Sandwich
{
    int centimeters;

    public Bread()
    {
        this.centimeters = setCentimeters();
    }

    public int setCentimeters()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Tamanho do pão em centímetros:");
        return input.nextInt();
    }

    @Override
    public Sandwich getSandwich()
    {
        return null;
    }

    @Override
    public String toString()
    {
        return "Este sanduiche é feito com:\n- Um pão de "
                + centimeters + " centímetros.\n";
    }
}
