package java.Avaliativo2.model;

public class Papel extends Coisa {
  public Papel() {
    super("Papel");
  }

  @Override
  public int comparar(Coisa thing) {
    if (thing instanceof Pedra) {
      return 1;
    } else if (thing instanceof Tesoura) {
      return -1;
    } else {
      return 0;
    }
  }
}
