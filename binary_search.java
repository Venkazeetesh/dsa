package dsa;

public class binary_search {
    public static int binarysearch(){
        int[] a={1,2,4,5};
        int target=5;
        int left=0;
        int right=(a.length)-1;
        while (left <=right){
            int mid=(left+right)/2;
            if(a[mid]==target){
                System.out.println("found at index"+mid);
                break;
            }else if(a[mid] <target){
                left=mid+1;
            }else {
                right =mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(binarysearch());
    }
}
