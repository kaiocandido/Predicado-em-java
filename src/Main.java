import entities.MyPredicate;
import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("Hd case", 80.90));

        //forma 1
        //list.removeIf(new MyPredicate());


        //forma 2
        //list.removeIf(Product::staticProductPredicate);

        //forma 3
        //list.removeIf(Product::noStaticProductPredicate);

        //forma 4
        //Predicate<Product> predi = p -> p.getPrice() >= 100;
        //list.removeIf(predi);

        //forma 5
        list.removeIf(p -> p.getPrice() >= 100.00);

        for (Product p : list){
            System.out.println(p);
        }


    }
}