package No2;

public class Book {
    private String title;
    private String author;
    private String year;

    public void Book(){

    }

    public void setbook(String title,String author,String year) {
        this.title = title;

        this.author = author;

        this.year = year;

    }
    public void displayInfo(){

        System.out.println("Title: "+title+","+"Author: "+author+","+"Year: "+year);

    }
}
