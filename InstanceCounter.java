/**
 * Class InstanceCounter demonstrates the use of the "static" keyword.
 * 
 * @author Wolfgang Renz, HUAS 
 * @version 2017-04-25
 */
public class InstanceCounter
{
    // fields:
    // class variable:
    private static int instances=0; // keep number of instances geneated
    // insatance variable:
    private int number; //instance number

    /**
     * InstanceCounter Default Constructor
     * keeps it's instantiation process sequence number as instance variable
     *
     */
    public InstanceCounter()
    {
        number= ++instances;
    }

    /**
     * Method getInstanceNumber
     *
     * @return the number of instances at it's own instantiation
     */
    public int getInstanceNumber()
    {
        return number;
    }

    /**
     * Class Method number, accesses to class variable
     *
     * @return number of so far generated instances
     */
    public static int numberOfInstances()
    {
        return instances;
    }
}
