package sample.di.business.mock;
import sample.di.business.domain.*;
import sample.di.business.service.*;

import org.springframework.stereotype.Component;

@Component
public class MockDao implements ProductDao {

	String str;
	int i ;

	public Product findProduct(String name) {
		Product pr = new Product(str,i);
		return pr;
	}

}
