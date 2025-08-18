class SumThread extends Thread {
private int[] array;
private int start, end;
private int sum;
public SumThread(int[] array, int start, int end) {
this.array = array;
this.start = start;
this.end = end;
}
public void run() {
sum = 0;
for (int i = start; i < end; i++) {
sum += array[i];
}
}
public int getSum() {
return sum;
}
}
public class MultiThreadSum {
public static void main(String[] args) {
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
int length = array.length;
int segmentSize = length / 3;
SumThread[] threads = new SumThread[3];
for (int i = 0; i < 3; i++) {
int start = i * segmentSize;
int end = (i == 2) ? length : start + segmentSize;
threads[i] = new SumThread(array, start, end);
threads[i].start();
}
int totalSum = 0;
for (int i = 0; i < 3; i++) {
try {
threads[i].join();
System.out.println("Sum of segment " + (i + 1) + ": " +
threads[i].getSum());
totalSum += threads[i].getSum();
} catch (InterruptedException e) {
e.printStackTrace();
}
}
System.out.println("Total sum of array: " + totalSum);
}
}