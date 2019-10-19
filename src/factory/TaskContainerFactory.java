package factory;

import container.Container;
import container.ContainerStrategy;
import container.QueueContainer;
import container.StackContainer;

public class TaskContainerFactory implements Factory {
    private static TaskContainerFactory taskContainerFactory = null;

    private TaskContainerFactory(){}

    public static TaskContainerFactory getInstance(){
        if(taskContainerFactory == null)
            taskContainerFactory = new TaskContainerFactory();
        return taskContainerFactory;
    }

    @Override
    public Container createContainer(ContainerStrategy strategy){
        switch (strategy){
            case FIFO:
                return new QueueContainer();
            case LIFO:
                return new StackContainer();
            default:
                return null;
        }
    }
}
