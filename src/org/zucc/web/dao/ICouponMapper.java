package org.zucc.web.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.zucc.web.entity.ICoupon;
import org.zucc.web.entity.ICouponExample;

public interface ICouponMapper {
    int countByExample(ICouponExample example);

    int deleteByExample(ICouponExample example);

    int deleteByPrimaryKey(Long couponid);

    int insert(ICoupon record);

    int insertSelective(ICoupon record);

    List<ICoupon> selectByExample(ICouponExample example);

    ICoupon selectByPrimaryKey(Long couponid);

    int updateByExampleSelective(@Param("record") ICoupon record, @Param("example") ICouponExample example);

    int updateByExample(@Param("record") ICoupon record, @Param("example") ICouponExample example);

    int updateByPrimaryKeySelective(ICoupon record);

    int updateByPrimaryKey(ICoupon record);
}