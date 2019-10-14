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
*/
