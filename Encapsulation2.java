class Student {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation2 {

    public static void main(String[] args) {

        Student obj = new Student();
        Student obj1 = new Student();
        obj.setAge(18);
        obj1.setAge(20);
        obj.setName("SHIVAM");
        obj1.setName("SANSKRITI");

        int studAge = obj.getAge();
        System.out.println("Student 1 Age: " + studAge);

        String studName = obj.getName();
        System.out.println("Student 1 Name: " + studName);

        int stud2Age = obj1.getAge();
        System.out.println("Student 2 Age: " + stud2Age);

        String stud2Name = obj1.getName();
        System.out.println("Student 2 Name: " + stud2Name);
    }
}
