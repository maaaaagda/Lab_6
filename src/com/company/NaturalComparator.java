package com.company;

/**
 * Created by Magdalena Polak on 05.04.2016.
 */
public final class NaturalComparator implements Comparator {
    // wykorzystuje wzorzec singleton
    public static final NaturalComparator INSTANCE = new NaturalComparator();

    private NaturalComparator() { }

    public int compare(Object left, Object right) throws ClassCastException
    { return ((Comparable) left).compareTo(right); }
}

