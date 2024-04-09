package exam;

public class Business implements Payable{

    private String name = "Rita's Water Ice";
    private int productQtySupplied = 15000;
    private double productPrice = 4.99;

    public Business(String name, Size size){
        this.name = name;
        this.productQtySupplied = productQtySupplied;
        this.productPrice = productPrice;
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
