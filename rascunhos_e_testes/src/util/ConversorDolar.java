package util;

public class ConversorDolar {

	public static final double iOF = 0.06;

	public static double converter(double dolares, double cotacao) {
		double conversion = dolares * cotacao * (1 + iOF);
		return conversion;
	}

}
