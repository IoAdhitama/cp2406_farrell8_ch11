public class DemoSubscriptions
{
    public static void main(String[] args)
    {
        PhysicalNewspaperSubscription sub1 = new PhysicalNewspaperSubscription();
        sub1.setSubsName("Nyom");
        sub1.setSubsAddress("42 Answer Street");
        display(sub1);

        PhysicalNewspaperSubscription sub2 = new PhysicalNewspaperSubscription();
        sub2.setSubsName("Lot");
        sub2.setSubsAddress("Nowhere");
        display(sub2);

        OnlineNewspaperSubscription sub3 = new OnlineNewspaperSubscription();
        sub3.setSubsName("Qlo");
        sub3.setSubsAddress("Qlo@mail");
        display(sub3);

        OnlineNewspaperSubscription sub4 = new OnlineNewspaperSubscription();
        sub4.setSubsName("Uni");
        sub4.setSubsAddress("Unimail");
        display(sub4);
    }

    public static void display(NewspaperSubscription n)
    {
        System.out.println("Name: " + n.getSubsName() + "   Address: " +
                n.getSubsAddress() + "   Rate: " + n.getSubsRate() + "\n");
    }
}
