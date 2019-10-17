package test.circularReferences;
/*
* 1、构造器循环依赖
* 表示通过构造器注入构成的循环依赖，此依赖是无法解决的，只能抛出BeanCurrentlyInCreationException异常表示循环依赖。
*
* 如在创建TestA类时，构造器需要TestB类，那将去创建TestB，在创建TestB类时又发现需要TestC类，则又去创建TestC，最终在创建TestC时发现又需要TestA，从而形成一个环，
* 则没办法创建
*
* spring容器将每一个正在创建的bean标识符放在一个"当前创建bean池"中，bean标识符在创建过程中将一直保持在这个池中，因此如果在创建bean过程中发现自己已经在"当前创建bean池"
* 里时，将抛出BeanCurrentInCreationException异常表示循环依赖，而对于创建完毕的bean将从"当前创建bean池"中清除掉
*
*  1)spring容器创建 “testA” bean，首先去 “当前创建bean池” 查找是否当前bean正在创建，如果没发现，则继续准备其需要的构造器参数 “testB”，并将
* “testA”标识符放到 “当前创建bean池”
*  2)spring容器创建 “testB” bean，首先去 “当前创建bean池” 查找是否当前bean正在创建，如果没发现，则继续准备其需要的构造器参数 “testC”，并将
* “testB”标识符放到 “当前创建bean池”
*  3)spring容器创建 “testC” bean，首先去 “当前创建bean池” 查找是否当前bean正在创建，如果没发现，则继续准备其需要的构造器参数 “testA”，并将
* “testC”标识符放到 “当前创建bean池”
*  4)到此为止spring容器要去创建 “testA”bean，发现该bean标识符在 “当前创建bean池”中，因为表示循环依赖，抛出BeanCurrentlyInCreationException
*
*
* 2、setter循环依赖
* 	表示通过setter注入方式构成的循环依赖。对于setter注入造成的依赖是由spring容器提前暴露刚完成构造器注入但未完成其他步骤（如setter注入）
* 的bean来完成的，而且只能解决单例作用域的bean循环依赖。通过提前暴露一个单例工厂方法，从而使其他的bean能引用到该bean，如下代码所示:
*
* 	addSingletonFactory(beanName, () -> getEarlyBeanReference(beanName, mbd, bean));
*
* 具体步骤如下。
* 1) spring容器创建单例 “testA” bean, 首先根据无参构造器创建bean，并暴露一个 “ObjectFactory”，用于返回一个提前暴露一个创建中的bean
* 并将 “testA”标识符放到 “当前创建bean池”，然后进行setter注入“testB”
* 2) spring容器创建单例 “testB” bean, 首先根据无参构造器创建bean，并暴露一个 “ObjectFactory”，用于返回一个提前暴露一个创建中的bean
* 并将 “testB”标识符放到 “当前创建bean池”，然后进行setter注入“testC”
* 3) spring容器创建单例 “testC” bean, 首先根据无参构造器创建bean，并暴露一个 “ObjectFactory”，用于返回一个提前暴露一个创建中的bean
* 并将 “testC”标识符放到 “当前创建bean池”，然后进行setter注入“testA”
* 4) 最后在依赖注入 “testB” 和 “testA”，完成setter注入
*
*3、prototype范围的依赖处理
* 	对于 “prototype” 作用域bean，spring容器无法完成依赖注入，因为spring容器不进行缓存 “prototype”作用域的bean，因此无法提前暴露一个创建中的bean。示例如下：
*
*
*/
