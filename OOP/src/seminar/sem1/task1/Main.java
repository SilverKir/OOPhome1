package seminar.sem1.task1;

public class Main {
    public static void main(String[] args) {
    WaterVendingMachine machine=new WaterVendingMachine();
    machine.addBottle(new BottleOfWater("Байкал1", 10,1));
    machine.addBottle(new BottleOfWater("Байкал2", 9,10));
    machine.addBottle(new BottleOfWater("Байкал3", 11,3));
    machine.addBottle(new BottleOfWater("Байкал4", 13,2));
    machine.addBottle(new BottleOfWater("Байкал5", 15,3));
        System.out.println("machine.getProduct(\"Байкал2\") = " + machine.getProduct("Байкал2"));
        printGetProduct(machine);

    HotDrinksVendingMachine hotDrinksVendingMachine= new HotDrinksVendingMachine();
    hotDrinksVendingMachine.addHotDrink(new HotDrink("Кофе",50,0.5,70));
    hotDrinksVendingMachine.addHotDrink(new HotDrink("Какао",150,1,80));
    hotDrinksVendingMachine.addHotDrink(new HotDrink("Чай",30,0.5,50));
    hotDrinksVendingMachine.addHotDrink(new HotDrink("Глинтвейн",250,0.5,70));
    hotDrinksVendingMachine.addBottle(new BottleOfWater("Байкал5", 15,3));
    hotDrinksVendingMachine.addBottle(new BottleOfWater("Байкал1", 10,1));

        System.out.println("Запрос Кофе = " + hotDrinksVendingMachine.getProduct("Кофе"));
        System.out.println("Какао, 1 = " + hotDrinksVendingMachine.getProduct("Какао", 1));
        System.out.println("Байкал 5 = " + hotDrinksVendingMachine.getProduct("Байкал5",3));
        System.out.println("Глинтвейн = " + hotDrinksVendingMachine.getProduct("Глинтвейн", 0.5, 70));
    }

    public static void printGetProduct(VendingMachine vendingMachine) {
        System.out.println(vendingMachine.getProduct("Байкал3"));

    }
}
