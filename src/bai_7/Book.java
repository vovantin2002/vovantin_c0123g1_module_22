package bai_7;

public abstract class Book {
    String bookName;
    String publishingCompany;
    int publishingYear;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Book(String bookName, String publishingCompany, int publishingYear) {
        this.bookName = bookName;
        this.publishingCompany = publishingCompany;
        this.publishingYear = publishingYear;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }
}
