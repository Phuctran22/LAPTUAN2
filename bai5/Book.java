package bai5;

public class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;
    
    public Book() {
        this.boCode = "";
        this.boTitle = "";
        this.boAuthor = "";
    }
    
    public Book(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }
    
    public String getBoCode() {
        return boCode;
    }
    
    public String getBoTitle() {
        return boTitle;
    }
    
    public String getBoAuthor() {
        return boAuthor;
    }
    
    @Override
    public String toString() {
        return "Ma sach: " + boCode + ", Tieu de: " + boTitle + ", Tac gia: " + boAuthor;
    }
}
