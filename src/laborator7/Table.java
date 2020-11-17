package laborator7;

public class Table implements Element {
    /*private String name;
    Table(String name){
        this.name=name;
    }
    public void print(){
        System.out.println("Table with name: "+this.name);
    }

    @Override
    public void accept(Visitor visitor) {visitor.visit( Table: this); }*/

    public String name;
    Table(String n)
    {
        name=n;
    }
    public void print()
    {
        System.out.println(name);
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
