package Lesson04.HomeWork;

import java.io.File;

public class Program {
    public static void main(String[] args) {
        App app = new App(new View(), new ImportService(), new ExportService(), new AddRemoveService());
        app.start();
    }
}
