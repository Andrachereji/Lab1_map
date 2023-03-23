package Container;

import task.Task;

import java.util.ArrayList;
import java.util.List;

public class StackContainer extends SuperContainer {

    public StackContainer() {
        super();
    }

    @Override
    public Task remove() {
        int pos=super.elems.size()-1;
        return super.elems.remove(pos);
    }


}