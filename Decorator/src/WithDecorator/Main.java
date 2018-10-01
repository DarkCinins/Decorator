package WithDecorator;

import WithDecorator.MakeSandwich.*;

public class Main
{
    public static void main(String[] args)
    {
        Sandwich sandwich = new Bread();
        if(Choices.CheeseChoice()) sandwich = new Cheese(sandwich);
        if(Choices.HamburguerChoice()) sandwich = new Hamburguer(sandwich);
        if(Choices.SaladChoice()) sandwich = new Salad(sandwich);
        System.out.println(sandwich.toString());
        if(sandwich instanceof Bread);
        else  sandwich = sandwich.getSandwich();
        System.out.println(sandwich.toString());
    }
}
