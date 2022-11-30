public class Product {
    public Product (int id, String name, String description, double price,int stockAmount, String color){
        System.out.println("Yapıcı blok çalıştı.");
        this.id = id;
        this.color = color;
        this.price=price;
        this.description=description;
        this.stockAmount=stockAmount;
        this.code=code;

    }

    //attribute veya field:
    public int id;
    public String name;
    public String description;
    public double price;
    public int stockAmount;
    public String color;
    public String code;

    //getter:
    public int getId() {
        return id;
    }

    //setter:
    public void setId(int id) {
        this.id = id; //this içinde bulunduğumuz class demek.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public void set_ode(String _ode) {
        this.code = code;
    }

    public String getCode() {
        return this.name.substring(0, 1) + id;
    }
}
