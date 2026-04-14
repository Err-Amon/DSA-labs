
public class lab2 {
    public static void main(String[] args) {
          /* int[] int_array = new int[10];
        for(int i=0; i<10;i++){
            int_array[i] = i*2;
        } 
        for(int i=0; i<10;i++){
            System.out.print(int_array[i] + "\t");
        } } 
       //cloning an array
     int[] a = {9,5,4};
       int[] b = a;
       int[] c = (int[]) a.clone();
       System.out.print("\n Address of a: " + a);
       System.out.print("\n Address of b: " + b);
       System.out.print("\n Address of c: " + c);   
       int[] d = new int[a.length];
       for(int i=0; i<a.length;i++){
           d[i] = a[i];
       }
       System.out.print("\n Array d :");
         for(int i=0; i<d.length;i++){
              System.out.println(d[i] + " ");}*/
        
       //insertion in arrays
       int[] arr = new int[10];
       arr[0] = 9;
       arr[1] = 8;
       arr[2] =6 ;
       arr[3] = 5;
       for(int i=0; i<arr.length;i++){
           System.out.print(arr[i] + "\t");
       }
       int index = 2;
       int element = 7;
       for(int i = arr.length-1; i>index;i--){
           arr[i] = arr[i-1]; //shifting elements to the higher index
       }
       arr[index] = element; //inserting the new element at the specified index
       System.out.println("\n Array after insertion:");
         for(int i=0; i<arr.length;i++){
              System.out.print(arr[i] + "\t");  }
        


    }
    
}
