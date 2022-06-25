package siit.homework03;

public class Book {

    private String name;
    private int numberOfPages;

    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


    @Override
    public String toString() {
        return "\n" +
                "======================================================" +
                "\nTitle: " + name +
                "\nSize: " + numberOfPages + " pages " +
                "\n" +
                "======================================================";

    }

}
