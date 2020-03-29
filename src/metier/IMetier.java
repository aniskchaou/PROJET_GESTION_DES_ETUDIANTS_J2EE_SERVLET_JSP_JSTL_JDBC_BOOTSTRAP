package metier;

import java.sql.SQLException;
import java.util.List;

import entity.Produit;

public interface IMetier {
List<Produit> getProduitByName(String pnom) throws SQLException;
List<Produit> getProduits() throws SQLException;
void addProduit(Produit p);
}
