public class PhoneCallArray
{
    static PhoneCall[] PhoneCallLog = new PhoneCall[10];

    public static void main(String[] args)
    {
        buildArray();
        displayArray();
    }

    public static void buildArray()
    {
        PhoneCallLog[0] = new IncomingPhoneCall("39586748");
        PhoneCallLog[1] = new OutgoingPhoneCall("49857293", 5);
        PhoneCallLog[2] = new IncomingPhoneCall("38561937");
        PhoneCallLog[3] = new IncomingPhoneCall("93754396");
        PhoneCallLog[4] = new OutgoingPhoneCall("89014529",420);
        PhoneCallLog[5] = new IncomingPhoneCall("03751094");
        PhoneCallLog[6] = new IncomingPhoneCall("49275028");
        PhoneCallLog[7] = new OutgoingPhoneCall("14576190",49);
        PhoneCallLog[8] = new OutgoingPhoneCall("10394571",294);
        PhoneCallLog[9] = new IncomingPhoneCall("17523983");
    }

    public static void displayArray()
    {
        for(int x = 0; x < PhoneCallLog.length; ++x)
            System.out.println(PhoneCallLog[x].getCallInfo());
    }
}
