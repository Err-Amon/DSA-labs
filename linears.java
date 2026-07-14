public class linears {
public static void main(String arg[]){
 int[] A = {3,4,5,2,1,5,6,2,9,23,1,5};
 int index = linearSearch(A, 5);
 if(index != -1)
 System.out.println("Found at "+index);
 else
 System.out.println("Not found");
 }//main
 private static int linearSearch(int[] A, int key) {
 for(int i=0; i<A.length; i++)
 if(A[i]==key)
 return i;
 return -1;
    }  
}
