package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wj
 * @email 196229640@qq.com
 * @date 2020-03-02 17:43:56
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
