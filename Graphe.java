public class Graphe{

    protected List neuxs;

    public Graphe(){
        this.neuxs=new List(100);
    }
    protected Graphe(Graphe g){
        this.neuxs=g.neuxs;
    }

    public void addNeux(Neux n){
        this.neuxs.add(n);
    }

    public void addArc(Neux n1,Neux n2){
        n2.addPre(n1);
        n1.addSus(n2);
    }

    public Neux[] toTab(){
        return this.neuxs.toTab();
    }

}