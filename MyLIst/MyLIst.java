public class MyLinkedList implements MyList {

    private class MyNode {
        Object value;
        MyNode next;
        MyNode prev;

        MyNode(Object value) {
            this.value = value;
        }
    }

    private MyNode head;
    private MyNode tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public void add(Object element) {
        MyNode newNode = new MyNode(element);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public Object get(int index) {
        checkBounds(index);
        return nodeAt(index).value;
    }

    @Override
    public Object remove(int index) {
        checkBounds(index);
        MyNode node = nodeAt(index);

        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }

        size--;
        return node.value;
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
        head = null;
        tail = null;
        size = 0;
    }

    private MyNode nodeAt(int index) {
        MyNode current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++)
                current = current.next;
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--)
                current = current.prev;
        }
        return current;
    }

    private void checkBounds(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds.");
    }

    @Override
    public java.util.Iterator<Object> iterator() {
        return new java.util.Iterator<Object>() {
            private MyNode current = head;

            public boolean hasNext() {
                return current != null;
            }

            public Object next() {
                Object value = current.value;
                current = current.next;
                return value;
            }
        };
    }
}
public class Main {
    public static void main(String[] args) {
        MyList list = new MyLinkedList();

        System.out.println("adding elements...");
        list.add("Alpha");
        list.add("Beta");
        list.add("Gamma");

        System.out.println("List size: " + list.size()); // 3
        System.out.println("element 1: " + list.get(1)); // Beta

        System.out.println("Deleting element in 1: " + list.remove(1)); // Beta
        System.out.println("now element in 1: " + list.get(1)); // Gamma

        System.out.println("Список после удаления:");
        for (Object item : list) {
            System.out.println(item);
        }

        System.out.println("Clear list...");
        list.clear();
        System.out.println("Пустой? " + list.isEmpty()); // true
    }
}

