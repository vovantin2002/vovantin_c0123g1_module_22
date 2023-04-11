package bai_7;

public class SocialBook extends Book implements IBook {
    private String author;

    public SocialBook(String bookName, String publishingCompany, int publishingYear, String author) {
        super(bookName, publishingCompany, publishingYear);
        this.author = author;
    }

    public SocialBook() {
    }

    @Override
    public String toString() {
        return "SocialBook{" +
                "author='" + author + '\'' +
                ", bookName='" + bookName + '\'' +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }

    @Override
    public void display(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
