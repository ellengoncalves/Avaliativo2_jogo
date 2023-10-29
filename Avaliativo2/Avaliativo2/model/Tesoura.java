package java.Avaliativo2.model;

public class Tesoura extends Coisa {
  public Tesoura() {
    super("Tesoura");
  }

  @Override
  public int comparar(Coisa thing) {
    if (thing instanceof Papel) {
      return 1;
    } else if (thing instanceof Pedra) {
      return -1;
    } else {
      return 0;
    }
  }
}
