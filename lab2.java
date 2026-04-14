
public class lab2 {
    public static void main(String[] args) {
           int[] int_array = new int[10];
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
              System.out.println(d[i] + " ");}
        
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
        //deletion in arrays
        int[] arr = new int[8];
        for(int i=0;i<arr.length;i++){
            arr[i] = i+1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int index = 2;
        for(int i=index;i<arr.length-1;i++){
            arr[i] = arr[i+1]; //shifting elements to the lower index
        }
        arr[arr.length-1] = 0; //setting the last element to 0
        System.out.println("Array after deletion:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");    }
            //Two dimensional arrays
           int row = 3 , col = 3;
           int[][] matrix = new int[row][col]; 
           for(int i=0;i<row;i++){
               for(int j=0;j<col;j++){
                   matrix[i][j] = i+j; //assigning values to the matrix
               }
           }
           System.out.println("Two dimensional array:");
           for(int i=0;i<row;i++){
               for(int j=0;j<col;j++){
                   System.out.print(matrix[i][j] + "\t"); //printing the matrix
               }
               System.out.println();}  

         }}
