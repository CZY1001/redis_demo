package com.czy.dianping.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czy.dianping.entity.User;
import com.czy.dianping.mapper.UserMapper;
import com.czy.dianping.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author czy
 * @since 2021-12-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
