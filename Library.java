import java.util.ArrayList;
import Items.LibraryItem;
import Items.Display;
import javax.swing.JOptionPane;

public class Library {
    private ArrayList<LibraryItem> items;
    public ArrayList<LibraryItem> user_data;
    public LibraryItem temp;
    static private Library library;

    private Library(){
        items = new ArrayList<>();
        temp = null;
        user_data = new ArrayList<>();
    }

    public int size(){
        return items.size();
    }
    
    public LibraryItem at(int index){
        return items.get(index);
    }

    public void addItem(LibraryItem item){
        items.add(item);
        if(items.size() > 21)javax.swing.JOptionPane.showMessageDialog(null, "Item berhasil di buat");
    }

    public void delete(LibraryItem item){
        items.remove(item);
        javax.swing.JOptionPane.showMessageDialog(null, "Item dengan Id : " + item.getItemId() + " berhasil di hapus");
    }

    public void change(int index, LibraryItem newItem){
        items.set(index, newItem);
        JOptionPane.showMessageDialog(null, "Berhasil mengubah item");
    }
    
    public void display(ArrayList<LibraryItem> item){
        Display display = new Display(item);
        display.setVisible(true);
    }
    
    public void displayAll(){
        Display display = new Display(this.items);
        display.setVisible(true);
    }

    public LibraryItem findItem(String id){
        for(LibraryItem item: items){
            if(item.getItemId().equals(id)){
                return item;
            }
        }
        return null;
    }

    static Library getInstance(){
        if(library == null){
            library =  new Library();
        }
        return library;
    }
}
