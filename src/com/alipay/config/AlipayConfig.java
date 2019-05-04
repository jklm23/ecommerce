package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092800613555";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCatAu7wX0lKSS/\n" + 
    		"+AlVSuoaTopOgbmjiL5xFbpUgbjI0cKUsjCJSAiv37IGIJobeXqSyLL1hxgPPM1w\n" + 
    		"MkxPCDlFmEom591kI4FpjR07zbiIxcjTYgxGAwES5+c/8S141NgtqGgvFScC/l0g\n" + 
    		"EQERfkRBmCj5/1pkXZEeoaGlXQ6nFfWJvl6fpPnc73XrHx4BK0T/YWpoZjiK0TgW\n" + 
    		"Qi4ih/Su4Et1cKMUw4216Aqg4HrprfOBoGo2ysPobX92eIfuNd7J/TzKWOcN/0Hn\n" + 
    		"b96Z9WIqNY5UtRV+F0P0NBnhs9WQGm8I0+Hxuy9fykBybHD4wt/8DEV/ECL5uLcb\n" + 
    		"a9BUKYBfAgMBAAECggEAVM60y/XTPAblDZPU0fwif89khIsbEGpLNEUcA22ltfk/\n" + 
    		"uTJB51Ak6v0vY6qFsOAUcNkzOeQYLWpAmOwJ5x10ABHvPIrJVDcen5VrXDh3nAsI\n" + 
    		"/9B1OAA3m3yjyerV6bKM2+LBUmY/H6X/uS95LXTRyD+43uu8St78ShWDPtrXyIIn\n" + 
    		"/Lfobz49xyDloHYXUUYcGvG9w/93XXqA6zc4I774sj2dQ+vIKc1QCriV2krowYo2\n" + 
    		"5JM2mCmzo6CUlXJo6RzS55gOUPeFVtEutKjRdzJCj4Kcb5Gp8NadSBXsR/VnSsz/\n" + 
    		"4CE9It3f7088n2icbDgwaqhiFa1dok/3NUhl3tCmiQKBgQDLbh5WAV+Yj52KFbAA\n" + 
    		"132EKXqcHfhcqMZ2Q9EXDjyc1vznuZ0cOKoxtTFg6/4j03cyKf01Do48M6nlT++w\n" + 
    		"DGdYYO/OjxzCLJKvJoGWA4+xpPNJddvtCAerIYOvBKH1VXVEyoVKjJeH7di4oXKl\n" + 
    		"2ORJpCDK7VCrON579kbmdX6UWwKBgQDCrmmUPELg/UuPUe0855JlQelzk7w5JlsP\n" + 
    		"MYC8QABvpCPkx+kwGhaJ7UGbdNHmswFCtVhS7NJIQ9C0XYIfEAvgQOoaSsi42Pgw\n" + 
    		"ENVFnbPv4fYPwVrYw+zSyNGbDfe5KlGFNujsCB9EIoVQrJOkgyVC3Ij6FK8a88vD\n" + 
    		"Lzyeg/ZzTQKBgHrqCC5TGh2l+LwsKnH3wgEOxuR5P01NNMzUYQubMIhbZeflQMaC\n" + 
    		"fmMWZcV4EdA3vzdyI2nhZ5N8a9UAHYSzmeXOfFbEJc40/FQT4gxwDmx5i/4A1mc7\n" + 
    		"iNafo18mX21Ku1ZbP3oxxIT+8wlrk0gd6qGMJ7w0857g95zSyzgIGfktAoGAcfci\n" + 
    		"DUn9qLH+8qZ2J8o0VBxyqlsYu6ftdIZ5IzqgRrqi3IH+y07qVNHUL0oCunedzExW\n" + 
    		"qSzDqNQyL/PxgXemTCAUK1IOEM/K8nBYOUmplUsE/ZImOXDwiTBQK+HQW9AfKsnL\n" + 
    		"LqlOjFddDa4JPCwduvdZJHTJURDY/qj/Zpg/xJ0CgYEAoJsieNqA3/Cgr20mgKQC\n" + 
    		"HY+WhZ2Krhb2pC82r46sog0Z/1ACTzCGe03sUQibcjUaXO9uwydkofW7ys5FEqIF\n" + 
    		"t+SbYpHvUcxy4wi0Y/P8GBVgz/gN8TYYEVyFcM6GNDjzqoS8qFDRk32yBU7q87CF\n" + 
    		"JcIKYItYPb2zoI+CHFG25eA=";
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxZAJU9+VqDmqDqewj/wU5wf8oaErYBSU4mjnGpcSzAJpVRSSAqGhqjeD9X2ek6dmdoj8AqT6h2Su+qJ2/HvPWfcljne3xtMEV30MilbNh5jWDR8fs3PGQSfco35MA2kM4oC2UvNHP2t41UGB5LToRQx1889omUDfx0pRnGgELfSkoeFP1588ozEkTfmK793yu5/Ha/TolueDxEr3Jb2PiKZf/Q5GeMndpi4A5V648wtRcjfmB2TZaFNemPFvNkYDVutWa1K96rcULqjbLcGx7Fjx88wkfhjnr9sexsqipwBk6OCTTUYfUycTwQG4/TRZVGJN9rRl/tcM5iwXzsd9BQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/ecommerce/pay/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/ecommerce/pay/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

