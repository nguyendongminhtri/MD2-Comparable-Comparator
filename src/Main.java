import java.util.*;

public class Main {
    public static void main(String[] args) {
     List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("a",4));
     studentList.add(new Student("a",1));
        studentList.add(new Student("c",2));
        studentList.add(new Student("b",3));

        System.out.println(studentList);
        Collections.sort(studentList);
        System.out.println("sau khi sap xep"+studentList);
        System.out.println("=================COMPARATOR==================");
        List<Student2> studentList2 = new ArrayList<>();
        studentList2.add(new Student2("a",4));
        studentList2.add(new Student2("a",1));
        studentList2.add(new Student2("c",2));
        studentList2.add(new Student2("b",3));
        System.out.println("truoc sap xep"+studentList2);
        ComparatorWithStudent2 comparatorWithStudent2 = new ComparatorWithStudent2();
        Collections.sort(studentList2,comparatorWithStudent2);
        System.out.println("sau sap xep Student 2"+studentList2);
    }
}