import java.util.Objects;
import java.util.Set;

public class Product {

    private String name;
    private float amount;
    private float cost;

    public Product(String name, float amount, float cost) {
        this.name = validateParameters(name);
        this.amount = validateNumbers(amount);
        this.cost = validateNumbers(cost);
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }


    public void addProducts(Set<Product> basket) {
        if (!basket.contains(this)) {
            basket.add(this);
        }else {
            throw new UnsupportedOperationException("Такой товар " + getName() + " уже есть в корзине");
        }
    }

    public String validateParameters(String value) {
        if (value == null || value.isEmpty() || value.isBlank()) {
            throw new UnsupportedOperationException("Не ввёл название продукта");
        } else {
            return value;
        }
    }

    public float validateNumbers(float value) {
        if (value == 0) {
            throw new UnsupportedOperationException("Введите количество");
        } else if (value < 0) {
            return value = Math.abs(value);
        } else {
            return value;
        }
    }

    @Override
    public String toString() {
        return name + ", количество " + amount + " кг, стоимость " + cost + " рублей" +'\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Float.compare(product.amount, amount) == 0 && Float.compare(product.cost, cost) == 0 && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount, cost);
    }
}
