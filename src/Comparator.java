import java.util.Locale;

public class Comparator implements java.util.Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        return o1.getNome().toUpperCase().compareTo(o2.getNome());
    }
}
