
/**
 * A class that maintains information on a book. 
 * This might form part of a larger application such
 * as a library system, for instance. 
 * 
 * Isaiah Wesley 
 * February 8, 2016
 */
public class Book
{
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    /**
     * Constructor for objects of class Book
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText)
    {
        
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        courseText = isCourseText;
    }

    /**
     * Accessor for author field
     */
    public String getAuthor(){
        return author;
    }
    /**
     * Accessor for title field
     */
    public String getTitle() {
        return title;
}
    /**
     * Accessor for pages field
     */
    public int getPages(){
        return pages;
}
    /**
     * Print author field
     */
    public void printAuthor(){
        System.out.println(author);
        return;
}
    /**
     * Print title field
     */
    public void printTitle(){
        System.out.println(title);
        return;
}
    /**
     * Print details of book
     */
    public void printDetails(){
        String tmp = getRefNumber();
        if(tmp.length() == 0) {
            tmp = "ZZZ";
        }
        else {
       System.out.println("Title: " + title);
       System.out.println("Author: " + author);
       System.out.println("Pages: " + pages);
       System.out.println("Reference Number: " + tmp);
       System.out.println("Borrowed: " + borrowed);
}
}

   /**
    * If ref's length is >= 3, set the refNumber to ref. Otherwise, print error message and leave refNumber unchanged.
    */
   public void setRefNumber(String ref){
       if(ref.length() >= 3) {
           refNumber = ref;
        }
        else {
           System.out.println("Invalid input! Number needs to be at least three characters. ");
        }
    }
    /**
     * Accessor for refNumber field
     */
   public String getRefNumber(){
       return refNumber;
    }
    /**
     * Increments borrow
     */
   public void borrow() {
       borrowed += 1;
    }
    /**
     * Accessor for borrowed field
     */
   public int getBorrowed(){
       return borrowed;
    }
    /**
     * Accessor for courseText field
     */
    public boolean isCourseText(){
        return courseText;
    }
}