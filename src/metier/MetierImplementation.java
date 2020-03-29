package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connectionbd.SingletonConnection;
import entity.Produit;

public class MetierImplementation implements IMetier {

	@Override
	public List<Produit> getProduitByName(String pnom) throws SQLException {
		List<Produit> l=new ArrayList<Produit>();
		//connexion
		Connection con=SingletonConnection.getConnection();
		
		//requete
		PreparedStatement p=con.prepareStatement("select * from produit where designation like ?");
		p.setString(1, "%"+pnom+"%");
		ResultSet  rs=p.executeQuery();
		
		//resulats
		while (rs.next()) {
			Produit pp=new Produit();
			pp.setId(rs.getLong("id"));
			pp.setNom(rs.getString("designation"));
			pp.setPrix(rs.getString("prix"));
			l.add(pp);
		}
		
		return l;
	}

	@Override
	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Produit> getProduits() throws SQLException {
		List<Produit> l=new ArrayList<Produit>();
		//connexion
		Connection con=SingletonConnection.getConnection();
		
		//requete
		PreparedStatement p=con.prepareStatement("select * from produit");
		ResultSet  rs=p.executeQuery();
		
		//resulats
		while (rs.next()) {
			Produit pp=new Produit();
			pp.setId(rs.getLong("id"));
			pp.setNom(rs.getString("designation"));
			pp.setPrix(rs.getString("prix"));
			l.add(pp);
		}
		
		return l;
	}

}
