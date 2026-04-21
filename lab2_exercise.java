class student{
    String stdName;
    String RegNo;
    float cgpa;
    public student(String stdName, String RegNo, float cgpa){
        this.stdName = stdName;
        this.RegNo = RegNo;
        this.cgpa = cgpa;
    }
    float maximum(student[] students){
        float maxCgpa = students[0].cgpa;
        for(int i=1; i<students.length;i++){
            if(students[i].cgpa > maxCgpa){
                maxCgpa = students[i].cgpa;
            }
        }
        return maxCgpa;
    }    
}
public class lab2_exercise {
    public static void main(String[] args) {
       student[] students = new student[5];
        students[0] = new student("Alice", "REG001", 3.5f);
        students[1] = new student("Bob", "REG002", 3.8f);
        students[2] = new student("Charlie", "REG003", 3.2f);
        students[3] = new student("David", "REG004", 3.9f);
        students[4] = new student("Eve", "REG005", 3.6f);

        float greater = students[0].maximum(students);
        System.out.println("The highest CGPA is: " + greater);

   /*  int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int sum = 0;

    for (int i = 0; i < matrix.length; i++) {
        sum += matrix[i][i]; // main diagonal
    }
      System.out.println("Sum of main diagonal: " + sum);*/
}} 
    
    
    

