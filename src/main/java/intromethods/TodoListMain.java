package intromethods;

import java.util.List;

public class TodoListMain {

    public static void main(String[] args) {
        TodoList tl = new TodoList();
        tl.addTodo("tanulás");
        tl.addTodo("vásárlás");
        tl.addTodo("munka");
        tl.addTodo("telefon");
        tl.addTodo("köszöntés");

        System.out.println(tl.todosToFinish());
        tl.finishTodos("munka");
        System.out.println(tl.todosToFinish());
        tl.finishAllTodos(List.of("telefon", "vásárlás"));
        System.out.println(tl.todosToFinish());
        System.out.println(tl.numberOfFinishedTodos());
        System.out.println(tl);
    }
}
