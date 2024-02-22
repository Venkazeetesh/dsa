package dsa;

public class insertion{
    public static void main(String[] args) {
        int[] arr={0,2,3,6,5};
        int key;
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            key=arr[i];
            while(arr[j]>key &&j>=0){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        for (int num:arr){
            System.out.println(num);
        }
    }
}