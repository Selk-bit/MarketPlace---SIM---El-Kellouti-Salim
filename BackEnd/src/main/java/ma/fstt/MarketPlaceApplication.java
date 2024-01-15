package ma.fstt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.fstt.Repository.ArticleRepository;
import ma.fstt.Repository.CategorieRepository;
import ma.fstt.entity.Article;
import ma.fstt.entity.Categorie;
@SpringBootApplication
public class MarketPlaceApplication implements CommandLineRunner {
	@Autowired
	private  CategorieRepository rep;
	@Autowired
	private  ArticleRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(MarketPlaceApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categorie a=new Categorie("VEHICULES");
		Categorie b=new Categorie("INFORMATIQUE ET MULTIMEDIA");

		rep.save(a);
		rep.save(b);

		Article c=new Article("Hyundai ix 35 Diesel",163000,1);
		Article d=new Article("Dacia Logan Diesel Manuelle",148000,1);


		Article g=new Article("PC",6000.0,2);
		Article h=new Article("Iphone X Pro Max",10000.0,2);
		repo.save(c);
		repo.save(d);
		repo.save(g);
		repo.save(h);
	}

}
