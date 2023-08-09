package datamodel;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class TodoData {
    private static TodoData instance = new TodoData();
    private static String fileName = "TodoListItem.txt";
    private ObservableList<TodoItem> todoItems;
    private DateTimeFormatter formatter;
    public static TodoData getInstance() {
        return instance;
    }

    private TodoData(){
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    }

    public void addTodoItem(TodoItem item) {
        todoItems.add(item);
    }
    public ObservableList<TodoItem> getTodoItems() {
        return todoItems;
    }
//    public void setTodoItems(List<TodoItem> todoItems) {
//        this.todoItems = todoItems;
//    }

    public void loadTodoItems() throws IOException {
        todoItems = FXCollections.observableArrayList();
        Path path = Paths.get(fileName);
        BufferedReader br = Files.newBufferedReader(path);

        String input;

        try {
            while ((input = br.readLine()) != null){
                String[] itemPices = input.split("\t");

                String shortDescription = itemPices[0];
                String details = itemPices[1];
                String dateString = itemPices[2];

                LocalDate date = LocalDate.parse(dateString, formatter);
                TodoItem todoItem = new TodoItem(shortDescription, details, date);
                todoItems.add(todoItem);
            }
        } finally {
            if (br != null){
                br.close();
            }
        }
    }

    public void storeTodoItems() throws IOException {
        Path path = Paths.get(fileName);
        BufferedWriter bw = Files.newBufferedWriter(path);

        try {
            Iterator<TodoItem> iterator = todoItems.iterator();
            while (iterator.hasNext()) {
                TodoItem item = iterator.next();
                bw.write(String.format("%s\t%s\t%s\t",
                        item.getShortDescription(),
                        item.getDetails(),
                        item.getDeadline(),
                        item.getDeadline().format(formatter)
                ));
                bw.newLine();
            }
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
    }

    public void deleteTodoItem(TodoItem item){
        todoItems.remove(item);
    }
}
