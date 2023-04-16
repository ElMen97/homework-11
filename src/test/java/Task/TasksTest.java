package Task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TasksTest {
    @Test

    public void testMatchesSimpleTaskWhenTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("родителям");

        Assertions.assertTrue(actual);
    }

    @Test

    public void testMatchesSimpleTaskWhenFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("маме");

        Assertions.assertFalse(actual);
    }

    @Test

    public void testMatchesEpicWhenTrue1() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Молоко");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMatchesEpicWhenTrue2() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Яйца");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMatchesEpicWhenTrue3() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Хлеб");

        Assertions.assertTrue(actual);
    }

    @Test

    public void testMatchesEpicWhenFalse() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Шоколадка");

        Assertions.assertFalse(actual);
    }

    @Test
    public void testMatchesMeetingWhenTrue1() {

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("3й версии");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMatchesMeetingWhenTrue2() {

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("НетоБанка");

        Assertions.assertTrue(actual);
    }

    @Test

    public void testMatchesMeetingWhenFalse1() {

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("5й версии");

        Assertions.assertFalse(actual);
    }

    @Test

    public void testMatchesMeetingWhenFalse2() {

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("СовкомБанка");

        Assertions.assertFalse(actual);
    }

    @Test

    public void testMatchesMeetingWhenFalse3() {

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean actual = meeting.matches("Во вторник");

        Assertions.assertFalse(actual);
    }
}
