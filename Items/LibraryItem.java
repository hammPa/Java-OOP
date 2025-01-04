package Items;

import javax.swing.JOptionPane;

public class LibraryItem implements Cloneable {
    protected String title;
    protected String itemID;
    Boolean isAvailable;
    int amount;

    public LibraryItem(String title, String id, int amount){
        this.title = title;
        this.itemID = id;
        isAvailable = true;
        this.amount = amount;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void displayInfo(){
        JOptionPane.showMessageDialog(null, "ID : " + this.itemID + "\nTitle: " + this.title);
    }
    
    public int getAmount(){
        return amount;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();  // Shallow copy, membuat salinan dangkal
    }

    public void borrowItem(){
        if(amount > 0){
            if(amount - 1 == 0) isAvailable = false;
            amount--;
            JOptionPane.showMessageDialog(null, "Item berhasil di pinjam.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Item tidak tersedia.");
        }
    }

    public void setAmount(int amount){
        this.amount = amount;
    }
    
    public void returnItem(){
        if(amount >= 0){
            if(amount == 0) isAvailable = true;
            JOptionPane.showMessageDialog(null, "Item berhasil di kembalikan.");
            amount++;
        }
        else {
            JOptionPane.showMessageDialog(null, "Tidak ada item dikembalikan.");
        }
    }

    public Boolean getAvailability(){
        return isAvailable;
    }

    public String getItemId(){
        return itemID;
    }
}