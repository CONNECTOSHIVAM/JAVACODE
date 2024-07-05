public class enhancedforloop1 {
    
    public static void main(String[] args) {
        
        int arr[][]={{4,8,9,3,4},{8,6,9,0},{9,7,6}};

        for(int a[] : arr)
        {
            for(int b: a)
            {
                System.out.print(b+" ");
            }
           System.out.println();
        }
    }
}
