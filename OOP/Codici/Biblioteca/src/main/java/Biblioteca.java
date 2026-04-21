import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Biblioteca {

    List<Libro> catalogo = new ArrayList<>();
    List<Utente> utenti= new ArrayList<>();

    public Biblioteca(){

    }
    public void addlibro(String nome, String ISBN, boolean isDisponibile){
        Libro nuovoLibro=new Libro(nome,ISBN,isDisponibile);
        catalogo.add(nuovoLibro);
        System.out.println("Aggiunto con successo "+ nome +" !");
    }
    public void rimuoviLibro(String ISBN){
        for (Libro libro : catalogo){
            if (libro.getISBN().equalsIgnoreCase(ISBN)){
                catalogo.remove(libro);
                System.out.println("Rimosso con successo!");
            }
        }
    }

    public void aggiungiUtente(String nome, String cognome, String email){
        Utente utente=new Utente(nome,cognome,email);
        utenti.add(utente);
    }
    public void rimuoviUtente(String email){
        for (Utente utente : utenti){
            if (utente.getEmail().equalsIgnoreCase(email)){
                catalogo.remove(utente);
                System.out.println("Rimosso con successo!");
            }
        }
    }

}

