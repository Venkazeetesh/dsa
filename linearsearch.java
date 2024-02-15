package dsa;

class linearsearch {
    public static void main(String[] args) {
        int result = linearSearch(new int[]{1, 2, 4, 5}, 2);
        if (result != 0) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}