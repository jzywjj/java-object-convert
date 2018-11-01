import org.junit.Test;

import com.yotexs.convert.util.YotexsDtoConvertUtil;

public class T {

	@Test
	public void test() {
		A a = new A();
		a.setAname("A");
		B b = YotexsDtoConvertUtil.getSingleDestinationObj(a, B.class);
		System.out.println(b);
	}

}
