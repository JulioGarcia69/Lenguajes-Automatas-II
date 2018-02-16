public class ArbolBin {

    private Nodo raiz;

    public ArbolBin() {
        raiz=null;
    }
    public ArbolBin( int valor ) {
        this.raiz = new Nodo( valor );
    }
    public ArbolBin( Nodo raiz ) {
        this.raiz = raiz;
    } 
    public Nodo getRaiz() {
        return raiz;
    }
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public void insertar(int info){
        Nodo nuevo;
        nuevo=new Nodo(info);
        nuevo.info=info;
        nuevo.Izq=null;
        nuevo.Der=null;
        if(raiz==null)
            raiz=nuevo;
        else{
               Nodo anterior=null, reco;
               reco=raiz;
               while(reco!=null){
                         anterior=reco;
               if(info<reco.info)
                   reco=reco.Izq;
               else
                     reco=reco.Der;
               }
               if(info<anterior.info)
                  anterior.Izq=nuevo;
               else
                   anterior.Der=nuevo;
         }
    }
    private void imprimirPre(Nodo reco){
                 if(reco!=null){
                     System.out.print(reco.info+" ");
                     imprimirPre(reco.Izq);
                     imprimirPre(reco.Der);
                 }
      }
      public void imprimirPre(){
                  imprimirPre(raiz);
                  System.out.println();
      }
      private void imprimirEntre(Nodo reco){
                  if(reco!=null){
                     imprimirEntre(reco.Izq);
                      System.out.print(reco.info+" ");
                     imprimirEntre(reco.Der);
                 }
       }
       public void imprimirEntre(){
                     imprimirEntre(raiz);
                     System.out.println();
       }
       public void imprimirPost(Nodo reco){
                   if(reco!=null){
                       imprimirPost(reco.Izq);
                       imprimirPost(reco.Der);
                       System.out.print(reco.info+" ");
                   }
       }
       public void imprimirPost(){
                   imprimirPost(raiz);
                   System.out.println();
      }
       private Nodo recorrerIzquierda(Nodo nodo) {
        if (nodo.getHojaIzquierda() != null) {
            return recorrerIzquierda( nodo.getHojaIzquierda() );
        }
        return nodo;
    }
}