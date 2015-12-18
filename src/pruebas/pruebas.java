/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import static junit.framework.Assert.assertNotNull;
import knapsack.problem.TesterAlgorithmPortfolio;
import org.junit.Test;

/**
 *
 * @author Apuestas
 */
public class pruebas {
    
    @Test
	public void TestCreaObjeto() {
		System.out.println("Creación correcta Objeto");
		System.out.println("EL Objeto ha sido creado Correctamente\n");

		assertNotNull("EL Objeto ha sido creado Correctamente",new TesterAlgorithmPortfolio());
	}
    
}
