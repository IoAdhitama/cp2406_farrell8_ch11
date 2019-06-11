public class OutgoingPhoneCall extends PhoneCall
{
    int callTime;
    OutgoingPhoneCall(String phoneNumber, int callTimeinMinutes)
    {
        super(phoneNumber);
        callTime = callTimeinMinutes;
        setCallPrice(0.04);
    }

    @Override
    public String getCallInfo() {
        return ("Outgoing call: " + phoneNumber + ", Rate: " + callPrice + ", Call Time: " + callTime
                + " minutes, total price: " + (callTime * callPrice));
    }
}
