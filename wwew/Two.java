public class Two{
    public void triangle(int n){
        if(n > 0){
            printStars(n);
            triangle(n-1);
        }
    }

    public void reverseTriangle(int n){
        
    }

    static void printStars(int n){
        for (int i = 0; i < n; i++){
            System.out.println("*");
        }
        System.out.println("");
    }
}
