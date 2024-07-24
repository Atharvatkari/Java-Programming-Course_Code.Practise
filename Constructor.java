public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Atharva";
        s1.rollno = 03;
        s1.password = "abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2 = new Student(s1);//copy
        s2.password = "xyz";
        s1.marks[2]=100;
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int rollno;
    int marks[];
    String password;
    //Shallow copy constructer
    //  Student(Student s1){
    //     this.name = s1.name;
    //     this.rollno = s1.rollno;
    //     this.marks = s1.marks;
    // }

    // Deep copy constructor
    Student(Student s1){
           this.name = s1.name;
           this.rollno = s1.rollno;
           this.marks = new int[3];
           for(int i=0; i<3; i++){
           this.marks[i] = s1.marks[i];
        }
    }
    public void stuName(){
        System.out.println("name of the student is : "+name);
    }
    Student(){
        marks = new int[3];
    }
    
}