public class Multiplication extends Operation{

    public Multiplication(Expression a, Expression b){
        super(a,b);
    }

    public double valeur(){
        return (getOperande1().valeur() * getOperande2().valeur());
    }

    public String toString(){
        return "("+getOperande1()+" * "+getOperande2()+")";
    }
}