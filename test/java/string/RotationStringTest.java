package string;

import org.junit.Test;
import strings.RotationString;

import static org.junit.Assert.*;

public class RotationStringTest {


    @Test
    public void testIsRotation(){
        assertTrue(RotationString.isRotation("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"));
        assertFalse(RotationString.isRotation("HelloWorld","dlorWolleH"));
        assertFalse(RotationString.isRotation("abc","efs"));



    }

}