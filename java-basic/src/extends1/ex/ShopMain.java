package extends1.ex;

import extends1.super2.ClassB;


public class ShopMain {

    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000, "seo");
        Movie movie = new Movie("영화1", 18000, "감독1", "배우1");
        CryptoCurrency crypto = new CryptoCurrency("암호화폐", 1000000000, "비트코인", "BTC");

        book.print();
        album.print();
        movie.print();
        crypto.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice() + crypto.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
}
