/*
 * Lab2Tester.java
 *
 * A tester for the methods in Lab2.java
 *
 */
import java.util.Arrays;

public class Lab2Tester {
    
    private static int testPassCount = 0;
    private static int testCount = 0;
    
    
    // for approximate comparison of floating point numbers
    private static final double THRESHOLD = 0.01;
    
    public static void main(String[] args) {
        
        testGetHigherGradeStudent();
        testIsGradeAbove();
        testGetClasslist();
        testCountAbove();
        testGetClassAverage();
        testRegisterStudent();
        
        System.out.println("Passed " + testPassCount + "/" + testCount + " tests");
    }
    
    public static void displayResults (boolean passed, String testName)
    {
        /* There is some magic going on here getting the line number
         * Borrowed from:
         * http://blog.taragana.com/index.php/archive/core-java-how-to-get-java-source-code-line-number-file-name-in-code/
         */
        
        testCount++;
        if (passed)
        {
            System.out.println ("Passed test: " + testName);
            testPassCount++;
        }
        else
        {
            System.out.println ("Failed test: " + testName + " at line "
                                + Thread.currentThread().getStackTrace()[2].getLineNumber());
        }
        
    }
    
    public static void testGetHigherGradeStudent() {
        // ToDo: once you have implemented getHigherGradeStudent in Lab2.java
        //  uncomment the following tests - make sure you understand what they are testing
        
        
         Student s0  = new Student("abc", 50);
         Student s1a = new Student("def", 56);
         Student s1b = new Student("xyz", 56);
         Student s2  = new Student("xyz", 99);
         
         Student result;
         
         result = Lab2.getHigherGradeStudent(s0,s1a);
         System.out.println("should be  " + s1a + " is " + result);
         displayResults(result.equals(s1a), "testGetHigherGradeStudent");
         
         result = Lab2.getHigherGradeStudent(s1a,s0);
         System.out.println("should be  " + s1a + " is " + result);
         displayResults(result.equals(s1a), "testGetHigherGradeStudent");
         
         result = Lab2.getHigherGradeStudent(s1b,s1a);
         System.out.println("should be  " + s1b + " is " + result);
         displayResults(result.equals(s1b) && result == s1b, "testGetHigherGradeStudent");
         
         result = Lab2.getHigherGradeStudent(s1b,s2);
         System.out.println("should be  " + s2 + " is " + result);
         displayResults(result.equals(s2), "testGetHigherGradeStudent");
        
        
    }
    
    public static void testIsGradeAbove() {
        // ToDo: write tests for Lab2.isGradeAbove
		Student s0  = new Student("abc", 50);
		 
		boolean result;
         
        result = Lab2.isGradeAbove(s0,0);
        System.out.println("should be  " + true + " is " + result);
        displayResults(result==true, "testIsGradeAbove");
		
		result = Lab2.isGradeAbove(s0,49);
        System.out.println("should be  " + true + " is " + result);
        displayResults(result==true, "testIsGradeAbove");
		
		result = Lab2.isGradeAbove(s0,50);
        System.out.println("should be  " + false + " is " + result);
        displayResults(result==false, "testIsGradeAbove");
		
		result = Lab2.isGradeAbove(s0,51);
        System.out.println("should be  " + false + " is " + result);
        displayResults(result==false, "testIsGradeAbove");
        

    }
    
    public static void testGetClasslist() {
        // ToDo: write tests for Lab2.getClasslist
        
        // NOTE: the Arrays library has been imported for you.
        //  you can use the Arrays.equals method to compare
        //  2 arrays of String objects as String has a equals method
        // The API for Arrays.equals:
        //  equals(Object[] a, Object[] a2)
        //  Returns true if the two specified arrays of Objects are equal to one another.
        
        // ToDo: once you have implemented getClasslist in Lab2.java
        //  uncomment the following test
        // We have gotten you started with some initial test data and one test,
        // but you should consider other cases (empty array, longer array)

        
        Student s0  = new Student("abc", 50);
        Student[] students1 = {s0};
        String[] expected1 = {"abc"};

        String[] result;
     
        result = Lab2.getClasslist(students1);
        displayResults(Arrays.equals(result, expected1), "testGetClasslist - 1 elements");
		
		Student s1  = new Student("cde", 67);
		Student s2  = new Student("lulu", 77);
        Student[] students2 = {s0,s1,s2};
        String[] expected2 = {"abc","cde","lulu"};

        String[] result2;
     
        result2 = Lab2.getClasslist(students2);
        displayResults(Arrays.equals(result2, expected2), "testGetClasslist - 3 elements");
		
		Student[] students3 = {};
        String[] expected3 = {};

        String[] result3;
     
        result3 = Lab2.getClasslist(students3);
        displayResults(Arrays.equals(result3, expected3), "testGetClasslist - 0 elements");
		
		
        
    }
    
    
    public static void testCountAbove() {
        // ToDo: write tests for Lab2.countAbove
        Student s0  = new Student("abc", 50);
		Student s1  = new Student("cde", 67);
		Student s2  = new Student("lulu", 77);
        Student[] students1 = {s0,s1,s2};
        int expected1 = 2;

        int result;
     
        result = Lab2.countAbove(students1,50);
        displayResults(result==expected1, "testCountAbove - 1 above elements");
		
		Student[] students2 = {};
        int expected2 = 0;

        int result1;
     
        result1 = Lab2.countAbove(students2,50);
        displayResults(result1==expected2, "testCountAbove - 0 above elements");
		
		Student[] students3 = {s0,s1,s2};
        int expected3 = 3;

        int result2;
     
        result2 = Lab2.countAbove(students3,24);
        displayResults(result2==expected3, "testCountAbove - 3 above elements");

  
    }
    
 
    
    public static void testGetClassAverage() {
        // ToDo: write tests for Lab2.getClassAverage
        Student s0  = new Student("abc", 50);
		Student s1  = new Student("cde", 50);
		Student s2  = new Student("lulu", 77);
		Student s3  = new Student("xx",0);
        Student[] students1 = {s0,s1,s2};
        double expected1 = 59;

        double result;
     
        result = Lab2.getClassAverage(students1);
        displayResults(result==expected1, "testGetClassAverage - 3 elements 0 of them is 0");
		
		Student[] students2 = {s0,s1,s2,s3};
        double expected2 = 59;

        double result1;
     
        result1 = Lab2.getClassAverage(students2);
        displayResults(result1==expected2, "testGetClassAverage - 4 elements 1 of them is 0");
		
		Student[] students3 = {s3};
        double expected3 = 0;

        double result2;
     
        result2 = Lab2.getClassAverage(students3);
        displayResults(result2==expected3, "testGetClassAverage - 1 elements 1 of them is 0");
		
		Student[] students4 = {};
        double expected4 = 0;

        double result3;
     
        result3 = Lab2.getClassAverage(students4);
        displayResults(result3==expected4, "testGetClassAverage - 0 elements 0 of them is 0");

        
    }
    
    public static void testRegisterStudent() {
        // ToDo: write tests for Lab2.registerStudent
        // HINT: the Student class also has a equals method so you
        //  can use Arrays.equals again to compare 2 Student arrays
		Student s0  = new Student("abc", 50);		
		Student s1  = new Student("cde", 67);
		Student s2  = new Student("lulu", 77);
		Student s3  = new Student("xx",0);
        Student[] students1 = {s0};
        Student[] expected1 = {s0,s1};

        Student[] result;
     
        result = Lab2.registerStudent(students1,s1);
        displayResults(Arrays.equals(result, expected1), "testRegisterStudent - 1 elements");

        Student[] students2 = {s0,s1,s2};
        Student[] expected2 = {s0,s1,s2,s3};

        Student[] result2;
     
        result2 = Lab2.registerStudent(students2,s3);
        displayResults(Arrays.equals(result2, expected2), "testRegisterStudent - 3 elements");
		
		Student[] students3 = {};
        Student[] expected3 = {s1};

        Student[] result3;
     
        result3 = Lab2.registerStudent(students3,s1);
        displayResults(Arrays.equals(result3, expected3), "testRegisterStudent - 0 elements");

        
    }
    
    
}
