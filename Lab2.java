/*
 * Lab2.java
 *
 * A class of static methods that operate on Students
 *
 */
public class Lab2 {

    /* getHigherGradeStudent
     *
     * Purpose: determines which of Students s1 and s2
     *  have the higher grade
     *
     * Parameters: Student - s1, Student - s2
     *
     * Precondition: s1 and s2 are not null
     *
     * Returns: Student - the Student with the higher grade,
     *  s1 if they have the same grade
     *
     */
    public static Student getHigherGradeStudent(Student s1, Student s2) {
        // this is a stub provided for you, you still must complete the TODO...
        // ToDo: implement getHigherGradeStudent
		if (s1.getGrade()>=s2.getGrade()){
			return s1;
		}
		else {
			return s2;
		}

    }



    /* isGradeAbove
     *
     * Purpose: determines whether the grade of Student s
     *  is above the threshold
     *
     * Parameters: Student - s, int - threshold
     *
     * Returns: boolean - true if grade is above threshold,
     *          false otherwise
     *
     */
    // ToDo: implement isGradeAbove
	public static boolean isGradeAbove(Student s, int threshold){
		return s.getGrade()>threshold;
	}



    /* getClasslist
     *
     * Purpose: creates an array sIDs of all Students in students
     *
     * Parameters: Student[] - students
     *
     * Returns: String[] - array of sIDs
     *
     */
    // ToDo: implement getClasslist
	public static String[] getClasslist(Student[] students){
		String[] classlist=new String[students.length];
		for(int i=0;i<students.length;i++){
			classlist[i]=students[i].getSID();
		}
		return classlist;
	}


    /* countAbove
     *
     * Purpose: counts the number of Students in students
     *  with grade above threshold
     *
     * Parameters: Student[] - students, int threshold
     *
     * Returns: int - the count
     *
     */
    // ToDo: implement countAbove
    // HINT: you should be using the isGradeAbove method!
	public static int countAbove(Student[] students, int threshold){
		int count=0;
		for(int i=0;i<students.length;i++){
			if(isGradeAbove(students[i], threshold)){
				count++;
			}
		}
		return count;
	}



    /* getClassAverage
     *
     * Purpose: calculates the average grade of Students in students,
     *  does NOT include students with 0 grade in calculation
     *  average is 0.0 if students is empty or all students have 0 grade
     *
     * Parameters: Student[] - students
     *
     * Returns: double - the average grade
     *
     */
    // ToDo: implement getClassAverage
    // HINT: you can use the isGradeAbove method again
	public static double getClassAverage(Student[] students){
		int count=countAbove(students,0);
		double sum=0.0;
		if (students==null||count==0){
			return 0.0;
		}
		else{
			for(int i=0;i<students.length;i++){
				if(isGradeAbove(students[i],0)){
					sum+=students[i].getGrade();
				}
			}
		}
		return sum/count;
	}


    /* registerStudent
     *
     * Purpose: creates a new array 1 longer than students
     *  and adds all students and s to the new array
     *
     * Parameters: Student[] - students, Student s
     *
     * Returns: Student[] - the new array
     *
     */
    // ToDo: implement registerStudent
	public static Student[] registerStudent(Student[] students, Student s){
		Student[] newarray=new Student[students.length+1];
		for (int i=0;i<newarray.length;i++){
			if(i==newarray.length-1){
				newarray[i]=s;
			}
			else{
				newarray[i]=students[i];
			}
		}
		return newarray;
	}

}
