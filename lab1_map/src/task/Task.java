package task;
import java.util.Objects;

public abstract class Task {
    private Long id;
    private String desc;

    public Task(Long id, String desc) {
        this.id = id;
        this.desc = desc;
    }

//    public Task() {
//    }

    @Override
    public String toString() {
        return id+ " "+desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    /**
     *
     * @param desc
     * @raises
     * @return
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return id.equals(task.id) && desc.equals(task.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, desc);
    }
    public abstract void execute();
}
