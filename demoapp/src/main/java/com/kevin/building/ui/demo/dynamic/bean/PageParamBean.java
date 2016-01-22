package com.kevin.building.ui.demo.dynamic.bean;

import com.kevin.building.ui.demo.dynamic.bean.viewbean.ViewItem;

import java.util.List;

/**
 *
 * 页面完整参数类  该类对应一个完整的动态页面
 * Author:  liangjin.bai
 * Email: bailiangjin@gmail.com
 * Create Time: 2015/12/28 14:23
 */
public class PageParamBean {

    /**
     * 页面基本参数
     */
    private PageInfo pageInfo;

    /**
     * 界面元素列表
     */
    private List<ViewItem> viewItemList;



    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<ViewItem> getViewItemList() {
        return viewItemList;
    }

    public void setViewItemList(List<ViewItem> viewItemList) {
        this.viewItemList = viewItemList;
    }
}