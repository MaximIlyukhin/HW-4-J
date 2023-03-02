import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

public class Task1 {
    public static void main(String[] args) {
        System.out.println(creatList());

        reverse1(creatList()); // способ по индексу
        reverse2(creatList()); // способ по последнему элементу + удаление
    }

    private static LinkedList<String> creatList() {
        LinkedList<String> list = new LinkedList<>();
        list.add("m");
        list.add("o");
        list.add("c");
        list.add("l");
        list.add("e");
        list.add("w");
        return list;
    }

    private static void reverse1(LinkedList<String> list) {
        LinkedList<String> listReverse = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            listReverse.add(list.get(i));
        }
        System.out.println("Reverse №1");
        System.out.println(listReverse);
    }

    private static void reverse2(LinkedList<String> list) {
        LinkedList<String> listReverse = new LinkedList<>();
        while(list.size()>0) {
            listReverse.add(list.getLast());
            list.removeLast();
        }
        System.out.println("Reverse №2");
        System.out.print(listReverse);
    }
}