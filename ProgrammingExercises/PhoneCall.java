public abstract class PhoneCall
{
    String phoneNumber;
    double callPrice;

    public PhoneCall(String callNumber)
    {
        phoneNumber = callNumber;
        callPrice = 0.0;
    }

    public void setCallPrice(double callPrice) {
        this.callPrice = callPrice;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getCallPrice() {
        return callPrice;
    }

    public abstract String getCallInfo();
}
