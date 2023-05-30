import java.util.LinkedList;
import java.util.Queue;

public class _02_DSA_Queue {
    public static void main(String[] args) {
        /*
         * Queue is an interface and we cannot create an instance of interface.
         * Interface is like a template we can apply to another class
         * So inorder to utilize Queue, we use a class that implements Queue.
         * And there are 2 classes that implements Queue interface: LinkedList and PriorityQueue
         * Here we have used LinkedList to show operations/methods of queue.
         * */

        Queue<String> peoplesQueue = new LinkedList<>();
        System.out.println("\n Is Queue empty ? " + peoplesQueue.isEmpty());

//        enqueue: this will add an element to the tail of queue

//        to add to queue, we use 2 methods:
//        * offer() : will add an element to the tail of a queue, and returns null of queue is full
//        * add() : also  add an element to the tail of queue, but throws an exception when queue if full

        peoplesQueue.offer("Ram");
        peoplesQueue.offer("Hari");
        peoplesQueue.offer("Shyam");
        peoplesQueue.add("Dani");   // add() will throw an exception when memory is full

        System.out.println("\n Is Queue empty ? " + peoplesQueue.isEmpty());
        System.out.println("\n People on Queue : " + peoplesQueue);

//       dequeue: this will remove/delete element from head

//        to remove/delete from head of queue, we use 2 methods:
//        * poll(): will remove an element, and returns null if queue is empty
//        * remove(): also remove an element, but throws an exception if queue is empty

        System.out.println("\n " + peoplesQueue.poll());
        System.out.println("\n " + peoplesQueue.remove()); // throws an exception if queue is empty

//        peek: this will retrieve element of head without removing from queue
//        to retrieve from queue without removing from queue, we use 2 methods:
//        * peek(): will retrieve without removing from queue, but gives null of no element present in queue
//        * element(): also retrieve without removing from queue, but throws an exception if queue is empty

        System.out.println("\n Peeked people from Queue : " + peoplesQueue.peek());
        System.out.println("\n Peeked people from Queue : " + peoplesQueue.element()); // throws exception if queue
        // is empty

    }

}