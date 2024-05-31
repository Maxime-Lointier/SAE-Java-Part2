public class Soustraction extends Operation{
    
    public Soustraction(Expression a, Expression b){
        super(a,b);
    }

    public double valeur(){
        return (getOperande1().valeur() - getOperande2().valeur());
    }
    
    public String toString(){
        return "("+getOperande1()+" - "+getOperande2()+")";
    }
}