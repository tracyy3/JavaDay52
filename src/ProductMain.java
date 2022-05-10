public class ProductMain {

    public static void main (String[] args) {
        Product product= new Product("A Flower dozen", 20.0, 5);

        product.printProduct( );
        product.totalCost();
    }
}