
public class Product {

    private String ProductId;
    private String Name;
    private double Price;
    private int Quantity;
    private String Category;

    public Product() {
    }

    public Product(String Name, String ProductId,  double Price, int Quantity, String Category) {
        this.ProductId = ProductId;
        this.Name = Name;
        this.Price = Price;
        this.Quantity = Quantity;
        this.Category = Category;
    }

    public String getProductId() {
        return ProductId;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }
    
    public String getPrice2() {
        return String.format("%.2f", this.Price);
    }
    
     public double getPrice3() {
        return Double.parseDouble(String.format("%.2f", this.Price));
    }

    public int getQuantity() {
        return Quantity;
    }

    public String getCategory() {
        return Category;
    }

    public void setProductId(String ProductId) {
        if (ProductId != null && ProductId.length() != 0) {
            this.ProductId = ProductId;
        }
    }

    public void setName(String Name) {
        if (Name != null && Name.length() !=0 && Name.length() <= 100) {
            this.Name = Name;
        }
    }

    public void setPrice(double Price) {
        if (Price >= 0 && Price < 1000000) {
            this.Price = Price;
        }
    }

    public void setQuantity(int Quantity) {
        if (Quantity >= 0 && Quantity < 10000) {
            this.Quantity = Quantity;
        }
    }

    public void setCategory(String Category) {
        if (Category != null && Category.length() !=0 && Category.length() <= 50) {
            this.Category = Category;
        }
    }

    @Override
    public String toString() {
        return "Product{" + "ProductId=" + ProductId + ", Name=" + Name + ", Price=" + Price + ", Quantity=" + Quantity + ", Category=" + Category + '}';
    }
    
    
}
