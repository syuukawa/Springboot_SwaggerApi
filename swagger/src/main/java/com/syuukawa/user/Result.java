package com.syuukawa.user;

/** 
* <p>ClassName: Result</p>
* <p>Company: 指点无限(北京)科技有限公司   http://www.zhidianwuxian.cn</p>
* <p>Description: 这里用一句话描述这个方法的作用</p>
* <p>author zhouhe</p>
* <p>date 2017/3/17 15:07</p>
*/
public enum Result {
    SUCCESS(0, "SUCCESS"),
    FAIL(1, "FAIL");

    public final int code;
    public final String message;

    Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
