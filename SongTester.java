import java.util.Arrays;

// SongTester.java
public class SongTester {

    public static void main (String[] args) {

        Song samsSong = new Song("Only You", "Steven Chou");
        Song stephenSong = new Song("Bridge", "Paul Simon");

        // Q1b. The output of my program is not what I expect.
        // What is my bug and how do I fix it?
         System.out.println(stephenSong);


       // Q1c. I updated the parameter names in my setter methods
       //   in Song.java
       // Now I am trying to use setArtist to update stephenSong object but...
       //   it is not working!
       // What is my bug and how do I fix it?
       // stephenSong.setArtist("Red Hot Chilli Peppers");
       // System.out.println(stephenSong);


       //  Q2a. What will be the output of the following:
        //Song mySong = null;
		Song mySong = new Song();
        System.out.println("My song: " + mySong.getTitle());


       //  Q2b. What will be the output of the following:
       // mySong = samsSong;
       // System.out.println("Sam's song: " + samsSong.getTitle());
       // System.out.println("My song: "  + mySong.getTitle());

       //  Q2c. What will be the output of the following:
       // mySong.setTitle("Living on a Prayer");
       // System.out.println("Sam's song: "  + samsSong.getTitle());
       // System.out.println("My song: " + mySong.getTitle());


       //  Q3. The following code tests the addTime method.
       //  Complete the stub for the addTime method in Song.java
       // samsSong.addTime(100);
       // System.out.println("expect length 100: " + samsSong);
       // samsSong.addTime(10);
       // System.out.println("expect length 110: " + samsSong);


        // In Song.java I added a static variable x and an incx method
        // Q4a. Update the toString method so that it includes the value of x

        // Q4b. What will be the output of the following code:
        System.out.println();
        System.out.println("before incx() is called:");
        System.out.println(samsSong);
        System.out.println(stephenSong);
        
        samsSong.incx(10);
        System.out.println();
        System.out.println("after samsSong.incx(10) is called:");
        System.out.println(samsSong);
        System.out.println(stephenSong);
        
        Song.incx(2);
        System.out.println();
        System.out.println("after Song.incx(2) is called:");
        System.out.println(samsSong);
        System.out.println(stephenSong);



        // Q4c. Why can I not do this:
        // Song.getLength();
        // but I can do this:
        // Song.incx(2);


        // Q5a. Create an array of Songs holding samsSong, stephenSong, lennySong
        // Print the array using Arrays.toString method:
        //  It takes an array and returns a string representation
        //  of the contents of the specified array.
        Song lennySong  = new Song("Jump", "Van Halen", 241);


        // Q5b. Write and test a method called addTimeToAll that takes an
        //  array of Songs and an amount of time in seconds and
        //  adds the given amount of time to all Song lenths in the array


        // Q5c. Write and test a method called getPlaylistLength that takes an
        //  array of Songs and returns the total length of all songs in the array


        // Q6. Design and test 2 functions that will return
        //   the sum of the lengths of two songs.
        // Implement both functions within Song.java
        // - design one as an instance method
        // - design the other as a static method
        // Song instances provided for your testing:
        Song believe = new Song("Believe", "Cher", 310);
        Song despacito = new Song("Despacito", "Justin Bieber", 280);



    }
}
