import java.util.ArrayList;

public class Book {
    public String title;
    private TableOfContents tableOfContents;
    private ArrayList<Element> content = new ArrayList<>();
    private ArrayList <Author> authors=new ArrayList<Author>();
   // public ArrayList <Chapter> chapters=new ArrayList<Chapter>();
    public Book(String title){
        this.title=title;
    }
    public String toString() {
        return "Book{" + "title=" + title + "}";
    }

    public String getTitle() {
        return title;
    }

    public void addContent(Element elm){
        content.add(elm);
    }

    /*public int createChapter(String c) {
        Chapter sub=new Chapter(c);
        chapters.add(sub);
        return chapters.indexOf(sub);
    }*/

    /*public ArrayList<Chapter> getChapters() {
        return chapters;
    }*/

    public void setTitle(String title) {
        this.title = title;
    }

    /*public void addAuthor(Author author) {
        authors.add(author);
    }*/
    public void print() {
        System.out.println(this.title);
        for (Element e:content){
            e.print();
        }
    }


    public void addAuthor(Author rpGheo) {
        authors.add(rpGheo);
    }



    /*public Chapter getChapter(int indexChapterOne) {
        return chapters.get(indexChapterOne);
    }*/
}
