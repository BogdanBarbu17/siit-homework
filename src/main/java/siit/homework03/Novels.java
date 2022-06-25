package siit.homework03;

public class Novels extends Book {

    private String type;

    public Novels() {
        super();
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return     "\n" +
                "======================================================" +
                "\nTitle: " + getName() +
                "\nSize: " + getNumberOfPages() + " pages " +
                "\nType: " + type +
                "\n" +
                "======================================================";

    }

}
