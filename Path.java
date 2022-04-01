public class Path extends Graph {

    public Path(Graph g) {
        super(g);
        this.addFin();
    }

    private void addFin() {
        Node fin = new Fin();
        for (Node n1 : this.toTab()) {
            if (n1.getSuccesseur().length == 0) {
                fin.addPre(n1);
            }
        }
        this.addNode(fin);
    }

    private void ASAP() {
        this.toTab()[(this.toTab().length - 1)].ASAP();
    }

    private void ALAP() {
        for (Node n : this.toTab()) {
            if (n.getPrecede().length == 0) {
                n.ALAP(dayFin());
            }
        }
    }

    public void go() {
        this.ASAP();
        this.ALAP();
    }

    public int dayFin() {
        return this.toTab()[this.toTab().length - 1].getDepareTo();
    }

}