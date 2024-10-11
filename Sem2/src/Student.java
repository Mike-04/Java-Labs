import java.util.Objects;

public class Student implements Comparable{
    private final String Name;
    private final Float average;

    public Student(String Name, Float average) {
        this.Name = Name;
        this.average = average;
    }

    public Float getAverage() {
        return average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Float.compare(student.average, average) == 0 &&
                Name.equals(student.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, average);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", average=" + average +
                '}';
    }
    public String getName() {
        return Name;
    }


    @Override
    public int compareTo(Object o) {
        return -(this.average.compareTo(((Student)o).average));
    }
}

