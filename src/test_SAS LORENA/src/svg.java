public class svg implements Element{
    private String nume;

    svg(String nume){
        this.nume=nume;
    }
    public void print() {
        System.out.println(this.nume);
    }
}
