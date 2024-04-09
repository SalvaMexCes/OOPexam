package exam;

public class Manager extends Employee{

    final private double EXTRA_DISCOUNT = 0.05;
    private double salary;

    public Manager(String name, Size size) {
        super(name, size);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
