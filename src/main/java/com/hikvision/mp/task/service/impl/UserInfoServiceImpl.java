package com.hikvision.mp.task.service.impl;

import com.hikvision.mp.task.entity.UserInfo;
import com.hikvision.mp.task.mapper.UserInfoMapper;
import com.hikvision.mp.task.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author rpq
 * @since 2021-06-24
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
