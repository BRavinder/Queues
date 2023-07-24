class QueueSolution{
    int front_Q, rear_Q;
    int capasityofQueue;
    static int[] q1;

    QueueSolution(int size){
        capasityofQueue = size;
        q1 = new int[capasityofQueue];
    }
    void enqueue(int value){
        if(rear_Q == capasityofQueue){
            System.out.println(" Queue is already full, no need to insert enqueue")
        }
        else {
            q1[rear_Q] = value;
            rear_Q++;
        }
    }
    void dequeue(){
        if(rear_q == 0){
            System.out.println(" Queue is empty, there is nothing to delete");
        }
        else {
            for (int i = 0; i<rear_Q-1; rear_Q++){
                q1[i] = q1[i+1];
        }
        rear_Q--;
        }
    }
    void display(){
        if(rear_Q == 0){
            System.out.println(" Queue is empty, there is nothing to display");
        }
        else
        {
            for (int i = 0; i<rear_Q; i++){
                System.out.println(q1[i]);
            }
        }
    }
}
public class QueueUsingArray {
    public static void main(String[] args){
        QueueSolution q2 = new QueueSolution(5);
        q2.enqueue(2);
        q2.enqueue(4);
        q2.enqueue(8);
        
        q2.display();
        q2.dequeue();
        System.out.println();
        q2.display();

    }
}
  
