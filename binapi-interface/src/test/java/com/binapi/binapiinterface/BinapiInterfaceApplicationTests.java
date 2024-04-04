package com.binapi.binapiinterface;

import com.binapi.binapiclientsdk.Client.BinApiClient;
import com.binapi.binapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class BinapiInterfaceApplicationTests {

    @Resource
    private BinApiClient binApiClient;

    @Test
    void contextLoads() {
        String result = binApiClient.getNameByGet("binapi");
        User user = new User();
        user.setUsername("binapi");
        String usernameByPost = binApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);

    }

}
