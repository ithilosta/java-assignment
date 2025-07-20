public class MyMinHeap {
    private MyArrayList heap;

    public MyMinHeap() {
        heap = new MyArrayList();
    }

    public void add(Comparable value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    public Object poll() {
        if (isEmpty()) return null;
        Object min = heap.get(0);
        Object last = heap.remove(heap.size() - 1);
        if (!isEmpty()) {
            heap.set(0, last);
            heapifyDown(0);
        }
        return min;
    }

    public Object peek() {
        if (isEmpty()) return null;
        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            Comparable current = (Comparable) heap.get(index);
            Comparable parentVal = (Comparable) heap.get(parent);
            if (current.compareTo(parentVal) < 0) {
                swap(index, parent);
                index = parent;
            } else break;
        }
    }

    private void heapifyDown(int index) {
        int size = heap.size();
        while (true) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;

            if (left < size && compare(left, smallest) < 0)
                smallest = left;

            if (right < size && compare(right, smallest) < 0)
                smallest = right;

            if (smallest == index) break;

            swap(index, smallest);
            index = smallest;
        }
    }

    private int compare(int i, int j) {
        Comparable a = (Comparable) heap.get(i);
        Comparable b = (Comparable) heap.get(j);
        return a.compareTo(b);
    }

    private void swap(int i, int j) {
        Object temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
