public class SignOfProduct {
    public int arraySign(int[] nums) {
        int negativeCount = 0;              
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                negativeCount++;
            }
        }
        return (negativeCount % 2 == 0) ? 1 : -1;
    }

    public static void main(String[] args) {
        SignOfProduct obj = new SignOfProduct();

        int[] nums1 = {-1,-2,-3,-4,3,2,1};
        int[] nums2 = {1,5,0,2,-3};
        int[] nums3 = {-1,1,-1,1,-1};

        System.out.println(obj.arraySign(nums1));
        System.out.println(obj.arraySign(nums2));
        System.out.println(obj.arraySign(nums3));
}
}
