package com.company;

/**
 * Created by Magdalena Polak on 06.04.2016.
 */
public class InsertSort implements StudentSorter {
    private final Comparator _comparator;

    public InsertSort(Comparator comparator)  { _comparator = comparator; }

    public Object [] sort(Object [] objects) {
        for (int i = 1; i < objects.length; ++i) {
            Object value = objects[i],temp;
            int j;
            for (j = i; j > 0 && _comparator.compare(value, temp=objects[j - 1])< 0; --j)
                objects[j] = temp;
            objects[j] = value;
           }
        return objects;
    }
}

