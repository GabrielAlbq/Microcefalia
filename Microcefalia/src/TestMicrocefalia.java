import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;


import org.junit.*;

public class TestMicrocefalia {


	@Test
	public void testConstrutor() {
		String file = "C:\\Users\\Aluno\\Desktop\\lista_dados_microcefalia.csv";
		Microcefalia micro = new Microcefalia(file);
		assertNotNull(micro);
	}
	
	@Test
	public void testAbrirFile() throws FileNotFoundException {
		String file = "C:\\Users\\Aluno\\Desktop\\lista_dados_microcefalia.csv";
		Microcefalia micro = new Microcefalia(file);
		assertTrue(micro.abrirfile());
	}
	
	
	@Test(expected=FileNotFoundException.class)
	public void testAbrirFileInexistente() throws FileNotFoundException {
		String file = "C:\\Users\\Aluno\\Desktop\\lista_dados_microcefaliaa.csv";
		Microcefalia micro = new Microcefalia(file);
		micro.abrirfile();
	}
	
	
	@Test
	public void testLerArquivo() throws IOException {
		String file = "C:\\Users\\Aluno\\Desktop\\lista_dados_microcefalia.csv";
		Microcefalia micro = new Microcefalia(file);
			//assertTrue(micro.abrirfile());
			micro.separardados();
	}
	

}
