package com.czy.dianping.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czy.dianping.dto.Result;
import com.czy.dianping.entity.Voucher;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author czy
 * @since 2021-12-22
 */
public interface IVoucherService extends IService<Voucher> {

    Result queryVoucherOfShop(Long shopId);

    void addSeckillVoucher(Voucher voucher);
}
