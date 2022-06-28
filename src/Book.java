public class Book {
    private final String bookName;
    private final Author author;
    int publicationYear;



    public Book (String bookName,Author author,int publicationYear){
        this.author=author;
        this.bookName=bookName;
        this.publicationYear=publicationYear;
    }

    public String getBookName(){
        return this.bookName;

    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int newYear) {
        this.publicationYear = newYear;
    }
}
