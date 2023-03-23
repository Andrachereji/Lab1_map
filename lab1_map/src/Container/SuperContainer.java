package Container;

import task.Task;

import java.util.ArrayList;
import java.util.List;

public abstract class SuperContainer implements Container {

    protected final List<Task> elems=new ArrayList<>();

    @Override
    public void add(Task task) {
        elems.add(task);
    }

    @Override
    public int size() {
        return elems.size();
    }

    @Override
    public boolean isEmpty() {
        return elems.isEmpty();
    }
    public abstract Task remove() ;

}