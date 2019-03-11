import java.util.Scanner;

public class roundToNext5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j;
        int [] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
            if(arr[i]<38)
                System.out.println(arr[i]);
            else
            {
                int temp=arr[i];
                for(j=0;j<2;j++) {
                    temp++;
                    if(temp%5==0)
                    {
                        System.out.println(temp);
                        break;
                    }

                }
                if(j==2)
                System.out.println(arr[i]);

            }

        }
    }

}
