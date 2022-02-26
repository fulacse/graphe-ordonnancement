public class Neux{

    public String value;
    private int duree;
    protected List precede;
    private List sussecceur;
    protected int depareTo;
    private int depareTa;

    public Neux(String v,int d){
        this.value=v;
        this.duree=d;
        this.precede=new List(100);
        this.sussecceur=new List(100);
        this.depareTo=0;
        this.depareTa=0;
    }

    public Neux(String v,int d,Graphe g){
        this.value=v;
        this.duree=d;
        this.precede=new List(100);
        this.sussecceur=new List(100);
        this.depareTo=0;
        this.depareTa=0;
        g.addNeux(this);
    }

    protected Neux(){
        this.precede=new List(100);
        this.depareTa=0;
    }

    public void addPre(Neux n){
        this.precede.add(n);
    }

    public void addSus(Neux n){
        this.sussecceur.add(n);
    }

    @java.lang.Override
    public java.lang.String toString() {
        String s="Valeur: "+this.value+"\nDuree: "+this.duree+"\nPrecede: ";
        for(Neux n:precede.toTab()){
            s+=n.value+"; ";
        }
        return s+="\nDepare le plus tote: "
                +this.depareTo+"\nDepare le plus tare: "+this.depareTa;
    }

    public void ASAP(){
        if(this.precede.nb==0){
            this.depareTo=0;
            return;
        }
        int[] is=new int[this.precede.nb];
        for(int i=0;i<this.precede.nb;i++){
            this.precede.val(i).ASAP();
            is[i]=this.precede.val(i).duree+this.precede.val(i).depareTo;
        }
        this.depareTo=max(is);
    }

    public void ALAP(int f){
        if(this.sussecceur.nb==0){
            this.depareTa=f-this.duree;
            return;
        }
        int[] is=new int[this.sussecceur.nb];
        for(int i=0;i<this.sussecceur.nb;i++){
            this.sussecceur.val(i).ALAP(f);
            is[i]=this.sussecceur.val(i).depareTa-this.duree;
        }
        this.depareTa=min(is);
    }

    private int min(int[] is){
        int res=is[0];
        for(int i=1;i<is.length;i++){
            if(res>is[i]){
                res=is[i];
            }
        }
        return res;
    }

    private int max(int[] is){
        int res=is[0];
        for(int i=1;i<is.length;i++){
            if(res<is[i]){
                res=is[i];
            }
        }
        return res;
    }

    public Neux[] getPrecede(){
        return this.precede.toTab();
    }

    public Neux[] getSuccesseur(){
        return this.sussecceur.toTab();
    }

    public int getDepareTo(){
        return this.depareTo;
    }

}