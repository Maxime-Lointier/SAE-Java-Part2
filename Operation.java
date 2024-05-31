abstract class  Operation extends Expression {
//variables
private Expression Operande1;
private Expression Operande2;

    //Constructeur
    public Operation(){
        this.Operande1 = new Nombre(1);
        this.Operande2 = new Nombre(2);
    }
    public Operation(Expression Operande1, Expression Operande2){
        this.Operande1 = Operande1;
        this.Operande2 = Operande2;
    }
    public Operation(Operation operation){
        this.Operande1 = operation.getOperande1();
        this.Operande2 = operation.getOperande2();
    }
    //Méthodes

    public Expression getOperande1(){
         return Operande1;
    }

    public Expression getOperande2(){
        return Operande2;
    }
    
}