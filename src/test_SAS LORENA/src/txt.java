public class txt implements Element{
    private AlignStrategy alignStrategy;
    private String nume;

    txt(String nume){
        this.nume=nume;
    }
    public void print(){
        if(alignStrategy == null) {
            System.out.println(this.nume);
        }else{
            alignStrategy.render(this.nume);
        }
    }
    public void setAlignStrategy(AlignStrategy alignStrategy){
        this.alignStrategy = alignStrategy;
    }
}
