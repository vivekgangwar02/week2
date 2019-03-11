public class Sorting {

    public static void main(String[] args) {

        int arr[] = {64,11,23,45,10};
//Selection sort
//        for(int i=0;i<arr.length-1;i++)
//        {
//            int minindex=i;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j]<arr[minindex])
//                    minindex=j;
//            }
//            int temp=arr[minindex];
//            arr[minindex]=arr[i];
//            arr[i]=temp;
//
//        }
//OR THIS <BOTH ARE SAME
        for(int i=arr.length-1;i>=0;i--)
        {int max=i;
        for(int j=0;j<i;j++)
        {
            if(arr[max]<arr[j])
                max=j;
        }
        int temp=arr[i];
        arr[i]=arr[max];
        arr[max]=temp;

        }

        int arr1[]={23,34,54,56,10};

        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }


}
