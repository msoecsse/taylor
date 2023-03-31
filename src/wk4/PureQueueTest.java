package wk4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PureQueueTest {
    private PureQueue<Integer> queue;
    private static int[] DATA = {1, 17, 48, 11};

    @BeforeEach
    void setUp() {
        queue = new CircularQueue<>();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void offer() {
        Assertions.assertTrue(queue.offer(DATA[0]));
        Assertions.assertEquals(queue.peek(), DATA[0]);
        Assertions.assertThrows(NullPointerException.class, () -> queue.offer(null));
        Assertions.assertEquals(queue.peek(), DATA[0]);
        Assertions.assertTrue(queue.offer(DATA[1]));
        Assertions.assertEquals(queue.peek(), DATA[0]);
    }

    @Test
    void poll() {
        Assertions.assertTrue(queue.offer(DATA[0]));
        Assertions.assertTrue(queue.offer(DATA[1]));
        Assertions.assertEquals(queue.poll(), DATA[0]);
        Assertions.assertEquals(queue.poll(), DATA[1]);
        Assertions.assertEquals(queue.poll(), null);
    }

    @Test
    void peek() {
        Assertions.assertNull(queue.peek());
    }
}