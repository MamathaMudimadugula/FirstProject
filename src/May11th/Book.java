package May11th;

import java.util.ArrayList;

public class Book {

	

	
	private int id;
	private String name;
	private String author;
private ArrayList<Review> review= new ArrayList<>();

	public Book(int id, String name,String author) {
		super();
	this.id=id;
	this.name=name;
	this.author=author;
	}
	
	 public void addReview(Review review) {
		 this.review.add(review);
	 }
	 public String toString() {
		return String.format("id = %d author=%s name = %s Reviews =[%s]",id,author,name,review);
		 
	 }
}
