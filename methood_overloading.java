class clac{
    public int add(int a, int b) {
        
        int result= a+b;
        return result;
    }
    public int add(int a, int b, int c)
    {
        int result=a+b+c;
        return result;
    }
    public double add(double n, double m)
    {
        double result=n+m;
        return result;
    }
}




public class methood_overloading {
    
    public static void main(String args[])
    {
      clac obj = new clac();
      int result= obj.add(7,8);
      int result2=obj.add(8,5,7);
      double result3=obj.add(7.9,5.5);

      System.out.println(result);
      System.out.println(result2);
      System.out.println(result3);
    }
}
