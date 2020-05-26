package com.edureka;
import static org.junit.Assert.*;
import java.io.*;
import javax.servlet.http.*;
import org.junit.Test;
import org.mockito.Mockito;

import com.edureka.Calculator;

public class CalculatorTest extends Mockito{

    @Test
    public void testServlet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);       
        HttpServletResponse response = mock(HttpServletResponse.class);    


        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);

        new Calculator().doGet(request, response);
        
        writer.flush(); // it may not have been flushed yet...
        System.out.print(stringWriter.toString());
        assertTrue("Expecting Hello from Edureka but not found",stringWriter.toString().contains("Hello from Edureka"));
    }

    @Test
    public void testAdd() throws Exception {

        int k= new Calculator().add(8,6);
        assertEquals("Problem with Add function:", 14, k);
        
    }
    @Test
    public void testSub() throws Exception {

        int k= new Calculator().sub(8,7);
        assertEquals("Problem with Sub function:", 1, k);

    }
    
    @Test
    public void testMul() throws Exception {

        int k= new Calculator().mul(8,6);
        assertEquals("Problem with Mul function:", 48, k);

    }

}
