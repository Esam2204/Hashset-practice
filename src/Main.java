import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
// Таск 1
        System.out.print("Task 1: ");
        int[] nums = {1, 2, 2, 3, 4, 4, 4, 5};
        HashSet<Integer> uniqueNums = new HashSet<>();
        for (int n : nums) {
            uniqueNums.add(n);
        }
        System.out.println(uniqueNums);

// Таск 2
        System.out.print("Task 2: ");
        HashSet<String> users = new HashSet<>(Arrays.asList("admin", "user", "guest"));
        String name = "admin";
        System.out.println(users.contains(name));

// Таск 3
        System.out.print("Task 3: ");
        HashSet<Integer> set3 = new HashSet<>();
        set3.add(1);
        set3.add(2);
        set3.add(3);
        System.out.println(set3.size());
        set3.clear();
        System.out.println(set3.isEmpty());

// Таск 4
        System.out.print("Task 4: ");
        HashSet<String> names4 = new HashSet<>(Arrays.asList("Anna", "Bob", "Tom", "Alex", "John"));
        boolean removed4 = names4.remove("Tom");
        System.out.println(removed4);
        System.out.println(names4);

// Таск 5
        System.out.print("Task 5: ");
        HashSet<Integer> set1_5 = new HashSet<>(Arrays.asList(1, 2, 3));
        HashSet<Integer> set2_5 = new HashSet<>(Arrays.asList(3, 4, 5));
        set1_5.addAll(set2_5);
        System.out.println(set1_5);

// Таск 6
        System.out.print("Task 6: ");
        HashSet<Integer> setA6 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> setB6 = new HashSet<>(Arrays.asList(3, 4));
        setA6.removeAll(setB6);
        System.out.println(setA6);

// Таск 7
        System.out.print("Task 7: ");
        HashSet<Integer> setX7 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> setY7 = new HashSet<>(Arrays.asList(3, 4, 5));
        setX7.retainAll(setY7);
        System.out.println(setX7);

// Таск 8
        System.out.print("Task 8: ");
        HashSet<Integer> setA8 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        HashSet<Integer> setB8 = new HashSet<>(Arrays.asList(3, 4));
        System.out.println(setA8.containsAll(setB8));

// Таск 9
        System.out.print("Task 9: ");
        String sentence = "java is our course language and java is interesting";
        String[] words9 = sentence.split(" ");
        HashSet<String> uniqueWords9 = new HashSet<>();
        for (String w : words9) {
            uniqueWords9.add(w);
        }
        System.out.println(uniqueWords9);

// Таск 10
        System.out.print("Task 10: ");
        String[] mix10 = {"Apple", "apple", "APPLE", "Banana"};
        HashSet<String> lower10 = new HashSet<>();
        for (String w : mix10) {
            lower10.add(w.toLowerCase());
        }
        System.out.println(lower10);

// Таск 11
        System.out.print("Task 11: ");
        ArrayDeque<Integer> queue11 = new ArrayDeque<>();
        queue11.offer(1);
        queue11.offer(2);
        queue11.offer(3);
        System.out.println(queue11.peek());
        while (!queue11.isEmpty()) {
            System.out.println(queue11.poll());
        }

// Таск 12
        System.out.print("Task 12: ");
        ArrayDeque<String> stack12 = new ArrayDeque<>();
        stack12.push("A");
        stack12.push("B");
        stack12.push("C");
        while (!stack12.isEmpty()) {
            System.out.println(stack12.pop());
        }

// Таск 13
        System.out.print("Task 13: ");
        ArrayDeque<Integer> deque13 = new ArrayDeque<>();
        deque13.addFirst(2);
        deque13.addLast(3);
        deque13.addFirst(1);
        System.out.println(deque13);

// Таск 14
        System.out.print("Task 14: ");
        ArrayDeque<Integer> deque14 = new ArrayDeque<>();
        deque14.add(1);
        deque14.add(2);
        System.out.println(deque14.offerFirst(0));
        System.out.println(deque14.offerLast(3));
        System.out.println(deque14);

// Таск 15
        System.out.print("Task 15: ");
        ArrayDeque<Integer> deque15 = new ArrayDeque<>();
        deque15.add(10);
        deque15.add(20);
        deque15.add(30);
        System.out.println(deque15.peek());
        System.out.println(deque15.peekFirst());
        System.out.println(deque15.peekLast());
        deque15.clear();
        // Выдает null после каждой команды
        System.out.println(deque15.peek());
        System.out.println(deque15.peekFirst());
        System.out.println(deque15.peekLast());

// Таск 16
        System.out.print("Task 16: ");
        ArrayDeque<Integer> deque16 = new ArrayDeque<>();
        deque16.add(1);
        deque16.add(2);
        deque16.add(3);
        deque16.add(4);
        System.out.println(deque16.poll());
        System.out.println(deque16.pollFirst());
        System.out.println(deque16.pollLast());
        System.out.println(deque16);

// Таск 17
        System.out.print("Task 17: ");
        ArrayDeque<String> dq17 = new ArrayDeque<>();
        dq17.add("a");
        dq17.add("b");
        dq17.add("c");
        dq17.add("b");
        dq17.add("a");
        dq17.removeFirstOccurrence("b");
        System.out.println(dq17);
        dq17.removeLastOccurrence("a");
        System.out.println(dq17);

// Таск 18
        System.out.print("Task 18: ");
        ArrayDeque<String> dq18 = new ArrayDeque<>();
        dq18.add("x");
        System.out.println(dq18.size());
        System.out.println(dq18.isEmpty());
        dq18.remove("x");
        System.out.println(dq18.size());
        System.out.println(dq18.isEmpty());

// Таск 19
        System.out.print("Task 19: ");
        ArrayDeque<String> dq19 = new ArrayDeque<>();
        dq19.add("test");
        dq19.clear();
        System.out.println(dq19.peek());
        System.out.println(dq19.isEmpty());

// Таск 20
        System.out.print("Task 20: ");
        String text20 = "level";
        ArrayDeque<Character> pal20 = new ArrayDeque<>();
        for (char c : text20.toCharArray()) {
            pal20.add(c);
        }
        boolean palindrome20 = true;
        while (pal20.size() > 1) {
            if (pal20.pollFirst() != pal20.pollLast()) {
                palindrome20 = false;
                break;
            }
        }
        System.out.println(palindrome20);

        // Таск 21
        System.out.print("Task 21: ");

        addTask("Fix bug", true);      // high priority
        addTask("Write report", false); // normal
        addTask("Deploy app", true);    // high priority

        while (!scheduler.isEmpty()) {
            processTask();
        }
    }

    //метод для 21 таска
    static ArrayDeque<String> scheduler = new ArrayDeque<>();

    static void addTask(String task, boolean highPriority) {
        if (highPriority) {
            scheduler.addFirst(task);
        } else {
            scheduler.addLast(task);
        }
    }

    static void processTask() {
        if (!scheduler.isEmpty()) {
            System.out.println("Processing: " + scheduler.pollFirst());
        } else {
            System.out.println("No tasks");
        }
    }
}