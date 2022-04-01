import java.util.logging.Level;
import java.util.logging.Logger;

class Principal {

    private static final Logger LOGGER = Logger.getLogger(Principal.class.getName());

    public static void main(String[] arg) {
        Graph g1 = new Graph();

        Node a = new Node("A", 1, g1);
        Node b = new Node("B", 1, g1);
        Node c = new Node("C", 5, g1);
        Node d = new Node("D", 3, g1);
        Node e = new Node("E", 2, g1);
        Node f = new Node("F", 1, g1);
        Node g = new Node("G", 10, g1);
        Node h = new Node("H", 10, g1);
        Node i = new Node("I", 5, g1);
        Node j = new Node("J", 6, g1);
        Node test1 = new Node("TEST1", 1, g1);
        Node k = new Node("K", 1, g1);
        Node l = new Node("L", 1, g1);
        Node test2 = new Node("TEST2", 2, g1);
        Node m = new Node("M", 2, g1);
        Node n = new Node("N", 5, g1);
        Node o = new Node("O", 1, g1);

        g1.addArc(a, b);
        g1.addArc(b, c);
        g1.addArc(b, d);
        g1.addArc(d, e);
        g1.addArc(c, f);
        g1.addArc(d, f);
        g1.addArc(f, g);
        g1.addArc(b, h);
        g1.addArc(b, i);
        g1.addArc(g, i);
        g1.addArc(i, j);
        g1.addArc(j, test1);
        g1.addArc(j, k);
        g1.addArc(k, l);
        g1.addArc(l, test2);
        g1.addArc(l, m);
        g1.addArc(m, n);
        g1.addArc(m, o);
        g1.addArc(n, o);

        /**Neux a=new Neux("A",1,g1);
         Neux b=new Neux("B",1,g1);
         Neux c=new Neux("C",5,g1);
         Neux d=new Neux("D",3,g1);

         g1.addArc(a,c);
         g1.addArc(b,c);
         g1.addArc(a,d);**/

        Path p1 = new Path(g1);
        p1.go();
        LOGGER.log(Level.INFO, "P1: {0}", p1);
        for (final Node node : p1.toTab()) {
            System.out.println(node + "\n=========================");
        }

    }

}