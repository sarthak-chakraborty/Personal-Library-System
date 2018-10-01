/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class IssueTest {

    public IssueTest() {
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
     * Test of main method, of class Issue.
     */
    @Test
    public void testIssueBook() {
        int flag = 0;
        Connection conn = null;
        try {
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "Srth#hak1715");
            String query = "Select * from notif;";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if (!rs.next()); else {
                flag = 1;
            }
            conn.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        if (flag == 0) {
            Issue issue = new Issue();
            issue.issueClick();
            int flag1 = issue.getflag();
            assertEquals(0, flag1);
        }
        else{
            Issue issue = new Issue();
            issue.issueClick();
            int flag1 = issue.getflag();
            assertEquals(1, flag1);
        }
    }

}
