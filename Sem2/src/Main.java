import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Dan", 4.5f);
        Student s2 = new Student("Ana", 3.5f);
        Student s3 = new Student("Dan", 4.5f);
        Set<Student> studSet = new HashSet<>();
        studSet.add(s1);
        studSet.add(s2);
        studSet.add(s3);
        for (var s : studSet) {
            System.out.println(s);
        }

        Set<Student> studTree= new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        studTree.add(s1);
        studTree.add(s2);
        studTree.add(s3);
        for (var s : studTree) {
            System.out.println(s);
        }
        Set<Student> avrTree= new TreeSet<Student>();
        avrTree.add(s1);
        avrTree.add(s2);
        avrTree.add(s3);
        for (var s : avrTree) {
            System.out.println(s);
        }

    }
}