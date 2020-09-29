
import ProjectTest.Library;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Before;

/**
 *
 * @author Ayon
 */

public class LibraryTest {
    
    Library l;
    
    @Before
    public void setUp(){
        l = new Library();
    }
    
    @Test
    public void testSignIn(){
        
        assertEquals(true,l.signIn("sadman", "1234"));
    }
    
    @Test
    public void testAddBook(){
        
        assertEquals("book added successfully",l.addBook("Harry Potter"));
    }

    @Test
    public void testFindBook() {

        assertEquals("book found!", l.findBook("Harry Potter"));
    }

    
    @Test
    public void testShowBookList() {

        assertEquals("Showing book list:", l.showBookList());
        
        l.addBook("Harry Potter");
        assertEquals("Showing book list:", l.showBookList());
        
    }
    
    
    @Test
    public void testIssueBook() {

        assertEquals("Book issued successfully", l.issueBook("sadman","Harry Potter"));
    }
    
}
