package Items;

import java.util.ArrayList;
import java.util.Arrays;

public class DVD extends LibraryItem {
    private String director;
    private int duration;

    public DVD(String title, String id, int amount, String director, int duration){
        super(title, id, amount);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void displayInfo(){
        Display newDisplay = new Display(new ArrayList<>(Arrays.asList(this)));
        newDisplay.setVisible(true);
    }
}