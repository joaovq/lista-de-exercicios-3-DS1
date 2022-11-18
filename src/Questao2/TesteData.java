package Questao2;

import junit.framework.TestCase;

public class TesteData extends TestCase {
    public void testValidarData(){
        boolean b = Data.validarData(21, 12, 2000);
        assertTrue(b);
        boolean b1 = Data.validarData(31, 2, 10);
        assertFalse(b1);
        boolean b2 = Data.validarData(31, 1, 1000);
        assertTrue(b2);
        boolean b3 = Data.validarData(32, 1, 1000);
        assertFalse(b3);
        boolean b4 = Data.validarData(32, 3, 1000);
        assertFalse(b4);
        boolean b5 = Data.validarData(31, 4, 1000);
        assertFalse(b5);
    }


    public void testToString(){
        Data data = new Data(30,4,2000);
        String toString = data.toString();
        assertEquals("30 de abril de 2000",toString);
    }
}
