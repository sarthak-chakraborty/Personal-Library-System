/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class LoginTest {

    ArrayList<String> arrusername = new ArrayList<String>();
    ArrayList<String> arrpassword = new ArrayList<String>();

    public LoginTest() {
        Connection conn = null;
        try {
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "Srth#hak1715");
            String query = "Select * from Friend;";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if (!rs.next()) {
                System.out.println("Something went wrong.");
            }
            rs.beforeFirst();
            while (rs.next()) {
                arrusername.add(rs.getString("user"));
                arrpassword.add(rs.getString("pass"));
            }

        } catch (Exception e) {
        }
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Login.
     */
    @Test
    public void testOwner1() {
        Login login = new Login("Owner");
        login.setUsername("sarthak");
        login.setPassword("Srth#hak1715");
        login.loginclick();
        int flag = login.getflag();
        assertEquals(1, flag);
    }

    @Test
    public void testOwner2() {
        Login login = new Login("Owner");
        login.setUsername("sarthak123");
        login.setPassword("Srth#hak1715");
        login.loginclick();
        int flag = login.getflag();
        assertEquals(0, flag);
    }

    @Test
    public void testOwner3() {
        Login login = new Login("Owner");
        login.setUsername("sarthak");
        login.setPassword("Srth#hak");
        login.loginclick();
        int flag = login.getflag();
        assertEquals(0, flag);
    }

    @Test
    public void testFriend() {
        for (int i = 0; i < arrusername.size(); i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 1) {
                    Login login = new Login("Friend");
                    login.setUsername(arrusername.get(i));
                    login.setPassword(arrpassword.get(i));
                    login.loginclick();
                    int flag = login.getflag();
                    assertEquals(1, flag);
                }
                if (j == 2) {
                    Login login = new Login("Friend");
                    login.setUsername(arrusername.get(i) + "123");
                    login.setPassword(arrpassword.get(i));
                    login.loginclick();
                    int flag = login.getflag();
                    assertEquals(0, flag);
                }
                if (j == 3) {
                    Login login = new Login("Friend");
                    login.setUsername(arrusername.get(i));
                    login.setPassword(arrpassword.get(i) + "123");
                    login.loginclick();
                    int flag = login.getflag();
                    assertEquals(0, flag);
                }
            }
        }

    }
}
