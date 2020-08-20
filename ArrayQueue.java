
class ArrayQueue<T> {

 private int head;
 private int tail;
 private T arrQueue[];
 private int size;

 public ArrayQueue(int size) {
  this.head = 0;
  this.tail = 0;
  arrQueue = (T[]) new Object[size];

 }

 public boolean isEmpty() {
  if (size == 0) {
   return true;
  }
  return false;
 }

 public void enqueue(T var) {
  arrQueue[tail] = var;
  tail = (tail + 1) % (arrQueue.length);

 }

 public T dequeue() {
  if (!isEmpty()) {
   System.out.println("Queue is Empty, Cannot remove element");
   System.exit(1);

  }

  var r = arrQueue[head];
  arrQueue[head] = null;
  head = (head + 1) % (arrQueue.length);
  return r;

 }

 public void displayQueue() {
  System.out.println(" ");
  for (int i = 0; i < arrQueue.length; i++) {
   System.out.print(arrQueue[i] + " ");
  }
 }

}