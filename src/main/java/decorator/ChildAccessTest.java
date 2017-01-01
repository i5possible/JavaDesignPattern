package decorator;

/**
 * The difference between the protected and the default modifier is that the default modifier limit the access right
 * to the package. Even a class extends the base class, it can't use the default modifier modified method or
 * variable. But a protected method or variable can be used even the child class isn't in the same package with the
 * father class.
 *
 * This example isn't showed in the follow example. Because I'd like the them in the same package.
 * You can try it in a child package.
 */

public class ChildAccessTest extends BaseClass {
    public static void main(String[] args) {
        ChildAccessTest childAccessTest = new ChildAccessTest();
        System.out.println(ChildAccessTest.class.toString() + " : " + childAccessTest.aProtected);
        System.out.println(ChildAccessTest.class.toString() + " : " + childAccessTest.aDefault);

        System.out.println(ChildAccessTest.class.toString() + " : " + BaseClass.aProtected);
        System.out.println(ChildAccessTest.class.toString() + " : " + BaseClass.aDefault);
    }
}

//class PkgAccessTest {
//    public static void main(String[] args) {
//        PkgAccessTest pkgAccessTest = new PkgAccessTest();
//        System.out.println(PkgAccessTest.class.toString() + " : " + BaseClass.aProtected);
//        System.out.println(PkgAccessTest.class.toString() + " : " + BaseClass.aDefault);
//    }
//}