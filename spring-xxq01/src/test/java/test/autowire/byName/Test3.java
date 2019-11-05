package test.autowire.byName;

import org.springframework.stereotype.Component;
import test.autowire.byName.imp.Imp1;

import java.util.List;

@Component
public class Test3 {

	List<Imp1> test11;
	Test2 test22;

	public void setTest1xx(List<Imp1> test11) {
		this.test11 = test11;
	}

	public void setTest2(Test2 test22) {
		this.test22 = test22;
	}
}
