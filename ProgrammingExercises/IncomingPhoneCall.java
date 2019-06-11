public class IncomingPhoneCall extends PhoneCall
{
    IncomingPhoneCall(String phoneNumber)
    {
        super(phoneNumber);
        setCallPrice(0.02);
    }

    @Override
    public String getCallInfo() {
        return ("Incoming call: " + phoneNumber + ", Rate: " + callPrice + ", Price: " + callPrice);
    }
}
