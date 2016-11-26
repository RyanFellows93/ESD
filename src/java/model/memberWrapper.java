/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import utils.DatabaseHandlerBean;

/**
 *
 * @author RickyL
 */
public class memberWrapper {
    
    public static ArrayList<Member> getAllMembers(DatabaseHandlerBean dbBean) throws ClassNotFoundException, SQLException {
        ArrayList<Member> member = new ArrayList<>();
        ArrayList<HashMap<String, String>> results = dbBean.getResultsSet("SELECT * FROM users");

        for (HashMap<String, String> row : results) {
            member.add(new Member(row.get("id"), row.get("password"), row.get("status")));
        }

        return member;
    }
}
