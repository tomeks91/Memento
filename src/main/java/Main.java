import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Originator.Memento> stack = new ArrayDeque<>();

        Originator originator = new Originator();
        originator.set("State1");
        originator.set("State2");
        stack.push(originator.saveToMemento());
        originator.set("State3");
        // We can request multiple mementos, and choose which one to roll back to.
        stack.push(originator.saveToMemento());
        originator.set("State4");

        originator.restoreFromMemento(stack.pop());
    }
}
