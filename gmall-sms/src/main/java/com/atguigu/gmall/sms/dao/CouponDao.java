package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wj
 * @email 196229640@qq.com
 * @date 2020-03-02 18:53:57
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
