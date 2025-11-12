package cantinhoDoce;

public class Usuario {
	
	private String usuario;
	private String senha;
	private String msg;
	
	// construtor
	
		public Usuario(String usuario, String senha) {
			this.usuario = usuario;
			this.senha = senha;
			// this.senha refere-se a atributo // senha referese a parametro
			this.msg = "Bem vindo(a)";
		}
		
		public String getUsuario() {
			return usuario;
		}
		
		public String getSenha() {
			return senha;
		}
		public String getMsg() {
			return msg;
		}
}
