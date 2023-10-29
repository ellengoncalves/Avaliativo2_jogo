package java.Avaliativo2.model;

public abstract class Coisa {
    private String nome;

    public Coisa(String nome) {
        this.nome = nome;
    }

    public abstract int comparar(Coisa thing);

    @Override
    public String toString() {
        return nome;
    }
}

