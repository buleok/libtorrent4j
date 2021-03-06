package org.libtorrent4j;

/**
 * Represents an object that it is wrapper of a native
 * one.
 *
 * @author aldenml
 */
public class SwigObject<T> {

    // the native object handler
    protected final T h;

    /**
     * @param handler the native object handler
     */
    public SwigObject(T handler) {
        this.h = handler;
    }

    /**
     * Returns a reference to the native object handler
     */
    public T swig() {
        return h;
    }
}
