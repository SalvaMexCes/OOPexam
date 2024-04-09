package exam;

public class HourlyEmployee extends Employee{

    private float hoursWorked;
    private double hourlyWage;

    public HourlyEmployee(String name, Size size) {
        super(name, size);
    }


    @Override
    public double calculatePay() {
        return hoursWorked * hourlyWage;
    }
}
