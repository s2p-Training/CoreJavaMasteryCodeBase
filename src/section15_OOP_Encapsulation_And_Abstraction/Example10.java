package section15_OOP_Encapsulation_And_Abstraction;

class ProductItem
{
    String name;
    String description;
    int qty;
    float price;
    boolean isLegal;

    // No-Argument Constructor
    public ProductItem()
    {
        this.name = "Nokia Lumia";
        this.description = "A Windows OS Based Smart Phone";
        this.qty  = 17;
        this.price = 45000.45f;
        this.isLegal = true;

    }

    // Parameterized Constructor-1
    public ProductItem(String name)
    {
        this.name = name;
    }

    // Parameterized Constructor-2
    public ProductItem(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    // All Argument Constructor
    public ProductItem(String name, String description, float price, int qty, boolean isLegal)
    {
        this.name = name;
        this.description = description;
        this.price = price;
        this.qty = qty;
        this.isLegal = isLegal;
    }

    // Private Constructor
    private ProductItem(float price, int qty, boolean isLegal)
    {
        this.price = price;
        this.qty   = qty;
        this.isLegal = isLegal;
    }

    // Copy Constructor
    public ProductItem(ProductItem p)
    {
        this.name = p.name;
        this.description = p.description;
        this.qty = p.qty;
        this.price = p.price;
        this.isLegal = p.isLegal;
    }

}

public class Example10
{
    public static void main(String[] args)
    {

    }
}
