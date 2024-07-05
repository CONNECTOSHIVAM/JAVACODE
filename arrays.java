public class arrays {
    
public static void main(String args[])
{
     int a [] [] = new int [3] [3];
     a [0][0]=5;
     a [0][1]=8;
     a [0][2]=0;
     a [1][0]=5;
     a [1][1]=7;
     a [1][2]=7;
     a [2][0]=4;
     a [2][1]=3;
     a [2][2]=1;

          
     for(int i=0;i<3; i++)
     {
        for(int j=0;j<3;j++)
        {
            System.out.print(a[i] [j] + "  ");
        }
        System.out.println();
     }
}

}
