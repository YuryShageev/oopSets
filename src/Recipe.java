import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private final String recipeName;
    private final Set<Product> multipleProducts;
    private float wholeCost;

    public Recipe(String recipeName) {
        this.recipeName = validateRecipeName(recipeName);
        this.multipleProducts = new HashSet<>();
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

    public void addRecipes(Set<Recipe> recipes) {
        if (!recipes.contains(this)) {
            recipes.add(this);
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
