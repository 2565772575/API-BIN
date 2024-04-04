package com.binapi.binapicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.binapi.binapicommon.model.entity.UserInterfaceInfo;

/**
 * @author 25657
 * @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
 * @createDate 2024-03-30 20:27:31
 */
public interface InnerUserInterfaceInfoService {



    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
