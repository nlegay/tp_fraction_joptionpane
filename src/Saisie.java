import javax.swing.*;
public class Saisie{
    public static void main(String[] args){
    	String texte = "";
    	if(args.length == 2 && args[0].matches("\\d*") && args[1].matches("\\d*")){
    		int min = Integer.parseInt(args[0]);
    		int max = Integer.parseInt(args[1]);
    		int nbre = 0;
    		boolean correct = false;
    		do{
    			texte = JOptionPane.showInputDialog(null, "Entre un nombre entre "+min+" et "+max+":", "Entree",  1);
    			System.out.println(texte);
    			if(!texte.matches("\\d*")){
    				JOptionPane.showMessageDialog(null, "Alerte", "Erreur", JOptionPane.ERROR_MESSAGE);
    			}else if(Integer.parseInt(texte) >= max || Integer.parseInt(texte) <= min){
    				JOptionPane.showMessageDialog(null, "Alerte", "Erreur", JOptionPane.ERROR_MESSAGE);
    			}else{
    				correct = true;
    				nbre = Integer.parseInt(texte);
    				System.out.println(nbre);
    			}
    		}while(!correct);
    		JOptionPane.showMessageDialog(null, "Vous avez choisis: "+nbre, "Message", JOptionPane.INFORMATION_MESSAGE);
    	}else{
    		JOptionPane.showMessageDialog(null, "Alerte", "Erreur", JOptionPane.ERROR_MESSAGE);
    	}
    }
}
