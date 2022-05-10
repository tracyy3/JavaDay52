public class Product {
    private String flowerProduct;
    private Double flowerCost;
    private Integer flowerQuantity;

    public Product( String flowerProduct, double flowerCost, Integer flowerQuantity ) {
        this.flowerCost = flowerCost;
        this.flowerQuantity = flowerQuantity;
        this.flowerProduct = flowerProduct;
}

public void printProduct( ) {
    System.out.println(this.flowerProduct + " cost "  + this.flowerCost + " and " + this.flowerQuantity + " dozens were purchased." );
}

public void totalCost() {
    this.flowerCost *= this.flowerQuantity;
    System.out.println("Total cost is: "+ this.flowerCost);
}
}