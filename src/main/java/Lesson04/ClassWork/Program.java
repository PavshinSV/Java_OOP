package Lesson04.ClassWork;

public class Program {
    public static void main(String[] args) {
        ListAr<Integer> list = new ListAr<>(1);
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add(2);
        System.out.println(list);
        list.add(3);
        System.out.println(list);
        list.add(4);
        System.out.println(list);
    }
}
