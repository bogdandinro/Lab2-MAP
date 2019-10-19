package runner;

import model.Task;

public class AbstractTaskRunner implements TaskRunner {
    TaskRunner taskRunner;

    public AbstractTaskRunner(TaskRunner taskRunner) {
        this.taskRunner = taskRunner;
    }
    @Override
    public void executeOneTask(){
        taskRunner.executeOneTask();
    }
    @Override
    public void executeAll(){
        while (taskRunner.hasTask())
            executeOneTask();
    }
    @Override
    public void addTask(Task task){
        taskRunner.addTask(task);
    }
    @Override
    public boolean hasTask(){
        if(taskRunner.hasTask())
            return true;
        return false;
    }
}
