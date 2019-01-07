import java.util.Arrays;

public final class CustomArrayList<Type> {
    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object data[] = {};
    
    // constructor initializes a new object
    public CustomArrayList() {
        data = new Object[INITIAL_CAPACITY];
    }
    
    // add elements
    public void add(Type element) {
        if(size == data.length)
            checkCapacity(); // make sure that there is room for another element
        
        data[size++] = element;
    }
    
    // get element
    public Type get(int index) {
        // if the index is negative or greater than the current size, throw exception
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Picked index: " + index + ". Current size: " + size);
        
        return (Type) data[index];
    }
    
    // remove element
    public Object remove(int index) {
        // if the index is negative or greater than the current size, throw exception
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Picked index: " + index + ". Current size: " + size);
        
        Object removedElement = data[index];
        for(int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        
        size--; // reduce the size
        return removedElement;
    }
    
    // ensure that there is enough capacity
    // create more capacity if there isn't enough
    private void checkCapacity() {
        int newCapacity = data.length * 2;
        data = Arrays.copyOf(data, newCapacity);
    }
    
    public void display() {
        System.out.println("The array list contains:");
        for(int i = 0; i < size; i++)
            System.out.println(data[i]);
    }
}