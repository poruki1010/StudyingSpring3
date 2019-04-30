package sample.di.business.service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import sample.di.business.domain.Product;

//@Component
@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	//Autowiredの宣言があるインスタンス変数に、bean定義ファイルで決めたscan範囲から、代入できるクラスを拾ってきてくれる。
	//今回の場合は、(ProductDaoをimplementsした)ProductDaoImpleクラスが代入される。
	//このやり方は、byTypeという。
	//applicationContextで設定したscan範囲に、代入可能なクラス（=ProductDaoをimplementしたクラス）が複数あると、エラーになる。
	//回避方法としては、DIしたくないクラスにはComponentsつけない、@Qualifierを使ってbyName参照とする、applicationContextのscan範囲を変えるなど。
	//【同じパッケージにあったら、Qualifier使うしかないのか？)
	//これまでは当該クラスをnewする感じだったのが、DIの働きでセットされる感じか。
	//なおprivate定義でも、setterはいらない。（カプセル化には違反するけど、便利なんで…慣例的に許されている模様。）
	private ProductDao productDao;
	
	public Product findProduct() {
		return productDao.findProduct("ステープル");
	}

}
