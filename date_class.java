import java.util.Scanner;
class date{
    int day;
    int month;
    int year;

    date(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }

    void display(){
        System.out.println(day + "/" + month + "/" + year);
    }
}

public class date_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();        
        date d1 = new date(day, month, year);
        d1.display();
        sc.close();
    }
}
