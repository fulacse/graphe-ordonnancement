public class Fin extends Neux{

    public Fin(){
        super();
    }

    @java.lang.Override
    public java.lang.String toString() {
        String s="FIN\nPrecede: ";
        for(Neux n:precede.toTab()){
            s+=n.value+"; ";
        }
        return s+="\nFin du programme: "+this.depareTo;
    }

}