
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //Домашка 1

        Set<Product> basket = new HashSet<>();

        Product apples = new Product("Яблоки", 1, 60, 1);
        Product peaches = new Product("Персики", 1, 120,1);
        Product cherries = new Product("Вишня", 1, 150,1);
        Product apricots = new Product("Абрикосы", 1, 180,1);
        Product chicken = new Product("Курица", 1, 137,1);
        Product pasta = new Product("Макароны", 1, 27f,1);
        Product buckwheat = new Product("Гречка", 1, 70,1);
        Product onion = new Product("Лук", 1, 24f,1);
        Product blackPepper = new Product("Черный перец", 1, 15f,1);
        Product redPepper = new Product("Красный перец", 1, 16f,1);

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

        Map<Product, Integer> apricotChicken = new HashMap<>();
//        Recipe apricotChicken = new Recipe("Курица с абрикосом", 0, apricots, chicken, blackPepper);
//        Recipe fruitMix = new Recipe("Фруктовый микс", 0, apples, peaches, cherries, apricots);
//        Recipe porridgeChicken = new Recipe("Гречка с курицей",0,buckwheat, chicken, onion, blackPepper);
//        Recipe pastaChicken = new Recipe("Макароны с курицей",0,pasta, chicken, onion, blackPepper);

        apricotChicken.put(apples, 3);
        apricotChicken.put(chicken, 1);
        apricotChicken.put(blackPepper, 1);

//        apricotChicken.addProducts(apricots, chicken, blackPepper);
//        fruitMix.addProducts(apples, peaches, cherries, apricots);
//        porridgeChicken.addProducts(buckwheat, chicken, onion, blackPepper);
//        pastaChicken.addProducts(pasta, chicken, onion, blackPepper);
//
//        apricotChicken.addRecipes(apricotChicken);
//        fruitMix.addRecipes(recipes);
//        porridgeChicken.addRecipes(recipes);
//        pastaChicken.addRecipes(recipes);

        System.out.println(apricotChicken);

       Set<Integer> forList = new HashSet<>();
        for (int i = 0; i <= 20; i++) {
            forList.add((int) (Math.random()*1000) + 1);
        }
        forList.removeIf(integer -> integer % 2 != 0);

        System.out.println(forList);
    }

    public static void separator() {
        System.out.println("=========================================================");
    }
}


