package bai_7;


public class Main {
    public static void main(String[] args) {
        String[] str = new String[3];
        NaturalBook book = new NaturalBook("Tiếng việt", "Kim Đồng ", 2000, 20);
        NaturalBook book1 = new NaturalBook("Tiếng việt", "Kim Đồng ", 2000, 20);
        NaturalBook book2 = new NaturalBook("Tiếng việt", "Kim Đồng ", 2000, 20);
        SocialBook book3 = new SocialBook("Tiếng việt", "Kim Đồng ", 2000, "Võ Văn Tín");
        SocialBook book4 = new SocialBook("Tiếng việt", "Kim Đồng ", 2000, "Võ Văn Tín");
        str[0] = String.valueOf(book);
        str[1] = String.valueOf(book1);
        str[2] = String.valueOf(book2);
        String[] str1 = new String[2];
        str1[0] = String.valueOf(book3);
        str1[1] = String.valueOf(book4);
        NaturalBook naturalBook = new NaturalBook();
        SocialBook socialBook = new SocialBook();
        naturalBook.display(str);
        socialBook.display(str1);
    }
}
