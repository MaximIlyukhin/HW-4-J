import java.util.LinkedList;

/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */

public class Task2 {
    public static void main(String[] args) {
        System.out.println(creatList(10));
        enqueue(creatList(10));
        dequeue(creatList(10));
        first(creatList(10));
    }

    private static void first(LinkedList<Integer> creatList) {
        System.out.println("Возвращает первый элемент из очереди, не удаляя");
        System.out.println(creatList.getFirst());
        System.out.println(creatList);
    }

    private static void dequeue(LinkedList<Integer> creatList) {
        int firstEl = creatList.getFirst();
        creatList.removeFirst();
        System.out.println("Возвращает первый элемент из очереди и удаляет его");
        System.out.println(firstEl);
        System.out.println(creatList);
    }

    private static void enqueue(LinkedList<Integer> creatList) {
        int firstEl = creatList.getFirst();
        creatList.removeFirst();
        creatList.add(firstEl);
        System.out.println("Помещает элемент в конец очереди");
        System.out.println(firstEl);
        System.out.println(creatList);
    }

    private static LinkedList<Integer> creatList(int N) {
        LinkedList<Integer> listInt = new LinkedList<>();
        for (int i = 1; i < N + 1; i++) {
            listInt.add(i);
        }
        return listInt;
    }
}
