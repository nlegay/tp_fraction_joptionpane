public class Fraction{
    int num, deno;
    Fraction(int num, int deno){
    	this.num = num;
    	if(deno != 0){
    		this.deno = deno;
    	}else{
    		System.out.println("Denominateur non initialise");
    	}
    }
    public String toString(){
    	return num+"/"+deno;
    }
    int compareTo(Fraction fraction){
    	float f1 = num/deno;
    	float f2 = fraction.num/fraction.deno;
    	if(f1 == f2){
    		return 0;
    	}else if(f1 < f2){
    		return -1;
    	}
    	return 1;
    }
    Fraction somme(Fraction fraction){
    	int sommeNum = num*fraction.deno + fraction.num*deno;
    	int sommeDeno = deno*fraction.deno;
    	return new Fraction(sommeNum, sommeDeno);
    }
    void additionner(Fraction fraction){
    	this.num = num*fraction.deno + fraction.num*deno;
    	this.deno = deno*fraction.deno;	
    }
    /**
     * Retourne le produit des deux fractions.
     * 
     * @param fraction
     * Le second membre du produit.
     * @return Une instance de Fraction, qui correspond au produit des deux fractions.
     */
    Fraction produit(Fraction fraction){
    	return new Fraction(num*fraction.num, deno*fraction.deno);
    }
    /**
     * Retourne le produit d'une fraction avec un entier.
     * 
     * @param entier
     * Le second membre du produit.
     * @return Une instance de Fraction, qui correspond au produit d'une fraction avec un entier.
     */
    Fraction produit(int entier){
    	return new Fraction(num*entier, deno*entier);
    }
    void multiplier(Fraction fraction){
    	num=num*fraction.num;
    	deno=deno*fraction.deno;
    }
    void multiplier(int entier){
    	num=num*entier;
    	deno=deno*entier;
    }
}
