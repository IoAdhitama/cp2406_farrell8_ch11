public abstract class NewspaperSubscription
{
    String subsName;
    String subsAddress;
    int subsRate;

    public String getSubsName() {
        return subsName;
    }

    public void setSubsName(String subsName) {
        this.subsName = subsName;
    }

    public String getSubsAddress() {
        return subsAddress;
    }

    public abstract void setSubsAddress(String address);

    public int getSubsRate() {
        return subsRate;
    }
}
