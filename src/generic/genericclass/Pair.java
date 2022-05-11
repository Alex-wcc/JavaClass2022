package generic.genericclass;

import java.util.ArrayList;

public class Pair<T> {
    public ArrayList list;
    private T first;
    private T second;

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T newValue) {
        first = newValue;
    }

    public void setSecond(T newValue) {
        second = newValue;
    }

    int search(T t) {
        Object[] a = list.toArray();
        if (!(list.contains(t)))
            return -1;
        int i;
        for (i = 0; i <= a.length; i++)
            if (a[i] == t) break;
        return i;
    }
}
