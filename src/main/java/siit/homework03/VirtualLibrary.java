package siit.homework03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class VirtualLibrary {
    public static void main(String[] args) throws IOException {
        while (running) {
            mainMenuChoice();
        }
    }


    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final List<Novels> novelsCollection = new ArrayList<>();
    private static final List<ArtAlbums> artAlbumsCollection = new ArrayList<>();
    private static final List<Book> books = new ArrayList<>();
    private static Boolean running = true;


    private static void mainMenuChoice() throws IOException {
        printOptions();
        String answer = reader.readLine();

        switch (answer) {
            case "1":
                createNovels();
                break;

            case "2":
                createArtAlbums();
                break;

            case "3":
                deleteBook();
                break;

            case "4":
                listAllBooks();
                break;

            case "5":
                listNovels();
                break;

            case "6":
                listArtAlbums();
                break;

            case "0":
                running = false;
                break;

            default:
                System.out.println("Not a valid option, please choose another.");
                break;
        }
    }

    private static void printOptions() {

        System.out.println(
                "\nEnter 1 for adding a new novel" +
                        "\nEnter 2 for adding a new art album" +
                        "\nEnter 3 for deleting a book" +
                        "\nEnter 4 for listing all" +
                        "\nEnter 5 for listing novels" +
                        "\nEnter 6 for listing art albums" +
                        "\nEnter 0 for program exit. " +
                        "\n");

    }

    /***
     * adds a novel to the list of books and the list of novels
     * while checking if the input fits the criteria
     * @throws IOException handle the input/output exception
     * that may occur during the reading of the input
     */
    private static void createNovels() throws IOException {
        boolean invalid = true;
        Novels novels = new Novels();
        String input;

        while (invalid) {
            System.out.println("Enter the title of the book: ");
            input = reader.readLine();

            if (isInputEmpty(input)) {
                System.out.println("Wrong input, try again!");
            } else {
                novels.setName(input);
                invalid = false;
            }
        }

        invalid = true;

        while (invalid) {
            System.out.println("Enter the number of pages: ");
            input = reader.readLine();

            if (!isInputEmpty(input) && isInputNumber(input)) {
                novels.setNumberOfPages(Integer.parseInt(input));
                invalid = false;
            } else {
                System.out.println("Wrong input, try again!");
            }
        }


        invalid = true;

        while (invalid) {
            System.out.println("Enter the domain of the book: ");
            input = reader.readLine();

            if (isInputEmpty(input)) {
                System.out.println("Wrong input, try again!");
            } else {
                novels.setType(input);
                invalid = false;
            }
        }

        novelsCollection.add(novels);
        books.add(novels);
        System.out.println("Information complete, book was added to the library.");

    }

    /***
     * adds an art album to the list of books and the list of art albums
     * while checking if the input fits the criteria
     * @throws IOException handle the input/output exception
     * that may occur during the reading of the input
     */
    private static void createArtAlbums() throws IOException {
        boolean invalid = true;
        ArtAlbums artAlbums = new ArtAlbums();
        String input;

        while (invalid) {
            System.out.println("Enter the title of the book: ");
            input = reader.readLine();

            if (isInputEmpty(input)) {
                System.out.println("Wrong input, try again!");
            } else {
                artAlbums.setName(input);
                invalid = false;
            }
        }

        invalid = true;

        while (invalid) {
            System.out.println("Enter the number of pages: ");
            input = reader.readLine();

            if (!isInputEmpty(input) && isInputNumber(input)) {
                artAlbums.setNumberOfPages(Integer.parseInt(input));
                invalid = false;
            } else {
                System.out.println("Wrong input, try again!");
            }
        }


        invalid = true;

        while (invalid) {
            System.out.println("Enter the quality of the paper: ");
            input = reader.readLine();

            if (isInputEmpty(input)) {
                System.out.println("Wrong input, try again!");
            } else {
                artAlbums.setQuality(input);
                invalid = false;
            }
        }

        artAlbumsCollection.add(artAlbums);
        books.add(artAlbums);
        System.out.println("Information complete, book was added to the library.");

    }

    /**
     * iterates all 3 list of books and deletes the books that
     * the name of the book matches with the input
     * @throws IOException handle the input/output exception
     * that may occur during the reading of the input
     */
    private static void deleteBook() throws IOException {
        System.out.println("Enter the title of the book: ");
        String input = reader.readLine();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equals(input)) {
                books.remove(i);
            }
        }

        for (int i = 0; i < novelsCollection.size(); i++) {
            if (novelsCollection.get(i).getName().equals(input)) {
                novelsCollection.remove(i);
            }
        }

        for (int i = 0; i < artAlbumsCollection.size(); i++) {
            if (artAlbumsCollection.get(i).getName().equals(input)) {
                artAlbumsCollection.remove(i);
            }
        }
        System.out.println("The book was deleted!");
    }


    private static void listNovels() {
        System.out.println(novelsCollection);
    }

    private static void listArtAlbums() {
        System.out.println(artAlbumsCollection);
    }

    private static void listAllBooks() {
        System.out.println(books);
    }

    /***
     * verify if there is an input, or it is an empty string
     * @param input value from keyboard
     * @return the boolean value if the input is empty or not
     */
    private static Boolean isInputEmpty(String input) {
        if (input == null) {
            return true;
        }

        if (input.isEmpty()) {
            return true;
        }

        return false;
    }

    /***
     * verify if the String input from keyboard can be parsed to an int
     * handles the format e exception that occurs when an attempt is made
     * to convert a string with an incorrect format to a numeric value
     * @param input value from keyboard
     * @return the boolean value if the input can be or nat converted to number
     */
    private static Boolean isInputNumber(String input) {
        try {
            Integer.valueOf(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
