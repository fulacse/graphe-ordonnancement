public class List {

    protected Node[] nodes;
    protected int length;

    public List(int t) {
        this.nodes = new Node[t];
        this.length = 0;
    }

    public void add(Node n) {
        this.nodes[this.length] = n;
        this.length++;
    }

    public Node val(int p) {
        return this.nodes[p];
    }

    public Node[] toTab() {
        Node[] newNodes = new Node[this.length];

        System.arraycopy(this.nodes, 0, newNodes, 0, this.length);
        return newNodes;
    }

}