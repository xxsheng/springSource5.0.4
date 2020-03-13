package test.autowire.byName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import test.autowire.byName.imp.Imp1;

import java.util.List;

@Component
public class Test3 {

	@Autowired
	List<Imp1> test11;
	@Autowired
	Test2 test22;

//	String abc;
//
//	@Value("#{systemProperties.sun.jnu.encoding}")
//	public void setAbc(String abc) {this.abc = abc;}

//	public void setTest1xx(List<Imp1> test11) {
//		this.test11 = test11;
//	}
//
//	public void setTest2(Test2 test22) {
//		this.test22 = test22;
//	}


//	public Test3(List<Imp1> test11, Test2 test22) {
//		this.test11 = test11;
//		this.test22 = test22;
//	}
}
