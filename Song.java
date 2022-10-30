public class Song {
    public static int x; // added for demonstration purposes
    private String  title;
    private String  artist;
    private int     length; // in seconds

    public Song() {
        title = "unknown";
        artist = "unknown";
        length = 0;
    }
    public Song (String theTitle, String theArtist) {
        title = theTitle;
        artist = theArtist;
        int length = 0;
    }

    public Song (String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    /*
     * Purpose: get the title of this Song
     * Parameters: none
     * Returns: String title
     */
    public String getTitle() {
        return title;
    }
    /*
     * Purpose: set the title of this Song
     * Parameters: String title
     * Returns: nothing
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /*
     * Purpose: get the artist of this Song
     * Parameters: nothing
     * Returns: String artist
     */
    public String getArtist() {
        return artist;
    }
    /*
     * Purpose: set the artist of this Song
     * Parameters: String artist
     * Returns: nothing
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }
    /*
     * Purpose: get the length of this Song
     * Parameters: nothing
     * Returns: int - the length
     */
    public int getLength() {
        return length;
    }
    /*
     * Purpose: set the length of this Song
     * Parameters: int length
     * Returns: nothing
     */
    public void setLength(int length) {
        this.length = length;
    }

    /*
     * Purpose: determines whether this Song is the same as other
     * Parameters: Song other
     * Precondition: other is not null
     * Returns: boolean - true if they are equal, false otherwise
     */
    public boolean equals(Song other) {
        return title.equals(other.title) && artist.equals(other.artist);
    }

    /*
     * Purpose: generates a string representation of this Song
     * Parameters: nothing
     * Returns: String- representation of the song
     */
    public String toString() {
        String s = "(" + title + "," + artist + "," + length +","+x+ ")";
        return s;
    }
    /*
     * Purpose: the amount of time to add to the length of this Song
     * Parameters: int amount
     * Returns: void
     */
    public void addTime(int amount) {


    }

    /*
     * Purpose: increases x by amount
     * Parameters: int amount
     * Returns: void
     */
    public static void incx(int amount) {
        x += amount;
    }

}
