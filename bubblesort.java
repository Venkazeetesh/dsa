package dsa;

class bubblesort {
    public static void main(String[] args) {
        int[] a={1,2,6,4,5};
        int temp=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int num:a){
            System.out.println(num);
        }

    }

}