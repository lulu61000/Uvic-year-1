public class Test {
    /*
     *  Purpose: to determine whether n is negative
     *  Parameters: (int) n - any number
     *  Returns: (boolean) true if n is negative, false otherwise
     */
    public static boolean isNegative(int x) {
        if (x < 0)
            return true;
        else
            return false;
    }

    public static void main (String[] args) {
        // Q0. the following code tests the isNegative function
        //  use it to complete the implementation of isNegative
        boolean result;
        result = isNegative(-5);
        System.out.println("result should be true: " + result);

        result = isNegative(0);
        System.out.println("result should be false: " + result);

        result = isNegative(6);
        System.out.println("result should be false: " + result);

        // Q1. The following code tests the printValues method in
        //  IntegerLinkedList. Complete the implementation of printValues.
        // NOTICE: the variable is type IntegerLinkedList to allow us
        //          to call methods not included in the interface type
        System.out.println("\nQ1");
        IntegerLinkedList emptyList = new IntegerLinkedList();
        IntegerLinkedList myList = new IntegerLinkedList();

        myList.addBack(-10);
        myList.addBack(7);
        myList.addBack(-3);
        myList.addBack(12);

        System.out.println("emptyList, should print an empty line");
        emptyList.printValues();

        System.out.println("should print -10 7 -3 12:");
        myList.printValues();



        // Q2. write and test a recursive function that will update
        //  every element in the list to its absolute value
        System.out.println("\nQ2");
        
        System.out.println("emptyList, should not change");
        emptyList.absValue();
        System.out.println(emptyList);

        System.out.println("should update list to 10 7 3 12:");
        myList.absValue();
        System.out.println(myList);


        // Q3. write and test a recursive function that will
        //  compute and return the sum every element in the list
        System.out.println("\nQ3");
        
        System.out.println("emptyList, return 0");
        int sum = emptyList.getSum();
        System.out.println(sum);

        System.out.println("should return sum of 10 7 3 12, 32:");
        sum = myList.getSum();
        System.out.println(sum);
        

        // Q4. write and test a recursive method that will
        //  find and return the largest number in the list
        //  assume there is at least one element in the list
//        System.out.println("\nQ4");
//        IntegerLinkedList myList4a = new IntegerLinkedList();
//        myList4a.addBack(10);
//        int maximum = myList4a.getMax();
//        System.out.println("getMax max 1 element list, should have returned 10: " + maximum);
//
//        IntegerLinkedList myList4b = new IntegerLinkedList();
//        myList4b.addBack(10);
//        myList4b.addBack(9);
//        myList4b.addBack(3);
//        myList4b.addBack(12);
//
//        maximum = myList4b.getMax();
//        System.out.println("getMax should have returned 12: " + maximum);
//
//        myList4b.addBack(3);
//        maximum = myList4b.getMax();
//        System.out.println("getMax should have returned 12: " + maximum);
//
//        myList4b.addFront(40);
//        maximum = myList4b.getMax();
//        System.out.println("getMax should have returned 40: " + maximum);
       
       
        // Q5. write and test a recursive method that will
        //  determine whether all elements are above a given threshold
//        System.out.println("\nQ5");
//        boolean above = emptyList.allAbove(10);
//        System.out.println("allAbove emptyList, should have returned true: " + above);
//
//        IntegerLinkedList myList5 = new IntegerLinkedList();
//        myList5.addBack(40);
//        myList5.addBack(10);
//        myList5.addBack(9);
//        myList5.addBack(3);
//        myList5.addBack(12);
//        myList5.addBack(3);
//
//        // myList has: 40 10 9 3 12 3
//        above = myList5.allAbove(3);
//        System.out.println("allAbove should have returned false: " + above);
//
//        above = myList5.allAbove(0);
//        System.out.println("allAbove should have returned true: " + above);
       
       
        // Q6. write and test a recursive method that will
        //  print the values at a given position
//        System.out.println("\nQ6");
//        IntegerLinkedList myList6 = new IntegerLinkedList();
//        myList6.addBack(-10);
//        myList6.addBack(7);
//        myList6.addBack(-3);
//        myList6.addBack(12);
//        myList6.addBack(1);
//        myList6.addBack(14);
//
//        System.out.println("printAtPosition, should print -10: ");
//        myList6.printAtPosition(0);
//        System.out.println("printAtPosition, should print -3: ");
//        myList6.printAtPosition(2);
//        System.out.println("printAtPosition, should print 14:");
//        myList6.printAtPosition(5);
//

    }
}
