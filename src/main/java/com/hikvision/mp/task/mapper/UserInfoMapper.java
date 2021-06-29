package com.hikvision.mp.task.mapper;

import com.hikvision.mp.task.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author rpq
 * @since 2021-06-24
 */
public interface UserInfoMapper extends BaseMapper<UserInfo> {


    void selectLimit(int num);
}
