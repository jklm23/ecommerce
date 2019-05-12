package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016092800613555";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCp7acJ/Tc/wG6u9LwT3pNbpG1CFmOOCrG4CC+Mz0v6jfBe5jJ11y6eXl31Li9jOlamMTrXfbZdKHn9PXrLKosMifmEKvpBWpNS1OTEdKxX/XvhvmOBVntJAMFO30/w3UdAdnWrjxYtqHnQbcS9BU06r23RCTEOKxqnCDoO4y1uUYjItU+u5RBz1KSM4Zcak3yg0jCEsVm9wHQZrKqPXSLoouKatTVhYG//gmoU07NAmOzMxgM4q6+2siQrfHd+FPUSMTPCS1rE473CDTkw90IiRAWfMFvf10iHb/1merDj4RBrYicQk2yNKpsuc9SWe00EFjFQu416mjmCpRWpH6N5AgMBAAECggEARQxCYba4qnkBAKqFefVpH0XS95WtYlxKFqOM3sSk9OyUDZuwSV3knYlu2F+p9cIQz3sVk9aLMZNu7k37BW8GDVRLRT9JbSDm2DOVuZZHKYHgwrvgJwADHIjoA6qOCyt+9lysN8fulSLuTJkt5jivRvddwiDgBAfTzqdzH/WD0l024EvWzmZs+gLdsWuMIxXs0TQO7MrSG3+hLuUAPZxf7OivoVACRNJ2tHfsUuQ+Cn4PQI8z7LXxo2+YvsZ+UOIy5QeAgtZDP5yq2SzqlFsIBPn4YeCfesyrop2udHwPlCmpIt6UCUqsiCW1E8uR/B1nlr/Ws/i0XLt76YvUrjbfuQKBgQD5kycAMUjIOS+u6vBspoNUKeESc86MWHeAIUPPqWWuBbM4fgkCnQz3eiwBFkguavzY4TVIZct9OhTwPktt5id+3BGcr5IB5oVQhjuSYFJ5AHkkyv8DIow6q5/OWGaxXZBzXUpbG+Wutx+IKyMilw0lW9NXptAdxfa2p+6bE3xMJwKBgQCuTZUCi06dA3JgqdUKtFYkqomGMCt4OC6p9ndIgJlUEuZ4FbdVnc73e7fha77m9YZL9ZP0heniTJzukr0NmTrjhWjPDqjoYD6Gjm/tDmIug08fs2bq7G9Zdr8UykLy0FgPlPMuTN0PO6Ipvk4o1uM6P2zE5qlj7Nu5GfhiiCU3XwKBgHklGNVbFv055Q9/M11KJo2AFqSiWix99OPZQdVXYOfsFGbjpvQBz/2A7ENK0ZbWkA2mo/qUjwYmX2uOkYazJZDKujHYd4M8ppHD1r7iyqW5uRRHBSo8Zt1D2bqL5q1JwYh+TE2VaRQ6B7BNYCy2Lcdon1n4uyT4px1avtO/zaIZAoGAdswDwk8mDle6De3SeNA+YhElWCLejbpk+4wy8mRLnIShNbk/UggTdpOI2QexfgJbPMwswhy/MnCbCPNUDL+h5k4YB/9q2a43D0hnOn9yJVdzhxykCXuJzMTlKQtNo+aiDkSrlaPniqlPNfoxlR4YkquFu5GmY6ecfcUYiDdYfisCgYA0U5/GRw90POE8eGgGI12NK6PpLYM0NlacFgV+9ra5cQSE9BnlnP6R/4ggarDt+YZKwwblgXpmNw3karwm+FupLvXT46yB7YVd8o4okt7fwvNJUa7ZPBbGkMc4z8x5VvZEr/FbBfGcFqVfl1YFLnJCoLpVMAmlu0qdNibsipNOjQ==";
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxZAJU9+VqDmqDqewj/wU5wf8oaErYBSU4mjnGpcSzAJpVRSSAqGhqjeD9X2ek6dmdoj8AqT6h2Su+qJ2/HvPWfcljne3xtMEV30MilbNh5jWDR8fs3PGQSfco35MA2kM4oC2UvNHP2t41UGB5LToRQx1889omUDfx0pRnGgELfSkoeFP1588ozEkTfmK793yu5/Ha/TolueDxEr3Jb2PiKZf/Q5GeMndpi4A5V648wtRcjfmB2TZaFNemPFvNkYDVutWa1K96rcULqjbLcGx7Fjx88wkfhjnr9sexsqipwBk6OCTTUYfUycTwQG4/TRZVGJN9rRl/tcM5iwXzsd9BQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://u24646n044.zicp.vip/ecommerce/pay/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://u24646n044.zicp.vip/ecommerce/pay/return_url.jsp";

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

