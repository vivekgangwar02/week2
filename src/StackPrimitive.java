public class StackPrimitive {

    int size;
    int top;
    int[] stack;

    public StackPrimitive(int size) {
        this.size = size;
        stack = new int[size];
        top=-1;
    }
    //methods

    int pop(){
        if(isEmpty())
           return -1;
        else
            return stack[top--];
    }

    void push(int value){
        if(!isFull())

            stack[++top]=value;

    }

    boolean isEmpty(){
       return top==-1;

    }

    boolean isFull(){
        if(top==stack.length-1)
            return true;
        return false;

    }
    void peek(){
        for(int i=stack.length-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }


    public static void main(String[] args) {
        int size=5;
        StackPrimitive obj =new StackPrimitive(size);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.peek();
        System.out.println(obj.pop());
        System.out.println(obj.pop());

    }


}
