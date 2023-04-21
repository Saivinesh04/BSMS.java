class BookD {
    
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private double price;
    
    public BookD(String title, String author, String publisher, String isbn, double price) {
        this.title = title;
        this.author = author;
		this.publisher = publisher;
		this.isbn = isbn;
		this.price = price;
	 }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "\"" + title + "\" by " + author + " (Published by " + publisher + ") [ISBN: " + isbn + ", Price: $" + price + "]";
    }
}
