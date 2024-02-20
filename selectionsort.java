package dsa;

public class selectionsort {
    public static void main(String[] args) {
        int a[] ={1,9,6,4,8,5};
        int tem=0;
        int minIndex=-1;
        int size=a.length;
        System.out.println("Before sorting");
        for (int num:a){
            System.out.println(num+"");
        }
        for(int i=0;i<size;i++){
            minIndex=i;
            for(int j=i+1;j<size;j++){
                if(a[minIndex]>a[j]){
                    minIndex=j;
                }
                tem=a[minIndex];
                a[minIndex]=a[i];
                a[i]=tem;
            }
            System.out.println();
            System.out.println("After sorting");
            for (int num :a){
                System.out.println(num);
            }

        }



        System.out.println("After sorting");
    }
}
