import java.util.Date;
public class person {
    private String name;
    private int age;
    private Date birthdate;
    public person(){
        this.name = "Unknown";
        this.age = 0;
        this.birthdate = new Date();
        
    }
    public person(String n, int a , Date b){
        this.name = n;
        this.age = a;
        this.birthdate = b;
    }

    public void set_values(String n, int a, Date b){
        this.name = n;
        this.age = a;
        this.birthdate = b;
    }

    public String get_name(){
        return name;
    }
    public int get_age(){
        return age;
    }
    public Date get_birthdate(){
        return birthdate;
    }


    public static void main(String[] args) {    
        person p1 = new person();
        p1.set_values("Alice", 30, new Date());
        System.out.println("Name: " + p1.get_name());
        System.out.println("Age: " + p1.get_age());
        System.out.println("Date of Birth: " + p1.get_birthdate());
    }
}
