import java.time.LocalDateTime;

import Container.*;
import factory.Factory;
import task.*;
import runner.StrategyTaskRunner;
import runner.TaskRunner;
import factory.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("\n Testing SortingTask QuickSort");
        int[] nr1={10,1,2,3,8,7};
        AbsSorter s1=new QuickSort();
        Task task1= new SortingTask(10l,"note examen MAP",nr1,s1);
        task1.execute();
        System.out.println("\n Testing SortingTask BubbleSort ");
        int[] nr2={7,5,4,10,2,8};
        AbsSorter s2=new BubbleSort();
        Task task2= new SortingTask(11l,"note examen BD",nr2,s2);
        task2.execute();
        System.out.println("\n Testing StackContainer");
        MessageTask messageTask=new MessageTask(1l,"Pentru facultate","Andy", "Ioana", LocalDateTime.now());
        MessageTask messageTask1=new MessageTask(2l,"Pentru munca","Amalia", "Bogdan", LocalDateTime.now());
        MessageTask messageTask2=new MessageTask(3l,"Pentru examen","Andra", "Sergiu", LocalDateTime.now());
        SuperContainer container=new StackContainer();
        container.add(messageTask);
        container.add(messageTask1);
        container.add(messageTask2);
        System.out.println("\n Number of messages after add:");
        System.out.println(container.size());
        while(!container.isEmpty()){
            Task t= container.remove();
        }
        System.out.println("\n Number of messages after delete:");
        System.out.println(container.size());
        System.out.println("\n Testing QueueContainer");
        SuperContainer container1=new QueueContainer();
        container1.add(messageTask);
        container1.add(messageTask1);
        container1.add(messageTask2);
        System.out.println("\n Number of messages after add:");
        System.out.println(container1.size());
        System.out.println(container1.remove()==messageTask);
        while(!container1.isEmpty()){
            Task t= container1.remove();
        }
        System.out.println("\n Number of messages after delete:");
        System.out.println(container1.size());
        System.out.println("\n Testing TaskRunner for LIFO");
        TaskRunner runner=new StrategyTaskRunner(Strategy.LIFO);
        runner.addTask(messageTask);
        runner.addTask(messageTask1);
        runner.addTask(messageTask2);
        runner.executeAll();
        System.out.println("\n Testing TaskRunner for FIFO");
        TaskRunner runner1=new StrategyTaskRunner(Strategy.FIFO);
        runner1.addTask(messageTask);
        runner1.addTask(messageTask1);
        runner1.addTask(messageTask2);
        runner1.executeAll();
        //factory
        Factory f=TaskContainerFactory.getInstance();
        Factory f1=TaskContainerFactory.getInstance();
        assert f==f1;





    }
}