import java.util.*;

public class Recipe {

    private final String recipeName;
    private final Set<Product> multipleProducts;

    private final Map<Product, Integer> products;
    private float wholeCost;
    private Recipe recipe;

    public Recipe(String recipeName, float wholeCost, Product... products) {
        this.recipeName = validateRecipeName(recipeName);
        this.multipleProducts = new HashSet<>();
        this.products = new HashMap<>();
        setWholeCost(0.0f);
        for (Product product : products) {
            setWholeCost((getWholeCost() + product.getCost()) * product.getCount());
            this.products.put(product, product.getCount());
        }
    }


    public void addProducts(Product... multipleProducts) {
        this.multipleProducts.addAll(Arrays.asList(multipleProducts));
        for (Product t : this.multipleProducts) {
            this.wholeCost += t.getCost();
        }

    }


    private String validateRecipeName(String value) {
        if (value == null || value.isBlank() || value.isEmpty()) {
            throw new IllegalArgumentException("Введите название рецепта");
        } else {
            return value;
        }
    }

    public void addRecipes(Recipe recipe) {
        if (!recipe.equals(this.recipe)) {
            recipe.addRecipes(recipe);
        }else {
            throw new UnsupportedOperationException("Такой рецепт " + getRecipeName() + " уже есть в списке");
        }
    }


    public String getRecipeName() {
        return recipeName;
    }

    public Set<Product> getMultipleProducts() {
        return multipleProducts;
    }

    public float getWholeCost() {
        return wholeCost;
    }


    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void setWholeCost(float wholeCost) {
        this.wholeCost = wholeCost;
    }

    @Override
    public String toString() {
        return recipeName + ", Стоимостью = " + wholeCost + " рублей\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return recipeName.equals(recipe.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }
}
