import java.util.Arrays;

public class ArithmeticProgressionCheck {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArithmeticProgressionCheck apCheck = new ArithmeticProgressionCheck();
        
        int[] arr1 = {3, 5, 1};
        int[] arr2 = {1, 2, 4};

        System.out.println(apCheck.canMakeArithmeticProgression(arr1)); // true
        System.out.println(apCheck.canMakeArithmeticProgression(arr2)); // false
    }
}
