package facade;

/**
 * Facade provide a consistence interface for a couple of class.
 * It's easier to call many classes' method in a giving order.
 * <p>
 * 1. Facade is a nice implementation of LoD and DependencyInversion. So, when you do the design of a system, you
 * can try to isolate different layer and use Facade to simplify the design.
 * 2. When ths class and the method become more and more that you barely can tell which method or class is the best
 * choice to use, you need to use facade to package some of them to make the code clearer.
 * 3. When you have a existing system and you have to interact with it, especially ths system have tough design or
 * bad code quality, and you don't want to refactor the code, you can add some facades to them. So you don't need
 * to deal with the system directly, you interact with the facade only.
 */
public class Facade {
    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;
    SubSystemThree subSystemThree;
    SubSystemFour subSystemFour;

    public Facade(SubSystemOne subSystemOne, SubSystemTwo subSystemTwo, SubSystemThree subSystemThree, SubSystemFour subSystemFour) {
        this.subSystemOne = subSystemOne;
        this.subSystemTwo = subSystemTwo;
        this.subSystemThree = subSystemThree;
        this.subSystemFour = subSystemFour;
    }

    public static void main(String[] args) {
        SubSystemOne subSystemOne = new SubSystemOne();
        SubSystemTwo subSystemTwo = new SubSystemTwo();
        SubSystemThree subSystemThree = new SubSystemThree();
        SubSystemFour subSystemFour = new SubSystemFour();
        Facade facade = new Facade(subSystemOne, subSystemTwo, subSystemThree, subSystemFour);
        facade.methodA();
        facade.methodB();
    }

    public void methodA() {
        subSystemOne.methodOne();
        subSystemTwo.methodtTwo();
        subSystemFour.methodFour();
    }

    public void methodB() {
        subSystemOne.methodOne();
        subSystemThree.methodThree();
    }
}

class SubSystemOne {
    public void methodOne() {
        System.out.println("methodOne");
    }
}

class SubSystemTwo {
    public void methodtTwo() {
        System.out.println("methodTwo");
    }
}

class SubSystemThree {
    public void methodThree() {
        System.out.println("methodThree");
    }
}

class SubSystemFour {
    public void methodFour() {
        System.out.println("Four");
    }
}