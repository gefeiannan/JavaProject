package com.example.dameng.utils;

import com.github.pagehelper.ISelect;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 分页工具类
 */
public class PageUtils {

    /**
     * 统一返回spring Page类
     *
     * @param pageable 分页请求对象
     * @param select   分页查询接口
     * @return {@link Page}
     */
    public static <T> Page<T> startPage(Pageable pageable, ISelect select) {
        PageInfo<T> pageInfo = PageHelper.startPage(pageable.getPageNumber() + 1, pageable.getPageSize())
                .doSelectPageInfo(select);
        return new PageImpl<>(pageInfo.getList(), PageRequest.of(pageInfo.getPageNum() - 1, pageInfo.getPageSize()),
                pageInfo.getTotal());
    }

    /**
     * 统一返回spring Page类
     *
     * @param pageable 分页请求对象
     * @param li   分页对象
     * @return {@link Page}
     */
    public static <T> Page<T> startPage2(Pageable pageable, List<T> li) {
        PageHelper.startPage(pageable.getPageNumber() + 1, pageable.getPageSize());
        PageInfo<T> pageInfo = new PageInfo<>(li);
        return new PageImpl<>(pageInfo.getList(), PageRequest.of(pageInfo.getPageNum() - 1, pageable.getPageSize()),
                pageInfo.getTotal());
    }

}
