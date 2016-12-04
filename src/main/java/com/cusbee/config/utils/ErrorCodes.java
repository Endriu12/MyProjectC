package com.cusbee.config.utils;

public class ErrorCodes {

    public interface Common {
        int EMPTY_REQUEST = 1000;
        int EMPTY_REQUEST_ID = 1001;
        int NOT_EXIST = 1002;
        int INVALID_REQUEST = 1003;
        int KEY_CANNOT_BE_EMPTY = 1004;
        int NO_MAPPING_EXISTS = 1005;
        int INVALID_DATE_FORMAT = 1006;
    }

    public interface User {
        int INVALID_AUTHORITY = 2000;
        int EMPTY_FIELDS = 2001;
        int ALREADY_EXIST = 2002;
        int BAD_REQUEST = 2003;
        int USER_UNAVAILABLE = 2004;
        int INVALID_EMAIL = 2005;
        int IVALID_FIRST_OR_LAST_NAME = 2006;
        int INVALID_USERNAME = 2007;
        int INVALID_PASSWORD = 2008;
        int WRONG_OLD_PASSWORD = 2009;
    }

    public interface Developer {
        int INVALID_DEVELOPER = 3000;

    }

}
