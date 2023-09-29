package com.czy.dianping.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czy.dianping.entity.BlogComments;
import com.czy.dianping.mapper.BlogCommentsMapper;
import com.czy.dianping.service.IBlogCommentsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author czy
 * @since 2021-12-22
 */
@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
