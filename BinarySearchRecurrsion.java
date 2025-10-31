import java.util.Scanner;
public class BinarySearchR{
public static int BinarySearchR(int[] arr,int key,int st, int end){
while(st<=end){
int mid=st+(end-st)/2;
if(arr[mid]==key){
return mid;
}
else if(arr[mid]<key){
return BinarySearchR(arr,key,mid+1,end);
}
else{
return BinarySearchR(arr,key,st,mid-1);
}
}
return -1;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array : ");
int n=sc.nextInt();
int[] numbers=new int[n];
System.out.println("Enter " +n+" elements :");
for(int i=0;i<n;i++){
numbers[i]=sc.nextInt();
}
System.out.println("Enter element to search :");
int key=sc.nextInt();
int result=BinarySearchR(numbers,key,0,n-1);
if(result==-1){
System.out.println("Element not found!!");
}
else{
System.out.println("Element "+key+" found at index :"+result);

}
}
}
