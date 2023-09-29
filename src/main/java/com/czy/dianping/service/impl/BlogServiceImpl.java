package com.czy.dianping.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czy.dianping.entity.Blog;
import com.czy.dianping.mapper.BlogMapper;
import com.czy.dianping.service.IBlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
