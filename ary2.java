public class ary2 {
    
    public static void main(String[] args) {
        

        int arr[][]= new int[3][2];
        arr[0][0]=9;
        arr[0][1]=7;
        arr[1][0]=4;
        arr[1][1]=3;
        arr[2][0]=2;
        arr[2][1]=1;

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
