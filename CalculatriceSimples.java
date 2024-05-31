public class CalculatriceSimples {
    public static void main(String[] args) {
        Nombre six = new Nombre(6) ;  
        Nombre dix = new Nombre(10) ;
        try{
            Operation s = new Soustraction(dix,six) ;  
            System.out.println(s + " = " + s.valeur()) ; // doit afficher : (10 – 6) = 4 
        }
        catch(Exception e){
            System.out.println("exeption dans la soustraction");
        }

        try{
            Operation a = new Addition(dix,six);
            System.out.println(a + " = " + a.valeur()) ; //doit afficher (10 + 6) = 16 
        }
        catch(Exception e){
            System.out.println("exeption dans l'adition");
        }

        try{
            Operation m = new Multiplication(dix,six);
            System.out.println(m + " = " + m.valeur()) ; //doit afficher (10 * 6) = 60
        }
        catch(Exception e){
            System.out.println("exeption dans la multiplication");
        }

        try{
            Operation d = new Division(dix,six);
            System.out.println(d + " = " + d.valeur()) ; //doit afficher (10/6) = 1.66 
    
        }
        catch(Exception e){
            System.out.println("exeption dans la division");
        }
    }
}
