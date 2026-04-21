public class Libro {
    private String nome;
    private String ISBN;
    private boolean isDisponibile;
    private String presoDa;

    public Libro(String nome,String ISBN,boolean isDisponibile){
        this.nome=nome;
        this.ISBN=ISBN;
        this.isDisponibile=isDisponibile;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void notDisponibile(){
        isDisponibile=false;
    }
    public void Disponibile(){
        isDisponibile=true;
    }

    public boolean isDisponibile() {
        return isDisponibile;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public String getISBN() {
        return ISBN;
    }

     public void setPresoDa(String email){
        presoDa=email;
     }
     public String getPresoDa(){
        return presoDa;
     }
}

