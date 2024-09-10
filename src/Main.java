class Book {
    private String nameBook;
    private String authorBook;
    private int yearBook;
    public Book(String nameBook,String authorBook, int yearBook) {
        this.nameBook= nameBook;
        this.authorBook = authorBook;
        this.yearBook = yearBook;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public String getAuthorBook() {
        return this.authorBook;
    }
    public int getYearBook() {
        return this.yearBook;
    }
    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }


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
}}

    public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        Book one = new Book ("Русалочка","Ханс Кристиан Андерсен", 2013);
        System.out.println("Book.name = " + one.getNameBook() + "; authorBook = " + one.getAuthorBook());
        Book two  = new Book ("Золушка","Шарль Перро",2020 );
        System.out.println("Book.name = " + two.getNameBook() + "; authorBook = " + two.getAuthorBook());
        one.setYearBook(2016);
        System.out.println("YearBook = " + one.getYearBook());
    }}






