package dsassignment1spring2017;

// ********************************************************************
// BagADT.java
// Authors: Manuel A. Perez Quinones, loosely based on code by Lewis/Chase
//
// Defines the interface to a bag data structure.
//********************************************************************

public interface BagADT<E> {
    
    /**
     * Adds the 'element' to the bag. Bags don't care if an object
     * already exists in the bag, duplicate are allowed. Also it
     * does not matter where the element is added, beginning, end,
     * an empty slot, up to you.
     *
     * To add an element, the bag must make sure that it has enough
     * space to hold the new element. This routine should not fail
     * because the bag is full, the bag should always grow to accommodate
     * adds.
     * 
     * @param element
     * @precondition element != null
     */
    public void add(E element);

    /**
     * Removes an element randomly and returns it. 
     * @precondition precondition: (!isEmpty())
     * @return object removed from bag
     */
    public E remove();

    /**
     * Returns true if this bag contains 'target', false otherwise.
     * @param target
     * @precondition target != null
     * @return boolean true if bag contains it, false otherwise
     */
    public boolean contains(E target);

    /**
     * Returns true if this bag contains no elements (i.e. size() == 0)
     * @return boolean true if the bag is empty, false otherwise
     */
    public boolean isEmpty();

    /**
     * Returns the number of elements in the bag. Note that this the
     * number of elements stored in the bag, not the size of the
     * array to hold elements.
     * @return int for the size of the collection/bag
     */
    public int size();

    /**
     * Returns a string representation of this bag, for debugging purposes
     * @return a string
     */
    @Override
    public String toString();
}

