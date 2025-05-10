/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import Control.PersistenciaJPA;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vito
 */
public class TesteConexao {
    
 private PersistenciaJPA jpa;
@Before
public void setUp() {
	jpa = new PersistenciaJPA();
	System.out.println("Iniciando teste de conexão...");
}

@After
public void tearDown() {
	if (jpa != null && jpa.conexaoAberta()) {
		jpa.fecharConexao();
		System.out.println("Conexão fechada com sucesso.");
	}
}

@Test
public void testeConexaoAberta() {
	assertNotNull("Instância JPA não pode ser nula", jpa);
	assertTrue("A conexão deveria estar aberta", jpa.conexaoAberta());
	System.out.println("Conexão aberta com sucesso!");
}
}
