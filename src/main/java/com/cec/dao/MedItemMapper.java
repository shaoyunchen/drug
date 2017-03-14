package com.cec.dao;

import com.cec.entity.MedItem;
import com.cec.entity.MedItemExample;
import com.cec.entity.MedItemWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedItemMapper {
    int countByExample(MedItemExample example);

    int deleteByExample(MedItemExample example);

    int deleteByPrimaryKey(String itemId);

    int insert(MedItemWithBLOBs record);

    int insertSelective(MedItemWithBLOBs record);

    List<MedItemWithBLOBs> selectByExampleWithBLOBs(MedItemExample example);

    List<MedItem> selectByExample(MedItemExample example);

    MedItemWithBLOBs selectByPrimaryKey(String itemId);

    int updateByExampleSelective(@Param("record") MedItemWithBLOBs record, @Param("example") MedItemExample example);

    int updateByExampleWithBLOBs(@Param("record") MedItemWithBLOBs record, @Param("example") MedItemExample example);

    int updateByExample(@Param("record") MedItem record, @Param("example") MedItemExample example);

    int updateByPrimaryKeySelective(MedItemWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MedItemWithBLOBs record);

    int updateByPrimaryKey(MedItem record);
}