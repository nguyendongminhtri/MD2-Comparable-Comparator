public class Student implements Comparable<Student>{
    private String name;
    private int age;
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                " - age: "+age+
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int tempt = this.getName().compareTo(o.getName());
        if(tempt!=0){
            return tempt;
        }
        tempt = this.getAge() - o.getAge();
        return tempt;
    }
}
