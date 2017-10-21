/*** Interface to be implemented by the List created ***/
public interface ListInterface<E> {

    void remove(int position);

    void add(E e);

    E get(int position);
}
