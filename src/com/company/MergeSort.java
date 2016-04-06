package com.company;


/**
 * Created by Magdalena Polak on 05.04.2016.
 */


public class MergeSort implements StudentSorter {
    private final Comparator _comparator;

    public MergeSort(Comparator comparator) {
        _comparator = comparator;
    }
        // wynikiem jest nowa lista
    public Object[] sort(Object[] objects) {
        return mergesort(objects, 0, objects.length - 1);
    }

    private Object[] mergesort(Object[] ob, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            Object[] result = new Object[ob.length];
            for (int i = 0; i < result.length; i++) {
                if (result[i] == null) {
                    result[i] = ob[startIndex];
                    break;
                }
            }
            return result;
        }
        int splitIndex = startIndex + (endIndex - startIndex) / 2;
       // System.out.println(splitIndex);
        return merge(mergesort(ob, startIndex, splitIndex), mergesort(ob, splitIndex + 1, endIndex));
    }

    private Object[] merge(Object[] left, Object[] right) {
        Object[] result = new Object[left.length + right.length];
        ArrayIterator l = new ArrayIterator(left);
        ArrayIterator r = new ArrayIterator(right);
        l.first();
        r.first();

      //  System.out.println(left[0]+ " " + right[0] + " " + r.current());
        int a = _comparator.compare(l.current(), r.current());
        while (!l.isDone() && !r.isDone()) {
            if (a <= 0) {

                for (int i = 0; i < result.length; i++) {
                    if (result[i] == null) {
                        result[i] = l.current();
                        break;
                    }
                }
                l.next();

            } else {
                for (int i = 0; i < result.length; i++) {
                    if (result[i] == null) {
                        result[i] = r.current();
                        break;
                    }
                }
                r.next();
            }
        }
        while (!l.isDone()) {
            for (int i = 0; i < result.length; i++) {
                if (result[i] == null) {
                    result[i] = l.current();
                    break;
                }
            }
            l.next();
        }
        while (!r.isDone()) {
            for (int i = 0; i < result.length; i++) {
                if (result[i] == null) {
                    result[i] = r.current();
                    break;
                }
            }
            r.next();
        }
        return result;


    }
}
