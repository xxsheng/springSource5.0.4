package test.six.six.chapter3;

import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageSource {
	public static void main(String[] args) throws UnsupportedEncodingException {
		// 反码 补码
		// https://blog.csdn.net/csdn_ds/article/details/79106006
		// 带有语言和国家/地区信息的本地化对象
		Locale locale1 = new Locale("zh", "CN");

		// 只有语言类型的本地化化对象
		Locale locale2 = new Locale("zh");

		// 等同于locale1
		Locale locale3 = Locale.CHINA;

		// 等同于locale2
		Locale locale4 = Locale.CHINESE;

		// 获取系统默认的本地化对象
		Locale locale5 = Locale.getDefault();

		System.out.println(locale5);

		String pattern1 = "{0}, 你好！你于{1}在工商银行存入{2}元";
		String pattern2 = "At {1,time,short} on {1,date,short} {0} paied {2,number,currency}.";

		Object [] params = {"John", new GregorianCalendar().getTime(), 1.0E3};

		String format = MessageFormat.format(pattern1, params);

		MessageFormat messageFormat = new MessageFormat(pattern2, Locale.CHINA);

		String format1 = messageFormat.format(params);

		System.out.println(format);
		System.out.println(format1);
		System.out.println(new GregorianCalendar().getTime());
		System.out.println(1.0e3);

		System.out.println(ResourceBundle.getBundle("messages/messages", locale1).getString("test"));
		byte[] gbks = "中文".getBytes("utf-8");
		for (byte gbk : gbks) {
			System.out.println(gbk);
		}
	}
}
