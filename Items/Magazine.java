package Items;

import java.util.ArrayList;
import java.util.Arrays;

public class Magazine extends LibraryItem {
    private String publisher;
    private String issueDate;
    
    public Magazine(String title, String id, int amount, String publisher, String date){
        super(title, id, amount);
        this.publisher = publisher;
        this.issueDate = date;
    }
        
    @Override
    public void displayInfo(){
        Display newDisplay = new Display(new ArrayList<>(Arrays.asList(this)));
        newDisplay.setVisible(true);
    }
}