class clac{
   
    public int add(int a, int b )
    {
        int result=a+b;
        return result;
    }
    public int add(int a, int b, int c)
    {
        int result=a+b+c;
        return result;
    }
    public double add(double a, double b)
    {
        double result= a+b;
        return result;
    }
}


public class funovr {
    
    public static void main(String[] args) {
        
        clac obj = new clac();

        int result=obj.add(7, 8);
        int result1=obj.add(7,9,1);
        double result2= obj.add(7.5,9.3);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

    }
}
