package visitor;

public interface MyVisitor {
    float visit(Book book);
    float visit(Perfume perfume);
    float visit(DiscDVD discDVD);
}
