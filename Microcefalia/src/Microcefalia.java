import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Microcefalia {

	private String file;
	private BufferedReader br;
	private List<List<String>> dados;

	public Microcefalia(String file) {
		this.file = file;
		this.dados = new ArrayList<>();

	}
	public boolean abrirfile() throws FileNotFoundException {
		File f = new File(file);
		FileReader fr = new FileReader(f);
		this.br = new BufferedReader(fr);
		return f.exists();
	}
	
	
	public void separardados() throws IOException {
		if(this.abrirfile()) {
			String linha;
			while ((linha = br.readLine()) != null) {
				String[] valores = linha.split(";");
				System.out.println(valores.length);
				dados.add(Arrays.asList(valores));
				System.out.println(dados.get(0).get(0));
			}
		}
	}
	
	public void buscarcidade(String cidade) {
		
	}
	
}
