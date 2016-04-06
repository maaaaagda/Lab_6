package com.company;

/**
 * Created by Magdalena Polak on 06.04.2016.
 */

public final class NrComparator implements Comparator {
    // wykorzystuje wzorzec singleton
    public static final NrComparator INSTANCE = new NrComparator();

    private NrComparator() { }

    public int compare(Object left, Object right) throws ClassCastException
    { return ((Student)left).porNr((Student)right); }
}