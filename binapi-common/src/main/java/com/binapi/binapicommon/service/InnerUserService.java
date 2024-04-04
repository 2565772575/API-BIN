package com.binapi.binapicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.binapi.binapicommon.model.entity.User;




/**
 * 用户服务
 *
 * @author binapi
 */
public interface InnerUserService {



    /**
     * 数据库中查是否已分配给用户密钥
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);


}
