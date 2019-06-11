public class UseDivision
{
    public static void main(String[] args)
    {
        InternationalDivision div1 = new InternationalDivision("Work work work", 5318008,
                "Germany", "Deutsch");
        div1.display();

        DomesticDivision div2 = new DomesticDivision("Lazy gen", 3310, "Nowhere");
        div2.display();

        InternationalDivision div3 = new InternationalDivision("Most Dedicated", 674920,
                "Japan", "Japanese");
        div3.display();

        DomesticDivision div4 = new DomesticDivision("Common", 1337, "Ghetto");
        div4.display();
    }

}
