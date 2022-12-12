import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
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
//        peaches.addProducts(basket);
        blackPepper.addProducts(basket);
        redPepper.addProducts(basket);
        System.out.println(basket);

        basket.remove(buckwheat);
        System.out.println(basket);

        separator();

        Set<Recipe> recipes = new HashSet<>();
        Recipe apricotChicken = new Recipe("Курица с абрикосом");
        Recipe fruitMix = new Recipe("Фруктовый микс");
        Recipe porridgeChicken = new Recipe("Гречка с курицей");
        Recipe pastaChicken = new Recipe("Макароны с курицей");

        apricotChicken.addProducts(apricots, chicken, blackPepper);
        fruitMix.addProducts(apples, peaches, cherries, apricots);
        porridgeChicken.addProducts(buckwheat, chicken, onion, blackPepper);
        pastaChicken.addProducts(pasta, chicken, onion, blackPepper);

        apricotChicken.addRecipes(recipes);
        fruitMix.addRecipes(recipes);
        porridgeChicken.addRecipes(recipes);
        pastaChicken.addRecipes(recipes);

        System.out.println(recipes);

        Integer[] forList = new Integer[20];
        for (int i = 0; i < forList.length; i++) {
            forList[i] = (int) (Math.random() * 1000);
        }
        List<Integer> integerList = Arrays.asList(forList);

        System.out.println(integerList);
    }

    public static void separator() {
        System.out.println("=========================================================");
    }
}


