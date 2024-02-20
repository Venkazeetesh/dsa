package dsa;

public class insertionsorting {
    public static void main(String[] args) {
        int[] arr={1,10,7,9,6};
        int size=arr.length;
        for(int i=1;i<size;i++){
            int j=i-1;
            int key=arr[i];
            while(arr[j]>key && j>=0){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        for(int num:arr){
            System.out.println(num);
        }
    }
}
