/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsassignment1spring2017;

import java.util.Arrays;
import java.util.Random;

/**
 * @version 1.0
 * @author cbare3
 * @param <E> Is a generic 
 */
public class ArrayBag<E> implements BagADT<E> {

    private static int initCapacity = 100;
    private static Random random = new Random();
    private E[] bag;
    private int top;
    private final int nope = -1;

    /**
     * This is an ArrayBag. It requires food water and names. Love it like a
     * child.
     */
    public ArrayBag() {
        this(initCapacity);
    }

    /**
     *
     * @param capacity is the size of the bag when it is made.
     */
    public ArrayBag(int capacity) {
        bag = (E[]) (new Object[capacity]);
        top = 0;
    }

    @Override
    public void add(Object element) {
        if (size() == bag.length) {
            expandCapacity();
        }
        bag[top] = (E) element;
        top++;
    }

    @Override
    public E remove() {
        int pick = random.nextInt(top);

        E result = bag[pick];

        bag[pick] = bag[top - 1];
        bag[top - 1] = null;
        top--;

        return result;
    }

    @Override
    public boolean contains(Object target) {
        int isItThere = nope;

        for (int i = 0; i < top && isItThere == nope; i++) {
            if ((((Comparable) bag[i]).compareTo((Comparable) target)) == 0) {
                isItThere = i;
            }
        }

        return isItThere != nope;
    }

    @Override
    public boolean isEmpty() {

        if (top == 0) {
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public String toString() {
        return "ArrayBag{" + "bag="
                + Arrays.toString(bag) 
                + ", top=" + top 
                + ", Nope=" + nope + '}';
    }

    /**
     * Doubles the size of the array if it fills up.
     */
    private void expandCapacity() {
        bag = Arrays.copyOf(bag, bag.length * 2);
    }

    /**
     *
     * @return Returns the bag variable when you need it outside its house.
     */
    public E[] getBag() {
        return bag;
    }

    /**
     *
     * @return Returns the top variable when you need it outside its house.
     */
    public int getTop() {
        return top;
    }

    /**
     *
     * @return Returns the initCapacity variable when you need it outside its
     * house.
     */
    public static int getInitCapacity() {
        return initCapacity;
    }

    /**
     *
     * @return Returns the random variable when you need it outside its house.
     */
    public static Random getRandom() {
        return random;
    }

    /**
     *
     * @return Returns the nope variable when you need it outside its house.
     */
    public int getNope() {
        return nope;
    }

}
