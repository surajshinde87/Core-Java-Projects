
public class Tasks {

    private String title;
    private boolean isCompleted;

    public Tasks(String title) {
        this.title = title;
        this.isCompleted = false;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Task{"
                + "title='" + title + '\''
                + ", isCompleted=" + isCompleted
                + '}';
    }

}
