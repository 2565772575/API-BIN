package com.binapi.binapiinterface.Controller;


import com.binapi.binapiclientsdk.model.User;
import com.binapi.binapiclientsdk.utils.SignUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 陈帅彬
 * @date 2024/3/27 19:27
 * 名称API
 */

@RestController
@RequestMapping("/name")
public class NameController {


    @GetMapping("/get")
    public String getNameByGet(String name) {
        return "GET 你的名字是" + name;
    }

    @PostMapping("/post")
    public String getNameByPost(@RequestParam String name) {
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request) {
//        String accesskey = request.getHeader("accesskey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//        if (!accesskey.equals("binapi")) {
//            throw new RuntimeException("无权限");
//        }
//        if (Long.parseLong(nonce) > 100000) {
//            System.out.println(nonce);
//            throw new RuntimeException("无权限");
//        }
//        // 时间不能超过5分钟
//
//        String serverSign = SignUtils.genSign(body, "12345678");
//        if (!sign.equals(serverSign)) {
//            throw new RuntimeException("无权限");
//        }
        return "POST 用户名字是" + user.getUsername();
    }

}
