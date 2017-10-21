import java.util.Arrays;

public class MyList<E> implements ListInterface {

    private Object[] objects = new Object[5];
    private int size = 0;

    @Override
    public void remove(int position) {

    }

    @Override
    public void add(Object o) {
        if(objects[size] != null){
            int newSize = size + 5;

            Object[] newObjects = new Object[newSize];
            System.arraycopy(objects, 0, newObjects, 0, size);

            objects = new Object[newSize];
            System.arraycopy(newObjects, 0, objects, 0, newSize);

        }else{
            objects[size] = o;
            size++;
        }

    }

    @Override
    public Object get(int position) {
        return objects[position];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "objects=" + Arrays.toString(objects) +
                ", size=" + size +
                '}';
    }
}
