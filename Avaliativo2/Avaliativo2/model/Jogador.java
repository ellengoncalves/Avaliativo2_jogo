package java.Avaliativo2.model;

public class Jogador {
  private String nome;
  private Coisa escolha;

  public Jogador(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public Coisa getEscolha() {
    return escolha;
  }

  public void fazerEscolha(Coisa escolha) {
    this.escolha = escolha;
  }
}
