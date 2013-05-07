/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import industria.Circulo;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author aluno
 */
public class TesteCirculo {
    @Test
    public final void estGetRaio() {
        Circulo bola = new Circulo();
        assertEquals(1.0, bola.getRaio(), 0.0);

    }
}
