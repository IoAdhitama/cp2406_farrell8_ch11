public abstract class Division
{
    String divisionName;
    int divisionNumber;

    public abstract void display();

    Division(String name, int number)
    {
        divisionName = name;
        divisionNumber = number;
    }
}
