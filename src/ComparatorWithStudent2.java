import java.util.Comparator;

public class ComparatorWithStudent2 implements Comparator<Student2> {
    @Override
    public int compare(Student2 o1, Student2 o2) {
        int tempt = o1.getName().compareTo(o2.getName());
        if(tempt!=0){
            return tempt;
        }
        tempt = o1.getAge() - o2.getAge();
        return tempt;
    }
}
