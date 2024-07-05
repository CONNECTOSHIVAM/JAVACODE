public class logioptr {
    
    public static void main(String args[])
    {
        int age=17;
        int b=46;
        int c=17;

        System.out.println(age==c && age>c );
        System.out.println(age<b && age==c);
        System.out.println(age==c || c>b);
        System.out.println(c>b || b==c);
    }
}
