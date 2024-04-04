package com.binapi.binapiclientsdk.Client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.binapi.binapiclientsdk.model.User;

import java.util.HashMap;
import java.util.Map;

import static com.binapi.binapiclientsdk.utils.SignUtils.genSign;

/**
 * @author 陈帅彬
 * @date 2024/3/27 19:59
 */
public class BinApiClient {


    private static final String GATEWAY_HOST = "http://localhost:8090";

    private String accesskey;

    private String secretkey;

    public BinApiClient(String accesskey, String secretkey) {
        this.accesskey = accesskey;
        this.secretkey = secretkey;
    }

    public String getNameByGet(String name) {
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result = HttpUtil.get(GATEWAY_HOST + "/api/name/", paramMap);
        System.out.println(result);
        return result;
    }


    public String getNameByPost(String name) {
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);
        String result = HttpUtil.post(GATEWAY_HOST +"/api/name/", paramMap);
        System.out.println(result);
        return result;
    }




    private Map<String,String> getHeaderMap(String body) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("accesskey",accesskey);
        hashMap.put("nonce", RandomUtil.randomNumbers(5));
        hashMap.put("body",body);
        hashMap.put("timestamp",String.valueOf(System.currentTimeMillis() / 1000));
        hashMap.put("sign",genSign(body,secretkey));
        String nonce = hashMap.get("nonce");
        System.out.println(nonce);
        return hashMap;
    }

    public String getUsernameByPost( User user) {
        String json = JSONUtil.toJsonStr(user);
        HttpResponse httpResponse = HttpRequest.post(GATEWAY_HOST + "/api/name/user")
                .addHeaders(getHeaderMap(json))
                .body(json)
                .execute();
        System.out.println(httpResponse.getStatus());
        return httpResponse.body();

    }
}
