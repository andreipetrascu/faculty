package Library;

public class Book {

    private int bookId;
    private int nrOfPages;
    private int nrOfChapters;
    private String bookStatus;
    private String name;
    private String author;

    public Book(int bookId, int nrOfPages, int nrOfChapters, String bookStatus, String name, String author){

        this.bookId = bookId;
        this.nrOfPages = nrOfPages;
        this.nrOfChapters = nrOfChapters;
        this.bookStatus = bookStatus;
        this.name = name;
        this.author = author;
    }

    public void displayBook(){

        System.out.println(bookId);
        System.out.println(nrOfPages);
        System.out.println(nrOfChapters);
        System.out.println(bookStatus);
        System.out.println(name);
        System.out.println(author);

    }

    public void setBorrow(){
        this.bookStatus = "Borrow";
    }
    public void setNotBorrow(){
        this.bookStatus = "Not Borrow";
    }

}
