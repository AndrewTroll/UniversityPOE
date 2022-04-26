/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st10032464;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class MessageTest {
   Message m = new Message(); 
    
    public MessageTest() {
    }
    
    @Test
    public void testGetMessage() {
        String expected = "Hello World";
        String actual = m.getMessage();
        assertEquals(expected,actual);
    }
    
}
