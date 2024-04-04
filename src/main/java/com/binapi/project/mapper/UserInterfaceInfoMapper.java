package com.binapi.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.binapi.binapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author 25657
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2024-03-30 20:27:31
* @Entity com.binapi.project.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);

}




