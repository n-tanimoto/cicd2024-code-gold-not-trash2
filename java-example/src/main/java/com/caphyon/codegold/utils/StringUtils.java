package com.caphyon.codegold.utils;

public class StringUtils {

    public static boolean StartsWith(String aString, String aSubstring) {
    if (aSubstring.length() > aString.length())
    {
        return false;
    }

return aString.regionMatches(true, 0, aSubstring, 0, aSubstring.length());
}

    public static String Substring(String aValue, int aBeginIndex)

    {
        return aValue.substring(aBeginIndex);
    }

    public static String Substring(String aValue, int aBeginIndex, int aEndIndex)
    {
        if(aEndIndex > 0) {
            return aValue.substring(aBeginIndex);
        } else {
            return aValue.substring(aBeginIndex, aEndIndex);
        }
    }


    private int m_unuse;
    public static String getVersion(String service) {
        if (service != null && service.length() > 0) {
            int i = service.lastIndexOf(':');
            if (i >= 0) {
                return service.substring(i + 1);
            }
        }
        return null;
    }

}
