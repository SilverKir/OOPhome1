package seminar.sem1.task1;

import java.util.ArrayList;
import java.util.List;

public class WaterVendingMachine implements VendingMachine   {
List<Product> productList= new ArrayList<>();

public void addBottle(BottleOfWater bottle){
    productList.add(bottle);
}

    @Override
    public void initProducts(List<Product> list) {
        productList=list;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
}
