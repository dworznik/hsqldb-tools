package functions;

import java.nio.charset.Charset;

/**
 * Created by Patryk Dworznik <patryk@dworznik.com> on 31/12/14.
 */
public class Hex {

    private Hex() {
    }

    public static String hex(String input) {
        return org.apache.commons.codec.binary.Hex.encodeHexString(input.getBytes(Charset.defaultCharset()));
    }
}
