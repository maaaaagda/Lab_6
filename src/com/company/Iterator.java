package com.company;

/**
 * Created by Magdalena Polak on 06.04.2016.
 */

public interface Iterator
{
    public void first();
    public void last();
    public void next();
    public boolean isDone();
    public void previous();
    public Object current() throws Exception;

}
