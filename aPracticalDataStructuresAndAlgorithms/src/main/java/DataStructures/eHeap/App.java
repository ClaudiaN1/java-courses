package DataStructures.eHeap;

public class App {

    public static void main(String[] args) {

        Heap newHeap = new Heap(10);
        newHeap.insert(10);
        newHeap.insert(12);
        newHeap.insert(42);
        newHeap.insert(35);
        newHeap.insert(88);
        newHeap.insert(56);
        newHeap.insert(3);
        newHeap.insert(8);

        newHeap.displayHeap();

    }
}
