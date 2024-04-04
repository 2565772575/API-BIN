package com.binapi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.binapi.binapicommon.model.entity.InterfaceInfo;

/**
* @author 25657
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-03-26 10:40:32
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

     void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

}
