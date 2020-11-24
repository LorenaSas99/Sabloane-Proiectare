public interface Visitor {
    void visit(txt txt);
    void visit(mp3 mp3);
    void visit(svg svg);
    void visit(director director);
}
