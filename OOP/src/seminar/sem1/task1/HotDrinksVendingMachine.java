package seminar.sem1.task1;
import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {

    List<Product> productList = new ArrayList<>();

    public void addHotDrink(HotDrink drink) {
        productList.add(drink);
    }

    public void addBottle(BottleOfWater bottle){
        productList.add(bottle);
    }

    @Override
    public void initProducts(List<Product> list) {
        productList = list;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    /**
     * @param name        Им напитка
     * @param volume      объем
     * @param temperature температура
     * @return
     * @apiNote Получение информации о имеющемс напитке в автомате
     */
    public Product getProduct(String name, double volume, int temperature) {
        for (Product product : productList) {
            if (product.getName().equals(name)
                    && ((HotDrink)product).getVolume() == volume
                    && ((HotDrink)product).getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }
    public Product getProduct(String name, double volume) {
        for (Product product : productList) {
            if (product.getName().equals(name)
                    && ((BottleOfWater)product).getVolume() == volume) {
                return product;
            }
        }
        return null;
    }

}
