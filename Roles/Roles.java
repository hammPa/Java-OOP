package Roles;

public class Roles {
    private boolean read;
    private boolean delete;
    private boolean change;

    public Roles(boolean read, boolean delete, boolean change){
        this.read = read;
        this.delete = delete;
        this.change = change;
    }

    public boolean canRead(){ return read; }
    public boolean canDelete(){ return delete; }
    public boolean canChange(){ return change; }
}
