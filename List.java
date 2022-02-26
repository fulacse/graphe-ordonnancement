public class List{

    protected Neux[] tab;
    protected int nb;

    public List(int t){
        this.tab=new Neux[t];
        this.nb=0;
    }

    public void add(Neux n){
        this.tab[this.nb]=n;
        this.nb++;
    }

    public Neux val(int p){
        return this.tab[p];
    }

    public Neux[] toTab(){
        Neux[] neuxes=new Neux[this.nb];
        for(int i=0;i<this.nb;i++){
            neuxes[i]=this.tab[i];
        }
        return neuxes;
    }

}