public class Typecasting {

  public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        System.out.println("Implicit Typecasting:");
        System.out.println("Byte to Short: " + shortValue);
        System.out.println("Short to Int: " + intValue);
        System.out.println("Int to Long: " + longValue);
        System.out.println("Long to Float: " + floatValue);
        System.out.println("Float to Double: " + doubleValue);

        double doubleNum = 123.456;
        float floatNum = (float) doubleNum;
        long longNum = (long) floatNum;
        int intNum = (int) longNum;
        short shortNum = (short) intNum;
        byte byteNum = (byte) shortNum;

        System.out.println("Explicit Typecasting:");
        System.out.println("Double to Float: " + floatNum);
        System.out.println("Float to Long: " + longNum);
        System.out.println("Long to Int: " + intNum);
        System.out.println("Int to Short: " + shortNum);
        System.out.println("Short to Byte: " + byteNum);

        char charValue = 'A';
        int asciiValue = charValue;
        char charFromInt = (char) 66;

        System.out.println("\nChar Typecasting:");
        System.out.println("Char to Int (ASCII): " + asciiValue);
        System.out.println("Int to Char: " + charFromInt);

        String stringNum = "123";
        int stringToInt = Integer.parseInt(stringNum);
        double stringToDouble = Double.parseDouble("456.78");
        String intToString = String.valueOf(789);
        String doubleToString = Double.toString(123.45);

        System.out.println("\nString Typecasting:");
        System.out.println("String to Int: " + stringToInt);
        System.out.println("String to Double: " + stringToDouble);
        System.out.println("Int to String: " + intToString);
        System.out.println("Double to String: " + doubleToString);

        double largeDouble = 12345.6789;
        int truncatedInt = (int) largeDouble;
        byte overflowByte = (byte) 130;

        System.out.println("\nData Loss Examples:");
        System.out.println("Double to Int (Truncation): " + truncatedInt);
        System.out.println("Int to Byte (Overflow): " + overflowByte);
    }
  
}
