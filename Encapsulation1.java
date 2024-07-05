class Student{

   private int age;
   private String name;


    public void setdata1(int  age)
    {
       this.age = age;
    }
    public void setdata2(String name)
    {
        this.name = name;
    }
    public void show()
    {
        System.out.println(name+"  "+age);
    }
}



public class Encapsulation1 {

    public static void main(String[] args) {
     
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setdata1(20);
        obj1.setdata1(18);
        obj.setdata2("Sanskriti");
        obj1.setdata2("shivam");
        obj.show();
        obj1.show();
    }
    
}
