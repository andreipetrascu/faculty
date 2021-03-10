package Library;

public class Library {

    public static void main(String[] args){

        Book b1 = new Book(10983, 234, 33, "at student", "Physics", "James");
        //b1.displayBook();
        Student s1 = new Student("Martin", "Luther", b1);
        //s1.displayStudent();
        s1.borrowABook(b1);
        b1.displayBook();
    }
}
