package seguradora;

public class PessoaFisica{
    private String nome;
    private String cpf;

	/**
	* Returns value of nome
	* @return
	*/
	public String getNome() {
		return nome;
	}

	/**
	* Sets new value of nome
	* @param
	*/
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	* Returns value of cpf
	* @return
	*/
	public String getCpf() {
		return cpf;
	}

	/**
	* Sets new value of cpf
	* @param
	*/
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

    public void cadastrar() {
        this.nome = Input.stringLettersLimited("Cadastro cliente", "Tente novamente, utilize apenas letras", "Digite o nome", 35);
        this.cpf = Format.cpf(Input.stringNumLimited("Cadastro cliente", "Tente novamente, utilize apenas numeros", "Tente novamente, o CPF e composto por 11 digitos", "Digite o CPF", 11));
    }
}
