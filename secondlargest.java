import java.util.*;
class secondlargest
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements:");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("Enter the elements:");
for (int i = 0; i < n; i++) 
{
arr[i] = sc.nextInt();
}
int largest = arr[0];
int secondlargest = arr[0];
for (int i = 0; i < arr.length; i++) 
{
if (arr[i] > largest) 
{
secondlargest = largest;
largest = arr[i];
} 
else if (arr[i] > secondlargest && arr[i] != largest) 
{
secondlargest = arr[i];
}
}
System.out.println("Second largest element is: " + secondlargest);
}
}