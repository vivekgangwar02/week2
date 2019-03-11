import java.util.*;
public class StackClass {

    int size;
    int top;
    StackClass stackarray[];


    public StackClass(){
        size =10;
        top=-1;
        stackarray=new StackClass[size];
    }
    public void push(StackClass value){
        if(!isFull()){
            top++;
        }
        stackarray[top]=value;
    }
    public StackClass pop(){
        return stackarray[top--];
    }
    public StackClass peek(){
        return stackarray[top];
    }
    public boolean isFull(){
        return(top==stackarray.length-1);
    }

    public void dis(){
        for(int i=0;i<stackarray.length;i++)
        {
            System.out.println(stackarray[i]);
        }
    }

    public static void main(String[] args) {
        Stack obj=new Stack();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.dis();
        System.out.println(obj.pop());
        System.out.println(obj.pop());

    }




}
