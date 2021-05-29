package interfaces.simplethread;

import java.util.List;

public class SimpleThread implements Runnable{

    private final List<String> tasks;

    public SimpleThread(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<String> getTasks() {
        return tasks;
    }

    private boolean nextStep() {
        tasks.remove(tasks.size() - 1);
        return tasks.size() > 0;
    }

    @Override
    public void run() {
        boolean noEmpty = tasks.size() > 0;
        while (noEmpty) {
            noEmpty = nextStep();
        }
    }
}
