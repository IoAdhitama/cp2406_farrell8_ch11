public class Fiction extends Book
{
    public Fiction()
    {
        super("Fiction");
        setBookPrice();
    }
    public void setBookPrice()
    {
        super.bookPrice = 24.99;
    }
}
