public class DomesticDivision extends Division
{
    String divisionState;

    DomesticDivision(String name, int number, String state)
    {
        super(name, number);
        divisionState = state;
    }

    @Override
    public void display()
    {
        System.out.println(divisionName + " division (Domestic, account number " + divisionNumber
                + " is located in the state of " + divisionState);
    }
}
