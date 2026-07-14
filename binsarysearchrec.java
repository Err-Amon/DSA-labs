public class binsarysearchrec {
    public static void main(String arg[]) {
 int[] A = {1, 2, 4, 5, 7, 8, 9, 12, 26, 27, 34, 36, 38, 45, 67, 88};
 int index = binarySearchRec(A, 7, 0, A.length);
 if (index != -1) {
 System.out.println("Found at " + index);
 } else {
 System.out.println("Not found");
 }
 }//main
 private static int binarySearchRec(int[] A, int key, int lowerBound, int
upperBound) {
 int curIn;
 curIn = (lowerBound + upperBound) / 2;
 if (A[curIn] == key) {
 return curIn; 
 } else if (lowerBound > upperBound) {
 return -1;
 } else{
 if (A[curIn] < key) {
 return binarySearchRec(A, key, curIn + 1, upperBound);
 } else {
 return binarySearchRec(A, key, lowerBound, curIn - 1);}
        } 
    }
}
