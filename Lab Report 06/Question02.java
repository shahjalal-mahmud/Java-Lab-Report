class Book{
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    @Override
    public String toString(){
        return ("Title: "+ title+"\nAuthor: "+ author + "\nPrice: " + price);
    }
}

public class Question02 {
    public static void main(String[] args) {
        Book b = new Book("Developing JavaSoftware","Russel Winderand" ,79.75);
        System.err.println(b);
    }
}
