package practice;
import java.util.*;

class TaskManager {
    // A map to store task information: taskId -> [userId, priority]
    private Map<Integer, int[]> taskMap;
    // A priority queue to store tasks with custom comparator (max-heap)
    private PriorityQueue<int[]> taskQueue;

    public TaskManager(List<int[]> tasks) {
        taskMap = new HashMap<>();
        taskQueue = new PriorityQueue<>(
            (a, b) -> a[2] == b[2] ? b[1] - a[1] : b[2] - a[2] // Compare by priority, then by taskId
        );

        for (int[] task : tasks) {
            int userId = task[0];
            int taskId = task[1];
            int priority = task[2];
            taskMap.put(taskId, new int[]{userId, priority});
            taskQueue.offer(new int[]{userId, taskId, priority});
        }
    }

    public void add(int userId, int taskId, int priority) {
        taskMap.put(taskId, new int[]{userId, priority});
        taskQueue.offer(new int[]{userId, taskId, priority});
    }

    public void edit(int taskId, int newPriority) {
        int[] taskInfo = taskMap.get(taskId);
        int userId = taskInfo[0];
        taskQueue.remove(new int[]{userId, taskId, taskInfo[1]});
        taskInfo[1] = newPriority;
        taskQueue.offer(new int[]{userId, taskId, newPriority});
    }

    public void rmv(int taskId) {
        int[] taskInfo = taskMap.get(taskId);
        taskQueue.remove(new int[]{taskInfo[0], taskId, taskInfo[1]});
        taskMap.remove(taskId);
    }

    public int execTop() {
        while (!taskQueue.isEmpty()) {
            int[] topTask = taskQueue.poll();
            int userId = topTask[0];
            int taskId = topTask[1];
            if (taskMap.containsKey(taskId) && taskMap.get(taskId)[1] == topTask[2]) {
                taskMap.remove(taskId);
                return userId;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Initialize TaskManager with tasks
        List<int[]> tasks = Arrays.asList(
            new int[]{1, 101, 10},
            new int[]{2, 102, 20},
            new int[]{3, 103, 15}
        );
        TaskManager taskManager = new TaskManager(tasks);

        // Perform operations
        taskManager.add(4, 104, 5);
        taskManager.edit(102, 8);
        System.out.println(taskManager.execTop()); // Output: 3
        taskManager.rmv(101);
        taskManager.add(5, 105, 15);
        System.out.println(taskManager.execTop()); // Output: 5
    }
}

