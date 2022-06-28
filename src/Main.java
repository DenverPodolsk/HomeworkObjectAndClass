public class Main {
    public static void main(String[] args) {
 Author author1 =new Author("Denis ","Knyazev ");
        Author author2 =new Author("Aleks ","Pavlov ");


 Book book1 =new Book("Програмирование ",author1,2010);
        Book book2 =new Book("Разработка программ ",author2,2011);

        System.out.println("Имя книги "+ book1.getBookName() + "Имя автора "+ book1.getAuthor().getName()+ "Фамилия автора "+book1.getAuthor().getSurname()+ "Год публикации "+book1.getPublicationYear());
        book1.setPublicationYear(2000);
        System.out.println("Имя книги "+ book1.getBookName() + "Имя автора "+ book1.getAuthor().getName()+ "Фамилия автора "+book1.getAuthor().getSurname()+ "Год публикации "+book1.getPublicationYear());

    }
}