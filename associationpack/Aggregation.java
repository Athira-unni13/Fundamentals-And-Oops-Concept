package associationpack;

class Author {
	String authorName;
	String penName;
	Author(String authorName,String penName) {
		this.authorName = authorName;
		this.penName = penName;
	}
}

class Book {
	String bookName;
	float price;
	Author author; //reference variable
	public Book(String bookName, float price, Author author) {
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}

}

public class Aggregation {

	public static void main(String[] args) {
		Author author = new Author("Athira","Thira");
		Book book = new Book("abcd",240.5f,author);
		
		
		System.out.println("Book Name: "+book.bookName);
		System.out.println("Author Name: "+book.author.authorName);
		System.out.println("Pen Name: "+book.author.penName);
		System.out.println("Price Name: "+book.price);
		
		
	}

}
