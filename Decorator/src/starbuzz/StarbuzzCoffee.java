public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        beverage = new Espresso(beverage);
        System.out.println("double " + beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new Espresso();
        beverage2 = new Espresso(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println("double " + beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new Espresso();
        beverage3 = new Espresso(beverage3);
        beverage3 = new Whip(beverage3);
        beverage3 = new Oreo(beverage3);
        System.out.println("double " + beverage3.getDescription() + " $" + beverage3.cost());

        Beverage beverage4 = new Espresso();
        beverage4 = new Espresso(beverage4);
        beverage4 = new Whip(beverage4);
        beverage4 = new Milk(beverage4);
        System.out.println("double " + beverage4.getDescription() + " $" + beverage4.cost());

        Beverage beverage5 = new Espresso();
        beverage5 = new Espresso(beverage5);
        beverage5 = new Milk(beverage5);
        beverage5 = new Soy(beverage5);
        System.out.println("double " + beverage5.getDescription() + " $" + beverage5.cost());

        Beverage beverage6 = new Espresso();
        beverage6 = new Espresso(beverage6);
        beverage6 = new Whip(beverage6);
        beverage6 = new Milk(beverage6);
        System.out.println("double " + beverage6.getDescription() + " $" + beverage6.cost());

        Beverage beverage7 = new Espresso();
        beverage7 = new Espresso(beverage7);
        beverage7 = new Whip(beverage7);
        beverage7 = new Milk(beverage7);
        beverage7 = new Oreo(beverage7);
        beverage7 = new Soy(beverage7);
        beverage7 = new Mocha(beverage7);
        System.out.println("double " + beverage7.getDescription() + " $" + beverage7.cost());


    }
}
