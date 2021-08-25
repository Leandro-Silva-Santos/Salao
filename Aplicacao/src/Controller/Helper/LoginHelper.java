package Controller.Helper;

import Model.Usuario;
import View.Login;

public class LoginHelper {
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public Usuario obterModelo(){
        String nome = view.getTxtusuario().getText();
        String senha = view.getTxtsenha().getText();
        Usuario modelo = new Usuario(0, nome, senha);        
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTxtusuario().setText(nome);
        view.getTxtsenha().setText(senha);
    }
    
    public void limparCampos(){
        view.getTxtusuario().setText("");
        view.getTxtsenha().setText("");
    }
}
