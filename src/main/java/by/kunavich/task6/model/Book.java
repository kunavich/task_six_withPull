package by.kunavich.task6.model;

public class Book {
    private String titel;
    private String autor;
    private String publisher;
    private int length;

    public Book()
    {

    }

    @Override
    public String toString() {
        return "titel: " + titel + "\n" +
                "autor: " + autor + "\n" +
                "publisher: " + publisher + "\n" +
                "length: " + length +"\n";
    }

    public Book(String titel , String autor , String publisher, int length)
    {
        this.titel= titel;
        this.autor= autor;
        this.publisher= publisher;
        this.length= length;
    }

    public String getTitel() {
        return titel;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getLength() {
        return length;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
