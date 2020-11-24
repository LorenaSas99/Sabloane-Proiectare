public class mp3 implements Element{
    private String nume;

    mp3(String nume){
        this.nume=nume;
    }

    public void print() {
        System.out.println(this.nume);
    }
}
