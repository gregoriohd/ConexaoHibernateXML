package contato.hibernate;

import contato.Contato;

public class Conectar {

	public static void main(String[] args) {
		Contato contato = new Contato();
		
		contato.setNome("Gregorio");
		contato.setEmail("gregorio@email.com");
		contato.setIdade(34);
		
		ContatoCRUD crud = new ContatoCRUD();
		
		crud.salvar(contato);
	}

}
