/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */

/*
 * TODO: Create a public class named CrossbodyBag which is a subclass of Bag
 *       In addition to the attributes in Bag, the CrossbodyBag should have an
 *       attribute named "numberOfStraps".
 *
 *       The constructor for CrossbodyBag should take the following parameters
 *       in order:
 *           1. a String for the color
 *           2. an int for the capacity
 *           3. an int for the number of straps
 *
 *       CrossbodyBag should also have a getter method called getNumberOfStraps
 *       and it should implement the enhance method.
 *
 *       The enhance method should increase the capacity of the CrossbodyBag by
 *       2 (as opposed to the 1 that HandBag increases by).
 *
 *       The toString method should be overridden to return a string in the
 *       in the same form as Bag's toString but with the original "Bag" part
 *       of the string replaced by:
 *           Crossbody Bag with {numberOfStraps} straps
 *
 *       See the tests in test/CrossBodyBagTest.java for examples.
 */

public class CrossbodyBag extends Bag{

    /**
     * Creates a new Crossbody bag with the given color, capacity and number of straps in it.
     *
     * @param color
     * @param capacity
     * @param number_straps
     */

    public int number_of_straps; // creating a new public instant variable number of straps


    public CrossbodyBag(String bag_colour, int bag_capacity, int number_straps) {
        super(bag_colour, bag_capacity);
        this.number_of_straps = number_straps;
    }

    public int getNumberOfStraps(){
        // returns the number of straps
        return this. number_of_straps;
    }


    @Override
    public String toString(){
        // returns a string similar to the parent class Bag's toString method
        return this.getColor() + " Crossbody Bag with " + this.number_of_straps + " straps (" +
                this.getNumberOfContents() + " / " + this.getCapacity() + ")";
    }

    @Override
    public void enhance() {
        // increase the capacity by 2 here
        // Use increaseCapacity from Bag to increase the capacity
        super.increaseCapacity(2);
    }

}