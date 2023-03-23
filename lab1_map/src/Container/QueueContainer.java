package Container;
import task.Task;
public class QueueContainer extends SuperContainer{

    public QueueContainer(){super();}
    @Override
    public Task remove(){
        Task deleted=super.elems.remove(0);
        return deleted;
    }


}
