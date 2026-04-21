import java.util.ArrayList;
import java.util.List;

public class Utente {
    private String nome;
    private String cognome;
    private String email;

    public Utente(String nome, String cognome, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;

    }

    List<Libro> libri = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public void libriPosseduti() {
        for (Libro libro : libri) {
            System.out.println(libro);
        }
    }

    public void prendiLibroISBN(String ISBN) {
        for (Libro libro : libri) {
            if (libro.getISBN().equalsIgnoreCase(ISBN)){
                System.out.println("Preso libro con ISBN: "+ ISBN);
                libro.notDisponibile();
                libro.setPresoDa(email);
            }
            else {
                System.out.println("Libro non trovato");
            }
        }
    }
    public void prendiLibroNome(String nome) {

        for (Libro libro : libri) {
            if (libro.getNome().equalsIgnoreCase(nome)){
                System.out.println("Preso libro chiamato: "+ nome);
                libro.notDisponibile();
                libro.setPresoDa(email);
            }
            else {
                System.out.println("Libro non trovato");
            }
        }
    }
}
