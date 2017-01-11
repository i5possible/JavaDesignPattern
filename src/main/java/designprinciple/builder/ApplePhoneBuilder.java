package designprinciple.builder;

public class ApplePhoneBuilder extends PhoneBuilder {
    @Override
    void buildTPLCD() {
        System.out.println("Apple TPLCD");
    }

    @Override
    void buildBattery() {
        System.out.println("Apple Battery.");
    }

    @Override
    void buildSideKey() {
        System.out.println("Apple SideKey");
    }

    @Override
    void buildFrontCover() {
        System.out.println("Apple FrontCover");
    }

    @Override
    void buildBackCover() {
        System.out.println("Apple BackCover");
    }

    @Override
    void buildPCB() {
        System.out.println("Apple PCB");
    }
}
