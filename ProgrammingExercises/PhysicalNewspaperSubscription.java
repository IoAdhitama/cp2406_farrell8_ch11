public class PhysicalNewspaperSubscription extends NewspaperSubscription
{
    @Override
    public void setSubsAddress(String address) {
        if ((!address.contains("1")) && (!address.contains("2")) && (!address.contains("3")) &&
                (!address.contains("4")) && (!address.contains("5")) && (!address.contains("6")) &&
                (!address.contains("7")) && (!address.contains("8")) && (!address.contains("9")) &&
                (!address.contains("0")))
        {
            System.out.println("Error! Invalid address.");
            subsRate = 0;
        }
        else
        {
            subsRate = 15;
            subsAddress = address;
        }
    }
}
