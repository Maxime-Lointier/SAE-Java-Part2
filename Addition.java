public class Addition extends Operation{

    //constructeur
    public Addition(){
        super();
    }

    public Addition(Expression Operande1, Expression Operande2){
        super(Operande1,Operande2);
    }

    public Addition(Addition addition){
        super(addition);
    }

    //adition le string des deux operande
    public double valeur(){
        return this.getOperande1().valeur() + this.getOperande2().valeur();
    }

    
    public String toString() {
        return "("+getOperande1()+" + "+getOperande2()+")";
    }
}
