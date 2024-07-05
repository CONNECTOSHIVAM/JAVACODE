public class obj1 {
    

    //Instance variable because its existance out of methood or funtion
    int a;
    String name= "RAHUL";
    public static void main(String[] args) {
        
        //local variable because it's existance under the methood
        int a=9;
        //declare the variable 
        //Create the object
        int num=9; 
        obj1 obj = new obj1();
        obj1 ob= new obj1();
         
        obj.name="SHIVAM";
        System.out.println(obj.name);
        System.out.println(obj.a);


        System.out.println(ob.name);
        System.out.println(ob.a);
    }
}
