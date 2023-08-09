import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> produtos = new ArrayList<>();

        produtos.add(new Product("Zorro Mask", 1000.00));
        produtos.add(new Product("Carro", 2000.00));
        produtos.add(new Product("Martelo", 10000.00));


        produtos.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome()));

        for (Product p : produtos)
            System.out.println(p);

    }
}