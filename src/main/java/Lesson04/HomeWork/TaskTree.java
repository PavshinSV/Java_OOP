package Lesson04.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class TaskTree {
    public static List<Task> list = new ArrayList<>();

    public List<Task> getList() {
        return list;
    }

    public void add(Task task) {
        list.add(task);
        sort();
    }

    public void removeById(int id) {
        int i = 0;
        boolean notFind = true;
        while (notFind && i < list.size()) {
            if (list.get(i).getId() == id) {
                notFind = false;
            } else {
                i++;
            }
        }
        list.remove(i);
    }

    public void sort() {
        list.sort(new DeadlineSort());
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Task element :
                list) {
            str.append(element + "\n");
        }
        return str.toString();
    }
}
