public class ClassObjectSort {
    static ClassObjectSort arr[]=new  ClassObjectSort[5];
    int price;
    String book;
    public ClassObjectSort(int price,String book)
    {
        this.price=price;
        this.book=book;

    }
   static public void sort(){
        ClassObjectSort temp=new ClassObjectSort(0,"");
        for(int i=0;i>5;i++)
            for(int j=0;j<5-1-i;j++)
            {if(arr[j].price>arr[j+1].price)
                temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            }

    }
    public  String toString(){
        return (price +" "+book);
    }


    public static void main(String[] args) {

        arr[0]=new ClassObjectSort(2,"abc");
        arr[1]=new ClassObjectSort(4,"def");
        arr[2]=new ClassObjectSort(5,"dgh");
        arr[3]=new ClassObjectSort(1,"rty");
        arr[4]=new ClassObjectSort(3,"kkh");

for(int i=0;i<5;i++)
        System.out.println(arr[i].toString());

        sort();
        for(int i=0;i<5;i++)
        System.out.println(arr[i].toString());
    }
}