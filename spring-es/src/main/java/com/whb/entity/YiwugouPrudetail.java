package com.whb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


import javax.persistence.Column;
import java.util.Date;


@Document(indexName="iengchen",type="product")
public class YiwugouPrudetail {
    /**
     * tid
     */
    @Id
    private String tid;

    /**
     * id
     */


    /**
     * 售卖类型
     */
    private String sellType;

    /**
     * 标题
     */
    private String title;

    /**
     * 商品编码
     */
    private String goodsCode;

    /**
     * 商品标语
     */
    private String goodsflag;

    /**
     * 图片1
     */
    private String picture1;

    /**
     * 图片2
     */
    private String picture2;

    /**
     * 图片3
     */
    private String picture3;

    /**
     * 度量标准
     */
    private String metric;

    /**
     * 售品编号
     */
    @Column(name = "SALE_NUMBER")
    private Long saleNumber;

    /**
     * 运费
     */
    private Integer freight;

    /**
     * 价格类型
     */
    private String priceType;

    /**
     * 免费检验
     */
    private Integer freedelivery;

    /**
     * 商品模型
     */
    private String productMode;

    /**
     * 售卖标语
     */
    private String sellFlag;

    /**
     * 运费模板
     */
    private String freightTemplateId;

    /**
     * 市场代码
     */
    private Integer marketCode;

    /**
     * 标签
     */
    private String tags;

    /**
     * 出售价格
     */
    private Long sellPrice;

    /**
     * 价格
     */
    private String picture;

    /**
     * 是否退款
     */
    private String isRefund;

    private String weightetc;

    /**
     * 虚拟的
     */
    private String isVirtual;

    /**
     * 内部类型
     */
    private Integer innertype;

    /**
     * 开始编码
     */
    private Integer startNumber;

    /**
     * 交易承诺
     */
    private String deliveryPromise;

    private String orderStockinstruction;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 价格单位
     */
    private String unitprice;

    /**
     * bbsid
     */
    private Integer bbsId;

    /**
     * 视频
     */
    private String video;

    /**
     * 总额
     */
    private String totalprice;

    /**
     * 小码
     */
    private Integer smallnum;

    /**
     * 出售产品总计
     */
    private Integer productSelltotal;

    /**
     * 出售标语
     */
    private String sellflag;

    /**
     * 删除标语
     */
    private Short deletedFlag;

    /**
     * 开始时间
     */
    private Date createdTime;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 增加
     */
    private Integer createdBy;

    /**
     * 修改
     */
    private Integer updatedBy;

    /**
     * 语言
     */
    private Short language;

    private String category;

    /**
     * 店铺编号
     */
    private String shopId;

    private Date realUpdateTime;

    private String updateTime;

    /**
     * 简介
     */
    private String introduction;

    /**
     * 详情
     */
    private String detaill;

    /**
     * 产品图片
     */
    private String sdiProductsPiclist;

    /**
     * 产品价格
     */
    private String sdiProductsPricelist;

    /**
     * 产品属性列表
     */
    private String productPropertySkuBoList;

    /**
     * 性能清单
     */
    private String propertyList;

    /**
     * 获取tid
     *
     * @return TID - tid
     */
    public String getTid() {
        return tid;
    }

    /**
     * 设置tid
     *
     * @param tid tid
     */
    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }



    /**
     * 设置id
     *
     * @param id id
     */

    /**
     * 获取售卖类型
     *
     * @return SELL_TYPE - 售卖类型
     */
    public String getSellType() {
        return sellType;
    }

    /**
     * 设置售卖类型
     *
     * @param sellType 售卖类型
     */
    public void setSellType(String sellType) {
        this.sellType = sellType == null ? null : sellType.trim();
    }

    /**
     * 获取标题
     *
     * @return TITLE - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取商品编码
     *
     * @return GOODS_CODE - 商品编码
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /**
     * 设置商品编码
     *
     * @param goodsCode 商品编码
     */
    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    /**
     * 获取商品标语
     *
     * @return GOODSFLAG - 商品标语
     */
    public String getGoodsflag() {
        return goodsflag;
    }

    /**
     * 设置商品标语
     *
     * @param goodsflag 商品标语
     */
    public void setGoodsflag(String goodsflag) {
        this.goodsflag = goodsflag == null ? null : goodsflag.trim();
    }

    /**
     * 获取图片1
     *
     * @return PICTURE1 - 图片1
     */
    public String getPicture1() {
        return picture1;
    }

    /**
     * 设置图片1
     *
     * @param picture1 图片1
     */
    public void setPicture1(String picture1) {
        this.picture1 = picture1 == null ? null : picture1.trim();
    }

    /**
     * 获取图片2
     *
     * @return PICTURE2 - 图片2
     */
    public String getPicture2() {
        return picture2;
    }

    /**
     * 设置图片2
     *
     * @param picture2 图片2
     */
    public void setPicture2(String picture2) {
        this.picture2 = picture2 == null ? null : picture2.trim();
    }

    /**
     * 获取图片3
     *
     * @return PICTURE3 - 图片3
     */
    public String getPicture3() {
        return picture3;
    }

    /**
     * 设置图片3
     *
     * @param picture3 图片3
     */
    public void setPicture3(String picture3) {
        this.picture3 = picture3 == null ? null : picture3.trim();
    }

    /**
     * 获取度量标准
     *
     * @return METRIC - 度量标准
     */
    public String getMetric() {
        return metric;
    }

    /**
     * 设置度量标准
     *
     * @param metric 度量标准
     */
    public void setMetric(String metric) {
        this.metric = metric == null ? null : metric.trim();
    }

    /**
     * 获取售品编号
     *
     * @return SALE_NUMBER - 售品编号
     */
    public Long getSaleNumber() {
        return saleNumber;
    }

    /**
     * 设置售品编号
     *
     * @param saleNumber 售品编号
     */
    public void setSaleNumber(Long saleNumber) {
        this.saleNumber = saleNumber;
    }

    /**
     * 获取运费
     *
     * @return FREIGHT - 运费
     */
    public Integer getFreight() {
        return freight;
    }

    /**
     * 设置运费
     *
     * @param freight 运费
     */
    public void setFreight(Integer freight) {
        this.freight = freight;
    }

    /**
     * 获取价格类型
     *
     * @return PRICE_TYPE - 价格类型
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * 设置价格类型
     *
     * @param priceType 价格类型
     */
    public void setPriceType(String priceType) {
        this.priceType = priceType == null ? null : priceType.trim();
    }

    /**
     * 获取免费检验
     *
     * @return FREEDELIVERY - 免费检验
     */
    public Integer getFreedelivery() {
        return freedelivery;
    }

    /**
     * 设置免费检验
     *
     * @param freedelivery 免费检验
     */
    public void setFreedelivery(Integer freedelivery) {
        this.freedelivery = freedelivery;
    }

    /**
     * 获取商品模型
     *
     * @return PRODUCT_MODE - 商品模型
     */
    public String getProductMode() {
        return productMode;
    }

    /**
     * 设置商品模型
     *
     * @param productMode 商品模型
     */
    public void setProductMode(String productMode) {
        this.productMode = productMode == null ? null : productMode.trim();
    }

    /**
     * 获取售卖标语
     *
     * @return SELL_FLAG - 售卖标语
     */
    public String getSellFlag() {
        return sellFlag;
    }

    /**
     * 设置售卖标语
     *
     * @param sellFlag 售卖标语
     */
    public void setSellFlag(String sellFlag) {
        this.sellFlag = sellFlag == null ? null : sellFlag.trim();
    }

    /**
     * 获取运费模板
     *
     * @return FREIGHT_TEMPLATE_ID - 运费模板
     */
    public String getFreightTemplateId() {
        return freightTemplateId;
    }

    /**
     * 设置运费模板
     *
     * @param freightTemplateId 运费模板
     */
    public void setFreightTemplateId(String freightTemplateId) {
        this.freightTemplateId = freightTemplateId == null ? null : freightTemplateId.trim();
    }

    /**
     * 获取市场代码
     *
     * @return MARKET_CODE - 市场代码
     */
    public Integer getMarketCode() {
        return marketCode;
    }

    /**
     * 设置市场代码
     *
     * @param marketCode 市场代码
     */
    public void setMarketCode(Integer marketCode) {
        this.marketCode = marketCode;
    }

    /**
     * 获取标签
     *
     * @return TAGS - 标签
     */
    public String getTags() {
        return tags;
    }

    /**
     * 设置标签
     *
     * @param tags 标签
     */
    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    /**
     * 获取出售价格
     *
     * @return SELL_PRICE - 出售价格
     */
    public Long getSellPrice() {
        return sellPrice;
    }

    /**
     * 设置出售价格
     *
     * @param sellPrice 出售价格
     */
    public void setSellPrice(Long sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * 获取价格
     *
     * @return PICTURE - 价格
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置价格
     *
     * @param picture 价格
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    /**
     * 获取是否退款
     *
     * @return IS_REFUND - 是否退款
     */
    public String getIsRefund() {
        return isRefund;
    }

    /**
     * 设置是否退款
     *
     * @param isRefund 是否退款
     */
    public void setIsRefund(String isRefund) {
        this.isRefund = isRefund == null ? null : isRefund.trim();
    }

    /**
     * @return WEIGHTETC
     */
    public String getWeightetc() {
        return weightetc;
    }

    /**
     * @param weightetc
     */
    public void setWeightetc(String weightetc) {
        this.weightetc = weightetc == null ? null : weightetc.trim();
    }

    /**
     * 获取虚拟的
     *
     * @return IS_VIRTUAL - 虚拟的
     */
    public String getIsVirtual() {
        return isVirtual;
    }

    /**
     * 设置虚拟的
     *
     * @param isVirtual 虚拟的
     */
    public void setIsVirtual(String isVirtual) {
        this.isVirtual = isVirtual == null ? null : isVirtual.trim();
    }

    /**
     * 获取内部类型
     *
     * @return INNERTYPE - 内部类型
     */
    public Integer getInnertype() {
        return innertype;
    }

    /**
     * 设置内部类型
     *
     * @param innertype 内部类型
     */
    public void setInnertype(Integer innertype) {
        this.innertype = innertype;
    }

    /**
     * 获取开始编码
     *
     * @return START_NUMBER - 开始编码
     */
    public Integer getStartNumber() {
        return startNumber;
    }

    /**
     * 设置开始编码
     *
     * @param startNumber 开始编码
     */
    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    /**
     * 获取交易承诺
     *
     * @return DELIVERY_PROMISE - 交易承诺
     */
    public String getDeliveryPromise() {
        return deliveryPromise;
    }

    /**
     * 设置交易承诺
     *
     * @param deliveryPromise 交易承诺
     */
    public void setDeliveryPromise(String deliveryPromise) {
        this.deliveryPromise = deliveryPromise == null ? null : deliveryPromise.trim();
    }

    /**
     * @return ORDER_STOCKINSTRUCTION
     */
    public String getOrderStockinstruction() {
        return orderStockinstruction;
    }

    /**
     * @param orderStockinstruction
     */
    public void setOrderStockinstruction(String orderStockinstruction) {
        this.orderStockinstruction = orderStockinstruction == null ? null : orderStockinstruction.trim();
    }

    /**
     * 获取用户id
     *
     * @return USER_ID - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 获取价格单位
     *
     * @return UNITPRICE - 价格单位
     */
    public String getUnitprice() {
        return unitprice;
    }

    /**
     * 设置价格单位
     *
     * @param unitprice 价格单位
     */
    public void setUnitprice(String unitprice) {
        this.unitprice = unitprice == null ? null : unitprice.trim();
    }

    /**
     * 获取bbsid
     *
     * @return BBS_ID - bbsid
     */
    public Integer getBbsId() {
        return bbsId;
    }

    /**
     * 设置bbsid
     *
     * @param bbsId bbsid
     */
    public void setBbsId(Integer bbsId) {
        this.bbsId = bbsId;
    }

    /**
     * 获取视频
     *
     * @return VIDEO - 视频
     */
    public String getVideo() {
        return video;
    }

    /**
     * 设置视频
     *
     * @param video 视频
     */
    public void setVideo(String video) {
        this.video = video == null ? null : video.trim();
    }

    /**
     * 获取总额
     *
     * @return TOTALPRICE - 总额
     */
    public String getTotalprice() {
        return totalprice;
    }

    /**
     * 设置总额
     *
     * @param totalprice 总额
     */
    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice == null ? null : totalprice.trim();
    }

    /**
     * 获取小码
     *
     * @return SMALLNUM - 小码
     */
    public Integer getSmallnum() {
        return smallnum;
    }

    /**
     * 设置小码
     *
     * @param smallnum 小码
     */
    public void setSmallnum(Integer smallnum) {
        this.smallnum = smallnum;
    }

    /**
     * 获取出售产品总计
     *
     * @return PRODUCT_SELLTOTAL - 出售产品总计
     */
    public Integer getProductSelltotal() {
        return productSelltotal;
    }

    /**
     * 设置出售产品总计
     *
     * @param productSelltotal 出售产品总计
     */
    public void setProductSelltotal(Integer productSelltotal) {
        this.productSelltotal = productSelltotal;
    }

    /**
     * 获取出售标语
     *
     * @return SELLFLAG - 出售标语
     */
    public String getSellflag() {
        return sellflag;
    }

    /**
     * 设置出售标语
     *
     * @param sellflag 出售标语
     */
    public void setSellflag(String sellflag) {
        this.sellflag = sellflag == null ? null : sellflag.trim();
    }

    /**
     * 获取删除标语
     *
     * @return DELETED_FLAG - 删除标语
     */
    public Short getDeletedFlag() {
        return deletedFlag;
    }

    /**
     * 设置删除标语
     *
     * @param deletedFlag 删除标语
     */
    public void setDeletedFlag(Short deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    /**
     * 获取开始时间
     *
     * @return CREATED_TIME - 开始时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置开始时间
     *
     * @param createdTime 开始时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATED_TIME - 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 获取增加
     *
     * @return CREATED_BY - 增加
     */
    public Integer getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置增加
     *
     * @param createdBy 增加
     */
    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取修改
     *
     * @return UPDATED_BY - 修改
     */
    public Integer getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置修改
     *
     * @param updatedBy 修改
     */
    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * 获取语言
     *
     * @return LANGUAGE - 语言
     */
    public Short getLanguage() {
        return language;
    }

    /**
     * 设置语言
     *
     * @param language 语言
     */
    public void setLanguage(Short language) {
        this.language = language;
    }

    /**
     * @return CATEGORY
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * 获取店铺编号
     *
     * @return SHOP_ID - 店铺编号
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * 设置店铺编号
     *
     * @param shopId 店铺编号
     */
    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    /**
     * @return REAL_UPDATE_TIME
     */
    public Date getRealUpdateTime() {
        return realUpdateTime;
    }

    /**
     * @param realUpdateTime
     */
    public void setRealUpdateTime(Date realUpdateTime) {
        this.realUpdateTime = realUpdateTime;
    }

    /**
     * @return UPDATE_TIME
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    /**
     * 获取简介
     *
     * @return INTRODUCTION - 简介
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * 设置简介
     *
     * @param introduction 简介
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    /**
     * 获取详情
     *
     * @return DETAILL - 详情
     */
    public String getDetaill() {
        return detaill;
    }

    /**
     * 设置详情
     *
     * @param detaill 详情
     */
    public void setDetaill(String detaill) {
        this.detaill = detaill == null ? null : detaill.trim();
    }

    /**
     * 获取产品图片
     *
     * @return SDI_PRODUCTS_PICLIST - 产品图片
     */
    public String getSdiProductsPiclist() {
        return sdiProductsPiclist;
    }

    /**
     * 设置产品图片
     *
     * @param sdiProductsPiclist 产品图片
     */
    public void setSdiProductsPiclist(String sdiProductsPiclist) {
        this.sdiProductsPiclist = sdiProductsPiclist == null ? null : sdiProductsPiclist.trim();
    }

    /**
     * 获取产品价格
     *
     * @return SDI_PRODUCTS_PRICELIST - 产品价格
     */
    public String getSdiProductsPricelist() {
        return sdiProductsPricelist;
    }

    /**
     * 设置产品价格
     *
     * @param sdiProductsPricelist 产品价格
     */
    public void setSdiProductsPricelist(String sdiProductsPricelist) {
        this.sdiProductsPricelist = sdiProductsPricelist == null ? null : sdiProductsPricelist.trim();
    }

    /**
     * 获取产品属性列表
     *
     * @return PRODUCT_PROPERTY_SKU_BO_LIST - 产品属性列表
     */
    public String getProductPropertySkuBoList() {
        return productPropertySkuBoList;
    }

    /**
     * 设置产品属性列表
     *
     * @param productPropertySkuBoList 产品属性列表
     */
    public void setProductPropertySkuBoList(String productPropertySkuBoList) {
        this.productPropertySkuBoList = productPropertySkuBoList == null ? null : productPropertySkuBoList.trim();
    }

    /**
     * 获取性能清单
     *
     * @return PROPERTY_LIST - 性能清单
     */
    public String getPropertyList() {
        return propertyList;
    }

    /**
     * 设置性能清单
     *
     * @param propertyList 性能清单
     */
    public void setPropertyList(String propertyList) {
        this.propertyList = propertyList == null ? null : propertyList.trim();
    }
}