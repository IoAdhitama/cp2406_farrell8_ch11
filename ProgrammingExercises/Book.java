public abstract class Book
{
    String bookTitle;
    double bookPrice;

    public Book(String title)
    {
        bookTitle = title;
    }

    public String getBookTitle() {
        return bookTitle;
    }
    public double getBookPrice() {
        return bookPrice;
    }

    public abstract void setBookPrice();

    public String toString()
    {
        return("The " + bookTitle + " book costs $" + bookPrice);
    }
}
