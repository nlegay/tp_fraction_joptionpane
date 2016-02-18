public class TestFraction{
    public static void main(String[] args){
    	Fraction f1 = new Fraction(3,0);
    	Fraction f2 = new Fraction(2,2);
    	Fraction f3 = new Fraction(1,3);
    	System.out.println(f1);
    	System.out.println(f2);
    	System.out.println(f3);
    	System.out.println(f2.somme(f3));
    	System.out.println(f2.produit(f3));
    	System.out.println(f2.produit(2));
    }
}
