import java.util.ArrayList;

public class ToDoList {

    ArrayList<String> toDoList = new ArrayList<>();
    
    public ToDoList() {
        ArrayList<String> toDoList = new ArrayList<>();
    }

    public void add(String task) {
        toDoList.add(task);
    }

    public void print() {

            for(String i : toDoList) {
                System.out.println(toDoList.indexOf(i) + ": " + i);
            }
    }

    public void remove(int number) {

        toDoList.remove(number);
    }
}
