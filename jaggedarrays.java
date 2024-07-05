//jagged arrays:- In the jagged arrays ,num of row is fixed & not number of columns  
public class jaggedarrays {
    
    public static void main(String[] args) {
        
        int nums[][]={{2,3,4,6},{3,6},{1,2,4}};

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

    }
}
