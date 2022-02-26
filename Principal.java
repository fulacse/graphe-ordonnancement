class Principal{

    public static void main(String[] arg){

        Graphe g1=new Graphe();

        Neux a=new Neux("A",1,g1);
        Neux b=new Neux("B",1,g1);
        Neux c=new Neux("C",5,g1);
        Neux d=new Neux("D",3,g1);
        Neux e=new Neux("E",2,g1);
        Neux f=new Neux("F",1,g1);
        Neux g=new Neux("G",10,g1);
        Neux h=new Neux("H",10,g1);
        Neux i=new Neux("I",5,g1);
        Neux j=new Neux("J",6,g1);
        Neux test1=new Neux("TEST1",1,g1);
        Neux k=new Neux("K",1,g1);
        Neux l=new Neux("L",1,g1);
        Neux test2=new Neux("TEST2",2,g1);
        Neux m=new Neux("M",2,g1);
        Neux n=new Neux("N",5,g1);
        Neux o=new Neux("O",1,g1);

        g1.addArc(a,b);
        g1.addArc(b,c);
        g1.addArc(b,d);
        g1.addArc(d,e);
        g1.addArc(c,f);
        g1.addArc(d,f);
        g1.addArc(f,g);
        g1.addArc(b,h);
        g1.addArc(b,i);
        g1.addArc(g,i);
        g1.addArc(i,j);
        g1.addArc(j,test1);
        g1.addArc(j,k);
        g1.addArc(k,l);
        g1.addArc(l,test2);
        g1.addArc(l,m);
        g1.addArc(m,n);
        g1.addArc(m,o);
        g1.addArc(n,o);

        /**Neux a=new Neux("A",1,g1);
        Neux b=new Neux("B",1,g1);
        Neux c=new Neux("C",5,g1);
        Neux d=new Neux("D",3,g1);

        g1.addArc(a,c);
        g1.addArc(b,c);
        g1.addArc(a,d);**/

        Path p1=new Path(g1);
        p1.go();
        for(Neux neux:p1.toTab()){
            System.out.println(neux+"\n=========================");
        }

    }

}