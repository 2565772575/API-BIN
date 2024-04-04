package com.binapi.binapiclientsdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * 签名工具
 * @author 陈帅彬
 * @date 2024/3/28 22:06
 */
public class SignUtils {


    public static String genSign(String body, String secretkey) {
        Digester md5 = new Digester(DigestAlgorithm.SHA256);
        String content = body + "." + secretkey;
        return md5.digestHex(content);
    }

}
