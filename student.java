public class student {
    private String name;
    private int age;

    public void insertValue(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public void displayValue()
    {
        System.err.println("Name:" + name);
        System.err.println("Age:" + age);
    }

    public static void main(String[] args) {
        student obj = new student();
        obj.insertValue("Saikat", 20);
        obj.displayValue();

    }
}
