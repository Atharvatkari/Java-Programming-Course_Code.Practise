import java.util.PriorityQueue;

public class PriorityQueueClass {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        Student(String name, int rank){
         this.name = name;
         this.rank = rank;   
        }

        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        
        PriorityQueue<Student> pq = new PriorityQueue();
        // pq.add(3);
        // pq.add(5);
        // pq.add(2);
        // pq.add(0);

        pq.add(new Student("A", 4));
        pq.add(new Student("C", 14));
        pq.add(new Student("F", 64));
        pq.add(new Student("w", 23));


        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name +" -> "+pq.peek().rank);
            pq.remove();
        }
        
    }
}
