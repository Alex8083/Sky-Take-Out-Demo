package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;


public interface DishService {


    /*
    * 新增菜品和对应的口味
    * */
    public void saveWithFlavor(DishDTO dishDTO);

    /*
     * 菜品分页查询
     * */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);


    /*
    * 菜品的批量删除
    * */
    void deleteBatch(List<Long> ids);

    /*
    * 根据id来查询菜品和口味数据
    * */
    DishVO getByIdWithFlavor(Long id);

    /*
    * 根据id来修改菜品基本信息和关联的口味数据
    * */
    void updateWithFlavor(DishDTO dishDTO);
}
