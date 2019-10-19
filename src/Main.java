import container.Container;
import container.ContainerStrategy;
import container.QueueContainer;
import container.StackContainer;
import factory.TaskContainerFactory;
import model.MessageTask;
import runner.PrinterTaskRunner;
import runner.StrategyTaskRunner;
import sortArray.SortingStrategy;
import sortArray.SortingTask;

import java.time.LocalDateTime;

public class Main {
    public static MessageTask[] createMessageTaskArray(){
        MessageTask t1 = new MessageTask("1", "Feedback", "Ai obtinut 9.60", "Gigi", "Ana", LocalDateTime.now());
        MessageTask t2 = new MessageTask("2", "Feedback", "Ai obtinut 8.60", "Andri", "Ana", LocalDateTime.now());
        MessageTask t3 = new MessageTask("3", "Feedback", "Ai obtinut 6.60", "Mihai", "Misu", LocalDateTime.now());
        MessageTask t4 = new MessageTask("4", "Feedback", "Ai obtinut 5.60", "Ion", "Andreea", LocalDateTime.now());
        MessageTask t5 = new MessageTask("5", "Feedback", "Ai obtinut 4.60", "Gabi", "Anca", LocalDateTime.now());
        return new MessageTask[] { t1, t2, t3, t4, t5 };
    }

    public static void main(String[] args){
        System.out.println("Cerinta 3");
        System.out.println();

        SortingTask sortingTaskBubleSort = new SortingTask(SortingStrategy.BubleSort, new int[]{1,2,8,3,7,4,6,5,9,0},10);
        System.out.println("Sortare folosind BubleSort ");
        System.out.println();
        sortingTaskBubleSort.execute();

        SortingTask sortingTaskMergeSort = new SortingTask(SortingStrategy.MergeSort, new int[]{10, 1, 9, 2, 8, 3, 7, 4, 6, 5}, 10);
        System.out.println("Sortare folosind MergeSort:");
        sortingTaskMergeSort.execute();
        System.out.println();

        System.out.println("Cerinta 4");
        System.out.println();
        MessageTask taskuri[] = createMessageTaskArray();
        for (MessageTask task : taskuri)
            System.out.println(task);
        System.out.println();


        System.out.println("Cerinta 5");
        System.out.println();

        System.out.println("Stack");
        StackContainer stackContainer =new StackContainer();
        stackContainer.add(taskuri[0]);
        stackContainer.add(taskuri[1]);
        System.out.println(stackContainer.remove());
        System.out.println(stackContainer.remove() + "\n");

        System.out.println("Queue");
        QueueContainer queueContainer = new QueueContainer();
        queueContainer.add(taskuri[0]);
        queueContainer.add(taskuri[1]);
        System.out.println(queueContainer.remove());
        System.out.println(queueContainer.remove() + "\n");

        System.out.println("Cerinta 6-7");
        System.out.println();
        TaskContainerFactory taskContainerFactory = TaskContainerFactory.getInstance();
        Container container[] = {taskContainerFactory.createContainer(ContainerStrategy.LIFO), taskContainerFactory.createContainer(ContainerStrategy.FIFO)};
        System.out.println("Stack:");
        container[0].add(taskuri[0]);
        container[0].add(taskuri[1]);
        System.out.println(container[0].remove());
        System.out.println(container[0].remove() + "\n");

        System.out.println("Queue:");
        container[1].add(taskuri[0]);
        container[1].add(taskuri[1]);
        System.out.println(container[1].remove());
        System.out.println(container[1].remove() + "\n");

        System.out.println("Cerinta 10");
        System.out.println();
        StrategyTaskRunner strategyTaskRunner = new StrategyTaskRunner(ContainerStrategy.LIFO);
        for (MessageTask task : taskuri)
            strategyTaskRunner.addTask(task);
        strategyTaskRunner.executeAll();
        System.out.println();

        System.out.println("Cerinta 11-14");
        System.out.println();
        System.out.println("PrinterTaskRuner:");
        strategyTaskRunner.addTask(taskuri[0]);
        strategyTaskRunner.addTask(taskuri[1]);
        PrinterTaskRunner printerTaskRunner = new PrinterTaskRunner(strategyTaskRunner);
        printerTaskRunner.executeAll();
        System.out.println();

    }

}
