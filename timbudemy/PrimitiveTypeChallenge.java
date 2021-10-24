package timbudemy;

public class PrimitiveTypeChallenge {

	public static void main(String[] args) {
		byte byteNum = Byte.MAX_VALUE;
		int intNum = Integer.MAX_VALUE;
		short shortNum = Short.MAX_VALUE;

		long longNum = (50000L) + 10L * (byteNum + intNum + shortNum);
		System.out.println(longNum);

		short totalNum = (short) (byteNum + intNum + shortNum);
		System.out.println(totalNum);
	}

}
