package com.company;

/**
 * Created by Magdalena Polak on 05.04.2016.
 */
public final class NameComparator implements Comparator {
    // wykorzystuje wzorzec singleton
    public static final NameComparator INSTANCE = new NameComparator();

    private NameComparator() { }

    public int compare(Object left, Object right) throws ClassCastException
    { return ((Student)left).porNazw((Student)right); }
}
