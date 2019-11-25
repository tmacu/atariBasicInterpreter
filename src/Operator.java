public enum Operator {
    MULTIPLY,
    DIVIDE,
    MINUS,
    PLUS,
    POWER,
    EQUAL,
    NOTEQUAL,
    LESSTHAN,
    GREATERTHAN,
    LESSTHANOREQUAL,
    GREATERTHANOREQUAL,
    ERROROP,
    INT,
    SGN,
    SQR,
    ABS,
    CLOG,
    LOG,
    EXP,
    SIN,
    COS,
    NOT,
    AND,
    OR;



    public static Operator fromInt(int value) {
        switch(value) {
            case 12:
                return INT;
            case 13:
                return SGN;
            case 14:
                return SQR;
            case 15:
                return ABS;
            case 16:
                return CLOG;
            case 17:
                return LOG;
            case 18:
                return EXP;
            case 19:
                return SIN;
            case 20:
                return COS;
            case 23:
                return NOT;
            case 24:
                return AND;
            case 25:
                return OR;
            case 34:
                return EQUAL;
            case 37:
                return POWER;
            case 38:
                return MULTIPLY;
            case 39:
                return DIVIDE;
            case 40:
                return MINUS;
            case 41:
                return PLUS;
            case 42:
                return NOTEQUAL;
            case 43:
                return GREATERTHANOREQUAL;
            case 44:
                return LESSTHANOREQUAL;
            case 45:
                return GREATERTHAN;
            case 46:
                return LESSTHAN;
            default:
                return ERROROP;
        }
   }
}
