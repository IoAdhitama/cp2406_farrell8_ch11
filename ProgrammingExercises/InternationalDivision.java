public class InternationalDivision extends Division
{
    String divisionCountry;
    String divisionLanguage;

    InternationalDivision(String name, int number, String country, String language)
    {
        super(name, number);
        divisionCountry = country;
        divisionLanguage = language;
    }

    @Override
    public void display() {
        System.out.println(divisionName + " division, (International, account number " + divisionNumber
                + ") is located in " + divisionCountry + " and speaks " + divisionLanguage);
    }
}
