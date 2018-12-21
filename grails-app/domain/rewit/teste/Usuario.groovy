package rewit.teste

class Usuario {

	String nome
	String senha

    static constraints = {
    	nome(nullable: false, blank: false)
    	senha(nullable: false, blank: false)
    }
}
