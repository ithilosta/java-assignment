public class MyStack {
    private MyArrayList list;

    public MyStack() {
        list = new MyArrayList();
    }

    public void push(Object value) {
        list.add(value);
    }

    public Object pop() {
        if (isEmpty()) return null;
        return list.remove(list.size() - 1);
    }

    public Object peek() {
        if (isEmpty()) return null;
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
