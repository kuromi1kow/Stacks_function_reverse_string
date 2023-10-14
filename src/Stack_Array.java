public class Stack_Array {
    private int size;
    private int[] arr;
    private int left;
    private int right;

    public Stack_Array(int initialCapacity) {
        arr = new int[initialCapacity];
        size = 0;
        left = 0;
        right = initialCapacity - 1;
    }

    public boolean isEmpty(){
        if(size>0) return false;
        return true;
    }

    public void push(int input) {
        if (left > right) {
            int newCapacity = arr.length * 2;
            int[] newArr = new int[newCapacity];

            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
            right = newCapacity - 1;
        }

        arr[left] = input;
        left++;
        size++;
    }

    public void pop() {
        if (size > 0) {
            left--;
            size--;

            if (left < 0) {
                left = 0;
            }
        }
    }
    public void peek(){
        if(size>0){
            System.out.println(left);
        }
        if(left<0){
            System.out.println(0);
        }
    }

    public int size() {
        return size;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}