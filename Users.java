import java.awt.*;
import java.lang.*;

public class Users {
    String username;
    String name;
    String password;
    String[][] userlist;
    //constructure
    Users(){
        userlist = new userlist[][];
    }

    //behaviour
    void authentication(String username,String password){
        String[][] list = this.userlist;
        for(int i=0; i>=0;i++){

            if(username ==list[i][0]){
                    if(password ==userlist[i][1]){
                        System.out.println("Login Successs!");
                    }
                    else{
                        System.out.println("Incorrect password");
                    }
            } else{
                System.out.println("Username does not exist");
            }
    
            }    
    }
    
}
