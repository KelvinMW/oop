public class Users {
    String username;
    String name;
    String password;

    //constructure
    Users(String name, String username, String password){
        this.name = name;
        this.username =username;
        this.password =password;
    }

    //behaviour
    int authentication(username, password){
        return 1;
    }
    
}
