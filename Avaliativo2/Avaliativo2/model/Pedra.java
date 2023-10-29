package java.Avaliativo2.model;

public class Pedra extends Coisa {
  public Pedra() {
    super("Pedra");
  }

  @Override
  public int comparar(Coisa thing) {
    if (thing instanceof Tesoura) {
      return 1;
    } else if (thing instanceof Papel) {
      return -1;
    } else {
      return 0;
    }
  }
}
