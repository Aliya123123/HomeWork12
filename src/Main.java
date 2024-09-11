class Author {
    private String name;
    private String surname;
    public Author(String name,String surname) {
        this.name= name;
        this.surname = surname;
    }
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
}
class Book {
    private String nameBook;
    private Author authorBook;
    private int yearBook;
    public Book(String nameBook,Author authorBook, int yearBook) {
        this.nameBook= nameBook;
        this.authorBook = authorBook;
        this.yearBook = yearBook;

    }
    public String getNameBook() {
        return this.nameBook;
    }
    public Author getAuthorBook() {
        return this.authorBook;
    }
    public int getYearBook() {
        return this.yearBook;
    }
    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
}
    public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        Author author1 = new Author("Кристиан ", "Ханс");
        Author author2 = new Author("Шарль", " Перро");
        Book one = new Book ("Русалочка",author1, 2013);
        System.out.println("Book.name = " + one.getNameBook() + "; authorBook = " + author1.getName() + author1.getSurname());
        Book two  = new Book ("Золушка",author2,2020 );
        System.out.println("Book.name = " + two.getNameBook() + "; authorBook = " + author2.getName() + author2.getSurname());
        one.setYearBook(2016);
        System.out.println("YearBook = " + one.getYearBook());
    }}






