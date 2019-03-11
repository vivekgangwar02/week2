import java.util.Scanner;

public class menulist {
    static Scanner scanner=new Scanner(System.in);

   int size;
    int index;
    static int[] array;

    public menulist( int size){
        this.size=size;
        array=new int[size];

    }
    void insert(){

        System.out.println("Enter the index");
       index= scanner.nextInt();
        System.out.println("Enter the element now:");
        array[index]=scanner.nextInt();

    }
    void remove(){
        System.out.println("Enter the index");
        index= scanner.nextInt();
        for(int i=index;i<array.length-1;i++){
            array[i]=array[i+1];

        }
        array[array.length-1]=0;

    }
    void display(){
        for(int i=0;i<size;i++)
            System.out.println(array[i]);
    }
    void sort(){
        int temp;

        for(int i=0;i<array.length;i++)
            for(int j=0;j<array.length-i-1;j++)
            {if(array[j]>array[j+1]){
                temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;}
            }

    }


    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        int size=scanner.nextInt();

        menulist obj = new menulist(size);

        while(true){
        System.out.println("Enter the required values: \n1)Add an element \n2)Remove an element \n3)Displaying elements \n4)sort \n5)Exit ");
        int choice=scanner.nextInt();
           if(choice==1)
           {
           obj.insert();
           }
            if(choice==2)
            {
                obj.remove();
            }
            if(choice==3)
            {
                obj.display();
            }
            if(choice==4)
            {
                obj.sort();
            }
            if(choice==5)
            {
                break;
            }

        }


    }


}


