public class DemoPhoneCalls
{
    public static void main(String[] args)
    {
        IncomingPhoneCall call1 = new IncomingPhoneCall("12345678");
        System.out.println(call1.getCallInfo());

        OutgoingPhoneCall call2 = new OutgoingPhoneCall("12345678", 10);
        System.out.println(call2.getCallInfo());
    }

}
