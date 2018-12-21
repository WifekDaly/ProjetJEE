package org.sid.eboutique;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.sid.eboutique.entities.Categorie;
import org.sid.eboutique.entities.Produit;
import org.sid.eboutique.metier.IAdminCategoriesMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJPA {

    @Before( value = "" )
    public void setUp() throws Exception {

    }

    @Test
    public void test1() {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( new String[] {
                    "applicationContext.xml" } );
            IAdminCategoriesMetier metier = (IAdminCategoriesMetier) context.getBean( "metier" );
            List<Categorie> cts1 = metier.listCategories();
            metier.ajouterCategorie( new Categorie( "Ordinateurs", "Ordnmmmm", null, "image1.jpg" ) );
            metier.ajouterCategorie( new Categorie( "Imprimantes", "imprrrrr", null, "image1.jpg" ) );
            List<Categorie> cts2 = metier.listCategories();
            assertTrue( cts1.size() + 2 == cts2.size() );
        } catch ( Exception e ) {
            assertTrue( e.getMessage(), false );
        }
    }

    @Test
    public void test2() {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( new String[] {
                    "applicationContext.xml" } );
            IAdminCategoriesMetier metier = (IAdminCategoriesMetier) context.getBean( "metier" );
            List<Produit> prods = metier.listproduits();
            metier.ajouterProduit( new Produit( "HP45ERT", "HP7890", 6000, true, "image1.jpg", 50 ), 1L );
            metier.ajouterProduit( new Produit( "AZERTY", "HP7890", 6000, true, "image1.jpg", 50 ), 1L );
            List<Produit> prods2 = metier.listproduits();

            assertTrue( prods.size() + 2 == prods2.size() );
        } catch ( Exception e ) {
            assertTrue( e.getMessage(), false );
        }
    }
}
