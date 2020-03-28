package entity;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Metier m=new Metier();
      try {
		List<Produit> pds=m.getProduitByName("zer");
		for (Iterator iterator = pds.iterator(); iterator.hasNext();) {
			Produit produit = (Produit) iterator.next();
			System.out.println(produit.getPrix());
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
	}

}
