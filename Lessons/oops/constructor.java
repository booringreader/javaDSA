public class constructor {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("name");
        Student s3 = new Student(6);
    }    
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("new line");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}
