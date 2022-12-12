import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //Домашка 1

        Set<Product> basket = new HashSet<>();

        Product apples = new Product("Яблоки", 1, 180f);
        Product peaches = new Product("Персики", 1, 420f);
        Product cherries = new Product("Вишня", 3, 320f);
        Product apricots = new Product("Абрикосы", 1.5f, 230f);
        Product chicken = new Product("Курица", 2.1f, 283f);
        Product pasta = new Product("Макароны", 0.9f, 27f);
        Product buckwheat = new Product("Гречка", 1.8f, 148f);
        Product onion = new Product("Лук", 0.5f, 24f);
        Product blackPepper = new Product("Черный перец", 0.05f, 15f);
        Product redPepper = new Product("Красный перец", 0.05f, 16f);

        System.out.println(basket);

        apples.addProducts(basket);
        peaches.addProducts(basket);
        cherries.addProducts(basket);
        apricots.addProducts(basket);
        chicken.addProducts(basket);
        pasta.addProducts(basket);
        buckwheat.addProducts(basket);
        onion.addProducts(basket);
        blackPepper.addProducts(basket);
        redPepper.addProducts(basket);
        System.out.println(basket);

        basket.remove(buckwheat);
        System.out.println(basket);
    }
}
