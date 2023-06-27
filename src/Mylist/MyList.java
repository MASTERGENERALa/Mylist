package Mylist;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private List<Object> elements;

    public MyList() {
        elements = new ArrayList<>();
    }

    public void add(Object element) {
        elements.add(element);
    }

    public Object get(int index) {
        return elements.get(index);
    }

    public int getCount() {
        return elements.size();
    }

    public Object getElementAt(int index) {
        return elements.get(index);
    }

    public int size() {
        return elements.size();
    }
}
