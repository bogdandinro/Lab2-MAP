package runner;

import formatter.Constants;

import java.time.LocalDateTime;

public class PrinterTaskRunner extends AbstractTaskRunner {
    public PrinterTaskRunner(TaskRunner taskRunner) {
        super(taskRunner);
    }
    @Override
    public void executeOneTask(){
        super.executeOneTask();
        System.out.println("Task-ul s-a executat la " + LocalDateTime.now().format(Constants.DATE_TIME_FORMATTER));
    }
}
