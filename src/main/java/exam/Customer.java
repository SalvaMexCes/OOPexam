package exam;

public abstract class Customer extends Person{

    private String[] clothingItems;

    public void printPriceAfterDiscount(String[] clothingItems){
        System.out.println("Price after discount: ");
    }

    public Customer(String name, Size size) {
        super(name, size);
    }

}
