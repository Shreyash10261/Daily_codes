import java.util.Arrays;
class Multiplier extends Thread {
private int[] inputArray;
private int[] outputArray;
private int startIndex;
private int step;
public Multiplier(int[] inputArray, int[] outputArray, int
startIndex, int step) {
this.inputArray = inputArray;
this.outputArray = outputArray;
this.startIndex = startIndex;
this.step = step;
}
public void run() {
for (int i = startIndex; i < inputArray.length; i += step) {
outputArray[i] = inputArray[i] * 2;
}
}
}
public class MultiThreadMultiplier {
public static void main(String[] args) {
int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int[] outputArray = new int[inputArray.length];
Multiplier evenThread = new Multiplier(inputArray, outputArray,
0, 2);
Multiplier oddThread = new Multiplier(inputArray, outputArray,
1, 2);
evenThread.start();
oddThread.start();
try {
evenThread.join();
oddThread.join();
} catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println("Output Array: " +
Arrays.toString(outputArray));
}
}