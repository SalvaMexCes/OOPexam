package exam;

public abstract class Person {

    private String name;
    private Size size;

    public Person(String name, Size size){
    }

    public void printInfo(){
        System.out.println(name + size);
    }

}
