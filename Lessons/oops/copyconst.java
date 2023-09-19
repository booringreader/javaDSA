public class copyconst {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "abc";
        s1.roll = 2;
        s1.password = "kfapgh";
        s1.marks[0] = 100;
        s1.marks[1] = 88;
        s1.marks[2] = 45;

        Student s2 = new Student(s1);
        s2.password = "afjah";
    }
}

class Student{
    String name, password;
    int roll;
    int marks[];
    Student(){
        System.out.println("constructor called");
    }
    // shallow copy constructor 
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    // }

    // deep copy constructor 
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}