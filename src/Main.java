import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(18,"Java","Nikita"));
        students.add(new Student(22,"JavaScript","Olga"));
        students.add(new Student(21,"Java","Aidai"));
        students.add(new Student(21,"JavaScript","Nurs"));
        students.add(new Student(23,"Java","Beka"));
        students.add(new Student(19,"JavaScript","Aydai"));
        students.add(new Student(20,"Java","Kiril"));
        students.add(new Student(17,"JavaScript","Oleg"));
        students.add(new Student(19,"Java","Mihail"));
        students.add(new Student(22,"JavaScript","Aidana"));

        for (Student student : students){
            System.out.println(student);
        }

        ArrayList<Student> studentsJava = new ArrayList<>();
        ArrayList<Student> studentsJavaScript = new ArrayList<>();
        ArrayList<Student> studentsSortedAge = new ArrayList<>();
        ArrayList<Student> studentsNamedA = new ArrayList<>();


        for (int i = 0 ; i < students.size();  i++){
            if (students.get(i).getGroup().equals("Java")){
                studentsJava.add(students.get(i));
            }

            if (students.get(i).getGroup().equals("JavaScript")){
                studentsJavaScript.add(students.get(i));
            }

            if (students.get(i).getAge() >= 19 && students.get(i).getAge() <= 23 ) {
                studentsSortedAge.add(students.get(i));
            }

            if(students.get(i).getName().contains("a")){
                studentsNamedA.add(students.get(i));
            }
        }

    }
}