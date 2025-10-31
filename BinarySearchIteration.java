import java.util.Scanner;
public class binarySearch {
public static int binarySearch(int[] arr, int key) {
int st = 0;
int end = arr.length - 1;
while (st <= end) {
int mid = st + (end - st) / 2;
if (arr[mid] == key) {
return mid;
} else if (arr[mid] < key) {
st = mid + 1;
} else {
end = mid - 1;
}
}
return -1;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array:");
int n = sc.nextInt();
int[] numbers = new int[n];

System.out.println("Enter " + n + " elements:");
for (int i = 0; i < n; i++) {
numbers[i] = sc.nextInt();
}
System.out.print("Enter target to search: ");
int key = sc.nextInt();

int result = binarySearch(numbers, key);
if (result == -1) {
System.out.println(" ");
System.out.println("Element not found!");
} else {
System.out.println(" ");
System.out.println("Element " + key + " found at index: " + result);
}

}
}
