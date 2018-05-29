package feltech.strixdroidshooter.constructs;
// some technical objects and shiny trinkets will be stores here

/**
 * regular exception, only my own, my precious...
 */
public final class StrixException extends Exception {

    private final static String Declaration = "STRIX_RULES";
    private static final long serialVersionUID = -4496726716603093472L;
    private String code;
    private String msg;

    // Necessary to define de default constructor
    public StrixException() {}

    public StrixException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public StrixException(String msg) {
        this.code = null;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return msg;
    }
}
