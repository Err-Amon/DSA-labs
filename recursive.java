public class recursive {
    public int factorial(int x){
        if(x==1){
            return 1;
        }
        else
        {
            return x * factorial(x - 1);
        }
    }
    
    public static void main(String[] args) {
        recursive obj = new recursive();
        int result = obj.factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }

}
