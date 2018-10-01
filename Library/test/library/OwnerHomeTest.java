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
public class OwnerHomeTest {
    
    public OwnerHomeTest() {
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
     * Test of main method, of class OwnerHome.
     */
    
    /*
    @Test
    public void testAddBook1() {
        int flag = 0;
        OwnerHome owner = new OwnerHome("Sarthak Chakraborty");
        owner.setDetails("Book1","Author1","Genre1",1,"pubHouse1",1.0);
        owner.addBookClick();
        Connection conn = null;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from where book_name = \"Book1\";";
            PreparedStatement st = conn.prepareCall(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 0;
            else{
                String name = rs.getString("book_name");
                String author = rs.getString("book_author");
                String genre = rs.getString("book_genre");
                int year = rs.getInt("book_year");
                String pub = rs.getString("book_pub");
                double price = rs.getDouble("book_price");
                if(name.equals("Book1") && author.equals("Author1") && genre.equals("Genre1") && year == 1
                        && pub.equals("PubHouse1") && (price - 1.0)<0.5)
                    flag = 1;
                
                assertEquals(1, flag);
                conn.close();
            }
        }
        catch(Exception e){}
    }
    
    @Test
    public void testAddBook2() {
        int flag = 0;
        OwnerHome owner = new OwnerHome("Sarthak Chakraborty");
        owner.setDetails("Book2","Author2","Genre2",2,"pubHouse2",2.0);
        owner.addBookClick();
        Connection conn = null;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from where book_name = \"Book2\";";
            PreparedStatement st = conn.prepareCall(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 0;
            else{
                String name = rs.getString("book_name");
                String author = rs.getString("book_author");
                String genre = rs.getString("book_genre");
                int year = rs.getInt("book_year");
                String pub = rs.getString("book_pub");
                double price = rs.getDouble("book_price");
                if(name.equals("Book2") && author.equals("Author2") && genre.equals("Genre2") && year == 2
                        && pub.equals("PubHouse2") && (price - 2.0)<0.5)
                    flag = 1;
                
                assertEquals(1, flag);
                conn.close();
            }
        }
        catch(Exception e){}
    }
    
    @Test
    public void testAddBook3() {
        int flag = 0;
        OwnerHome owner = new OwnerHome("Sarthak Chakraborty");
        owner.setDetails("Book3","","",1,"pubHouse3",1.0);
        owner.addBookClick();
        Connection conn = null;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from where book_name = \"Book3\";";
            PreparedStatement st = conn.prepareCall(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 0;
            else{
                String name = rs.getString("book_name");
                int year = rs.getInt("book_year");
                String pub = rs.getString("book_pub");
                double price = rs.getDouble("book_price");
                if(name.equals("Book3") && year == 1 && pub.equals("PubHouse3") && (price - 1.0)<0.5)
                    flag = 1;
                
                assertEquals(1, flag);
                conn.close();
            }
        }
        catch(Exception e){}
    }
    
    @Test
    public void testAddBook4() {
        int flag = 0;
        OwnerHome owner = new OwnerHome("Sarthak Chakraborty");
        owner.setDetails("Book4","","",1,"",1.0);
        owner.addBookClick();
        Connection conn = null;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from where book_name = \"Book4\";";
            PreparedStatement st = conn.prepareCall(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 0;
            else{
                String name = rs.getString("book_name");
                int year = rs.getInt("book_year");
                double price = rs.getDouble("book_price");
                if(name.equals("Book1") && year == 1 && (price - 1.0)<0.5)
                    flag = 1;
                
                assertEquals(1, flag);
                conn.close();
            }
        }
        catch(Exception e){}
    }
    
    @Test
    public void testAddBook5() {
        int flag = 0;
        OwnerHome owner = new OwnerHome("Sarthak Chakraborty");
        owner.setDetails("Book5","Author5","Genre5",5,"pubHouse5",5.0);
        owner.addBookClick();
        Connection conn = null;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from where book_name = \"Book5\";";
            PreparedStatement st = conn.prepareCall(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 0;
            else{
                String name = rs.getString("book_name");
                String author = rs.getString("book_author");
                String genre = rs.getString("book_genre");
                int year = rs.getInt("book_year");
                String pub = rs.getString("book_pub");
                double price = rs.getDouble("book_price");
                if(name.equals("Book5") && author.equals("Author5") && genre.equals("Genre5") && year == 5
                        && pub.equals("PubHouse5") && (price - 5.0)<0.5)
                    flag = 1;
                
                assertEquals(1, flag);
                conn.close();
            }
        }
        catch(Exception e){}
    }
    */
    
    /*
    @Test
    public void testsearchBook1() {
        OwnerHome owner = new OwnerHome("Sarthak Chakraborty");
        owner.setDetails("Book1","Author1","Genre1",1,"pubHouse1",1.0);
        owner.searchBookClick();
        int flag = owner.getflag();
        assertEquals(1, flag);
    }
    
    @Test
    public void testsearchBook2() {
        OwnerHome owner = new OwnerHome("Sarthak Chakraborty");
        owner.setDetails("Book2","Author2","",2,"",2.0);
        owner.searchBookClick();
        int flag = owner.getflag();
        assertEquals(1, flag);
    }
    
    @Test
    public void testsearchBook3() {
        OwnerHome owner = new OwnerHome("Sarthak Chakraborty");
        owner.setDetails("Book2","Author1","Genre1",2,"pubHouse1",1.0);
        owner.searchBookClick();
        int flag = owner.getflag();
        assertEquals(0, flag);
    }
    
    @Test
    public void testsearchBook4() {
        OwnerHome owner = new OwnerHome("Sarthak Chakraborty");
        owner.setDetails("","","",1,"",1.0);
        owner.searchBookClick();
        int flag = owner.getflag();
        assertEquals(1, flag);
    }
    
    @Test
    public void testsearchBook5() {
        OwnerHome owner = new OwnerHome("Sarthak Chakraborty");
        owner.setDetails("","","",5,"",1.0);
        owner.searchBookClick();
        int flag = owner.getflag();
        assertEquals(0, flag);
    }
    */
    
    /*
    @Test
    public void testRemoveBook1() {
        int flag = 0;
        OwnerHome owner = new OwnerHome("Sarthak Chakraborty");
        owner.setDetails("Book1","Author1","Genre1",1,"pubHouse1",1.0);
        owner.removeBookClick();
        Connection conn = null;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from where book_name = \"Book1\";";
            PreparedStatement st = conn.prepareCall(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 1;
            assertEquals(1,flag);
            conn.close();
        }
        catch(Exception e){}
    }
    
    @Test
    public void testRemoveBook2() {
        int flag = 0;
        OwnerHome owner = new OwnerHome("Sarthak Chakraborty");
        owner.setDetails("Book2","Author2","Genre2",2,"pubHouse2",2.0);
        owner.removeBookClick();
        Connection conn = null;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from where book_name = \"Book2\";";
            PreparedStatement st = conn.prepareCall(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 1;
            assertEquals(1,flag);
            conn.close();
        }
        catch(Exception e){}
    }
    
    @Test
    public void testRemoveBook3() {
        int flag = 0;
        OwnerHome owner = new OwnerHome("Sarthak Chakraborty");
        owner.setDetails("Book1","Author1","Genre1",1,"pubHouse1",1.0);
        owner.removeBookClick();
        Connection conn = null;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from where book_name = \"Book1\";";
            PreparedStatement st = conn.prepareCall(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 1;
            assertEquals(1,flag);
            conn.close();
        }
        catch(Exception e){}
    }
    
    @Test
    public void testRemoveBook4() {
        int flag = 0;
        OwnerHome owner = new OwnerHome("Sarthak Chakraborty");
        owner.setDetails("Book4","","",1,"",1.0);
        owner.removeBookClick();
        Connection conn = null;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from where book_name = \"Book4\";";
            PreparedStatement st = conn.prepareCall(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 1;
            assertEquals(1,flag);
            conn.close();
        }
        catch(Exception e){}
    }
    
    @Test
    public void testRemoveBook5() {
        int flag = 0;
        OwnerHome owner = new OwnerHome("Sarthak Chakraborty");
        owner.setDetails("Book5","","",5,"",5.0);
        owner.removeBookClick();
        Connection conn = null;
        try{
            String myDriver = "org.gjt.mm.mysql.Driver";
            Class.forName(myDriver);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Srth#hak1715");
            String query = "Select * from where book_name = \"Book1\";";
            PreparedStatement st = conn.prepareCall(query);
            ResultSet rs = st.executeQuery();
            if(!rs.next())
                flag = 1;
            assertEquals(1,flag);
            conn.close();
        }
        catch(Exception e){}
    }
    */
    
}