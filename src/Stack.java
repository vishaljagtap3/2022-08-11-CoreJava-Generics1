public class Stack<T> {

    private T [] arr;
    private int size;
    private int top;

    public Stack(int size) {
        this.size = size;
        //arr = new T[size]; //can not create an array of generic type T in java
        arr = (T []) new Object[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == (size - 1);
    }

    public boolean push(T data) {
        if(isFull()) {
            return false;
        }

        arr[++top] = data;
        return true;
    }

    public T pop() {
        if(isEmpty()) {
            return null;
        }

        return arr[top--];
    }
}
