public class MyQueue {
    private MyLinkedList list;

    public MyQueue() {
        list = new MyLinkedList();
    }

    public void enqueue(Object value) {
        list.add(value); // добавляем в конец
    }

    public Object dequeue() {
        if (isEmpty()) return null;
        return list.remove(0); // удаляем с начала
    }

    public Object peek() {
        if (isEmpty()) return null;
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
