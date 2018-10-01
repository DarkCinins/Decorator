package WithDecorator;

import java.util.Scanner;

public class Choices
{
    private static boolean Options()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Sim\n2 - Não");
        if(input.nextInt() == 1) return true;
        else return false;
    }

    public static boolean CheeseChoice()
    {
        System.out.println("Queijo?");
        return Options();
    }

    public static boolean HamburguerChoice()
    {
        System.out.println("Hamburguer?");
        return Options();
    }

    public static boolean SaladChoice()
    {
        System.out.println("Salada?");
        return Options();
    }
}
