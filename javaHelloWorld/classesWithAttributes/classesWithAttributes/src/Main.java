public class Main {
    public static void main(String[] args) {
        Product product = new Product();

        // Product product = new Product(id:1, name: "Laptop", description: "Asus Laptop", stockAmount: 2, color: "Siyah");
        product.name = "Laptop";
        product.setId (1);
        product.description = "Asus Laptop";
        product.price = 5000;
        product.stockAmount = 3;
        product.color = "mavi";
        System.out.println(product.name);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);





    }
}