package com.binapi.binapiclientsdk;

import com.binapi.binapiclientsdk.Client.BinApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 陈帅彬
 * @date 2024/3/27 22:07
 */
@Configuration
@ConfigurationProperties("binapi-client")
@Data
@ComponentScan
public class BinApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public BinApiClient binApiClient() {
        return new BinApiClient(accessKey,secretKey);
    }

}
