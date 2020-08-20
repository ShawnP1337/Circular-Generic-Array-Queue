class ArrayQueueTest {

 public static void main(String[] args) {

  ArrayQueue<Object> arrayQueue = new ArrayQueue<Object>(5);

  arrayQueue.enqueue(10);
  arrayQueue.enqueue("helllo");
  arrayQueue.enqueue(444);
  arrayQueue.enqueue(1.2334);
  arrayQueue.enqueue("yes");

  arrayQueue.displayQueue();

  arrayQueue.dequeue();
  arrayQueue.dequeue();
  arrayQueue.enqueue("yes");
  arrayQueue.enqueue("hello");
  arrayQueue.dequeue();
  arrayQueue.enqueue("hi");

  arrayQueue.displayQueue();

 }

}