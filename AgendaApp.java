package agendaapp;
import model.Agenda;

/**
 *
 * @author dpMelian
 */
public class AgendaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.addPerson("Pepe", "Santana", "12345", "pepe.gmail");
        System.out.println(agenda.contacts.get(0).getName());
    }
}
