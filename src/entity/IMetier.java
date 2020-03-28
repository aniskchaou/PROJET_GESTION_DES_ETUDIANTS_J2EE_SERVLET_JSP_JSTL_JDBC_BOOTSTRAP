package entity;

import java.sql.SQLException;
import java.util.List;

public interface IMetier {
List<Produit> getProduitByName(String pnom) throws SQLException;
void addProduit(Produit p);
}
