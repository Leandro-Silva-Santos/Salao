package Controller;

import View.Agenda;
import View.Menu;

public class MenuController {
    private final Menu view;

    public MenuController(Menu view) {
        this.view = view;
    }
    
    public void abrirAgenda(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
        
    }
}
