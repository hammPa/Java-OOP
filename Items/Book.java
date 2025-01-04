package Items;

import java.util.ArrayList;
import java.util.Arrays;

public class Book extends LibraryItem {
    private String author;
    private int pages;

    public Book(String title, String id, int amount, String author, int pages){
        super(title, id, amount);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void displayInfo(){
        Display newDisplay = new Display(new ArrayList<>(Arrays.asList(this)));
        newDisplay.setVisible(true);
    }
}
