public class strg1 {
    
    public static void main(String[] args) {
        
        // Mutable string 
        String brand="pwskills";
        System.out.println(brand);
        brand.concat("SHIVAM");
        System.out.println(brand);
        

        //Mutable string 
        StringBuilder brand1= new StringBuilder("pwskills");
        System.out.println(brand1);
        brand1.append("   shivam");
        System.out.println(brand1);

    }
}
