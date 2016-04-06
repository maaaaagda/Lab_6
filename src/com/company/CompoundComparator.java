package com.company;



/**
 * Created by Magdalena Polak on 06.04.2016.
 */
public class CompoundComparator implements Comparator {
    //tablica komparatorów ; od najważniejszego
    private final Object [] _comparators = new Object[5];

    public void addComparator(Comparator comparator)
    {  for (int i = 0; i < _comparators.length; i++) {
        if (_comparators[i] == null) {
            _comparators[i] = comparator;
            break;
        }
    }
    }

    public int compare(Object left, Object right) throws ClassCastException {
        int result = 0;

        ArrayIterator i = new ArrayIterator (_comparators);
       // System.out.println("current" + i.current());
        for (i.first(); !i.isDone()&&(result = ((Comparator) i.current()).compare(left, right))== 0; i.next());
        return result;
    }
}

