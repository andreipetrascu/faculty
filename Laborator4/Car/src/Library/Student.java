package Library;

public class Student {

    private String firstName;
    private String lastName;
    private Book myBook;

    public Student(String firstName, String lastName, Book myBook){
        this.firstName = firstName;
        this.lastName = lastName;
        this.myBook = myBook;
    }

    public void displayStudent(){

        System.out.println(firstName);
        System.out.println(lastName);
        this.myBook.displayBook();
    }

    public void borrowABook(Book book){
        this.myBook = book;
        book.setBorrow();
    }

}
