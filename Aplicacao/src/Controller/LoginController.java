package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.Menu;

public class LoginController {

    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);        
    }
    
    public void entrarNoSistema(){
        Usuario usuario = helper.obterModelo();
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if (usuarioAutenticado != null) {
            Menu menu = new Menu();
            menu.setVisible(true);
            this.view.dispose();
        }else{
            view.exibeMensagem("Usuário ou senha inválidos");
        }
    }

    public void fizTarefa(){
        System.out.println("Busquei algo do bd");
        this.view.exibeMensagem("Executei fizTarefa");
    }
}
