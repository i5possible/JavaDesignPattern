package visitor;

abstract class Element {
    abstract void accept(Visitor visitor);
    abstract void otherOperate();
}
