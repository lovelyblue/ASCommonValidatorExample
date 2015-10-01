package com.example.lovelyblue.ascommonvalidatorexample.Commons;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by C120972108 on 2015/10/1.
 */
public class ValidatorClass {
    public static boolean isStringAsCommaEra(String value)
    {
        boolean result = true;
        Calendar calendar = Calendar.getInstance();
        if (value.length() != 8)
        {
            return false;
        }
        try {
            String year = value.substring(0,4);
            String month = value.substring(4, 6);
            String day = value.substring(6, 8);
            SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
            String inputtedYMD = year + "/" + month + "/" + day;
            calendar.setTime(df.parse(year + "/" + month + "/" + day));
            String strConvertedYMD = df.format(calendar.getTime());
            if (!inputtedYMD.equalsIgnoreCase(strConvertedYMD))
            {return false;}
        }catch (Exception exp){
            Log.e("error", "Message"+exp.getMessage());
            return false;
        }
        return result;
    }
}
