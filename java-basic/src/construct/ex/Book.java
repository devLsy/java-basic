package construct.ex;

public class Book {
    String title;
    String author;
    int page;
    
    //기본 생성자
    Book() {
        this("", "", 0);
    }

    //제목과 저자만 받는 생성자
    Book(String title, String author) {
        this(title, author, 0);
    }
    
    //모두 다 받는 생성자
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목:" + this.title + " 저자: " + this.author + " 페이지: " + this.page);
    }
}
