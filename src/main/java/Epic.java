import java.util.Arrays;

public class Epic extends Task {
    protected String subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = Arrays.toString(subtasks);
    }

    public String getSubtasks() {
        return subtasks;
    }

}
