package runner;

import container.Container;
import container.ContainerStrategy;
import factory.TaskContainerFactory;
import model.Task;

public class StrategyTaskRunner implements TaskRunner {
    private Container container;

    public StrategyTaskRunner(ContainerStrategy strategy){
        this.container = TaskContainerFactory.getInstance().createContainer(strategy);
    }

    @Override
    public void executeOneTask(){
        if(!container.isEmpty()){
            container.remove().execute();
        }
    }

    @Override
    public void executeAll(){
        while ((!container.isEmpty()))
            executeOneTask();
    }

    @Override
    public void addTask(Task task){
        container.add(task);
    }

    @Override
    public boolean hasTask(){
        if(!container.isEmpty())
            return true;
        return false;
    }
}
