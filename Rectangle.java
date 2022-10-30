public class Rectangle implements Shape {

    private int length; //length units along x axis
    private int height;  //height units along y axis
    private Point position; // position is the (x,y) coordinates of lower left corner of the rectangle


    /*
     * Purpose: initializes this Rectangle with length and height of 0
     *   and position to new Point at 0,0
     * Parameters: none
     */
    public Rectangle() {
        this.length = 0;
        this.height = 0;
        this.position = new Point();
    }

    /*
     * Purpose: initializes this Rectangle with given length and height
     *   and position to new Point at 0,0
     * Parameters: int length, int height
     * Precondition: given length and height >=0
     */
    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
        this.position = new Point();
    }

    /*
     * Purpose: initializes this Rectangle with given length, height and position
     * Parameters: int length, int height, Point position
     * Precondition: given length and height >=0, position is not null
     */
    public Rectangle(int length, int height, Point position) {
        this.length = length;
        this.height = height;
        this.position = position;
    }

    /*
     * Purpose: prints a message about the characteristics of this Rectangle
     * Parameters: none
     * Returns: void
     */
    public void printCharacteristics() {
        if (length > height) {
            System.out.println("long rectangle");
        } else if (height > length) {
            System.out.println("tall rectangle");
        } else {
            System.out.println("square");
        }
    }

    public String toString() {
        return "Rectangle of dimensions: " + length + " by " + height + " at Point: " + position;
    }
	
	    /*
     * Purpose: calculates the area of this Shape
     * Parameters: none
     * Returns: double - the area
     */
	public double area(){
		return length*height;
	}

    /*
     * Purpose: calculates the perimeter of this Shape
     * Parameters: none
     * Returns: double - the perimeter
     */
	public double perimeter(){
		return 2*(length+height);
	}

    /*
     * Purpose: determines whether p is within or on the perimeter of this Shape
     * Parameters: Point p
     * Precondition: p is not null
     * Returns: boolean - true if p is with this Shape,
     *          false otherwise
     */
	public boolean contains(Point p){
		int ptX = p.getX();
        int ptY = p.getY();

        int positionX = position.getX();
        int positionY = position.getY();
		
		return ptX<=positionX+length&&ptY<=positionY+height&&ptX>=positionX&&ptY>=positionY;
	}
	// public void duplicateAllValues(){
		// int[] newarray= new int[count*2];
		// int postion=0;
		// int current=0;
		// if(count>=2){
			// while(postion<count){
				// for(int i=0;i<2;i++){
					// newarray[current+i]=data[postion];
				// }
				// postion++;
				// current+=2;
			// }
			// data=newarray;
		// }
		// else if(count==0){
			
		// }
		// else {
			// data[1]=data[0];
		// }
	// }
}

}
