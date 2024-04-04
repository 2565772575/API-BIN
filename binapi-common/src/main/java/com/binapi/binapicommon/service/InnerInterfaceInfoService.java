package com.binapi.binapicommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.binapi.binapicommon.model.entity.InterfaceInfo;


/**
* @author 25657
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-03-26 10:40:32
*/
public interface InnerInterfaceInfoService {


     /**
      * 从数据库中查询模拟接口是否存在（请求路径，请求方法，请求参数）
      * @param path
      * @param method
      * @return
      */
     InterfaceInfo getInterfaceInfo(String path, String method);



}
