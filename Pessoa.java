package seguradora;

public class Pessoa {
    private String rua;
    private String numero;
    private String complemento;
    private String cidade;
    private String cep;

    public void cadastrarPessoa(){
        this.rua = 
        //this.numero =
        //this.complemento =
        this.cidade = Input.stringLettersLimited("Cadastro cliente", "Tente novamente, utilize apenas letras", "Digite a cidade", 35);
        this.cep = Format.cep(Input.stringNumLimited("Cadastro cliente", "Tente novamente, utilize apenas numeros", "Tente novamente, o cep e formado por 8 digitos", "Digite o CEP", 8));
        //Console.pause(this.cep, true);
    }

	/**
	* Returns value of rua
	* @return
	*/
	public String getRua() {
		return rua;
	}

	/**
	* Sets new value of rua
	* @param
	*/
	public void setRua(String rua) {
		this.rua = rua;
	}

	/**
	* Returns value of numero
	* @return
	*/
	public String getNumero() {
		return numero;
	}

	/**
	* Sets new value of numero
	* @param
	*/
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	* Returns value of complemento
	* @return
	*/
	public String getComplemento() {
		return complemento;
	}

	/**
	* Sets new value of complemento
	* @param
	*/
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	* Returns value of cidade
	* @return
	*/
	public String getCidade() {
		return cidade;
	}

	/**
	* Sets new value of cidade
	* @param
	*/
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	* Returns value of cep
	* @return
	*/
	public String getCep() {
		return cep;
	}

	/**
	* Sets new value of cep
	* @param
	*/
	public void setCep(String cep) {
		this.cep = cep;
	}
}
