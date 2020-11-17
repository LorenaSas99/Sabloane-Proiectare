package laborator7;


public class Paragraph implements Element {
       /*private String name;
       private AlignStrategy alignStrategy;

           Paragraph(String name){
               this.name=name;
           }

               public void print(){
                    if (alignStrategy == null){
                        System.out.println(this.name);
                    } else{
                        alignStrategy.render(this.name);
                    }
           }
           public void setAlignStrategy(AlignStrategy alignStrategy){
               this.alignStrategy = alignStrategy;
           }

    @Override
    public void accept(Visitor visitor) {visitor.visit( Paragraph: this); }*/

    public String name;
    private AlignStrategy alignStrategy;

    Paragraph(String n)
    {
        name=n;
    }
   /* public void print()
    {
        System.out.println("Paragraph: "+name);
    }*/

    public void print(){

        if(alignStrategy==null) {
            System.out.println(this.name);
        }else{
            alignStrategy.render(this.name);
        }
    }
    public String getPar(){
        return name;
    }

    public void setAlignStrategy(AlignStrategy s){

        this.alignStrategy=s;
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
