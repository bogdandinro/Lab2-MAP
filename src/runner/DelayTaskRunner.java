package runner;

public class DelayTaskRunner extends AbstractTaskRunner {
    public DelayTaskRunner(TaskRunner taskRunner) {
        super(taskRunner);
    }
    @Override
    public void executeOneTask(){
        try{
            Thread.sleep(3000);
            System.out.println("Pauza");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.executeOneTask();
    }
}
