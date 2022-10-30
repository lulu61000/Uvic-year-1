public class ShapeList {

    private static final int INIT_CAPACITY = 2;

    Shape[] elements; // array to store Shape objects added to the list
    int count; // number of Shape objects in elements

    /*
     * Purpose: initializes elements to an array of INIT_CAPACITY
     *   and initializes count to zero
     * Parameters: none
     */
    public ShapeList() {
		elements=new Shape[INIT_CAPACITY];
		count=0;
    }

    /*
     * Purpose: returns the count of the number of elements in this list
     * Parameters: none
     * Returns: int - the number of elements
     */
    public int size() {
        // ToDo
        return count;
    }

    /*
     * Purpose: adds Shape s to back of this list
     *  If elements is full, creates a new array with the existing value and s,
     *     and sets elements to point to the new array.
     * Parameters: Shape - s
     * Precondition: s is not null
     * Returns: void
     */
    public void add(Shape s) {
        // ToDo
		if(count<2){
			elements[count]=s;
		}
		else{
			Shape[] temp= new Shape[count+1];
			temp[count]=s;
			for(int i=0;i<count;i++){
				temp[i]=elements[i];
			}
			elements=temp;
		}
		count++;
    }

    /*
     * Purpose: returns a String reprensentation of the elements
     *      in this list separated by newlines
     * Parameters: none
     * Returns: String - the representation
     */
     public String toString() {
         String s = "";

         for(int i=0; i<count; i++)
             s  += elements[i] + "\n";

         return s;
     }

    /*
     * Purpose: removes the first element in this list
     *  When complete, all remaining Shape instances in the list will be
     *    at the front of the array.
     *    That is, position 0 of elements is not null.
     * Parameters: none
     * Returns: void
     */
    public void removeFront() {
        // ToDo
		if(count>0){
			Shape[] temp= new Shape[count-1];
		int startcount=1;
		for(int i=0;i<count-1;i++){
			temp[i]=elements[startcount++];
		}
		elements=temp;
		count--;
		}
    }


}
