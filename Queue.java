public class Queue {
public final int maxSize = 5;
public int[] arr = new int[maxSize];
public int R = -1;
public int F = -1;
public void enqueue(int val) {
if (R == maxSize - 1) {
System.out.println("Queue Overflow");
return;
}
if (F == -1) { // first element
F = 0;
}
arr[++R] = val;
System.out.println("Enqueued: " + val);
}
public void dequeue() {
if (F == -1 || F > R) {
System.out.println("Queue Underflow");
return;
}
int deletedData = arr[F++];
System.out.println("Dequeued: " + deletedData);

if (F > R) {
F = R = -1;
}
}
public void printQueue() {
if (F == -1) {
System.out.println("Queue is empty");
return;
}
System.out.print("Queue: ");
for (int i = F; i <= R; i++) {
System.out.print(arr[i] + " ");
}
System.out.println();

}
public static void main(String[] args) {
Queue q = new Queue();
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
q.dequeue();
q.dequeue();
q.enqueue(40);
q.enqueue(50);
q.printQueue();
}
}
