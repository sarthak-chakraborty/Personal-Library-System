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
public class FriendHomeTest {
    
    public FriendHomeTest() {
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
     * Test of main method, of class FriendHome.
     */
    
    /*
    @Test
    public void testsearchBook1() {
        FriendHome friend = new FriendHome("abcd");
        friend.setDetails("Book1","Author1","Genre1",1,"pubHouse1",1.0);
        friend.searchBookClick();
        int flag = friend.getflag();
        assertEquals(1, flag);
    }
    
    @Test
    public void testsearchBook2() {
        FriendHome friend = new FriendHome("abcd");
        friend.setDetails("Book2","Author2","",2,"",2.0);
        friend.searchBookClick();
        int flag = friend.getflag();
        assertEquals(1, flag);
    }
    
    @Test
    public void testsearchBook3() {
        FriendHome friend = new FriendHome("abcd");
        friend.setDetails("Book2","Author1","Genre1",2,"pubHouse1",1.0);
        friend.searchBookClick();
        int flag = friend.getflag();
        assertEquals(0, flag);
    }
    
    @Test
    public void testsearchBook4() {
        FriendHome friend = new FriendHome("abcd");
        friend.setDetails("","","",1,"",1.0);
        friend.searchBookClick();
        int flag = friend.getflag();
        assertEquals(1, flag);
    }
    
    @Test
    public void testsearchBook5() {
        FriendHome friend = new FriendHome("abcd");
        friend.setDetails("","","",5,"",1.0);
        friend.searchBookClick();
        int flag = friend.getflag();
        assertEquals(0, flag);
    }
    */
    
    /*
    @Test
    public void testBorrowBook1() {
        int flag = 0;
        FriendHome friend = new FriendHome("abcd");
        friend.setBook("Book1");
        friend.borrowBookClick();
        Connection conn;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from notif where book_issue='Book1';";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 0;
            else
                flag = 1;
            
            assertEquals(1,flag);
        }catch(Exception e){}
    }
    
    @Test
    public void testBorrowBook2() {
        int flag = 0;
        FriendHome friend = new FriendHome("abcd");
        friend.setBook("Book2");
        friend.borrowBookClick();
        Connection conn;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from notif where book_issue='Book2';";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 0;
            else
                flag = 1;
            
            assertEquals(1,flag);
        }catch(Exception e){}
    }
    
    @Test
    public void testBorrowBook3() {
        int flag = 0;
        FriendHome friend = new FriendHome("abcd");
        friend.setBook("Book10");
        friend.borrowBookClick();
        Connection conn;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from notif where book_issue='Book10';";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 0;
            else
                flag = 1;
            
            assertEquals(1,flag);
        }catch(Exception e){}
    }
    
    @Test
    public void testBorrowBook4() {
        int flag = 0;
        FriendHome friend = new FriendHome("abcd");
        friend.setBook("");
        friend.borrowBookClick();
        Connection conn;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from notif where book_issue='';";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 0;
            else
                flag = 1;
           
            assertEquals(0,flag);
        }catch(Exception e){}
    }
    
    @Test
    public void testBorrowBook5() {
        int flag = 0;
        FriendHome friend = new FriendHome("abcd");
        friend.setBook("Book3");
        friend.borrowBookClick();
        Connection conn;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from notif where book_issue='Book3';";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 0;
            else
                flag = 1;
           
            assertEquals(1,flag);
        }catch(Exception e){}
    }
    */
    
    /*
    @Test
    public void testReturnBook1(){
        int flag;
        FriendHome friend = new FriendHome("abcd");
        friend.setBook("Book1");
        friend.returnBookClick();
        Connection conn;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from frnd_accnt where book_issued='Book1';";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 1;
            else
                flag = 0;
            
            int flag1 = friend.getflag();
            assertEquals(0,flag1);
            assertEquals(1,flag);
        }catch(Exception e){}
    }
    
    @Test
    public void testReturnBook2(){
        int flag;
        FriendHome friend = new FriendHome("abcd");
        friend.setBook("Book1");
        friend.returnBookClick();
        Connection conn;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from frnd_accnt where book_issued='Book1';";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 1;
            else
                flag = 0;
           
            int flag1 = friend.getflag();
            assertEquals(0,flag1);
            assertEquals(1,flag);
        }catch(Exception e){}
    }
    
    @Test
    public void testReturnBook3(){
        int flag;
        FriendHome friend = new FriendHome("abcd");
        friend.setBook("Book3");
        friend.returnBookClick();
        Connection conn;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from frnd_accnt where book_issued='Book3';";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 1;
            else
                flag = 0;
           
            int flag1 = friend.getflag();
            assertEquals(0,flag1);
            assertEquals(1,flag);
        }catch(Exception e){}
    }
    
    @Test
    public void testReturnBook4(){
        int flag;
        FriendHome friend = new FriendHome("abcd");
        friend.setBook("Book10");
        friend.returnBookClick();
        Connection conn;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from frnd_accnt where book_issued='Book10';";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 1;
            else
                flag = 0;
           
            int flag1 = friend.getflag();
            assertEquals(0,flag1);
            assertEquals(1,flag);
        }catch(Exception e){}
    }
    
    @Test
    public void testReturnBook5(){
        int flag;
        FriendHome friend = new FriendHome("abcd");
        friend.setBook("");
        friend.returnBookClick();
        Connection conn;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from frnd_accnt where book_issued='';";
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 1;
            else
                flag = 0;
            
            int flag1 = friend.getflag();
            assertEquals(0,flag1);
            assertEquals(1,flag);
        }catch(Exception e){}
    }
   */
}
