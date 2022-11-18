import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Javadoc me
 */
public class BaseConverter {
    private final String DIGITS = "0123456789ABCDEF";
    /**
     * Convert a String num in fromBase to base-10 int.
     * @param num the original number
     * @param fromBase the original from base
     * @return a base-10 int of num base fromBase
     */
    public int strToInt(String num, String fromBase)    {
        // "FF" "16"
        int value = 0, decimalBase;
        // Do i need a try here?
        decimalBase = Integer.parseInt(fromBase);

        return value;
    }

    /**
     * Javadoc me
     * @param num
     * @param toBase
     * @return
     */
    public String intToStr(int num, int toBase) {
        String toNum = new String();

        return toNum;
    }

    /**
     * Javadoc me
     */
    public void inputConvertPrintWrite()    {
        Scanner in = null;
        PrintWriter out = null;
    }

    /**
     * Javadoc me
     * @param args
     */
    public static void main(String[] args) {
        BaseConverter bc = new BaseConverter();
        bc.inputConvertPrintWrite();
    }
}
