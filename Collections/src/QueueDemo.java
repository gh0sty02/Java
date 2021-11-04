import com.company.Student;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Student> q = new PriorityQueue<>();
        q.offer(new Student("A", 100));
        q.offer(new Student("B", 101));
        q.offer(new Student("C", 102));
        q.offer(new Student("D", 103));


        for(Student s : q){
            System.out.println(s);
        }

    }
}
