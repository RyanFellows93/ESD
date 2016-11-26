/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

import model.*;

/**
 *
 * @author RickyL
 */
public class Login {

    Boolean loginSuccess;

    public Login() {
        loginSuccess = false;
    }

    public Boolean attemptLogin(String username, String password) {
        if (!((username == null) || (password == null))) {
            if ((username.equals("ricky")) && (password.equals("pass"))) {
                loginSuccess = true;
            }
        }
        return loginSuccess;
    }

    public Boolean isLoggedIn() {
        return loginSuccess;
    }
}
