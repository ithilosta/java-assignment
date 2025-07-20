public class MyArrayList<E> implements MyList<E> {
    private Object[] data;
    private int size;
    public MyArrayList() {
        data = new Object[10]; // начальная ёмкость
        size = 0;
    }
    @Override
    public void add(E element) {
        ensureCapacity();
        data[size++] = element;
    }
    @Override
    public E get(int index) {
        checkBounds(index);
        return (E) data[index];
    }
    @Override
    public E remove(int index) {
        checkBounds(index);
        E removed = (E) data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null; // убрать последний дубликат
        return removed;
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        data = new Object[10];
        size = 0;
    }

    private void ensureCapacity() {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }

    private void checkBounds(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds.");
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return new java.util.Iterator<E>() {
            private int current = 0;

            public boolean hasNext() {
                return current < size;
            }

            public E next() {
                return (E) data[current++];
            }
        };
    }
} 

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();

        System.out.println("Adding elements...");
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Size: " + list.size()); // 3
        System.out.println("Element 1: " + list.get(1)); // Banana

        System.out.println("Delete element 1: " + list.remove(1)); // Banana
        System.out.println("Now element in 1: " + list.get(1)); // Cherry

        System.out.println("All elements in list:");
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("Clear list");
        list.clear();
        System.out.println

