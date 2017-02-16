package agendaapp;
import gui.AgendaForm;
import model.Agenda;

/**
 *
 * @author dpMelian: el grande
 */
public class AgendaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        AgendaForm agendaForm = new AgendaForm();
        agendaForm.assignAgenda(agenda);
        agendaForm.setVisible(true);
    }
}
