package com.example.dameng.system.mapper;

import com.example.dameng.system.entity.Fonds;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface FondsMapper {
    /**
     * 插入全宗
     *
     * @param fonds 全宗
     */
    void insert(Fonds fonds);

    /**
     * 更新全宗
     *
     * @param fonds 全宗
     */
    void update(Fonds fonds);

    /**
     * 删除全宗
     *
     * @param ids 主键数组
     */
    void deleteByIds(String... ids);

    /**
     * 查找全宗
     *
     * @param id 主键
     * @return 全宗
     */
    Fonds findById(String id);

    /**
     * 查找全宗
     *
     * @param fondscode 全宗名
     * @return 全宗
     */
    Fonds findByFondscode(String fondscode);

    /**
     * 查询全宗列表
     *
     * @return 全宗列表
     */
    List<Fonds> findAll();

    /**
     * 查询全宗列表
     *
     * @param parameters 查询参数
     * @return 全宗列表
     */
    List<Fonds> queryForList(Map<String, Object> parameters);
}
