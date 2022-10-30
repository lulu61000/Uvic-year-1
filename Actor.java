/*
 * Actor class
 *  represents a movie actor
 */
public class Actor {

    private String firstName;
    private String lastName;
    private int birthYear;
    private int numOscars;


    /* Constructor
     *
     * Purpose: Initialize this instance of Actor with given firstName,
     *     lastName and year and initializes numOscars to 0.
     *
     * Parameters: String firstName, String lastName, int year
     */
    // TODO: add the method implementation
	public Actor(String newfirstName, String newlastName, int newyear){
		firstName=newfirstName;
		lastName=newlastName;
		birthYear=newyear;
		numOscars=0;
	}

    /* Constructor
     *
     * Purpose: Initialize this instance of Actor with given firstName,
     *   lastName, year and numOscars.
     *
     * Parameters: String firstName, String lastName, int birthYear, int numOscars
     */
    // TODO: add the method implementation
	public Actor(String newfirstName, String newlastName, int newyear, int newnumOscars){
		firstName=newfirstName;
		lastName=newlastName;
		birthYear=newyear;
		numOscars=newnumOscars;
	}

    /* getFirstName
     *
     * Purpose: Returns the firstName associated with this Actor
     *
     * Parameters: nothing
     *
     * Returns: String - firstName associated with this Actor
     */
    // TODO: add the method implementation
	public String getFirstName(){
		return firstName;
	}

    /* setFirstName
     *
     * Purpose: set the firstName associated with this Actor to given firstName
     *
     * Parameters: String firstName
     *
     * Returns: void
     */
    // TODO: add the method implementation
	public void setFirstName(String newfirstName){
		firstName=newfirstName;
	}

    /* getLastName
     *
     * Purpose: Returns the lastName associated with this Actor
     *
     * Parameters: nothing
     *
     * Returns: String - lastName associated with this Actor
    */
    // TODO: add the method implementation
	public String getLastName(){
		return lastName;
	}

    /* setLastName
     *
     * Purpose: set the lastName associated with this Actor to given firstName
     *
     * Parameters: String lastName
     *
     * Returns: void
     */
    // TODO: add the method implementation
	public void setLastName(String newlastName){
		lastName=newlastName;
	}

    /* getBirthYear
     *
     * Purpose: Returns the birthYear associated with this Actor
     *
     * Parameters: nothing
     *
     * Returns: int - birthYear associated with this Actor
     */
    // TODO: add the method implementation
	public int getBirthYear(){
		return birthYear;
	}

    /* getNumOscars
     *
     * Purpose: Returns the numOscars associated with this Actor
     *
     * Parameters: nothing
     *
     * Returns: int - numOscars associated with this Actor
     */
    // TODO: add the method implementation
	public int getNumOscars(){
		return numOscars;
	}

    /* addOscars
     *
     * Purpose: adds moreOscars to numOscars associated with this Actor
     *
     * Parameters: int moreOscars
     *
     * Precondition: moreOscars>=0
     *
     * Returns: void
     */
    // TODO: add the method implementation
	public void addOscars(int moreOscars){
		numOscars+=moreOscars;
	}

    //vli: add parameters
    /* getAge
     *
     * Purpose: calculates the age this Actor will be in the given year
     *
     * Parameters: int year
     *
     * Precondition: year >= birthYear
     *
     * Returns: int - the age
     */
    // TODO: add the method implementation
	public int getAge(int year){
		return year-birthYear;
	}

    /* toString
     *
     * Purpose: returns a String representing this Actor formated as:
     *  firstName lastName, born in birthYear, has numOscars Oscar awards
     *
     * Parameters: nothing
     *
     * Returns: String - a representation of this Actor
     *
     * Example:
     *  Actor a = new Actor("Brad", "Pitt", 1963, 2)
     *  a.toString() returns "Brad Pitt, born in 1963, has 2 Oscar awards"
     */
     // TODO: add the method implementation
	 public String toString(){
		 return firstName+" "+lastName+", born in "+birthYear+", has "+numOscars+" Oscar awards";
	 }

}
