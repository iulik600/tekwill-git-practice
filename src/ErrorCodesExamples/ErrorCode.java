package ErrorCodesExamples;

public enum ErrorCode {
    INVALID_INPUT(303, "Cod invalid"),
    NOT_FOUND(404, "Negasit"),
    SERVER_ERROR(606, "Eroare server");

    private final int errorcode;
    private final String messagecode;

    ErrorCode(int errorcode, String messagecode) {
        this.errorcode = errorcode;
        this.messagecode = messagecode;
    }

    public int getErrorcode() {
        return errorcode;
    }

    public String getMessagecode() {
        return messagecode;
    }

    // Metoda statica pentru a obbtine eroarea in functie de codul numeric
    public static ErrorCode fromCode(int errorcode) {
        for (ErrorCode error : ErrorCode.values()) {
            if (error.errorcode == errorcode) {
                return error;
            }
        }
        return null; //Daca nu exista un cod potrivit
    }
    public void getUserMessage() {
        System.out.println("Eroare " + errorcode + messagecode);
    }
}
