package seguradora;

public class PessoaJuridica{
    private String razaoSocial;
    private String cnpj;

	/**
	* Returns value of razaoSocial
	* @return
	*/
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	* Sets new value of razaoSocial
	* @param
	*/
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	/**
	* Returns value of cnpj
	* @return
	*/
	public String getCnpj() {
		return cnpj;
	}

	/**
	* Sets new value of cnpj
	* @param
	*/
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

    public void cadastrar() {
        this.razaoSocial = Input.stringLettersLimited("Cadastro cliente", "Tente novamente, utilize apenas letras", "Digite o nome", 50);
        this.cnpj = Format.cnpj(Input.stringNumLimited("Cadastro cliente", "Tente novamente, utilize apenas numeros", "Tente novamente, o CNPJ e composto por 15 digitos", "Digite o CNPJ", 15));
        Console.pause(this.cnpj, true);
    }
}
