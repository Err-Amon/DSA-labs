public class Bsearch {
    public static void main(String arg[]){
 int[] A = {1,2,4,5,7,8,9,12,14,16,23,26,27,34,36,38,45,67,88};
 int index = binarySearch(A, 14);
 if(index != -1)
 System.out.println("Found at "+index);
 else
 System.out.println("Not found");
 }//main
 private static int binarySearch(int[] A, int key) {
 int lowerBound = 0;
 int upperBound = A.length - 1;
 int curIn;
 while (true) {
 curIn = (lowerBound + upperBound) / 2;
 if (A[curIn] == key) {
 return curIn; 
 } else if (lowerBound > upperBound) {
 return -1 ; 
 } else {
 if (A[curIn] < key) {
 lowerBound = curIn + 1; 
 } else {
 upperBound = curIn - 1; } } 
         } 
    }
}