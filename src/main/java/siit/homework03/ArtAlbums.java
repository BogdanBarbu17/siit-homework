package siit.homework03;

public class ArtAlbums extends Book {

    private String quality;

    public ArtAlbums() {

    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return     "\n" +
                "======================================================" +
                "\nTitle: " + getName() +
                "\nSize: " + getNumberOfPages() + " pages " +
                "\nPaper quality: " + quality +
                "\n" +
                "======================================================";

    }

}
