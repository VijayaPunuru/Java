package threadsTest;

import org.junit.Test;
import threads.Deadlock;
public class DeadlockTest {
    @Test
    public void TestDeadlock() {
        Deadlock evenThread = new Deadlock();
        Deadlock oddThread = new Deadlock();
        evenThread.start();
        oddThread.start();
    }
}