package visitor;

interface Element {
    float accept(MyVisitor visitor);
}
