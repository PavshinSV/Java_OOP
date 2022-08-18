package Lesson04.HomeWork;

import java.time.LocalDate;
import java.time.LocalTime;

public class Program {
    public static void main(String[] args) {
        TaskTree taskList = new TaskTree();
        taskList.add(new Task(
                LocalDate.of(2022, 6, 18),
                LocalTime.of(16, 47),
                LocalDate.of(2022, 11, 11),
                "Sergey",
                "Studying"));

        taskList.add(new Task(
                LocalDate.of(2021, 7, 17),
                LocalTime.of(16, 47),
                LocalDate.of(2022, 10, 1),
                "Sergey",
                "RUSAL"));

        taskList.add(new Task(
                LocalDate.of(2021, 8, 23),
                LocalTime.of(12, 30),
                LocalDate.of(2022, 8, 21),
                "Sergey",
                "Martenovskaja"));

        taskList.add(new Task(
                LocalDate.of(2022, 8, 17),
                LocalTime.of(15, 00),
                LocalDate.of(2022, 12, 14),
                "Sergey",
                "EL+"));

        System.out.println(taskList);

        ExportToXML exp = new ExportToXML();
        exp.exportFile();

    }
}
