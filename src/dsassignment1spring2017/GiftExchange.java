/*
 * Created on Feb 8, 2005
 * author: manuel a. perez-quinones
 * Modified January 2017 
 * author: celine latulipe
 * 
 * Gift Exchange class
 * 
 */
package dsassignment1spring2017;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 * GiftExchange class... it reads from a file a set of names, stores these names
 * in a 2D array and then adds them to a bag. It then assigns a giftee name to
 * each name in the first dimension of the 2D array. The name of the giftee and
 * the name of the giftor must be different
 *
 * @author celine latulipe (as modified from a Fortune Cookie class by Manuel
 * Perez Quinones)
 *
 */
/**
 * @author clatulip
 */
public class GiftExchange {

    private String theFilename;
    private BagADT<String> theBag;
    private String[][] exchange;
    private int nameIndex;

    /**
     * Constructor for the GiftExchange class. It tries to read the file in and
     * throws an exception if there was an error reading the file. The state of
     * the object is undefined if the exception is thrown.
     *
     * @param file
     * @precondition file != null
     * @throws IOException
     */
    public GiftExchange(String file) throws IOException {
        assert (file != null);
        theFilename = file;
        theBag = new ArrayBag<String>();
        exchange = new String[10][2];
        nameIndex = 0;
        readNames();
        assignGiftees();

    }

    /**
     * Returns the number of names read.
     *
     * @return int
     */
    public int count() {
        return theBag.size();
    }

    /**
     * Reads the contents of a names file and stores it in a bag
     *
     * @throws IOException
     */
    private void readNames() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(theFilename));

        String str;
        while ((str = br.readLine()) != null) {
            theBag.add(str);
            exchange[nameIndex++][0] = str;

        }
        br.close();
    }

    private void assignGiftees() {
        String temp;
        for (int i = 0; i < nameIndex; i++) {
            temp = theBag.remove();
            while (temp.equals(exchange[i][0])) {
                // giftee is the same as giftor, 
                // put name back in, try again
                theBag.add(temp);
                temp = theBag.remove();
            }
            exchange[i][1] = temp;
        }
    }

    /**
     * Get a fortune cookie from the bag and print it to standard output
     */
    private void printGiftExchange() throws IOException {
        System.out.println("Here is the gift exchange list: ");
        for (int i = 0; i < nameIndex; i++) {
            System.out.println(exchange[i][0] + " is giving to: " + exchange[i][1]);
        }
    }

    /**
     * Main program, reads a cookie file, and prints one.
     *
     * @param args
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        GiftExchange fc = new GiftExchange("~/christopher1/Dropbox/School/DataStructures/DSAssignment1Spring2017/build/classes/dsassignment1spring2017/names.txt");
        fc.printGiftExchange();
        System.out.println("Have a good day!");
    }
}
