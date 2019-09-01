package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式化转换
 * */

public class DateTest {	
	
	public static void main(String[] args) throws ParseException {

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String time = sdf.format(date);
		System.out.println(time);
		
		String birthday = "2000-12-26 11:29:08";
		//按照模板上的格式进行输入
		Date date2 = sdf.parse(birthday);
		
		System.out.println(date2);
		
		
	}

}
