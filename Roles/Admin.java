package Roles;

public class Admin extends Roles {
    static private String username = "sky_blue";
    static private String password = "123";
    
    public Admin(){
        super(true, true, true);
    }
    
    static public String getUser(){
        return username;
    }
    
    static public String getPass(){
        return password;
    }
}
