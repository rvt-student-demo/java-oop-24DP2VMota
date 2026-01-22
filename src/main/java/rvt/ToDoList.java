package rvt;
import java.util.*;

public class ToDoList {
private ArrayList<String> list;
public ToDoList() {
this.list = new ArrayList<>();
}
public void add(String task) {
list.add(task);
}

public void print() {

for (int i = 0; i < list.size(); i++) {
System.out.println((i + 1) + ": " + list.get(i));
}


}
public void remove(int number) {

if (number >= 1 && number <= list.size()) {
list.remove(number - 1);

}
}

//public static void main(String[] args) {
//ToDoList list = new ToDoList();
//list.add("read the course material");
//list.add("watch the latest fool us");
//list.add("take it easy");
//list.print();
//list.remove(2);
//System.out.println();
//list.print();
//}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ToDoList list = new ToDoList();
    while (true) {
        System.out.println("Command:");
        String command = sc.nextLine();
        if(command.equals("add")){
            System.out.println("To add: ");
            String task = sc.nextLine();
            list.add(task);
        } else if(command.equals("list")){
            list.print();
        } else if(command.equals("remove")){
            System.out.println("Which one is removed? ");
            int number = sc.nextInt();
            list.remove(number);
            System.out.println();
        } else if(command.equals("stop")){
            break;
        }
        }
    }

}
