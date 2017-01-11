package designprinciple.builder;

/**
 * Builder is used to isolate the product construct and the produce of the part.
 *
 * This builder also can construct a immutable class. and you can add the properties you'd like to add.
 */
public class PhoneDirector {
    public void buildPhone(PhoneBuilder phoneBuilder) {
        phoneBuilder.buildTPLCD();
        phoneBuilder.buildFrontCover();
        phoneBuilder.buildPCB();
        phoneBuilder.buildSideKey();
        phoneBuilder.buildBattery();
        phoneBuilder.buildBackCover();
    }

    public static void main(String[] args) {
        PhoneDirector phoneDirector = new PhoneDirector();
        ApplePhoneBuilder applePhoneBuilder = new ApplePhoneBuilder();
        phoneDirector.buildPhone(applePhoneBuilder);
        HuaweiPhoneBuilder huaweiPhoneBuilder = new HuaweiPhoneBuilder();
        phoneDirector.buildPhone(huaweiPhoneBuilder);
    }
}
