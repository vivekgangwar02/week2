public class Queue {
    int size;
    int[] queue;
    int front;
    int rear;

    public Queue(int size) {
        this.size = size;
        queue=new int[size];
        front=0;
        rear=0;
    }
    //Methods

    void enqueue(int value){
        if (isFull()) {
           System.out.println("Full");
        } else {
            queue[rear]=value;
            rear++;}
    }

    void dequeue(){
        if(!isEmpty())
            System.out.println(queue[front++]);
            else
            System.out.println("Queue is Empty");

    }

    boolean isFull(){
return rear==queue.length;
    }

    boolean isEmpty(){
return front==rear;
    }

    void display(){
for(int i=0;i<queue.length;i++){
    System.out.println(queue[i]);
}
    }



    public static void main(String[] args) {
        int size=5;
        Queue obj=new Queue(size);
      obj.dequeue();
       obj.enqueue(1);

        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.enqueue(5);
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();





    }

}
