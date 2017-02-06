package composite;

public class Main {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("Beijing Main");
        root.add(new HRBP("Beijing HRBP"));
        root.add(new Office("Beijing Office"));

        ConcreteCompany shangHai = new ConcreteCompany("ShangHai Part");
        root.add(shangHai);
        shangHai.add(new HRBP("ShangHai HRBP"));
        shangHai.add(new Office("ShangHai Office"));

        ConcreteCompany hangZhou = new ConcreteCompany("HangZhou Part");
        shangHai.add(hangZhou);
        hangZhou.add(new HRBP("HangZhou HRBP"));
        hangZhou.add(new Office("HangZhou Office"));

        ConcreteCompany nanJing = new ConcreteCompany("NanJing Part");
        shangHai.add(nanJing);
        nanJing.add(new HRBP("NanJing HRBP"));
        nanJing.add(new Office("NanJing Office"));

        ConcreteCompany xian = new ConcreteCompany("Xi'an Part");
        root.add(xian);
        xian.add(new HRBP("xi'an HRBP"));
        xian.add(new Office("xi'an Office"));

        root.display(1);

        root.lineOfDuty();
    }
}
