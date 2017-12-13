package com.dabin.ndkone;

/**
 * Created by Dabin on 2017/12/13.
 */

public class NativeHelper {
    static {
        // 加载C代码库, 库的名称, 必须是CMakeLists.txt中指定的名称
        System.loadLibrary("native-lib");
    }

    //获取C中隐藏的AppKey
    public static native String getAppKey();

}
