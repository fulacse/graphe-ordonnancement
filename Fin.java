public class Fin extends Node {

    public Fin() {
        super();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("FIN\nPrecede: ");

        for (Node n : precede.toTab()) {
            s.append(n.value).append("; ");
        }
        return String.valueOf(s.append("\nFin du programme: ").append(this.depareTo));
    }

}