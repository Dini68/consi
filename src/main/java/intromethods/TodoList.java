package intromethods;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private final List<Todo> todos = new ArrayList<>();

    public void addTodo(String caption) {
        todos.add(new Todo(caption));
    }

    public void finishTodos(String caption) {
        for (Todo t: todos) {
            if (t.getCaption().equals(caption)) {
                t.finish();
            }
        }
    }

    public void finishAllTodos(List<String> todosToFinish) {
        for (String s: todosToFinish) {
            finishTodos(s);
        }
    }

    public List<String> todosToFinish(){
        List<String> result = new ArrayList<>();
        for (Todo t: todos) {
            if (!t.isFinished()) {
                result.add(t.getCaption());
            }
        }
        return result;
    }

    public int numberOfFinishedTodos(){
        int number = 0;
        for (Todo t: todos) {
            if (t.isFinished()) {
                number ++;
            }
        }
        return number;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Todo t: todos) {
            sb.append(t.toString()).append("\n");
        }
        return sb.toString();
    }
}
