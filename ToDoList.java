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

        if((number > toDoList.size()-1) || (number < toDoList.size()-1)) {
            System.out.println("Podana pozycja spoza zakresu listy! Podaj poprawną wartość z zakresu: 0 - " + (toDoList.size()-1));
            System.exit(0);
        }

        toDoList.remove(number);
    }
}
