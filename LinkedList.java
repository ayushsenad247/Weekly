import java.util.Scanner;
public class CarList {
Node head;

static class Node {
String data;
Node next;
Node(String data) {
this.data = data;
this.next = null;
}
}

public CarList() {
head = null;
}

public void addCar(String carName) {
Node newNode = new Node(carName);
if (head == null) {
head = newNode;
} else {
Node current = head;
while (current.next != null) {
current = current.next;
}
current.next = newNode;
}
}
