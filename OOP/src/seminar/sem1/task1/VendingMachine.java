package seminar.sem1.task1;

import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
  void initProducts(List<Product> list);
   Product getProduct(String name);


}
