package builder;

public class HuaweiPhoneBuilder extends PhoneBuilder {
    private Phone phone;

    @Override
    void buildTPLCD() {
        System.out.println("Build Huawei TPLCD.");
    }

    @Override
    void buildBattery() {
        System.out.println("Build Huawei Battery.");
    }

    @Override
    void buildSideKey() {
        System.out.println("Build Huawei SideKey.");
    }

    @Override
    void buildFrontCover() {
        System.out.println("Build Huawei FrontCover.");
    }

    @Override
    void buildBackCover() {
        System.out.println("Build Huawei BackCover.");
    }

    @Override
    void buildPCB() {
        System.out.println("Build Huawei PCB.");
    }
}
