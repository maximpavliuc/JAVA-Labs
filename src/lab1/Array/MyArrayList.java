package lab1.Array;

package arrays;

public class MyArrayList {
    private float[] elements;
    private int size;
    private int capacity;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int initialCapacity) {
        this.capacity = initialCapacity;
        this.elements = new float[this.capacity];
        this.size = 0;
    }

    public void add(float value) {
        if (this.size >= this.capacity) {
            resize();
        }
        this.elements[this.size++] = value;
    }

    private void resize() {
        this.capacity *= 2;
        float[] newElements = new float[this.capacity];
        System.arraycopy(this.elements, 0, newElements, 0, this.size);
        this.elements = newElements;
    }

    public boolean contains(float value) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            System.out.println("Invalid index");
            return;
        }
        for (int i = index; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
    }

    public float get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return this.elements[index];
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.size; i++) {
            sb.append(this.elements[i]);
            if (i < this.size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
