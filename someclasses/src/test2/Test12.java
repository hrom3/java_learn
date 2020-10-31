package test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Test12<Task> {
        private static final int MAX_TASKS = 1000;

        private BlockingQueue<Task> queue
                = new LinkedBlockingQueue<Task>(MAX_TASKS);

        public void putTask(Task r) throws InterruptedException {
            queue.put(r);
        }

        public Task getTask() throws InterruptedException {
            return queue.take();
        }
    }

