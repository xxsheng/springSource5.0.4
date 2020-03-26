package test.autowire.bynameandtype;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test.autowire.bynameandtype.imp.Imp1;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Component
public class Test3 extends AbstractClassTest implements BeanFactoryAware {

//	@Autowired
	List<Imp1> test11;
//	@Autowired
	Test2 test22;

	@Autowired
	HttpServletRequest httpServletRequest;

//	String abc;
//
//	@Value("#{systemProperties.sun.jnu.encoding}")
//	public void setAbc(String abc) {this.abc = abc;}


	public Test3() {
		System.out.println("------");
	}

	public void setTest1xx(List<Imp1> test11) {
		this.test11 = test11;
	}

	public void setTest2(Test2 test22) {
		this.test22 = test22;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(beanFactory);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("----");
	}


//	public Test3(List<Imp1> test11, Test2 test22) {
//		this.test11 = test11;
//		this.test22 = test22;
//	}
}
