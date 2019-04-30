package sample.di.business.service;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import sample.di.business.domain.Product;
import sample.di.business.service.ProductDao;

@Repository
public class ProductDaoImpl implements ProductDao {
	//ＤＢアクセスは省略
	public Product findProduct(String name) {
		//本当は、BDから取ってきたものがセットされる
		//今回はＤＢアクセス省略のため、固定値を送ることにする。
		return new Product(name,100);
	}
	

}
