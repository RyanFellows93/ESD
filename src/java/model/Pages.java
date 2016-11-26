/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author RickyL
 */
public class Pages {

    HashMap<String, String> allowedPages;

    public Pages() {
        allowedPages = new HashMap<String, String>();

        allowedPages.put("/login.do", "main.jsp");
        // Inner site
        allowedPages.put("/main", "main.jsp");
        allowedPages.put("/index.jsp", "main.jsp");
        allowedPages.put("/index", "main.jsp");
        
        allowedPages.put("/test", "test.jsp");
        allowedPages.put("/loginreg", "loginreg.jsp");

        allowedPages.put("/listAllMembers", "listAllMembers.jsp");
    }

    // Check if page is allowed 
    public boolean pageAllowed(String input) {
        if (allowedPages.containsKey(input)) {
            return true;
        } else {
            return false;
        }
    }

    // Mapping from request URI to resource
    public String redirect(String input) {
        return allowedPages.get(input);
    }

    // Reroutes to login if login object is not valid or not found
//    public String loginReroute(HttpServletRequest request, String appendUri, String currentPage) {
//        HttpSession session = request.getSession();
//        serv.Login loginInfo = (serv.Login) session.getAttribute("login");
//        
//        if (loginInfo == null) {
//            request.getSession().setAttribute("originalPage", appendUri + currentPage);
//            request.setAttribute("alert", "Session has timed out, please re-login");
//            return "loginreg.jsp";
//        } else {
//            if (!loginInfo.isLoggedIn()) {
//                request.getSession().setAttribute("originalPage", appendUri + currentPage);
//                request.setAttribute("alert", "Session has timed out, please re-login");
//                return "loginreg.jsp";
//            }
//        }
//        return currentPage;
//    }
 

}
