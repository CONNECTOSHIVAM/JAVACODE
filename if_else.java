public class if_else {
    
    public static void main(String args[])
    {
        int age = 5;

        if(age>=18 && age<60 )
        {
            System.out.println("You can Drive ..");
        }
        else if (age>=60) {
            System.out.println("you can Drive but take care yourself..");
        }
        else 
        {
            System.out.println("You can't Drive ");
        }
    }
}
