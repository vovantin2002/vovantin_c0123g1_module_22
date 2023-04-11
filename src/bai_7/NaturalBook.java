package bai_7;

public class NaturalBook extends Book implements IBook {
    private int numberOfPublications;

    public NaturalBook(String bookName, String publishingCompany, int publishingYear, int numberOfPublications) {
        super(bookName, publishingCompany, publishingYear);
        this.numberOfPublications = numberOfPublications;
    }

    public NaturalBook() {
    }

    @Override
    public String toString() {
        return "NaturalBook{" +
                "numberOfPublications=" + numberOfPublications +
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
