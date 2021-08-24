package Controller;

import View.Login;

public class LoginController {

    private final Login view;
    
    public LoginController(Login view) {
        this.view = view;
        
    }

    public void fizTarefa(){
        System.out.println("Busquei algo do bd");
        this.view.exibeMensagem("Executei FizTarefa");
    }
}
