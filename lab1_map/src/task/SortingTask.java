package task;

public class SortingTask extends Task{

    private int[] nr;
    private AbsSorter sorter;

    public SortingTask(Long id, String d, int[] nr, AbsSorter s){
        super(id,d);
        this.nr=nr;
        this.sorter=s;

    }
    @Override
    public void execute(){
        int v[]=this.nr;
        sorter.sort(v);
        for(int i:v){
            System.out.print(i+" ");
        }
    }
}

