import java.util.*;

public class MyMap {
    private Map<Integer, List<Student>> mm;
    public MyMap() {
        mm = new TreeMap<Integer,List<Student>>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
    }

    public void add(Student s) {
        final Integer key = Math.round(s.getAverage());
        List<Student> l = mm.get(key);
        if(l != null) {
            l.add(s);
        } else {
            l = new ArrayList<Student>();
            l.add(s);
            mm.put(key, l);
        }
    }

}
