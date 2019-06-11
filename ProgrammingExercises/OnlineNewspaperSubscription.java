public class OnlineNewspaperSubscription extends NewspaperSubscription
{
    @Override
    public void setSubsAddress(String address)
    {
        if (!address.contains("@"))
        {
            System.out.println("Error! Invalid address.");
            //subsAddress = "INVALID";
            subsRate = 0;
        }
        else
        {
            subsAddress = address;
            subsRate = 9;
        }
    }
}
