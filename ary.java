// Enhenced program of plus level 
public class ary{

    public static void main(String args[])
    {
        int nums[][]= {{5,6,7,2,7,7},{6,2,3,9,7,5},{6,5,9,0,3,5}};

        for(int a []: nums)
        { 

            for(int b: a)
            {
                System.out.print(b + "  ");
            }
            System.out.println();

        }
    } 
}