package com.huatong.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TransSqlDateTime {
    public static String getSqlDatetime(Timestamp dateTime){

        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return sdf.format(dateTime);
    }
}
