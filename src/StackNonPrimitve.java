import java.util.Arrays;

class Emp {
    String name;
    int number;


    public Emp(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return this.name + " " + this.number;

    }
}
public class StackNonPrimitve {
     Emp[] obj;
    int size;
    int top;

    public StackNonPrimitve(int size) {
        this.size = size;
        obj = new Emp[size];
        top = -1;
    }

    //METHODS


    void pop() {
        if (!isEmpty())
            System.out.println(obj[top--]);
    }

    void push(String name,int number) {
        if (!isFull()) {
            top++;
            Emp a = new Emp(name,number);
            obj[top]=a;
            obj[top].name=name;
            obj[top].number=number;

            System.out.println(obj[top].name+obj[top].number);
        }

    }

    boolean isEmpty() {
        return top == -1;

    }

    boolean isFull() {
        return top == obj.length - 1;
    }


    void peek() {
        for (int i = obj.length - 1; i >= 0; i--) {
            System.out.println(obj[i]);
        }
    }

    public static void main(String[] args) {
        int size = 5;
        StackNonPrimitve object = new StackNonPrimitve(size);
        object.push("vivek", 123);
        object.push("abc", 456);
        object.push("xyz", 789);
//        Emp a1=new Emp("sfsdf",234);/**/
//        object.push(a1);
        object.pop();
        object.pop();
    }


}
