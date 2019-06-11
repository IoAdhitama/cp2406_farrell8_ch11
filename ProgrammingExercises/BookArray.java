import javax.swing.*;

public class BookArray
{
    static Book[] bookArray = new Book[10];

    public static void main(String[] args)
    {
        buildArray();
        displayArray();
    }

    public static void buildArray()
    {
        //declare x as int in for loop
        char bookType;
        for(int x = 0; x < bookArray.length; ++x)
        {
            bookType = getBook();
            if(bookType == 'f')
                bookArray[x] = new Fiction();
            else
                bookArray[x] = new NonFiction();
        }
    }

    public static char getBook()
    {
        String boatType;
        boatType = JOptionPane.showInputDialog(null,
                "Enter f for fiction; n for non fiction ");
        return boatType.charAt(0);
    }
    public static void displayArray()
    {
        for(int x = 0; x < bookArray.length; ++x)
            JOptionPane.showMessageDialog(null, "Book #" + (x + 1) + ": " +
                    bookArray[x].toString());
    }
}
