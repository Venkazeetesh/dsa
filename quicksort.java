package dsa;

class quiksort{
    public  static  void  quicksor(int[] arr ,int low,int high){
        int pi=partition(arr,low,high);
       if(low<high){
           quicksor(arr,low,pi-1);
           quicksor(arr,pi+1,high);
       }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        quicksor(arr,0,arr.length);
    }
    static int partition(int[] arr, int low, int high){
        int pivot =arr.length;
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
}

