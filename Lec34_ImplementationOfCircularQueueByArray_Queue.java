public class Lec34_ImplementationOfCircularQueueByArray_Queue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

            Queue(int n){
                arr = new int[n];
                size = n;
                rear = -1;
                front = -1;
            }
            // Empty function
            public static boolean isEmpty(){
                return rear == -1 && front == -1;
            }
            // Full check Function
            public static boolean isFull(){
                return (rear+1)%size == front;
            }
            // Add function
        public static void add(int data){
                if(isFull()){
                    System.out.println("Queue is Full!");
                    return;
                }
                // add first element
            if(front == -1){
                front = 0;
            }
                rear = (rear+1)%size;
                arr[rear] = data;
        }
        //remove function[
        public static int remove(){
                if(isEmpty()){
                    System.out.println("Queue is Empty");
                    return -1;
                }

                int result = arr[front];

                // Delete Last Element
            if(rear == front){
                rear = front = -1;
            }else {
                front = (front+1)%size;
            }
            return  result;
        }
        // peek function
        public static int peek(){
                if (isEmpty()){
                    System.out.println("Queue is Empty!");
                    return -1;
                }
                return arr[front];
        }

    }
    // main function
    public static void main(String[] args){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
