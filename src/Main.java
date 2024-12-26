import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(18,"Math","Nikita"));
        students.add(new Student(22,"Prog","Olga"));
        students.add(new Student(21,"Math","Aidai"));
        students.add(new Student(21,"Prog","Nurs"));
        students.add(new Student(23,"Prog","Beka"));
        students.add(new Student(19,"Math","Aydai"));
        students.add(new Student(20,"Math","Kiril"));
        students.add(new Student(17,"Linguist","Oleg"));
        students.add(new Student(19,"Linguist","Mihail"));
        students.add(new Student(22,"Phil","Aidana"));

        for (Student student : students){
            System.out.println(student);
        }









    }
}