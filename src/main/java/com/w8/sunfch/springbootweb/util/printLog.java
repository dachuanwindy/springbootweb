package com.w8.sunfch.springbootweb.util;

import java.io.PrintWriter;
import java.io.StringWriter;

public class printLog {


    public static String getExptionLog(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);

        return pw.toString();
    }
}
