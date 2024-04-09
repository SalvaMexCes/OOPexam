package exam;

public class Main {

    public static void main(String[] args) {

        //Q1
        String[] clothingArray = new String[]{"Jeans", "T-shirt", "Hat"};
        clothingArray[0] = Size.MEDIUM.toString();
        clothingArray[1] = Size.SMALL.toString();
        clothingArray[2] = Size.LARGE.toString();

        //Q2
        

        //Q3a
        Student student1 = new Student("Mike", Size.SMALL);
        Student student2 = new Student("Alex", Size.XL);

        //Q3b

        //Q4

        //Q5

        //Q6
        Manager uniqueManager = new Manager("Joe",Size.LARGE );
        HourlyEmployee uniqueHourlyEmployee = new HourlyEmployee("Walter", Size.XL);
        Business uniqueBusiness = new Business("Texas Roadhouse", Size.XL);

        //Q7






    }

}
