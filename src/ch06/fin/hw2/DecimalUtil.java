package ch06.fin.hw2;

import java.text.*;

public class DecimalUtil {

	/**
	 * 3자리마다 콤마를 찍는다.
	 * DecimalUtil.decimalComma
	 * @param input 숫자
	 * @return
	 */
	public static String decimalComma(int input) {
		DecimalFormat df = new DecimalFormat("#,##0");
		String result = df.format(input);
		return result;
	}

}
