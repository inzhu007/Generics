import java.util.ArrayList;
import java.util.List;
public class Main4 {
    public static void main(String[] args) {
        Student student1 = new Student("Inzhu", "Duissenbay", 23, 3.07);
        Student student2 = new Student("Zhuldyz", "Almyrzaeva", 21, 3.05);
        Student student3 = new Student("Bob", "Smith", 11, 2.98);
        StudentList<Student> students = new StudentList<>();
        students.addStudent(student1);
        students.addStudent(student2);
        students.addStudent(student3);

        for (Student x : students.getStudents()) {
            System.out.println(x);
        }
        System.out.println("highest gpa: ");
        System.out.println(students.getHighestGpaStudent());
    }
}

class Student{
    private String firstName;
    private String lastName;
    private int studentId;
    private double gpa;

    public Student (String firstName, String lastName , int studentId , double gpa){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.gpa = gpa;
    }
    public Student(){}

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getStudentId() {
        return studentId;
    }
    public double getGpa() {
        return gpa;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String toString(){
        return "firt name: " + firstName + ",last name: " + lastName + ",student id: " + studentId + ",gpa: " + gpa;
    }
}

class  StudentList <T extends Student>{
    private List<T> students=new ArrayList<>();
    public StudentList(){
    }

    public StudentList(List<T> students){
        this.students = students;
    }

    void addStudent(T student){
        students.add(student);
    }
    void removeStudent(T student){
        students.remove(student);
    }
    T getHighestGpaStudent(){
        T highestGpaStud=students.get(0);
        for(T student : students){
            if(student.getGpa()>highestGpaStud.getGpa()){
                highestGpaStud = student;
            }
        }
        return highestGpaStud;
    }
    List<T> getStudents(){
        return students;
    }
    void Swap(int ind1,int ind2){
        T val=students.get(ind1);
        students.set(ind1,students.get(ind2));
        students.set(ind2,val);
    }
}