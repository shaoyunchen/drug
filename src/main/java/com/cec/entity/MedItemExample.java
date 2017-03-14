package com.cec.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andItemIdIsNull() {
            addCriterion("ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(String value) {
            addCriterion("ITEM_ID =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(String value) {
            addCriterion("ITEM_ID <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(String value) {
            addCriterion("ITEM_ID >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_ID >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(String value) {
            addCriterion("ITEM_ID <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(String value) {
            addCriterion("ITEM_ID <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLike(String value) {
            addCriterion("ITEM_ID like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotLike(String value) {
            addCriterion("ITEM_ID not like", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<String> values) {
            addCriterion("ITEM_ID in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<String> values) {
            addCriterion("ITEM_ID not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(String value1, String value2) {
            addCriterion("ITEM_ID between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(String value1, String value2) {
            addCriterion("ITEM_ID not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andCodezhIsNull() {
            addCriterion("codeZH is null");
            return (Criteria) this;
        }

        public Criteria andCodezhIsNotNull() {
            addCriterion("codeZH is not null");
            return (Criteria) this;
        }

        public Criteria andCodezhEqualTo(String value) {
            addCriterion("codeZH =", value, "codezh");
            return (Criteria) this;
        }

        public Criteria andCodezhNotEqualTo(String value) {
            addCriterion("codeZH <>", value, "codezh");
            return (Criteria) this;
        }

        public Criteria andCodezhGreaterThan(String value) {
            addCriterion("codeZH >", value, "codezh");
            return (Criteria) this;
        }

        public Criteria andCodezhGreaterThanOrEqualTo(String value) {
            addCriterion("codeZH >=", value, "codezh");
            return (Criteria) this;
        }

        public Criteria andCodezhLessThan(String value) {
            addCriterion("codeZH <", value, "codezh");
            return (Criteria) this;
        }

        public Criteria andCodezhLessThanOrEqualTo(String value) {
            addCriterion("codeZH <=", value, "codezh");
            return (Criteria) this;
        }

        public Criteria andCodezhLike(String value) {
            addCriterion("codeZH like", value, "codezh");
            return (Criteria) this;
        }

        public Criteria andCodezhNotLike(String value) {
            addCriterion("codeZH not like", value, "codezh");
            return (Criteria) this;
        }

        public Criteria andCodezhIn(List<String> values) {
            addCriterion("codeZH in", values, "codezh");
            return (Criteria) this;
        }

        public Criteria andCodezhNotIn(List<String> values) {
            addCriterion("codeZH not in", values, "codezh");
            return (Criteria) this;
        }

        public Criteria andCodezhBetween(String value1, String value2) {
            addCriterion("codeZH between", value1, value2, "codezh");
            return (Criteria) this;
        }

        public Criteria andCodezhNotBetween(String value1, String value2) {
            addCriterion("codeZH not between", value1, value2, "codezh");
            return (Criteria) this;
        }

        public Criteria andUomlargeIsNull() {
            addCriterion("uomLarge is null");
            return (Criteria) this;
        }

        public Criteria andUomlargeIsNotNull() {
            addCriterion("uomLarge is not null");
            return (Criteria) this;
        }

        public Criteria andUomlargeEqualTo(String value) {
            addCriterion("uomLarge =", value, "uomlarge");
            return (Criteria) this;
        }

        public Criteria andUomlargeNotEqualTo(String value) {
            addCriterion("uomLarge <>", value, "uomlarge");
            return (Criteria) this;
        }

        public Criteria andUomlargeGreaterThan(String value) {
            addCriterion("uomLarge >", value, "uomlarge");
            return (Criteria) this;
        }

        public Criteria andUomlargeGreaterThanOrEqualTo(String value) {
            addCriterion("uomLarge >=", value, "uomlarge");
            return (Criteria) this;
        }

        public Criteria andUomlargeLessThan(String value) {
            addCriterion("uomLarge <", value, "uomlarge");
            return (Criteria) this;
        }

        public Criteria andUomlargeLessThanOrEqualTo(String value) {
            addCriterion("uomLarge <=", value, "uomlarge");
            return (Criteria) this;
        }

        public Criteria andUomlargeLike(String value) {
            addCriterion("uomLarge like", value, "uomlarge");
            return (Criteria) this;
        }

        public Criteria andUomlargeNotLike(String value) {
            addCriterion("uomLarge not like", value, "uomlarge");
            return (Criteria) this;
        }

        public Criteria andUomlargeIn(List<String> values) {
            addCriterion("uomLarge in", values, "uomlarge");
            return (Criteria) this;
        }

        public Criteria andUomlargeNotIn(List<String> values) {
            addCriterion("uomLarge not in", values, "uomlarge");
            return (Criteria) this;
        }

        public Criteria andUomlargeBetween(String value1, String value2) {
            addCriterion("uomLarge between", value1, value2, "uomlarge");
            return (Criteria) this;
        }

        public Criteria andUomlargeNotBetween(String value1, String value2) {
            addCriterion("uomLarge not between", value1, value2, "uomlarge");
            return (Criteria) this;
        }

        public Criteria andUomsmallIsNull() {
            addCriterion("uomSmall is null");
            return (Criteria) this;
        }

        public Criteria andUomsmallIsNotNull() {
            addCriterion("uomSmall is not null");
            return (Criteria) this;
        }

        public Criteria andUomsmallEqualTo(String value) {
            addCriterion("uomSmall =", value, "uomsmall");
            return (Criteria) this;
        }

        public Criteria andUomsmallNotEqualTo(String value) {
            addCriterion("uomSmall <>", value, "uomsmall");
            return (Criteria) this;
        }

        public Criteria andUomsmallGreaterThan(String value) {
            addCriterion("uomSmall >", value, "uomsmall");
            return (Criteria) this;
        }

        public Criteria andUomsmallGreaterThanOrEqualTo(String value) {
            addCriterion("uomSmall >=", value, "uomsmall");
            return (Criteria) this;
        }

        public Criteria andUomsmallLessThan(String value) {
            addCriterion("uomSmall <", value, "uomsmall");
            return (Criteria) this;
        }

        public Criteria andUomsmallLessThanOrEqualTo(String value) {
            addCriterion("uomSmall <=", value, "uomsmall");
            return (Criteria) this;
        }

        public Criteria andUomsmallLike(String value) {
            addCriterion("uomSmall like", value, "uomsmall");
            return (Criteria) this;
        }

        public Criteria andUomsmallNotLike(String value) {
            addCriterion("uomSmall not like", value, "uomsmall");
            return (Criteria) this;
        }

        public Criteria andUomsmallIn(List<String> values) {
            addCriterion("uomSmall in", values, "uomsmall");
            return (Criteria) this;
        }

        public Criteria andUomsmallNotIn(List<String> values) {
            addCriterion("uomSmall not in", values, "uomsmall");
            return (Criteria) this;
        }

        public Criteria andUomsmallBetween(String value1, String value2) {
            addCriterion("uomSmall between", value1, value2, "uomsmall");
            return (Criteria) this;
        }

        public Criteria andUomsmallNotBetween(String value1, String value2) {
            addCriterion("uomSmall not between", value1, value2, "uomsmall");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCheNameIsNull() {
            addCriterion("CHE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCheNameIsNotNull() {
            addCriterion("CHE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCheNameEqualTo(String value) {
            addCriterion("CHE_NAME =", value, "cheName");
            return (Criteria) this;
        }

        public Criteria andCheNameNotEqualTo(String value) {
            addCriterion("CHE_NAME <>", value, "cheName");
            return (Criteria) this;
        }

        public Criteria andCheNameGreaterThan(String value) {
            addCriterion("CHE_NAME >", value, "cheName");
            return (Criteria) this;
        }

        public Criteria andCheNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHE_NAME >=", value, "cheName");
            return (Criteria) this;
        }

        public Criteria andCheNameLessThan(String value) {
            addCriterion("CHE_NAME <", value, "cheName");
            return (Criteria) this;
        }

        public Criteria andCheNameLessThanOrEqualTo(String value) {
            addCriterion("CHE_NAME <=", value, "cheName");
            return (Criteria) this;
        }

        public Criteria andCheNameLike(String value) {
            addCriterion("CHE_NAME like", value, "cheName");
            return (Criteria) this;
        }

        public Criteria andCheNameNotLike(String value) {
            addCriterion("CHE_NAME not like", value, "cheName");
            return (Criteria) this;
        }

        public Criteria andCheNameIn(List<String> values) {
            addCriterion("CHE_NAME in", values, "cheName");
            return (Criteria) this;
        }

        public Criteria andCheNameNotIn(List<String> values) {
            addCriterion("CHE_NAME not in", values, "cheName");
            return (Criteria) this;
        }

        public Criteria andCheNameBetween(String value1, String value2) {
            addCriterion("CHE_NAME between", value1, value2, "cheName");
            return (Criteria) this;
        }

        public Criteria andCheNameNotBetween(String value1, String value2) {
            addCriterion("CHE_NAME not between", value1, value2, "cheName");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeIsNull() {
            addCriterion("COMMODITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeIsNotNull() {
            addCriterion("COMMODITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeEqualTo(String value) {
            addCriterion("COMMODITY_CODE =", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeNotEqualTo(String value) {
            addCriterion("COMMODITY_CODE <>", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeGreaterThan(String value) {
            addCriterion("COMMODITY_CODE >", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_CODE >=", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeLessThan(String value) {
            addCriterion("COMMODITY_CODE <", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_CODE <=", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeLike(String value) {
            addCriterion("COMMODITY_CODE like", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeNotLike(String value) {
            addCriterion("COMMODITY_CODE not like", value, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeIn(List<String> values) {
            addCriterion("COMMODITY_CODE in", values, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeNotIn(List<String> values) {
            addCriterion("COMMODITY_CODE not in", values, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeBetween(String value1, String value2) {
            addCriterion("COMMODITY_CODE between", value1, value2, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCommodityCodeNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_CODE not between", value1, value2, "commodityCode");
            return (Criteria) this;
        }

        public Criteria andCataIdIsNull() {
            addCriterion("CATA_ID is null");
            return (Criteria) this;
        }

        public Criteria andCataIdIsNotNull() {
            addCriterion("CATA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCataIdEqualTo(String value) {
            addCriterion("CATA_ID =", value, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdNotEqualTo(String value) {
            addCriterion("CATA_ID <>", value, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdGreaterThan(String value) {
            addCriterion("CATA_ID >", value, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdGreaterThanOrEqualTo(String value) {
            addCriterion("CATA_ID >=", value, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdLessThan(String value) {
            addCriterion("CATA_ID <", value, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdLessThanOrEqualTo(String value) {
            addCriterion("CATA_ID <=", value, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdLike(String value) {
            addCriterion("CATA_ID like", value, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdNotLike(String value) {
            addCriterion("CATA_ID not like", value, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdIn(List<String> values) {
            addCriterion("CATA_ID in", values, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdNotIn(List<String> values) {
            addCriterion("CATA_ID not in", values, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdBetween(String value1, String value2) {
            addCriterion("CATA_ID between", value1, value2, "cataId");
            return (Criteria) this;
        }

        public Criteria andCataIdNotBetween(String value1, String value2) {
            addCriterion("CATA_ID not between", value1, value2, "cataId");
            return (Criteria) this;
        }

        public Criteria andCategoryUserIsNull() {
            addCriterion("CATEGORY_USER is null");
            return (Criteria) this;
        }

        public Criteria andCategoryUserIsNotNull() {
            addCriterion("CATEGORY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryUserEqualTo(String value) {
            addCriterion("CATEGORY_USER =", value, "categoryUser");
            return (Criteria) this;
        }

        public Criteria andCategoryUserNotEqualTo(String value) {
            addCriterion("CATEGORY_USER <>", value, "categoryUser");
            return (Criteria) this;
        }

        public Criteria andCategoryUserGreaterThan(String value) {
            addCriterion("CATEGORY_USER >", value, "categoryUser");
            return (Criteria) this;
        }

        public Criteria andCategoryUserGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_USER >=", value, "categoryUser");
            return (Criteria) this;
        }

        public Criteria andCategoryUserLessThan(String value) {
            addCriterion("CATEGORY_USER <", value, "categoryUser");
            return (Criteria) this;
        }

        public Criteria andCategoryUserLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_USER <=", value, "categoryUser");
            return (Criteria) this;
        }

        public Criteria andCategoryUserLike(String value) {
            addCriterion("CATEGORY_USER like", value, "categoryUser");
            return (Criteria) this;
        }

        public Criteria andCategoryUserNotLike(String value) {
            addCriterion("CATEGORY_USER not like", value, "categoryUser");
            return (Criteria) this;
        }

        public Criteria andCategoryUserIn(List<String> values) {
            addCriterion("CATEGORY_USER in", values, "categoryUser");
            return (Criteria) this;
        }

        public Criteria andCategoryUserNotIn(List<String> values) {
            addCriterion("CATEGORY_USER not in", values, "categoryUser");
            return (Criteria) this;
        }

        public Criteria andCategoryUserBetween(String value1, String value2) {
            addCriterion("CATEGORY_USER between", value1, value2, "categoryUser");
            return (Criteria) this;
        }

        public Criteria andCategoryUserNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_USER not between", value1, value2, "categoryUser");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("BARCODE is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("BARCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("BARCODE =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("BARCODE <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("BARCODE >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BARCODE >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("BARCODE <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("BARCODE <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("BARCODE like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("BARCODE not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("BARCODE in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("BARCODE not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("BARCODE between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("BARCODE not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andExpirationDayIsNull() {
            addCriterion("EXPIRATION_DAY is null");
            return (Criteria) this;
        }

        public Criteria andExpirationDayIsNotNull() {
            addCriterion("EXPIRATION_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationDayEqualTo(Integer value) {
            addCriterion("EXPIRATION_DAY =", value, "expirationDay");
            return (Criteria) this;
        }

        public Criteria andExpirationDayNotEqualTo(Integer value) {
            addCriterion("EXPIRATION_DAY <>", value, "expirationDay");
            return (Criteria) this;
        }

        public Criteria andExpirationDayGreaterThan(Integer value) {
            addCriterion("EXPIRATION_DAY >", value, "expirationDay");
            return (Criteria) this;
        }

        public Criteria andExpirationDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXPIRATION_DAY >=", value, "expirationDay");
            return (Criteria) this;
        }

        public Criteria andExpirationDayLessThan(Integer value) {
            addCriterion("EXPIRATION_DAY <", value, "expirationDay");
            return (Criteria) this;
        }

        public Criteria andExpirationDayLessThanOrEqualTo(Integer value) {
            addCriterion("EXPIRATION_DAY <=", value, "expirationDay");
            return (Criteria) this;
        }

        public Criteria andExpirationDayIn(List<Integer> values) {
            addCriterion("EXPIRATION_DAY in", values, "expirationDay");
            return (Criteria) this;
        }

        public Criteria andExpirationDayNotIn(List<Integer> values) {
            addCriterion("EXPIRATION_DAY not in", values, "expirationDay");
            return (Criteria) this;
        }

        public Criteria andExpirationDayBetween(Integer value1, Integer value2) {
            addCriterion("EXPIRATION_DAY between", value1, value2, "expirationDay");
            return (Criteria) this;
        }

        public Criteria andExpirationDayNotBetween(Integer value1, Integer value2) {
            addCriterion("EXPIRATION_DAY not between", value1, value2, "expirationDay");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNull() {
            addCriterion("REF_ID is null");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNotNull() {
            addCriterion("REF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRefIdEqualTo(String value) {
            addCriterion("REF_ID =", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotEqualTo(String value) {
            addCriterion("REF_ID <>", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThan(String value) {
            addCriterion("REF_ID >", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThanOrEqualTo(String value) {
            addCriterion("REF_ID >=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThan(String value) {
            addCriterion("REF_ID <", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThanOrEqualTo(String value) {
            addCriterion("REF_ID <=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLike(String value) {
            addCriterion("REF_ID like", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotLike(String value) {
            addCriterion("REF_ID not like", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdIn(List<String> values) {
            addCriterion("REF_ID in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotIn(List<String> values) {
            addCriterion("REF_ID not in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdBetween(String value1, String value2) {
            addCriterion("REF_ID between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotBetween(String value1, String value2) {
            addCriterion("REF_ID not between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andCode1IsNull() {
            addCriterion("CODE1 is null");
            return (Criteria) this;
        }

        public Criteria andCode1IsNotNull() {
            addCriterion("CODE1 is not null");
            return (Criteria) this;
        }

        public Criteria andCode1EqualTo(String value) {
            addCriterion("CODE1 =", value, "code1");
            return (Criteria) this;
        }

        public Criteria andCode1NotEqualTo(String value) {
            addCriterion("CODE1 <>", value, "code1");
            return (Criteria) this;
        }

        public Criteria andCode1GreaterThan(String value) {
            addCriterion("CODE1 >", value, "code1");
            return (Criteria) this;
        }

        public Criteria andCode1GreaterThanOrEqualTo(String value) {
            addCriterion("CODE1 >=", value, "code1");
            return (Criteria) this;
        }

        public Criteria andCode1LessThan(String value) {
            addCriterion("CODE1 <", value, "code1");
            return (Criteria) this;
        }

        public Criteria andCode1LessThanOrEqualTo(String value) {
            addCriterion("CODE1 <=", value, "code1");
            return (Criteria) this;
        }

        public Criteria andCode1Like(String value) {
            addCriterion("CODE1 like", value, "code1");
            return (Criteria) this;
        }

        public Criteria andCode1NotLike(String value) {
            addCriterion("CODE1 not like", value, "code1");
            return (Criteria) this;
        }

        public Criteria andCode1In(List<String> values) {
            addCriterion("CODE1 in", values, "code1");
            return (Criteria) this;
        }

        public Criteria andCode1NotIn(List<String> values) {
            addCriterion("CODE1 not in", values, "code1");
            return (Criteria) this;
        }

        public Criteria andCode1Between(String value1, String value2) {
            addCriterion("CODE1 between", value1, value2, "code1");
            return (Criteria) this;
        }

        public Criteria andCode1NotBetween(String value1, String value2) {
            addCriterion("CODE1 not between", value1, value2, "code1");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("MODEL is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("MODEL =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("MODEL <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("MODEL >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("MODEL <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("MODEL <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("MODEL like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("MODEL not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("MODEL in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("MODEL not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("MODEL between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("MODEL not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andIsObsoletedIsNull() {
            addCriterion("IS_OBSOLETED is null");
            return (Criteria) this;
        }

        public Criteria andIsObsoletedIsNotNull() {
            addCriterion("IS_OBSOLETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsObsoletedEqualTo(Integer value) {
            addCriterion("IS_OBSOLETED =", value, "isObsoleted");
            return (Criteria) this;
        }

        public Criteria andIsObsoletedNotEqualTo(Integer value) {
            addCriterion("IS_OBSOLETED <>", value, "isObsoleted");
            return (Criteria) this;
        }

        public Criteria andIsObsoletedGreaterThan(Integer value) {
            addCriterion("IS_OBSOLETED >", value, "isObsoleted");
            return (Criteria) this;
        }

        public Criteria andIsObsoletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_OBSOLETED >=", value, "isObsoleted");
            return (Criteria) this;
        }

        public Criteria andIsObsoletedLessThan(Integer value) {
            addCriterion("IS_OBSOLETED <", value, "isObsoleted");
            return (Criteria) this;
        }

        public Criteria andIsObsoletedLessThanOrEqualTo(Integer value) {
            addCriterion("IS_OBSOLETED <=", value, "isObsoleted");
            return (Criteria) this;
        }

        public Criteria andIsObsoletedIn(List<Integer> values) {
            addCriterion("IS_OBSOLETED in", values, "isObsoleted");
            return (Criteria) this;
        }

        public Criteria andIsObsoletedNotIn(List<Integer> values) {
            addCriterion("IS_OBSOLETED not in", values, "isObsoleted");
            return (Criteria) this;
        }

        public Criteria andIsObsoletedBetween(Integer value1, Integer value2) {
            addCriterion("IS_OBSOLETED between", value1, value2, "isObsoleted");
            return (Criteria) this;
        }

        public Criteria andIsObsoletedNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_OBSOLETED not between", value1, value2, "isObsoleted");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("ORG_ID like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("ORG_ID not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNull() {
            addCriterion("ITEM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("ITEM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(Integer value) {
            addCriterion("ITEM_TYPE =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(Integer value) {
            addCriterion("ITEM_TYPE <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(Integer value) {
            addCriterion("ITEM_TYPE >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITEM_TYPE >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(Integer value) {
            addCriterion("ITEM_TYPE <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ITEM_TYPE <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<Integer> values) {
            addCriterion("ITEM_TYPE in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<Integer> values) {
            addCriterion("ITEM_TYPE not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_TYPE between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ITEM_TYPE not between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CREATED_BY like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CREATED_BY not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("CREATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CREATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("CREATED_DATE =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("CREATED_DATE <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("CREATED_DATE >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("CREATED_DATE <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_DATE <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("CREATED_DATE in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("CREATED_DATE not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_DATE not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andDisabledByIsNull() {
            addCriterion("DISABLED_BY is null");
            return (Criteria) this;
        }

        public Criteria andDisabledByIsNotNull() {
            addCriterion("DISABLED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledByEqualTo(String value) {
            addCriterion("DISABLED_BY =", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByNotEqualTo(String value) {
            addCriterion("DISABLED_BY <>", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByGreaterThan(String value) {
            addCriterion("DISABLED_BY >", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByGreaterThanOrEqualTo(String value) {
            addCriterion("DISABLED_BY >=", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByLessThan(String value) {
            addCriterion("DISABLED_BY <", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByLessThanOrEqualTo(String value) {
            addCriterion("DISABLED_BY <=", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByLike(String value) {
            addCriterion("DISABLED_BY like", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByNotLike(String value) {
            addCriterion("DISABLED_BY not like", value, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByIn(List<String> values) {
            addCriterion("DISABLED_BY in", values, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByNotIn(List<String> values) {
            addCriterion("DISABLED_BY not in", values, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByBetween(String value1, String value2) {
            addCriterion("DISABLED_BY between", value1, value2, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledByNotBetween(String value1, String value2) {
            addCriterion("DISABLED_BY not between", value1, value2, "disabledBy");
            return (Criteria) this;
        }

        public Criteria andDisabledDateIsNull() {
            addCriterion("DISABLED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDisabledDateIsNotNull() {
            addCriterion("DISABLED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledDateEqualTo(Date value) {
            addCriterion("DISABLED_DATE =", value, "disabledDate");
            return (Criteria) this;
        }

        public Criteria andDisabledDateNotEqualTo(Date value) {
            addCriterion("DISABLED_DATE <>", value, "disabledDate");
            return (Criteria) this;
        }

        public Criteria andDisabledDateGreaterThan(Date value) {
            addCriterion("DISABLED_DATE >", value, "disabledDate");
            return (Criteria) this;
        }

        public Criteria andDisabledDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DISABLED_DATE >=", value, "disabledDate");
            return (Criteria) this;
        }

        public Criteria andDisabledDateLessThan(Date value) {
            addCriterion("DISABLED_DATE <", value, "disabledDate");
            return (Criteria) this;
        }

        public Criteria andDisabledDateLessThanOrEqualTo(Date value) {
            addCriterion("DISABLED_DATE <=", value, "disabledDate");
            return (Criteria) this;
        }

        public Criteria andDisabledDateIn(List<Date> values) {
            addCriterion("DISABLED_DATE in", values, "disabledDate");
            return (Criteria) this;
        }

        public Criteria andDisabledDateNotIn(List<Date> values) {
            addCriterion("DISABLED_DATE not in", values, "disabledDate");
            return (Criteria) this;
        }

        public Criteria andDisabledDateBetween(Date value1, Date value2) {
            addCriterion("DISABLED_DATE between", value1, value2, "disabledDate");
            return (Criteria) this;
        }

        public Criteria andDisabledDateNotBetween(Date value1, Date value2) {
            addCriterion("DISABLED_DATE not between", value1, value2, "disabledDate");
            return (Criteria) this;
        }

        public Criteria andProductLineIsNull() {
            addCriterion("PRODUCT_LINE is null");
            return (Criteria) this;
        }

        public Criteria andProductLineIsNotNull() {
            addCriterion("PRODUCT_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andProductLineEqualTo(String value) {
            addCriterion("PRODUCT_LINE =", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineNotEqualTo(String value) {
            addCriterion("PRODUCT_LINE <>", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineGreaterThan(String value) {
            addCriterion("PRODUCT_LINE >", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_LINE >=", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineLessThan(String value) {
            addCriterion("PRODUCT_LINE <", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_LINE <=", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineLike(String value) {
            addCriterion("PRODUCT_LINE like", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineNotLike(String value) {
            addCriterion("PRODUCT_LINE not like", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineIn(List<String> values) {
            addCriterion("PRODUCT_LINE in", values, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineNotIn(List<String> values) {
            addCriterion("PRODUCT_LINE not in", values, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineBetween(String value1, String value2) {
            addCriterion("PRODUCT_LINE between", value1, value2, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_LINE not between", value1, value2, "productLine");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("UPDATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("UPDATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("UPDATED_BY =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("UPDATED_BY <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("UPDATED_BY >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("UPDATED_BY <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("UPDATED_BY like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("UPDATED_BY not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("UPDATED_BY in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("UPDATED_BY not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("UPDATED_BY between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("UPDATED_BY not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNull() {
            addCriterion("UPDATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNotNull() {
            addCriterion("UPDATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateEqualTo(Date value) {
            addCriterion("UPDATED_DATE =", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotEqualTo(Date value) {
            addCriterion("UPDATED_DATE <>", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThan(Date value) {
            addCriterion("UPDATED_DATE >", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_DATE >=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThan(Date value) {
            addCriterion("UPDATED_DATE <", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_DATE <=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIn(List<Date> values) {
            addCriterion("UPDATED_DATE in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotIn(List<Date> values) {
            addCriterion("UPDATED_DATE not in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("UPDATED_DATE between", value1, value2, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_DATE not between", value1, value2, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andDunsIsNull() {
            addCriterion("DUNS is null");
            return (Criteria) this;
        }

        public Criteria andDunsIsNotNull() {
            addCriterion("DUNS is not null");
            return (Criteria) this;
        }

        public Criteria andDunsEqualTo(String value) {
            addCriterion("DUNS =", value, "duns");
            return (Criteria) this;
        }

        public Criteria andDunsNotEqualTo(String value) {
            addCriterion("DUNS <>", value, "duns");
            return (Criteria) this;
        }

        public Criteria andDunsGreaterThan(String value) {
            addCriterion("DUNS >", value, "duns");
            return (Criteria) this;
        }

        public Criteria andDunsGreaterThanOrEqualTo(String value) {
            addCriterion("DUNS >=", value, "duns");
            return (Criteria) this;
        }

        public Criteria andDunsLessThan(String value) {
            addCriterion("DUNS <", value, "duns");
            return (Criteria) this;
        }

        public Criteria andDunsLessThanOrEqualTo(String value) {
            addCriterion("DUNS <=", value, "duns");
            return (Criteria) this;
        }

        public Criteria andDunsLike(String value) {
            addCriterion("DUNS like", value, "duns");
            return (Criteria) this;
        }

        public Criteria andDunsNotLike(String value) {
            addCriterion("DUNS not like", value, "duns");
            return (Criteria) this;
        }

        public Criteria andDunsIn(List<String> values) {
            addCriterion("DUNS in", values, "duns");
            return (Criteria) this;
        }

        public Criteria andDunsNotIn(List<String> values) {
            addCriterion("DUNS not in", values, "duns");
            return (Criteria) this;
        }

        public Criteria andDunsBetween(String value1, String value2) {
            addCriterion("DUNS between", value1, value2, "duns");
            return (Criteria) this;
        }

        public Criteria andDunsNotBetween(String value1, String value2) {
            addCriterion("DUNS not between", value1, value2, "duns");
            return (Criteria) this;
        }

        public Criteria andGId1IsNull() {
            addCriterion("G_ID1 is null");
            return (Criteria) this;
        }

        public Criteria andGId1IsNotNull() {
            addCriterion("G_ID1 is not null");
            return (Criteria) this;
        }

        public Criteria andGId1EqualTo(String value) {
            addCriterion("G_ID1 =", value, "gId1");
            return (Criteria) this;
        }

        public Criteria andGId1NotEqualTo(String value) {
            addCriterion("G_ID1 <>", value, "gId1");
            return (Criteria) this;
        }

        public Criteria andGId1GreaterThan(String value) {
            addCriterion("G_ID1 >", value, "gId1");
            return (Criteria) this;
        }

        public Criteria andGId1GreaterThanOrEqualTo(String value) {
            addCriterion("G_ID1 >=", value, "gId1");
            return (Criteria) this;
        }

        public Criteria andGId1LessThan(String value) {
            addCriterion("G_ID1 <", value, "gId1");
            return (Criteria) this;
        }

        public Criteria andGId1LessThanOrEqualTo(String value) {
            addCriterion("G_ID1 <=", value, "gId1");
            return (Criteria) this;
        }

        public Criteria andGId1Like(String value) {
            addCriterion("G_ID1 like", value, "gId1");
            return (Criteria) this;
        }

        public Criteria andGId1NotLike(String value) {
            addCriterion("G_ID1 not like", value, "gId1");
            return (Criteria) this;
        }

        public Criteria andGId1In(List<String> values) {
            addCriterion("G_ID1 in", values, "gId1");
            return (Criteria) this;
        }

        public Criteria andGId1NotIn(List<String> values) {
            addCriterion("G_ID1 not in", values, "gId1");
            return (Criteria) this;
        }

        public Criteria andGId1Between(String value1, String value2) {
            addCriterion("G_ID1 between", value1, value2, "gId1");
            return (Criteria) this;
        }

        public Criteria andGId1NotBetween(String value1, String value2) {
            addCriterion("G_ID1 not between", value1, value2, "gId1");
            return (Criteria) this;
        }

        public Criteria andChkCatIdIsNull() {
            addCriterion("CHK_CAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andChkCatIdIsNotNull() {
            addCriterion("CHK_CAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChkCatIdEqualTo(String value) {
            addCriterion("CHK_CAT_ID =", value, "chkCatId");
            return (Criteria) this;
        }

        public Criteria andChkCatIdNotEqualTo(String value) {
            addCriterion("CHK_CAT_ID <>", value, "chkCatId");
            return (Criteria) this;
        }

        public Criteria andChkCatIdGreaterThan(String value) {
            addCriterion("CHK_CAT_ID >", value, "chkCatId");
            return (Criteria) this;
        }

        public Criteria andChkCatIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_CAT_ID >=", value, "chkCatId");
            return (Criteria) this;
        }

        public Criteria andChkCatIdLessThan(String value) {
            addCriterion("CHK_CAT_ID <", value, "chkCatId");
            return (Criteria) this;
        }

        public Criteria andChkCatIdLessThanOrEqualTo(String value) {
            addCriterion("CHK_CAT_ID <=", value, "chkCatId");
            return (Criteria) this;
        }

        public Criteria andChkCatIdLike(String value) {
            addCriterion("CHK_CAT_ID like", value, "chkCatId");
            return (Criteria) this;
        }

        public Criteria andChkCatIdNotLike(String value) {
            addCriterion("CHK_CAT_ID not like", value, "chkCatId");
            return (Criteria) this;
        }

        public Criteria andChkCatIdIn(List<String> values) {
            addCriterion("CHK_CAT_ID in", values, "chkCatId");
            return (Criteria) this;
        }

        public Criteria andChkCatIdNotIn(List<String> values) {
            addCriterion("CHK_CAT_ID not in", values, "chkCatId");
            return (Criteria) this;
        }

        public Criteria andChkCatIdBetween(String value1, String value2) {
            addCriterion("CHK_CAT_ID between", value1, value2, "chkCatId");
            return (Criteria) this;
        }

        public Criteria andChkCatIdNotBetween(String value1, String value2) {
            addCriterion("CHK_CAT_ID not between", value1, value2, "chkCatId");
            return (Criteria) this;
        }

        public Criteria andGId2IsNull() {
            addCriterion("G_ID2 is null");
            return (Criteria) this;
        }

        public Criteria andGId2IsNotNull() {
            addCriterion("G_ID2 is not null");
            return (Criteria) this;
        }

        public Criteria andGId2EqualTo(String value) {
            addCriterion("G_ID2 =", value, "gId2");
            return (Criteria) this;
        }

        public Criteria andGId2NotEqualTo(String value) {
            addCriterion("G_ID2 <>", value, "gId2");
            return (Criteria) this;
        }

        public Criteria andGId2GreaterThan(String value) {
            addCriterion("G_ID2 >", value, "gId2");
            return (Criteria) this;
        }

        public Criteria andGId2GreaterThanOrEqualTo(String value) {
            addCriterion("G_ID2 >=", value, "gId2");
            return (Criteria) this;
        }

        public Criteria andGId2LessThan(String value) {
            addCriterion("G_ID2 <", value, "gId2");
            return (Criteria) this;
        }

        public Criteria andGId2LessThanOrEqualTo(String value) {
            addCriterion("G_ID2 <=", value, "gId2");
            return (Criteria) this;
        }

        public Criteria andGId2Like(String value) {
            addCriterion("G_ID2 like", value, "gId2");
            return (Criteria) this;
        }

        public Criteria andGId2NotLike(String value) {
            addCriterion("G_ID2 not like", value, "gId2");
            return (Criteria) this;
        }

        public Criteria andGId2In(List<String> values) {
            addCriterion("G_ID2 in", values, "gId2");
            return (Criteria) this;
        }

        public Criteria andGId2NotIn(List<String> values) {
            addCriterion("G_ID2 not in", values, "gId2");
            return (Criteria) this;
        }

        public Criteria andGId2Between(String value1, String value2) {
            addCriterion("G_ID2 between", value1, value2, "gId2");
            return (Criteria) this;
        }

        public Criteria andGId2NotBetween(String value1, String value2) {
            addCriterion("G_ID2 not between", value1, value2, "gId2");
            return (Criteria) this;
        }

        public Criteria andUsage1IsNull() {
            addCriterion("USAGE1 is null");
            return (Criteria) this;
        }

        public Criteria andUsage1IsNotNull() {
            addCriterion("USAGE1 is not null");
            return (Criteria) this;
        }

        public Criteria andUsage1EqualTo(String value) {
            addCriterion("USAGE1 =", value, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1NotEqualTo(String value) {
            addCriterion("USAGE1 <>", value, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1GreaterThan(String value) {
            addCriterion("USAGE1 >", value, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1GreaterThanOrEqualTo(String value) {
            addCriterion("USAGE1 >=", value, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1LessThan(String value) {
            addCriterion("USAGE1 <", value, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1LessThanOrEqualTo(String value) {
            addCriterion("USAGE1 <=", value, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1Like(String value) {
            addCriterion("USAGE1 like", value, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1NotLike(String value) {
            addCriterion("USAGE1 not like", value, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1In(List<String> values) {
            addCriterion("USAGE1 in", values, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1NotIn(List<String> values) {
            addCriterion("USAGE1 not in", values, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1Between(String value1, String value2) {
            addCriterion("USAGE1 between", value1, value2, "usage1");
            return (Criteria) this;
        }

        public Criteria andUsage1NotBetween(String value1, String value2) {
            addCriterion("USAGE1 not between", value1, value2, "usage1");
            return (Criteria) this;
        }

        public Criteria andUomCodeIsNull() {
            addCriterion("UOM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUomCodeIsNotNull() {
            addCriterion("UOM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUomCodeEqualTo(String value) {
            addCriterion("UOM_CODE =", value, "uomCode");
            return (Criteria) this;
        }

        public Criteria andUomCodeNotEqualTo(String value) {
            addCriterion("UOM_CODE <>", value, "uomCode");
            return (Criteria) this;
        }

        public Criteria andUomCodeGreaterThan(String value) {
            addCriterion("UOM_CODE >", value, "uomCode");
            return (Criteria) this;
        }

        public Criteria andUomCodeGreaterThanOrEqualTo(String value) {
            addCriterion("UOM_CODE >=", value, "uomCode");
            return (Criteria) this;
        }

        public Criteria andUomCodeLessThan(String value) {
            addCriterion("UOM_CODE <", value, "uomCode");
            return (Criteria) this;
        }

        public Criteria andUomCodeLessThanOrEqualTo(String value) {
            addCriterion("UOM_CODE <=", value, "uomCode");
            return (Criteria) this;
        }

        public Criteria andUomCodeLike(String value) {
            addCriterion("UOM_CODE like", value, "uomCode");
            return (Criteria) this;
        }

        public Criteria andUomCodeNotLike(String value) {
            addCriterion("UOM_CODE not like", value, "uomCode");
            return (Criteria) this;
        }

        public Criteria andUomCodeIn(List<String> values) {
            addCriterion("UOM_CODE in", values, "uomCode");
            return (Criteria) this;
        }

        public Criteria andUomCodeNotIn(List<String> values) {
            addCriterion("UOM_CODE not in", values, "uomCode");
            return (Criteria) this;
        }

        public Criteria andUomCodeBetween(String value1, String value2) {
            addCriterion("UOM_CODE between", value1, value2, "uomCode");
            return (Criteria) this;
        }

        public Criteria andUomCodeNotBetween(String value1, String value2) {
            addCriterion("UOM_CODE not between", value1, value2, "uomCode");
            return (Criteria) this;
        }

        public Criteria andLeadTimeIsNull() {
            addCriterion("LEAD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLeadTimeIsNotNull() {
            addCriterion("LEAD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLeadTimeEqualTo(Double value) {
            addCriterion("LEAD_TIME =", value, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeNotEqualTo(Double value) {
            addCriterion("LEAD_TIME <>", value, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeGreaterThan(Double value) {
            addCriterion("LEAD_TIME >", value, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("LEAD_TIME >=", value, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeLessThan(Double value) {
            addCriterion("LEAD_TIME <", value, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeLessThanOrEqualTo(Double value) {
            addCriterion("LEAD_TIME <=", value, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeIn(List<Double> values) {
            addCriterion("LEAD_TIME in", values, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeNotIn(List<Double> values) {
            addCriterion("LEAD_TIME not in", values, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeBetween(Double value1, Double value2) {
            addCriterion("LEAD_TIME between", value1, value2, "leadTime");
            return (Criteria) this;
        }

        public Criteria andLeadTimeNotBetween(Double value1, Double value2) {
            addCriterion("LEAD_TIME not between", value1, value2, "leadTime");
            return (Criteria) this;
        }

        public Criteria andMinOrderQtyIsNull() {
            addCriterion("MIN_ORDER_QTY is null");
            return (Criteria) this;
        }

        public Criteria andMinOrderQtyIsNotNull() {
            addCriterion("MIN_ORDER_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andMinOrderQtyEqualTo(Double value) {
            addCriterion("MIN_ORDER_QTY =", value, "minOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinOrderQtyNotEqualTo(Double value) {
            addCriterion("MIN_ORDER_QTY <>", value, "minOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinOrderQtyGreaterThan(Double value) {
            addCriterion("MIN_ORDER_QTY >", value, "minOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinOrderQtyGreaterThanOrEqualTo(Double value) {
            addCriterion("MIN_ORDER_QTY >=", value, "minOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinOrderQtyLessThan(Double value) {
            addCriterion("MIN_ORDER_QTY <", value, "minOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinOrderQtyLessThanOrEqualTo(Double value) {
            addCriterion("MIN_ORDER_QTY <=", value, "minOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinOrderQtyIn(List<Double> values) {
            addCriterion("MIN_ORDER_QTY in", values, "minOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinOrderQtyNotIn(List<Double> values) {
            addCriterion("MIN_ORDER_QTY not in", values, "minOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinOrderQtyBetween(Double value1, Double value2) {
            addCriterion("MIN_ORDER_QTY between", value1, value2, "minOrderQty");
            return (Criteria) this;
        }

        public Criteria andMinOrderQtyNotBetween(Double value1, Double value2) {
            addCriterion("MIN_ORDER_QTY not between", value1, value2, "minOrderQty");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQtyIsNull() {
            addCriterion("MAX_ORDER_QTY is null");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQtyIsNotNull() {
            addCriterion("MAX_ORDER_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQtyEqualTo(Double value) {
            addCriterion("MAX_ORDER_QTY =", value, "maxOrderQty");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQtyNotEqualTo(Double value) {
            addCriterion("MAX_ORDER_QTY <>", value, "maxOrderQty");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQtyGreaterThan(Double value) {
            addCriterion("MAX_ORDER_QTY >", value, "maxOrderQty");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQtyGreaterThanOrEqualTo(Double value) {
            addCriterion("MAX_ORDER_QTY >=", value, "maxOrderQty");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQtyLessThan(Double value) {
            addCriterion("MAX_ORDER_QTY <", value, "maxOrderQty");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQtyLessThanOrEqualTo(Double value) {
            addCriterion("MAX_ORDER_QTY <=", value, "maxOrderQty");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQtyIn(List<Double> values) {
            addCriterion("MAX_ORDER_QTY in", values, "maxOrderQty");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQtyNotIn(List<Double> values) {
            addCriterion("MAX_ORDER_QTY not in", values, "maxOrderQty");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQtyBetween(Double value1, Double value2) {
            addCriterion("MAX_ORDER_QTY between", value1, value2, "maxOrderQty");
            return (Criteria) this;
        }

        public Criteria andMaxOrderQtyNotBetween(Double value1, Double value2) {
            addCriterion("MAX_ORDER_QTY not between", value1, value2, "maxOrderQty");
            return (Criteria) this;
        }

        public Criteria andHazardClassIdIsNull() {
            addCriterion("HAZARD_CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andHazardClassIdIsNotNull() {
            addCriterion("HAZARD_CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHazardClassIdEqualTo(String value) {
            addCriterion("HAZARD_CLASS_ID =", value, "hazardClassId");
            return (Criteria) this;
        }

        public Criteria andHazardClassIdNotEqualTo(String value) {
            addCriterion("HAZARD_CLASS_ID <>", value, "hazardClassId");
            return (Criteria) this;
        }

        public Criteria andHazardClassIdGreaterThan(String value) {
            addCriterion("HAZARD_CLASS_ID >", value, "hazardClassId");
            return (Criteria) this;
        }

        public Criteria andHazardClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("HAZARD_CLASS_ID >=", value, "hazardClassId");
            return (Criteria) this;
        }

        public Criteria andHazardClassIdLessThan(String value) {
            addCriterion("HAZARD_CLASS_ID <", value, "hazardClassId");
            return (Criteria) this;
        }

        public Criteria andHazardClassIdLessThanOrEqualTo(String value) {
            addCriterion("HAZARD_CLASS_ID <=", value, "hazardClassId");
            return (Criteria) this;
        }

        public Criteria andHazardClassIdLike(String value) {
            addCriterion("HAZARD_CLASS_ID like", value, "hazardClassId");
            return (Criteria) this;
        }

        public Criteria andHazardClassIdNotLike(String value) {
            addCriterion("HAZARD_CLASS_ID not like", value, "hazardClassId");
            return (Criteria) this;
        }

        public Criteria andHazardClassIdIn(List<String> values) {
            addCriterion("HAZARD_CLASS_ID in", values, "hazardClassId");
            return (Criteria) this;
        }

        public Criteria andHazardClassIdNotIn(List<String> values) {
            addCriterion("HAZARD_CLASS_ID not in", values, "hazardClassId");
            return (Criteria) this;
        }

        public Criteria andHazardClassIdBetween(String value1, String value2) {
            addCriterion("HAZARD_CLASS_ID between", value1, value2, "hazardClassId");
            return (Criteria) this;
        }

        public Criteria andHazardClassIdNotBetween(String value1, String value2) {
            addCriterion("HAZARD_CLASS_ID not between", value1, value2, "hazardClassId");
            return (Criteria) this;
        }

        public Criteria andStandardCostIsNull() {
            addCriterion("STANDARD_COST is null");
            return (Criteria) this;
        }

        public Criteria andStandardCostIsNotNull() {
            addCriterion("STANDARD_COST is not null");
            return (Criteria) this;
        }

        public Criteria andStandardCostEqualTo(Double value) {
            addCriterion("STANDARD_COST =", value, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostNotEqualTo(Double value) {
            addCriterion("STANDARD_COST <>", value, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostGreaterThan(Double value) {
            addCriterion("STANDARD_COST >", value, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostGreaterThanOrEqualTo(Double value) {
            addCriterion("STANDARD_COST >=", value, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostLessThan(Double value) {
            addCriterion("STANDARD_COST <", value, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostLessThanOrEqualTo(Double value) {
            addCriterion("STANDARD_COST <=", value, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostIn(List<Double> values) {
            addCriterion("STANDARD_COST in", values, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostNotIn(List<Double> values) {
            addCriterion("STANDARD_COST not in", values, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostBetween(Double value1, Double value2) {
            addCriterion("STANDARD_COST between", value1, value2, "standardCost");
            return (Criteria) this;
        }

        public Criteria andStandardCostNotBetween(Double value1, Double value2) {
            addCriterion("STANDARD_COST not between", value1, value2, "standardCost");
            return (Criteria) this;
        }

        public Criteria andMinShipRevIsNull() {
            addCriterion("MIN_SHIP_REV is null");
            return (Criteria) this;
        }

        public Criteria andMinShipRevIsNotNull() {
            addCriterion("MIN_SHIP_REV is not null");
            return (Criteria) this;
        }

        public Criteria andMinShipRevEqualTo(String value) {
            addCriterion("MIN_SHIP_REV =", value, "minShipRev");
            return (Criteria) this;
        }

        public Criteria andMinShipRevNotEqualTo(String value) {
            addCriterion("MIN_SHIP_REV <>", value, "minShipRev");
            return (Criteria) this;
        }

        public Criteria andMinShipRevGreaterThan(String value) {
            addCriterion("MIN_SHIP_REV >", value, "minShipRev");
            return (Criteria) this;
        }

        public Criteria andMinShipRevGreaterThanOrEqualTo(String value) {
            addCriterion("MIN_SHIP_REV >=", value, "minShipRev");
            return (Criteria) this;
        }

        public Criteria andMinShipRevLessThan(String value) {
            addCriterion("MIN_SHIP_REV <", value, "minShipRev");
            return (Criteria) this;
        }

        public Criteria andMinShipRevLessThanOrEqualTo(String value) {
            addCriterion("MIN_SHIP_REV <=", value, "minShipRev");
            return (Criteria) this;
        }

        public Criteria andMinShipRevLike(String value) {
            addCriterion("MIN_SHIP_REV like", value, "minShipRev");
            return (Criteria) this;
        }

        public Criteria andMinShipRevNotLike(String value) {
            addCriterion("MIN_SHIP_REV not like", value, "minShipRev");
            return (Criteria) this;
        }

        public Criteria andMinShipRevIn(List<String> values) {
            addCriterion("MIN_SHIP_REV in", values, "minShipRev");
            return (Criteria) this;
        }

        public Criteria andMinShipRevNotIn(List<String> values) {
            addCriterion("MIN_SHIP_REV not in", values, "minShipRev");
            return (Criteria) this;
        }

        public Criteria andMinShipRevBetween(String value1, String value2) {
            addCriterion("MIN_SHIP_REV between", value1, value2, "minShipRev");
            return (Criteria) this;
        }

        public Criteria andMinShipRevNotBetween(String value1, String value2) {
            addCriterion("MIN_SHIP_REV not between", value1, value2, "minShipRev");
            return (Criteria) this;
        }

        public Criteria andRevRelsDateIsNull() {
            addCriterion("REV_RELS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRevRelsDateIsNotNull() {
            addCriterion("REV_RELS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRevRelsDateEqualTo(Date value) {
            addCriterion("REV_RELS_DATE =", value, "revRelsDate");
            return (Criteria) this;
        }

        public Criteria andRevRelsDateNotEqualTo(Date value) {
            addCriterion("REV_RELS_DATE <>", value, "revRelsDate");
            return (Criteria) this;
        }

        public Criteria andRevRelsDateGreaterThan(Date value) {
            addCriterion("REV_RELS_DATE >", value, "revRelsDate");
            return (Criteria) this;
        }

        public Criteria andRevRelsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REV_RELS_DATE >=", value, "revRelsDate");
            return (Criteria) this;
        }

        public Criteria andRevRelsDateLessThan(Date value) {
            addCriterion("REV_RELS_DATE <", value, "revRelsDate");
            return (Criteria) this;
        }

        public Criteria andRevRelsDateLessThanOrEqualTo(Date value) {
            addCriterion("REV_RELS_DATE <=", value, "revRelsDate");
            return (Criteria) this;
        }

        public Criteria andRevRelsDateIn(List<Date> values) {
            addCriterion("REV_RELS_DATE in", values, "revRelsDate");
            return (Criteria) this;
        }

        public Criteria andRevRelsDateNotIn(List<Date> values) {
            addCriterion("REV_RELS_DATE not in", values, "revRelsDate");
            return (Criteria) this;
        }

        public Criteria andRevRelsDateBetween(Date value1, Date value2) {
            addCriterion("REV_RELS_DATE between", value1, value2, "revRelsDate");
            return (Criteria) this;
        }

        public Criteria andRevRelsDateNotBetween(Date value1, Date value2) {
            addCriterion("REV_RELS_DATE not between", value1, value2, "revRelsDate");
            return (Criteria) this;
        }

        public Criteria andRevisionIsNull() {
            addCriterion("REVISION is null");
            return (Criteria) this;
        }

        public Criteria andRevisionIsNotNull() {
            addCriterion("REVISION is not null");
            return (Criteria) this;
        }

        public Criteria andRevisionEqualTo(String value) {
            addCriterion("REVISION =", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionNotEqualTo(String value) {
            addCriterion("REVISION <>", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionGreaterThan(String value) {
            addCriterion("REVISION >", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionGreaterThanOrEqualTo(String value) {
            addCriterion("REVISION >=", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionLessThan(String value) {
            addCriterion("REVISION <", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionLessThanOrEqualTo(String value) {
            addCriterion("REVISION <=", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionLike(String value) {
            addCriterion("REVISION like", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionNotLike(String value) {
            addCriterion("REVISION not like", value, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionIn(List<String> values) {
            addCriterion("REVISION in", values, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionNotIn(List<String> values) {
            addCriterion("REVISION not in", values, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionBetween(String value1, String value2) {
            addCriterion("REVISION between", value1, value2, "revision");
            return (Criteria) this;
        }

        public Criteria andRevisionNotBetween(String value1, String value2) {
            addCriterion("REVISION not between", value1, value2, "revision");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNull() {
            addCriterion("MATERIAL is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("MATERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("MATERIAL =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("MATERIAL <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("MATERIAL >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("MATERIAL <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("MATERIAL like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("MATERIAL not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("MATERIAL in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("MATERIAL not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("MATERIAL between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("MATERIAL not between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andDateRequestedIsNull() {
            addCriterion("DATE_REQUESTED is null");
            return (Criteria) this;
        }

        public Criteria andDateRequestedIsNotNull() {
            addCriterion("DATE_REQUESTED is not null");
            return (Criteria) this;
        }

        public Criteria andDateRequestedEqualTo(Date value) {
            addCriterion("DATE_REQUESTED =", value, "dateRequested");
            return (Criteria) this;
        }

        public Criteria andDateRequestedNotEqualTo(Date value) {
            addCriterion("DATE_REQUESTED <>", value, "dateRequested");
            return (Criteria) this;
        }

        public Criteria andDateRequestedGreaterThan(Date value) {
            addCriterion("DATE_REQUESTED >", value, "dateRequested");
            return (Criteria) this;
        }

        public Criteria andDateRequestedGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_REQUESTED >=", value, "dateRequested");
            return (Criteria) this;
        }

        public Criteria andDateRequestedLessThan(Date value) {
            addCriterion("DATE_REQUESTED <", value, "dateRequested");
            return (Criteria) this;
        }

        public Criteria andDateRequestedLessThanOrEqualTo(Date value) {
            addCriterion("DATE_REQUESTED <=", value, "dateRequested");
            return (Criteria) this;
        }

        public Criteria andDateRequestedIn(List<Date> values) {
            addCriterion("DATE_REQUESTED in", values, "dateRequested");
            return (Criteria) this;
        }

        public Criteria andDateRequestedNotIn(List<Date> values) {
            addCriterion("DATE_REQUESTED not in", values, "dateRequested");
            return (Criteria) this;
        }

        public Criteria andDateRequestedBetween(Date value1, Date value2) {
            addCriterion("DATE_REQUESTED between", value1, value2, "dateRequested");
            return (Criteria) this;
        }

        public Criteria andDateRequestedNotBetween(Date value1, Date value2) {
            addCriterion("DATE_REQUESTED not between", value1, value2, "dateRequested");
            return (Criteria) this;
        }

        public Criteria andDateEffectiveIsNull() {
            addCriterion("DATE_EFFECTIVE is null");
            return (Criteria) this;
        }

        public Criteria andDateEffectiveIsNotNull() {
            addCriterion("DATE_EFFECTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andDateEffectiveEqualTo(Date value) {
            addCriterion("DATE_EFFECTIVE =", value, "dateEffective");
            return (Criteria) this;
        }

        public Criteria andDateEffectiveNotEqualTo(Date value) {
            addCriterion("DATE_EFFECTIVE <>", value, "dateEffective");
            return (Criteria) this;
        }

        public Criteria andDateEffectiveGreaterThan(Date value) {
            addCriterion("DATE_EFFECTIVE >", value, "dateEffective");
            return (Criteria) this;
        }

        public Criteria andDateEffectiveGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_EFFECTIVE >=", value, "dateEffective");
            return (Criteria) this;
        }

        public Criteria andDateEffectiveLessThan(Date value) {
            addCriterion("DATE_EFFECTIVE <", value, "dateEffective");
            return (Criteria) this;
        }

        public Criteria andDateEffectiveLessThanOrEqualTo(Date value) {
            addCriterion("DATE_EFFECTIVE <=", value, "dateEffective");
            return (Criteria) this;
        }

        public Criteria andDateEffectiveIn(List<Date> values) {
            addCriterion("DATE_EFFECTIVE in", values, "dateEffective");
            return (Criteria) this;
        }

        public Criteria andDateEffectiveNotIn(List<Date> values) {
            addCriterion("DATE_EFFECTIVE not in", values, "dateEffective");
            return (Criteria) this;
        }

        public Criteria andDateEffectiveBetween(Date value1, Date value2) {
            addCriterion("DATE_EFFECTIVE between", value1, value2, "dateEffective");
            return (Criteria) this;
        }

        public Criteria andDateEffectiveNotBetween(Date value1, Date value2) {
            addCriterion("DATE_EFFECTIVE not between", value1, value2, "dateEffective");
            return (Criteria) this;
        }

        public Criteria andShipNumIsNull() {
            addCriterion("SHIP_NUM is null");
            return (Criteria) this;
        }

        public Criteria andShipNumIsNotNull() {
            addCriterion("SHIP_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andShipNumEqualTo(String value) {
            addCriterion("SHIP_NUM =", value, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumNotEqualTo(String value) {
            addCriterion("SHIP_NUM <>", value, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumGreaterThan(String value) {
            addCriterion("SHIP_NUM >", value, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumGreaterThanOrEqualTo(String value) {
            addCriterion("SHIP_NUM >=", value, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumLessThan(String value) {
            addCriterion("SHIP_NUM <", value, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumLessThanOrEqualTo(String value) {
            addCriterion("SHIP_NUM <=", value, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumLike(String value) {
            addCriterion("SHIP_NUM like", value, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumNotLike(String value) {
            addCriterion("SHIP_NUM not like", value, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumIn(List<String> values) {
            addCriterion("SHIP_NUM in", values, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumNotIn(List<String> values) {
            addCriterion("SHIP_NUM not in", values, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumBetween(String value1, String value2) {
            addCriterion("SHIP_NUM between", value1, value2, "shipNum");
            return (Criteria) this;
        }

        public Criteria andShipNumNotBetween(String value1, String value2) {
            addCriterion("SHIP_NUM not between", value1, value2, "shipNum");
            return (Criteria) this;
        }

        public Criteria andLifeCyclePhaseIsNull() {
            addCriterion("LIFE_CYCLE_PHASE is null");
            return (Criteria) this;
        }

        public Criteria andLifeCyclePhaseIsNotNull() {
            addCriterion("LIFE_CYCLE_PHASE is not null");
            return (Criteria) this;
        }

        public Criteria andLifeCyclePhaseEqualTo(Integer value) {
            addCriterion("LIFE_CYCLE_PHASE =", value, "lifeCyclePhase");
            return (Criteria) this;
        }

        public Criteria andLifeCyclePhaseNotEqualTo(Integer value) {
            addCriterion("LIFE_CYCLE_PHASE <>", value, "lifeCyclePhase");
            return (Criteria) this;
        }

        public Criteria andLifeCyclePhaseGreaterThan(Integer value) {
            addCriterion("LIFE_CYCLE_PHASE >", value, "lifeCyclePhase");
            return (Criteria) this;
        }

        public Criteria andLifeCyclePhaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIFE_CYCLE_PHASE >=", value, "lifeCyclePhase");
            return (Criteria) this;
        }

        public Criteria andLifeCyclePhaseLessThan(Integer value) {
            addCriterion("LIFE_CYCLE_PHASE <", value, "lifeCyclePhase");
            return (Criteria) this;
        }

        public Criteria andLifeCyclePhaseLessThanOrEqualTo(Integer value) {
            addCriterion("LIFE_CYCLE_PHASE <=", value, "lifeCyclePhase");
            return (Criteria) this;
        }

        public Criteria andLifeCyclePhaseIn(List<Integer> values) {
            addCriterion("LIFE_CYCLE_PHASE in", values, "lifeCyclePhase");
            return (Criteria) this;
        }

        public Criteria andLifeCyclePhaseNotIn(List<Integer> values) {
            addCriterion("LIFE_CYCLE_PHASE not in", values, "lifeCyclePhase");
            return (Criteria) this;
        }

        public Criteria andLifeCyclePhaseBetween(Integer value1, Integer value2) {
            addCriterion("LIFE_CYCLE_PHASE between", value1, value2, "lifeCyclePhase");
            return (Criteria) this;
        }

        public Criteria andLifeCyclePhaseNotBetween(Integer value1, Integer value2) {
            addCriterion("LIFE_CYCLE_PHASE not between", value1, value2, "lifeCyclePhase");
            return (Criteria) this;
        }

        public Criteria andMinNumIsNull() {
            addCriterion("MIN_NUM is null");
            return (Criteria) this;
        }

        public Criteria andMinNumIsNotNull() {
            addCriterion("MIN_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andMinNumEqualTo(Double value) {
            addCriterion("MIN_NUM =", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumNotEqualTo(Double value) {
            addCriterion("MIN_NUM <>", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumGreaterThan(Double value) {
            addCriterion("MIN_NUM >", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumGreaterThanOrEqualTo(Double value) {
            addCriterion("MIN_NUM >=", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumLessThan(Double value) {
            addCriterion("MIN_NUM <", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumLessThanOrEqualTo(Double value) {
            addCriterion("MIN_NUM <=", value, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumIn(List<Double> values) {
            addCriterion("MIN_NUM in", values, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumNotIn(List<Double> values) {
            addCriterion("MIN_NUM not in", values, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumBetween(Double value1, Double value2) {
            addCriterion("MIN_NUM between", value1, value2, "minNum");
            return (Criteria) this;
        }

        public Criteria andMinNumNotBetween(Double value1, Double value2) {
            addCriterion("MIN_NUM not between", value1, value2, "minNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumIsNull() {
            addCriterion("MAX_NUM is null");
            return (Criteria) this;
        }

        public Criteria andMaxNumIsNotNull() {
            addCriterion("MAX_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andMaxNumEqualTo(Double value) {
            addCriterion("MAX_NUM =", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotEqualTo(Double value) {
            addCriterion("MAX_NUM <>", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumGreaterThan(Double value) {
            addCriterion("MAX_NUM >", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumGreaterThanOrEqualTo(Double value) {
            addCriterion("MAX_NUM >=", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumLessThan(Double value) {
            addCriterion("MAX_NUM <", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumLessThanOrEqualTo(Double value) {
            addCriterion("MAX_NUM <=", value, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumIn(List<Double> values) {
            addCriterion("MAX_NUM in", values, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotIn(List<Double> values) {
            addCriterion("MAX_NUM not in", values, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumBetween(Double value1, Double value2) {
            addCriterion("MAX_NUM between", value1, value2, "maxNum");
            return (Criteria) this;
        }

        public Criteria andMaxNumNotBetween(Double value1, Double value2) {
            addCriterion("MAX_NUM not between", value1, value2, "maxNum");
            return (Criteria) this;
        }

        public Criteria andHasAlertIsNull() {
            addCriterion("HAS_ALERT is null");
            return (Criteria) this;
        }

        public Criteria andHasAlertIsNotNull() {
            addCriterion("HAS_ALERT is not null");
            return (Criteria) this;
        }

        public Criteria andHasAlertEqualTo(Integer value) {
            addCriterion("HAS_ALERT =", value, "hasAlert");
            return (Criteria) this;
        }

        public Criteria andHasAlertNotEqualTo(Integer value) {
            addCriterion("HAS_ALERT <>", value, "hasAlert");
            return (Criteria) this;
        }

        public Criteria andHasAlertGreaterThan(Integer value) {
            addCriterion("HAS_ALERT >", value, "hasAlert");
            return (Criteria) this;
        }

        public Criteria andHasAlertGreaterThanOrEqualTo(Integer value) {
            addCriterion("HAS_ALERT >=", value, "hasAlert");
            return (Criteria) this;
        }

        public Criteria andHasAlertLessThan(Integer value) {
            addCriterion("HAS_ALERT <", value, "hasAlert");
            return (Criteria) this;
        }

        public Criteria andHasAlertLessThanOrEqualTo(Integer value) {
            addCriterion("HAS_ALERT <=", value, "hasAlert");
            return (Criteria) this;
        }

        public Criteria andHasAlertIn(List<Integer> values) {
            addCriterion("HAS_ALERT in", values, "hasAlert");
            return (Criteria) this;
        }

        public Criteria andHasAlertNotIn(List<Integer> values) {
            addCriterion("HAS_ALERT not in", values, "hasAlert");
            return (Criteria) this;
        }

        public Criteria andHasAlertBetween(Integer value1, Integer value2) {
            addCriterion("HAS_ALERT between", value1, value2, "hasAlert");
            return (Criteria) this;
        }

        public Criteria andHasAlertNotBetween(Integer value1, Integer value2) {
            addCriterion("HAS_ALERT not between", value1, value2, "hasAlert");
            return (Criteria) this;
        }

        public Criteria andManuCostIsNull() {
            addCriterion("MANU_COST is null");
            return (Criteria) this;
        }

        public Criteria andManuCostIsNotNull() {
            addCriterion("MANU_COST is not null");
            return (Criteria) this;
        }

        public Criteria andManuCostEqualTo(Double value) {
            addCriterion("MANU_COST =", value, "manuCost");
            return (Criteria) this;
        }

        public Criteria andManuCostNotEqualTo(Double value) {
            addCriterion("MANU_COST <>", value, "manuCost");
            return (Criteria) this;
        }

        public Criteria andManuCostGreaterThan(Double value) {
            addCriterion("MANU_COST >", value, "manuCost");
            return (Criteria) this;
        }

        public Criteria andManuCostGreaterThanOrEqualTo(Double value) {
            addCriterion("MANU_COST >=", value, "manuCost");
            return (Criteria) this;
        }

        public Criteria andManuCostLessThan(Double value) {
            addCriterion("MANU_COST <", value, "manuCost");
            return (Criteria) this;
        }

        public Criteria andManuCostLessThanOrEqualTo(Double value) {
            addCriterion("MANU_COST <=", value, "manuCost");
            return (Criteria) this;
        }

        public Criteria andManuCostIn(List<Double> values) {
            addCriterion("MANU_COST in", values, "manuCost");
            return (Criteria) this;
        }

        public Criteria andManuCostNotIn(List<Double> values) {
            addCriterion("MANU_COST not in", values, "manuCost");
            return (Criteria) this;
        }

        public Criteria andManuCostBetween(Double value1, Double value2) {
            addCriterion("MANU_COST between", value1, value2, "manuCost");
            return (Criteria) this;
        }

        public Criteria andManuCostNotBetween(Double value1, Double value2) {
            addCriterion("MANU_COST not between", value1, value2, "manuCost");
            return (Criteria) this;
        }

        public Criteria andBomCostIsNull() {
            addCriterion("BOM_COST is null");
            return (Criteria) this;
        }

        public Criteria andBomCostIsNotNull() {
            addCriterion("BOM_COST is not null");
            return (Criteria) this;
        }

        public Criteria andBomCostEqualTo(Double value) {
            addCriterion("BOM_COST =", value, "bomCost");
            return (Criteria) this;
        }

        public Criteria andBomCostNotEqualTo(Double value) {
            addCriterion("BOM_COST <>", value, "bomCost");
            return (Criteria) this;
        }

        public Criteria andBomCostGreaterThan(Double value) {
            addCriterion("BOM_COST >", value, "bomCost");
            return (Criteria) this;
        }

        public Criteria andBomCostGreaterThanOrEqualTo(Double value) {
            addCriterion("BOM_COST >=", value, "bomCost");
            return (Criteria) this;
        }

        public Criteria andBomCostLessThan(Double value) {
            addCriterion("BOM_COST <", value, "bomCost");
            return (Criteria) this;
        }

        public Criteria andBomCostLessThanOrEqualTo(Double value) {
            addCriterion("BOM_COST <=", value, "bomCost");
            return (Criteria) this;
        }

        public Criteria andBomCostIn(List<Double> values) {
            addCriterion("BOM_COST in", values, "bomCost");
            return (Criteria) this;
        }

        public Criteria andBomCostNotIn(List<Double> values) {
            addCriterion("BOM_COST not in", values, "bomCost");
            return (Criteria) this;
        }

        public Criteria andBomCostBetween(Double value1, Double value2) {
            addCriterion("BOM_COST between", value1, value2, "bomCost");
            return (Criteria) this;
        }

        public Criteria andBomCostNotBetween(Double value1, Double value2) {
            addCriterion("BOM_COST not between", value1, value2, "bomCost");
            return (Criteria) this;
        }

        public Criteria andMassIsNull() {
            addCriterion("MASS is null");
            return (Criteria) this;
        }

        public Criteria andMassIsNotNull() {
            addCriterion("MASS is not null");
            return (Criteria) this;
        }

        public Criteria andMassEqualTo(Integer value) {
            addCriterion("MASS =", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassNotEqualTo(Integer value) {
            addCriterion("MASS <>", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassGreaterThan(Integer value) {
            addCriterion("MASS >", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassGreaterThanOrEqualTo(Integer value) {
            addCriterion("MASS >=", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassLessThan(Integer value) {
            addCriterion("MASS <", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassLessThanOrEqualTo(Integer value) {
            addCriterion("MASS <=", value, "mass");
            return (Criteria) this;
        }

        public Criteria andMassIn(List<Integer> values) {
            addCriterion("MASS in", values, "mass");
            return (Criteria) this;
        }

        public Criteria andMassNotIn(List<Integer> values) {
            addCriterion("MASS not in", values, "mass");
            return (Criteria) this;
        }

        public Criteria andMassBetween(Integer value1, Integer value2) {
            addCriterion("MASS between", value1, value2, "mass");
            return (Criteria) this;
        }

        public Criteria andMassNotBetween(Integer value1, Integer value2) {
            addCriterion("MASS not between", value1, value2, "mass");
            return (Criteria) this;
        }

        public Criteria andRequire1IsNull() {
            addCriterion("REQUIRE1 is null");
            return (Criteria) this;
        }

        public Criteria andRequire1IsNotNull() {
            addCriterion("REQUIRE1 is not null");
            return (Criteria) this;
        }

        public Criteria andRequire1EqualTo(String value) {
            addCriterion("REQUIRE1 =", value, "require1");
            return (Criteria) this;
        }

        public Criteria andRequire1NotEqualTo(String value) {
            addCriterion("REQUIRE1 <>", value, "require1");
            return (Criteria) this;
        }

        public Criteria andRequire1GreaterThan(String value) {
            addCriterion("REQUIRE1 >", value, "require1");
            return (Criteria) this;
        }

        public Criteria andRequire1GreaterThanOrEqualTo(String value) {
            addCriterion("REQUIRE1 >=", value, "require1");
            return (Criteria) this;
        }

        public Criteria andRequire1LessThan(String value) {
            addCriterion("REQUIRE1 <", value, "require1");
            return (Criteria) this;
        }

        public Criteria andRequire1LessThanOrEqualTo(String value) {
            addCriterion("REQUIRE1 <=", value, "require1");
            return (Criteria) this;
        }

        public Criteria andRequire1Like(String value) {
            addCriterion("REQUIRE1 like", value, "require1");
            return (Criteria) this;
        }

        public Criteria andRequire1NotLike(String value) {
            addCriterion("REQUIRE1 not like", value, "require1");
            return (Criteria) this;
        }

        public Criteria andRequire1In(List<String> values) {
            addCriterion("REQUIRE1 in", values, "require1");
            return (Criteria) this;
        }

        public Criteria andRequire1NotIn(List<String> values) {
            addCriterion("REQUIRE1 not in", values, "require1");
            return (Criteria) this;
        }

        public Criteria andRequire1Between(String value1, String value2) {
            addCriterion("REQUIRE1 between", value1, value2, "require1");
            return (Criteria) this;
        }

        public Criteria andRequire1NotBetween(String value1, String value2) {
            addCriterion("REQUIRE1 not between", value1, value2, "require1");
            return (Criteria) this;
        }

        public Criteria andOpenDirecIsNull() {
            addCriterion("OPEN_DIREC is null");
            return (Criteria) this;
        }

        public Criteria andOpenDirecIsNotNull() {
            addCriterion("OPEN_DIREC is not null");
            return (Criteria) this;
        }

        public Criteria andOpenDirecEqualTo(String value) {
            addCriterion("OPEN_DIREC =", value, "openDirec");
            return (Criteria) this;
        }

        public Criteria andOpenDirecNotEqualTo(String value) {
            addCriterion("OPEN_DIREC <>", value, "openDirec");
            return (Criteria) this;
        }

        public Criteria andOpenDirecGreaterThan(String value) {
            addCriterion("OPEN_DIREC >", value, "openDirec");
            return (Criteria) this;
        }

        public Criteria andOpenDirecGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_DIREC >=", value, "openDirec");
            return (Criteria) this;
        }

        public Criteria andOpenDirecLessThan(String value) {
            addCriterion("OPEN_DIREC <", value, "openDirec");
            return (Criteria) this;
        }

        public Criteria andOpenDirecLessThanOrEqualTo(String value) {
            addCriterion("OPEN_DIREC <=", value, "openDirec");
            return (Criteria) this;
        }

        public Criteria andOpenDirecLike(String value) {
            addCriterion("OPEN_DIREC like", value, "openDirec");
            return (Criteria) this;
        }

        public Criteria andOpenDirecNotLike(String value) {
            addCriterion("OPEN_DIREC not like", value, "openDirec");
            return (Criteria) this;
        }

        public Criteria andOpenDirecIn(List<String> values) {
            addCriterion("OPEN_DIREC in", values, "openDirec");
            return (Criteria) this;
        }

        public Criteria andOpenDirecNotIn(List<String> values) {
            addCriterion("OPEN_DIREC not in", values, "openDirec");
            return (Criteria) this;
        }

        public Criteria andOpenDirecBetween(String value1, String value2) {
            addCriterion("OPEN_DIREC between", value1, value2, "openDirec");
            return (Criteria) this;
        }

        public Criteria andOpenDirecNotBetween(String value1, String value2) {
            addCriterion("OPEN_DIREC not between", value1, value2, "openDirec");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("OWNER is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("OWNER =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("OWNER <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("OWNER >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("OWNER <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("OWNER <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("OWNER like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("OWNER not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("OWNER in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("OWNER not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("OWNER between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("OWNER not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("TAX is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("TAX is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(Double value) {
            addCriterion("TAX =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(Double value) {
            addCriterion("TAX <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(Double value) {
            addCriterion("TAX >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(Double value) {
            addCriterion("TAX >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(Double value) {
            addCriterion("TAX <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(Double value) {
            addCriterion("TAX <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<Double> values) {
            addCriterion("TAX in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<Double> values) {
            addCriterion("TAX not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(Double value1, Double value2) {
            addCriterion("TAX between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(Double value1, Double value2) {
            addCriterion("TAX not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxRatioIsNull() {
            addCriterion("TAX_RATIO is null");
            return (Criteria) this;
        }

        public Criteria andTaxRatioIsNotNull() {
            addCriterion("TAX_RATIO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRatioEqualTo(Double value) {
            addCriterion("TAX_RATIO =", value, "taxRatio");
            return (Criteria) this;
        }

        public Criteria andTaxRatioNotEqualTo(Double value) {
            addCriterion("TAX_RATIO <>", value, "taxRatio");
            return (Criteria) this;
        }

        public Criteria andTaxRatioGreaterThan(Double value) {
            addCriterion("TAX_RATIO >", value, "taxRatio");
            return (Criteria) this;
        }

        public Criteria andTaxRatioGreaterThanOrEqualTo(Double value) {
            addCriterion("TAX_RATIO >=", value, "taxRatio");
            return (Criteria) this;
        }

        public Criteria andTaxRatioLessThan(Double value) {
            addCriterion("TAX_RATIO <", value, "taxRatio");
            return (Criteria) this;
        }

        public Criteria andTaxRatioLessThanOrEqualTo(Double value) {
            addCriterion("TAX_RATIO <=", value, "taxRatio");
            return (Criteria) this;
        }

        public Criteria andTaxRatioIn(List<Double> values) {
            addCriterion("TAX_RATIO in", values, "taxRatio");
            return (Criteria) this;
        }

        public Criteria andTaxRatioNotIn(List<Double> values) {
            addCriterion("TAX_RATIO not in", values, "taxRatio");
            return (Criteria) this;
        }

        public Criteria andTaxRatioBetween(Double value1, Double value2) {
            addCriterion("TAX_RATIO between", value1, value2, "taxRatio");
            return (Criteria) this;
        }

        public Criteria andTaxRatioNotBetween(Double value1, Double value2) {
            addCriterion("TAX_RATIO not between", value1, value2, "taxRatio");
            return (Criteria) this;
        }

        public Criteria andWorkerCostIsNull() {
            addCriterion("WORKER_COST is null");
            return (Criteria) this;
        }

        public Criteria andWorkerCostIsNotNull() {
            addCriterion("WORKER_COST is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerCostEqualTo(Double value) {
            addCriterion("WORKER_COST =", value, "workerCost");
            return (Criteria) this;
        }

        public Criteria andWorkerCostNotEqualTo(Double value) {
            addCriterion("WORKER_COST <>", value, "workerCost");
            return (Criteria) this;
        }

        public Criteria andWorkerCostGreaterThan(Double value) {
            addCriterion("WORKER_COST >", value, "workerCost");
            return (Criteria) this;
        }

        public Criteria andWorkerCostGreaterThanOrEqualTo(Double value) {
            addCriterion("WORKER_COST >=", value, "workerCost");
            return (Criteria) this;
        }

        public Criteria andWorkerCostLessThan(Double value) {
            addCriterion("WORKER_COST <", value, "workerCost");
            return (Criteria) this;
        }

        public Criteria andWorkerCostLessThanOrEqualTo(Double value) {
            addCriterion("WORKER_COST <=", value, "workerCost");
            return (Criteria) this;
        }

        public Criteria andWorkerCostIn(List<Double> values) {
            addCriterion("WORKER_COST in", values, "workerCost");
            return (Criteria) this;
        }

        public Criteria andWorkerCostNotIn(List<Double> values) {
            addCriterion("WORKER_COST not in", values, "workerCost");
            return (Criteria) this;
        }

        public Criteria andWorkerCostBetween(Double value1, Double value2) {
            addCriterion("WORKER_COST between", value1, value2, "workerCost");
            return (Criteria) this;
        }

        public Criteria andWorkerCostNotBetween(Double value1, Double value2) {
            addCriterion("WORKER_COST not between", value1, value2, "workerCost");
            return (Criteria) this;
        }

        public Criteria andNeedBarcodeIsNull() {
            addCriterion("NEED_BARCODE is null");
            return (Criteria) this;
        }

        public Criteria andNeedBarcodeIsNotNull() {
            addCriterion("NEED_BARCODE is not null");
            return (Criteria) this;
        }

        public Criteria andNeedBarcodeEqualTo(Integer value) {
            addCriterion("NEED_BARCODE =", value, "needBarcode");
            return (Criteria) this;
        }

        public Criteria andNeedBarcodeNotEqualTo(Integer value) {
            addCriterion("NEED_BARCODE <>", value, "needBarcode");
            return (Criteria) this;
        }

        public Criteria andNeedBarcodeGreaterThan(Integer value) {
            addCriterion("NEED_BARCODE >", value, "needBarcode");
            return (Criteria) this;
        }

        public Criteria andNeedBarcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEED_BARCODE >=", value, "needBarcode");
            return (Criteria) this;
        }

        public Criteria andNeedBarcodeLessThan(Integer value) {
            addCriterion("NEED_BARCODE <", value, "needBarcode");
            return (Criteria) this;
        }

        public Criteria andNeedBarcodeLessThanOrEqualTo(Integer value) {
            addCriterion("NEED_BARCODE <=", value, "needBarcode");
            return (Criteria) this;
        }

        public Criteria andNeedBarcodeIn(List<Integer> values) {
            addCriterion("NEED_BARCODE in", values, "needBarcode");
            return (Criteria) this;
        }

        public Criteria andNeedBarcodeNotIn(List<Integer> values) {
            addCriterion("NEED_BARCODE not in", values, "needBarcode");
            return (Criteria) this;
        }

        public Criteria andNeedBarcodeBetween(Integer value1, Integer value2) {
            addCriterion("NEED_BARCODE between", value1, value2, "needBarcode");
            return (Criteria) this;
        }

        public Criteria andNeedBarcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("NEED_BARCODE not between", value1, value2, "needBarcode");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIsNull() {
            addCriterion("CHECK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIsNotNull() {
            addCriterion("CHECK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeEqualTo(Integer value) {
            addCriterion("CHECK_TYPE =", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotEqualTo(Integer value) {
            addCriterion("CHECK_TYPE <>", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThan(Integer value) {
            addCriterion("CHECK_TYPE >", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHECK_TYPE >=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThan(Integer value) {
            addCriterion("CHECK_TYPE <", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThanOrEqualTo(Integer value) {
            addCriterion("CHECK_TYPE <=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIn(List<Integer> values) {
            addCriterion("CHECK_TYPE in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotIn(List<Integer> values) {
            addCriterion("CHECK_TYPE not in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_TYPE between", value1, value2, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_TYPE not between", value1, value2, "checkType");
            return (Criteria) this;
        }

        public Criteria andNeedAmlIsNull() {
            addCriterion("NEED_AML is null");
            return (Criteria) this;
        }

        public Criteria andNeedAmlIsNotNull() {
            addCriterion("NEED_AML is not null");
            return (Criteria) this;
        }

        public Criteria andNeedAmlEqualTo(Integer value) {
            addCriterion("NEED_AML =", value, "needAml");
            return (Criteria) this;
        }

        public Criteria andNeedAmlNotEqualTo(Integer value) {
            addCriterion("NEED_AML <>", value, "needAml");
            return (Criteria) this;
        }

        public Criteria andNeedAmlGreaterThan(Integer value) {
            addCriterion("NEED_AML >", value, "needAml");
            return (Criteria) this;
        }

        public Criteria andNeedAmlGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEED_AML >=", value, "needAml");
            return (Criteria) this;
        }

        public Criteria andNeedAmlLessThan(Integer value) {
            addCriterion("NEED_AML <", value, "needAml");
            return (Criteria) this;
        }

        public Criteria andNeedAmlLessThanOrEqualTo(Integer value) {
            addCriterion("NEED_AML <=", value, "needAml");
            return (Criteria) this;
        }

        public Criteria andNeedAmlIn(List<Integer> values) {
            addCriterion("NEED_AML in", values, "needAml");
            return (Criteria) this;
        }

        public Criteria andNeedAmlNotIn(List<Integer> values) {
            addCriterion("NEED_AML not in", values, "needAml");
            return (Criteria) this;
        }

        public Criteria andNeedAmlBetween(Integer value1, Integer value2) {
            addCriterion("NEED_AML between", value1, value2, "needAml");
            return (Criteria) this;
        }

        public Criteria andNeedAmlNotBetween(Integer value1, Integer value2) {
            addCriterion("NEED_AML not between", value1, value2, "needAml");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNull() {
            addCriterion("PLAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNotNull() {
            addCriterion("PLAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlanIdEqualTo(Integer value) {
            addCriterion("PLAN_ID =", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotEqualTo(Integer value) {
            addCriterion("PLAN_ID <>", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThan(Integer value) {
            addCriterion("PLAN_ID >", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLAN_ID >=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThan(Integer value) {
            addCriterion("PLAN_ID <", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThanOrEqualTo(Integer value) {
            addCriterion("PLAN_ID <=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIn(List<Integer> values) {
            addCriterion("PLAN_ID in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotIn(List<Integer> values) {
            addCriterion("PLAN_ID not in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdBetween(Integer value1, Integer value2) {
            addCriterion("PLAN_ID between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PLAN_ID not between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("CUST_ID like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("CUST_ID not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andName1IsNull() {
            addCriterion("NAME_1 is null");
            return (Criteria) this;
        }

        public Criteria andName1IsNotNull() {
            addCriterion("NAME_1 is not null");
            return (Criteria) this;
        }

        public Criteria andName1EqualTo(String value) {
            addCriterion("NAME_1 =", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotEqualTo(String value) {
            addCriterion("NAME_1 <>", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1GreaterThan(String value) {
            addCriterion("NAME_1 >", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1GreaterThanOrEqualTo(String value) {
            addCriterion("NAME_1 >=", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1LessThan(String value) {
            addCriterion("NAME_1 <", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1LessThanOrEqualTo(String value) {
            addCriterion("NAME_1 <=", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1Like(String value) {
            addCriterion("NAME_1 like", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotLike(String value) {
            addCriterion("NAME_1 not like", value, "name1");
            return (Criteria) this;
        }

        public Criteria andName1In(List<String> values) {
            addCriterion("NAME_1 in", values, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotIn(List<String> values) {
            addCriterion("NAME_1 not in", values, "name1");
            return (Criteria) this;
        }

        public Criteria andName1Between(String value1, String value2) {
            addCriterion("NAME_1 between", value1, value2, "name1");
            return (Criteria) this;
        }

        public Criteria andName1NotBetween(String value1, String value2) {
            addCriterion("NAME_1 not between", value1, value2, "name1");
            return (Criteria) this;
        }

        public Criteria andName2IsNull() {
            addCriterion("NAME_2 is null");
            return (Criteria) this;
        }

        public Criteria andName2IsNotNull() {
            addCriterion("NAME_2 is not null");
            return (Criteria) this;
        }

        public Criteria andName2EqualTo(String value) {
            addCriterion("NAME_2 =", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2NotEqualTo(String value) {
            addCriterion("NAME_2 <>", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2GreaterThan(String value) {
            addCriterion("NAME_2 >", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2GreaterThanOrEqualTo(String value) {
            addCriterion("NAME_2 >=", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2LessThan(String value) {
            addCriterion("NAME_2 <", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2LessThanOrEqualTo(String value) {
            addCriterion("NAME_2 <=", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2Like(String value) {
            addCriterion("NAME_2 like", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2NotLike(String value) {
            addCriterion("NAME_2 not like", value, "name2");
            return (Criteria) this;
        }

        public Criteria andName2In(List<String> values) {
            addCriterion("NAME_2 in", values, "name2");
            return (Criteria) this;
        }

        public Criteria andName2NotIn(List<String> values) {
            addCriterion("NAME_2 not in", values, "name2");
            return (Criteria) this;
        }

        public Criteria andName2Between(String value1, String value2) {
            addCriterion("NAME_2 between", value1, value2, "name2");
            return (Criteria) this;
        }

        public Criteria andName2NotBetween(String value1, String value2) {
            addCriterion("NAME_2 not between", value1, value2, "name2");
            return (Criteria) this;
        }

        public Criteria andWhIdIsNull() {
            addCriterion("WH_ID is null");
            return (Criteria) this;
        }

        public Criteria andWhIdIsNotNull() {
            addCriterion("WH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWhIdEqualTo(String value) {
            addCriterion("WH_ID =", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotEqualTo(String value) {
            addCriterion("WH_ID <>", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdGreaterThan(String value) {
            addCriterion("WH_ID >", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdGreaterThanOrEqualTo(String value) {
            addCriterion("WH_ID >=", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdLessThan(String value) {
            addCriterion("WH_ID <", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdLessThanOrEqualTo(String value) {
            addCriterion("WH_ID <=", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdLike(String value) {
            addCriterion("WH_ID like", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotLike(String value) {
            addCriterion("WH_ID not like", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdIn(List<String> values) {
            addCriterion("WH_ID in", values, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotIn(List<String> values) {
            addCriterion("WH_ID not in", values, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdBetween(String value1, String value2) {
            addCriterion("WH_ID between", value1, value2, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotBetween(String value1, String value2) {
            addCriterion("WH_ID not between", value1, value2, "whId");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNull() {
            addCriterion("SALE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andSalePriceIsNotNull() {
            addCriterion("SALE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSalePriceEqualTo(Double value) {
            addCriterion("SALE_PRICE =", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotEqualTo(Double value) {
            addCriterion("SALE_PRICE <>", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThan(Double value) {
            addCriterion("SALE_PRICE >", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("SALE_PRICE >=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThan(Double value) {
            addCriterion("SALE_PRICE <", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceLessThanOrEqualTo(Double value) {
            addCriterion("SALE_PRICE <=", value, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceIn(List<Double> values) {
            addCriterion("SALE_PRICE in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotIn(List<Double> values) {
            addCriterion("SALE_PRICE not in", values, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceBetween(Double value1, Double value2) {
            addCriterion("SALE_PRICE between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andSalePriceNotBetween(Double value1, Double value2) {
            addCriterion("SALE_PRICE not between", value1, value2, "salePrice");
            return (Criteria) this;
        }

        public Criteria andPriceUpdateDateIsNull() {
            addCriterion("PRICE_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPriceUpdateDateIsNotNull() {
            addCriterion("PRICE_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceUpdateDateEqualTo(Date value) {
            addCriterion("PRICE_UPDATE_DATE =", value, "priceUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPriceUpdateDateNotEqualTo(Date value) {
            addCriterion("PRICE_UPDATE_DATE <>", value, "priceUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPriceUpdateDateGreaterThan(Date value) {
            addCriterion("PRICE_UPDATE_DATE >", value, "priceUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPriceUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PRICE_UPDATE_DATE >=", value, "priceUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPriceUpdateDateLessThan(Date value) {
            addCriterion("PRICE_UPDATE_DATE <", value, "priceUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPriceUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("PRICE_UPDATE_DATE <=", value, "priceUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPriceUpdateDateIn(List<Date> values) {
            addCriterion("PRICE_UPDATE_DATE in", values, "priceUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPriceUpdateDateNotIn(List<Date> values) {
            addCriterion("PRICE_UPDATE_DATE not in", values, "priceUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPriceUpdateDateBetween(Date value1, Date value2) {
            addCriterion("PRICE_UPDATE_DATE between", value1, value2, "priceUpdateDate");
            return (Criteria) this;
        }

        public Criteria andPriceUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("PRICE_UPDATE_DATE not between", value1, value2, "priceUpdateDate");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("WEIGHT =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("WEIGHT <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("WEIGHT >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("WEIGHT >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("WEIGHT <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("WEIGHT <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("WEIGHT in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("WEIGHT not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("WEIGHT between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("WEIGHT not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("CUST_NAME =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("CUST_NAME <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("CUST_NAME >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NAME >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("CUST_NAME <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_NAME <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("CUST_NAME like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("CUST_NAME not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("CUST_NAME in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("CUST_NAME not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("CUST_NAME between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("CUST_NAME not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andAttr1IsNull() {
            addCriterion("ATTR_1 is null");
            return (Criteria) this;
        }

        public Criteria andAttr1IsNotNull() {
            addCriterion("ATTR_1 is not null");
            return (Criteria) this;
        }

        public Criteria andAttr1EqualTo(String value) {
            addCriterion("ATTR_1 =", value, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1NotEqualTo(String value) {
            addCriterion("ATTR_1 <>", value, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1GreaterThan(String value) {
            addCriterion("ATTR_1 >", value, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1GreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_1 >=", value, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1LessThan(String value) {
            addCriterion("ATTR_1 <", value, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1LessThanOrEqualTo(String value) {
            addCriterion("ATTR_1 <=", value, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1Like(String value) {
            addCriterion("ATTR_1 like", value, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1NotLike(String value) {
            addCriterion("ATTR_1 not like", value, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1In(List<String> values) {
            addCriterion("ATTR_1 in", values, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1NotIn(List<String> values) {
            addCriterion("ATTR_1 not in", values, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1Between(String value1, String value2) {
            addCriterion("ATTR_1 between", value1, value2, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr1NotBetween(String value1, String value2) {
            addCriterion("ATTR_1 not between", value1, value2, "attr1");
            return (Criteria) this;
        }

        public Criteria andAttr2IsNull() {
            addCriterion("ATTR_2 is null");
            return (Criteria) this;
        }

        public Criteria andAttr2IsNotNull() {
            addCriterion("ATTR_2 is not null");
            return (Criteria) this;
        }

        public Criteria andAttr2EqualTo(String value) {
            addCriterion("ATTR_2 =", value, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2NotEqualTo(String value) {
            addCriterion("ATTR_2 <>", value, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2GreaterThan(String value) {
            addCriterion("ATTR_2 >", value, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2GreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_2 >=", value, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2LessThan(String value) {
            addCriterion("ATTR_2 <", value, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2LessThanOrEqualTo(String value) {
            addCriterion("ATTR_2 <=", value, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2Like(String value) {
            addCriterion("ATTR_2 like", value, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2NotLike(String value) {
            addCriterion("ATTR_2 not like", value, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2In(List<String> values) {
            addCriterion("ATTR_2 in", values, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2NotIn(List<String> values) {
            addCriterion("ATTR_2 not in", values, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2Between(String value1, String value2) {
            addCriterion("ATTR_2 between", value1, value2, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr2NotBetween(String value1, String value2) {
            addCriterion("ATTR_2 not between", value1, value2, "attr2");
            return (Criteria) this;
        }

        public Criteria andAttr3IsNull() {
            addCriterion("ATTR_3 is null");
            return (Criteria) this;
        }

        public Criteria andAttr3IsNotNull() {
            addCriterion("ATTR_3 is not null");
            return (Criteria) this;
        }

        public Criteria andAttr3EqualTo(String value) {
            addCriterion("ATTR_3 =", value, "attr3");
            return (Criteria) this;
        }

        public Criteria andAttr3NotEqualTo(String value) {
            addCriterion("ATTR_3 <>", value, "attr3");
            return (Criteria) this;
        }

        public Criteria andAttr3GreaterThan(String value) {
            addCriterion("ATTR_3 >", value, "attr3");
            return (Criteria) this;
        }

        public Criteria andAttr3GreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_3 >=", value, "attr3");
            return (Criteria) this;
        }

        public Criteria andAttr3LessThan(String value) {
            addCriterion("ATTR_3 <", value, "attr3");
            return (Criteria) this;
        }

        public Criteria andAttr3LessThanOrEqualTo(String value) {
            addCriterion("ATTR_3 <=", value, "attr3");
            return (Criteria) this;
        }

        public Criteria andAttr3Like(String value) {
            addCriterion("ATTR_3 like", value, "attr3");
            return (Criteria) this;
        }

        public Criteria andAttr3NotLike(String value) {
            addCriterion("ATTR_3 not like", value, "attr3");
            return (Criteria) this;
        }

        public Criteria andAttr3In(List<String> values) {
            addCriterion("ATTR_3 in", values, "attr3");
            return (Criteria) this;
        }

        public Criteria andAttr3NotIn(List<String> values) {
            addCriterion("ATTR_3 not in", values, "attr3");
            return (Criteria) this;
        }

        public Criteria andAttr3Between(String value1, String value2) {
            addCriterion("ATTR_3 between", value1, value2, "attr3");
            return (Criteria) this;
        }

        public Criteria andAttr3NotBetween(String value1, String value2) {
            addCriterion("ATTR_3 not between", value1, value2, "attr3");
            return (Criteria) this;
        }

        public Criteria andAttr4IsNull() {
            addCriterion("ATTR_4 is null");
            return (Criteria) this;
        }

        public Criteria andAttr4IsNotNull() {
            addCriterion("ATTR_4 is not null");
            return (Criteria) this;
        }

        public Criteria andAttr4EqualTo(String value) {
            addCriterion("ATTR_4 =", value, "attr4");
            return (Criteria) this;
        }

        public Criteria andAttr4NotEqualTo(String value) {
            addCriterion("ATTR_4 <>", value, "attr4");
            return (Criteria) this;
        }

        public Criteria andAttr4GreaterThan(String value) {
            addCriterion("ATTR_4 >", value, "attr4");
            return (Criteria) this;
        }

        public Criteria andAttr4GreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_4 >=", value, "attr4");
            return (Criteria) this;
        }

        public Criteria andAttr4LessThan(String value) {
            addCriterion("ATTR_4 <", value, "attr4");
            return (Criteria) this;
        }

        public Criteria andAttr4LessThanOrEqualTo(String value) {
            addCriterion("ATTR_4 <=", value, "attr4");
            return (Criteria) this;
        }

        public Criteria andAttr4Like(String value) {
            addCriterion("ATTR_4 like", value, "attr4");
            return (Criteria) this;
        }

        public Criteria andAttr4NotLike(String value) {
            addCriterion("ATTR_4 not like", value, "attr4");
            return (Criteria) this;
        }

        public Criteria andAttr4In(List<String> values) {
            addCriterion("ATTR_4 in", values, "attr4");
            return (Criteria) this;
        }

        public Criteria andAttr4NotIn(List<String> values) {
            addCriterion("ATTR_4 not in", values, "attr4");
            return (Criteria) this;
        }

        public Criteria andAttr4Between(String value1, String value2) {
            addCriterion("ATTR_4 between", value1, value2, "attr4");
            return (Criteria) this;
        }

        public Criteria andAttr4NotBetween(String value1, String value2) {
            addCriterion("ATTR_4 not between", value1, value2, "attr4");
            return (Criteria) this;
        }

        public Criteria andAttr5IsNull() {
            addCriterion("ATTR_5 is null");
            return (Criteria) this;
        }

        public Criteria andAttr5IsNotNull() {
            addCriterion("ATTR_5 is not null");
            return (Criteria) this;
        }

        public Criteria andAttr5EqualTo(String value) {
            addCriterion("ATTR_5 =", value, "attr5");
            return (Criteria) this;
        }

        public Criteria andAttr5NotEqualTo(String value) {
            addCriterion("ATTR_5 <>", value, "attr5");
            return (Criteria) this;
        }

        public Criteria andAttr5GreaterThan(String value) {
            addCriterion("ATTR_5 >", value, "attr5");
            return (Criteria) this;
        }

        public Criteria andAttr5GreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_5 >=", value, "attr5");
            return (Criteria) this;
        }

        public Criteria andAttr5LessThan(String value) {
            addCriterion("ATTR_5 <", value, "attr5");
            return (Criteria) this;
        }

        public Criteria andAttr5LessThanOrEqualTo(String value) {
            addCriterion("ATTR_5 <=", value, "attr5");
            return (Criteria) this;
        }

        public Criteria andAttr5Like(String value) {
            addCriterion("ATTR_5 like", value, "attr5");
            return (Criteria) this;
        }

        public Criteria andAttr5NotLike(String value) {
            addCriterion("ATTR_5 not like", value, "attr5");
            return (Criteria) this;
        }

        public Criteria andAttr5In(List<String> values) {
            addCriterion("ATTR_5 in", values, "attr5");
            return (Criteria) this;
        }

        public Criteria andAttr5NotIn(List<String> values) {
            addCriterion("ATTR_5 not in", values, "attr5");
            return (Criteria) this;
        }

        public Criteria andAttr5Between(String value1, String value2) {
            addCriterion("ATTR_5 between", value1, value2, "attr5");
            return (Criteria) this;
        }

        public Criteria andAttr5NotBetween(String value1, String value2) {
            addCriterion("ATTR_5 not between", value1, value2, "attr5");
            return (Criteria) this;
        }

        public Criteria andAttr6IsNull() {
            addCriterion("ATTR_6 is null");
            return (Criteria) this;
        }

        public Criteria andAttr6IsNotNull() {
            addCriterion("ATTR_6 is not null");
            return (Criteria) this;
        }

        public Criteria andAttr6EqualTo(String value) {
            addCriterion("ATTR_6 =", value, "attr6");
            return (Criteria) this;
        }

        public Criteria andAttr6NotEqualTo(String value) {
            addCriterion("ATTR_6 <>", value, "attr6");
            return (Criteria) this;
        }

        public Criteria andAttr6GreaterThan(String value) {
            addCriterion("ATTR_6 >", value, "attr6");
            return (Criteria) this;
        }

        public Criteria andAttr6GreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_6 >=", value, "attr6");
            return (Criteria) this;
        }

        public Criteria andAttr6LessThan(String value) {
            addCriterion("ATTR_6 <", value, "attr6");
            return (Criteria) this;
        }

        public Criteria andAttr6LessThanOrEqualTo(String value) {
            addCriterion("ATTR_6 <=", value, "attr6");
            return (Criteria) this;
        }

        public Criteria andAttr6Like(String value) {
            addCriterion("ATTR_6 like", value, "attr6");
            return (Criteria) this;
        }

        public Criteria andAttr6NotLike(String value) {
            addCriterion("ATTR_6 not like", value, "attr6");
            return (Criteria) this;
        }

        public Criteria andAttr6In(List<String> values) {
            addCriterion("ATTR_6 in", values, "attr6");
            return (Criteria) this;
        }

        public Criteria andAttr6NotIn(List<String> values) {
            addCriterion("ATTR_6 not in", values, "attr6");
            return (Criteria) this;
        }

        public Criteria andAttr6Between(String value1, String value2) {
            addCriterion("ATTR_6 between", value1, value2, "attr6");
            return (Criteria) this;
        }

        public Criteria andAttr6NotBetween(String value1, String value2) {
            addCriterion("ATTR_6 not between", value1, value2, "attr6");
            return (Criteria) this;
        }

        public Criteria andAttr7IsNull() {
            addCriterion("ATTR_7 is null");
            return (Criteria) this;
        }

        public Criteria andAttr7IsNotNull() {
            addCriterion("ATTR_7 is not null");
            return (Criteria) this;
        }

        public Criteria andAttr7EqualTo(String value) {
            addCriterion("ATTR_7 =", value, "attr7");
            return (Criteria) this;
        }

        public Criteria andAttr7NotEqualTo(String value) {
            addCriterion("ATTR_7 <>", value, "attr7");
            return (Criteria) this;
        }

        public Criteria andAttr7GreaterThan(String value) {
            addCriterion("ATTR_7 >", value, "attr7");
            return (Criteria) this;
        }

        public Criteria andAttr7GreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_7 >=", value, "attr7");
            return (Criteria) this;
        }

        public Criteria andAttr7LessThan(String value) {
            addCriterion("ATTR_7 <", value, "attr7");
            return (Criteria) this;
        }

        public Criteria andAttr7LessThanOrEqualTo(String value) {
            addCriterion("ATTR_7 <=", value, "attr7");
            return (Criteria) this;
        }

        public Criteria andAttr7Like(String value) {
            addCriterion("ATTR_7 like", value, "attr7");
            return (Criteria) this;
        }

        public Criteria andAttr7NotLike(String value) {
            addCriterion("ATTR_7 not like", value, "attr7");
            return (Criteria) this;
        }

        public Criteria andAttr7In(List<String> values) {
            addCriterion("ATTR_7 in", values, "attr7");
            return (Criteria) this;
        }

        public Criteria andAttr7NotIn(List<String> values) {
            addCriterion("ATTR_7 not in", values, "attr7");
            return (Criteria) this;
        }

        public Criteria andAttr7Between(String value1, String value2) {
            addCriterion("ATTR_7 between", value1, value2, "attr7");
            return (Criteria) this;
        }

        public Criteria andAttr7NotBetween(String value1, String value2) {
            addCriterion("ATTR_7 not between", value1, value2, "attr7");
            return (Criteria) this;
        }

        public Criteria andAttr8IsNull() {
            addCriterion("ATTR_8 is null");
            return (Criteria) this;
        }

        public Criteria andAttr8IsNotNull() {
            addCriterion("ATTR_8 is not null");
            return (Criteria) this;
        }

        public Criteria andAttr8EqualTo(String value) {
            addCriterion("ATTR_8 =", value, "attr8");
            return (Criteria) this;
        }

        public Criteria andAttr8NotEqualTo(String value) {
            addCriterion("ATTR_8 <>", value, "attr8");
            return (Criteria) this;
        }

        public Criteria andAttr8GreaterThan(String value) {
            addCriterion("ATTR_8 >", value, "attr8");
            return (Criteria) this;
        }

        public Criteria andAttr8GreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_8 >=", value, "attr8");
            return (Criteria) this;
        }

        public Criteria andAttr8LessThan(String value) {
            addCriterion("ATTR_8 <", value, "attr8");
            return (Criteria) this;
        }

        public Criteria andAttr8LessThanOrEqualTo(String value) {
            addCriterion("ATTR_8 <=", value, "attr8");
            return (Criteria) this;
        }

        public Criteria andAttr8Like(String value) {
            addCriterion("ATTR_8 like", value, "attr8");
            return (Criteria) this;
        }

        public Criteria andAttr8NotLike(String value) {
            addCriterion("ATTR_8 not like", value, "attr8");
            return (Criteria) this;
        }

        public Criteria andAttr8In(List<String> values) {
            addCriterion("ATTR_8 in", values, "attr8");
            return (Criteria) this;
        }

        public Criteria andAttr8NotIn(List<String> values) {
            addCriterion("ATTR_8 not in", values, "attr8");
            return (Criteria) this;
        }

        public Criteria andAttr8Between(String value1, String value2) {
            addCriterion("ATTR_8 between", value1, value2, "attr8");
            return (Criteria) this;
        }

        public Criteria andAttr8NotBetween(String value1, String value2) {
            addCriterion("ATTR_8 not between", value1, value2, "attr8");
            return (Criteria) this;
        }

        public Criteria andAttr9IsNull() {
            addCriterion("ATTR_9 is null");
            return (Criteria) this;
        }

        public Criteria andAttr9IsNotNull() {
            addCriterion("ATTR_9 is not null");
            return (Criteria) this;
        }

        public Criteria andAttr9EqualTo(String value) {
            addCriterion("ATTR_9 =", value, "attr9");
            return (Criteria) this;
        }

        public Criteria andAttr9NotEqualTo(String value) {
            addCriterion("ATTR_9 <>", value, "attr9");
            return (Criteria) this;
        }

        public Criteria andAttr9GreaterThan(String value) {
            addCriterion("ATTR_9 >", value, "attr9");
            return (Criteria) this;
        }

        public Criteria andAttr9GreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_9 >=", value, "attr9");
            return (Criteria) this;
        }

        public Criteria andAttr9LessThan(String value) {
            addCriterion("ATTR_9 <", value, "attr9");
            return (Criteria) this;
        }

        public Criteria andAttr9LessThanOrEqualTo(String value) {
            addCriterion("ATTR_9 <=", value, "attr9");
            return (Criteria) this;
        }

        public Criteria andAttr9Like(String value) {
            addCriterion("ATTR_9 like", value, "attr9");
            return (Criteria) this;
        }

        public Criteria andAttr9NotLike(String value) {
            addCriterion("ATTR_9 not like", value, "attr9");
            return (Criteria) this;
        }

        public Criteria andAttr9In(List<String> values) {
            addCriterion("ATTR_9 in", values, "attr9");
            return (Criteria) this;
        }

        public Criteria andAttr9NotIn(List<String> values) {
            addCriterion("ATTR_9 not in", values, "attr9");
            return (Criteria) this;
        }

        public Criteria andAttr9Between(String value1, String value2) {
            addCriterion("ATTR_9 between", value1, value2, "attr9");
            return (Criteria) this;
        }

        public Criteria andAttr9NotBetween(String value1, String value2) {
            addCriterion("ATTR_9 not between", value1, value2, "attr9");
            return (Criteria) this;
        }

        public Criteria andWeight2IsNull() {
            addCriterion("WEIGHT_2 is null");
            return (Criteria) this;
        }

        public Criteria andWeight2IsNotNull() {
            addCriterion("WEIGHT_2 is not null");
            return (Criteria) this;
        }

        public Criteria andWeight2EqualTo(String value) {
            addCriterion("WEIGHT_2 =", value, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2NotEqualTo(String value) {
            addCriterion("WEIGHT_2 <>", value, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2GreaterThan(String value) {
            addCriterion("WEIGHT_2 >", value, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2GreaterThanOrEqualTo(String value) {
            addCriterion("WEIGHT_2 >=", value, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2LessThan(String value) {
            addCriterion("WEIGHT_2 <", value, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2LessThanOrEqualTo(String value) {
            addCriterion("WEIGHT_2 <=", value, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2Like(String value) {
            addCriterion("WEIGHT_2 like", value, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2NotLike(String value) {
            addCriterion("WEIGHT_2 not like", value, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2In(List<String> values) {
            addCriterion("WEIGHT_2 in", values, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2NotIn(List<String> values) {
            addCriterion("WEIGHT_2 not in", values, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2Between(String value1, String value2) {
            addCriterion("WEIGHT_2 between", value1, value2, "weight2");
            return (Criteria) this;
        }

        public Criteria andWeight2NotBetween(String value1, String value2) {
            addCriterion("WEIGHT_2 not between", value1, value2, "weight2");
            return (Criteria) this;
        }

        public Criteria andAttr10IsNull() {
            addCriterion("ATTR_10 is null");
            return (Criteria) this;
        }

        public Criteria andAttr10IsNotNull() {
            addCriterion("ATTR_10 is not null");
            return (Criteria) this;
        }

        public Criteria andAttr10EqualTo(String value) {
            addCriterion("ATTR_10 =", value, "attr10");
            return (Criteria) this;
        }

        public Criteria andAttr10NotEqualTo(String value) {
            addCriterion("ATTR_10 <>", value, "attr10");
            return (Criteria) this;
        }

        public Criteria andAttr10GreaterThan(String value) {
            addCriterion("ATTR_10 >", value, "attr10");
            return (Criteria) this;
        }

        public Criteria andAttr10GreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_10 >=", value, "attr10");
            return (Criteria) this;
        }

        public Criteria andAttr10LessThan(String value) {
            addCriterion("ATTR_10 <", value, "attr10");
            return (Criteria) this;
        }

        public Criteria andAttr10LessThanOrEqualTo(String value) {
            addCriterion("ATTR_10 <=", value, "attr10");
            return (Criteria) this;
        }

        public Criteria andAttr10Like(String value) {
            addCriterion("ATTR_10 like", value, "attr10");
            return (Criteria) this;
        }

        public Criteria andAttr10NotLike(String value) {
            addCriterion("ATTR_10 not like", value, "attr10");
            return (Criteria) this;
        }

        public Criteria andAttr10In(List<String> values) {
            addCriterion("ATTR_10 in", values, "attr10");
            return (Criteria) this;
        }

        public Criteria andAttr10NotIn(List<String> values) {
            addCriterion("ATTR_10 not in", values, "attr10");
            return (Criteria) this;
        }

        public Criteria andAttr10Between(String value1, String value2) {
            addCriterion("ATTR_10 between", value1, value2, "attr10");
            return (Criteria) this;
        }

        public Criteria andAttr10NotBetween(String value1, String value2) {
            addCriterion("ATTR_10 not between", value1, value2, "attr10");
            return (Criteria) this;
        }

        public Criteria andWeight3IsNull() {
            addCriterion("WEIGHT_3 is null");
            return (Criteria) this;
        }

        public Criteria andWeight3IsNotNull() {
            addCriterion("WEIGHT_3 is not null");
            return (Criteria) this;
        }

        public Criteria andWeight3EqualTo(Double value) {
            addCriterion("WEIGHT_3 =", value, "weight3");
            return (Criteria) this;
        }

        public Criteria andWeight3NotEqualTo(Double value) {
            addCriterion("WEIGHT_3 <>", value, "weight3");
            return (Criteria) this;
        }

        public Criteria andWeight3GreaterThan(Double value) {
            addCriterion("WEIGHT_3 >", value, "weight3");
            return (Criteria) this;
        }

        public Criteria andWeight3GreaterThanOrEqualTo(Double value) {
            addCriterion("WEIGHT_3 >=", value, "weight3");
            return (Criteria) this;
        }

        public Criteria andWeight3LessThan(Double value) {
            addCriterion("WEIGHT_3 <", value, "weight3");
            return (Criteria) this;
        }

        public Criteria andWeight3LessThanOrEqualTo(Double value) {
            addCriterion("WEIGHT_3 <=", value, "weight3");
            return (Criteria) this;
        }

        public Criteria andWeight3In(List<Double> values) {
            addCriterion("WEIGHT_3 in", values, "weight3");
            return (Criteria) this;
        }

        public Criteria andWeight3NotIn(List<Double> values) {
            addCriterion("WEIGHT_3 not in", values, "weight3");
            return (Criteria) this;
        }

        public Criteria andWeight3Between(Double value1, Double value2) {
            addCriterion("WEIGHT_3 between", value1, value2, "weight3");
            return (Criteria) this;
        }

        public Criteria andWeight3NotBetween(Double value1, Double value2) {
            addCriterion("WEIGHT_3 not between", value1, value2, "weight3");
            return (Criteria) this;
        }

        public Criteria andBuyTypeIsNull() {
            addCriterion("BUY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBuyTypeIsNotNull() {
            addCriterion("BUY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTypeEqualTo(Integer value) {
            addCriterion("BUY_TYPE =", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeNotEqualTo(Integer value) {
            addCriterion("BUY_TYPE <>", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeGreaterThan(Integer value) {
            addCriterion("BUY_TYPE >", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUY_TYPE >=", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeLessThan(Integer value) {
            addCriterion("BUY_TYPE <", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("BUY_TYPE <=", value, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeIn(List<Integer> values) {
            addCriterion("BUY_TYPE in", values, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeNotIn(List<Integer> values) {
            addCriterion("BUY_TYPE not in", values, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeBetween(Integer value1, Integer value2) {
            addCriterion("BUY_TYPE between", value1, value2, "buyType");
            return (Criteria) this;
        }

        public Criteria andBuyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("BUY_TYPE not between", value1, value2, "buyType");
            return (Criteria) this;
        }

        public Criteria andNameenglishIsNull() {
            addCriterion("nameEnglish is null");
            return (Criteria) this;
        }

        public Criteria andNameenglishIsNotNull() {
            addCriterion("nameEnglish is not null");
            return (Criteria) this;
        }

        public Criteria andNameenglishEqualTo(String value) {
            addCriterion("nameEnglish =", value, "nameenglish");
            return (Criteria) this;
        }

        public Criteria andNameenglishNotEqualTo(String value) {
            addCriterion("nameEnglish <>", value, "nameenglish");
            return (Criteria) this;
        }

        public Criteria andNameenglishGreaterThan(String value) {
            addCriterion("nameEnglish >", value, "nameenglish");
            return (Criteria) this;
        }

        public Criteria andNameenglishGreaterThanOrEqualTo(String value) {
            addCriterion("nameEnglish >=", value, "nameenglish");
            return (Criteria) this;
        }

        public Criteria andNameenglishLessThan(String value) {
            addCriterion("nameEnglish <", value, "nameenglish");
            return (Criteria) this;
        }

        public Criteria andNameenglishLessThanOrEqualTo(String value) {
            addCriterion("nameEnglish <=", value, "nameenglish");
            return (Criteria) this;
        }

        public Criteria andNameenglishLike(String value) {
            addCriterion("nameEnglish like", value, "nameenglish");
            return (Criteria) this;
        }

        public Criteria andNameenglishNotLike(String value) {
            addCriterion("nameEnglish not like", value, "nameenglish");
            return (Criteria) this;
        }

        public Criteria andNameenglishIn(List<String> values) {
            addCriterion("nameEnglish in", values, "nameenglish");
            return (Criteria) this;
        }

        public Criteria andNameenglishNotIn(List<String> values) {
            addCriterion("nameEnglish not in", values, "nameenglish");
            return (Criteria) this;
        }

        public Criteria andNameenglishBetween(String value1, String value2) {
            addCriterion("nameEnglish between", value1, value2, "nameenglish");
            return (Criteria) this;
        }

        public Criteria andNameenglishNotBetween(String value1, String value2) {
            addCriterion("nameEnglish not between", value1, value2, "nameenglish");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberIsNull() {
            addCriterion("approvalNumber is null");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberIsNotNull() {
            addCriterion("approvalNumber is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberEqualTo(String value) {
            addCriterion("approvalNumber =", value, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberNotEqualTo(String value) {
            addCriterion("approvalNumber <>", value, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberGreaterThan(String value) {
            addCriterion("approvalNumber >", value, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberGreaterThanOrEqualTo(String value) {
            addCriterion("approvalNumber >=", value, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberLessThan(String value) {
            addCriterion("approvalNumber <", value, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberLessThanOrEqualTo(String value) {
            addCriterion("approvalNumber <=", value, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberLike(String value) {
            addCriterion("approvalNumber like", value, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberNotLike(String value) {
            addCriterion("approvalNumber not like", value, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberIn(List<String> values) {
            addCriterion("approvalNumber in", values, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberNotIn(List<String> values) {
            addCriterion("approvalNumber not in", values, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberBetween(String value1, String value2) {
            addCriterion("approvalNumber between", value1, value2, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andApprovalnumberNotBetween(String value1, String value2) {
            addCriterion("approvalNumber not between", value1, value2, "approvalnumber");
            return (Criteria) this;
        }

        public Criteria andBynameIsNull() {
            addCriterion("byname is null");
            return (Criteria) this;
        }

        public Criteria andBynameIsNotNull() {
            addCriterion("byname is not null");
            return (Criteria) this;
        }

        public Criteria andBynameEqualTo(String value) {
            addCriterion("byname =", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameNotEqualTo(String value) {
            addCriterion("byname <>", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameGreaterThan(String value) {
            addCriterion("byname >", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameGreaterThanOrEqualTo(String value) {
            addCriterion("byname >=", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameLessThan(String value) {
            addCriterion("byname <", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameLessThanOrEqualTo(String value) {
            addCriterion("byname <=", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameLike(String value) {
            addCriterion("byname like", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameNotLike(String value) {
            addCriterion("byname not like", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameIn(List<String> values) {
            addCriterion("byname in", values, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameNotIn(List<String> values) {
            addCriterion("byname not in", values, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameBetween(String value1, String value2) {
            addCriterion("byname between", value1, value2, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameNotBetween(String value1, String value2) {
            addCriterion("byname not between", value1, value2, "byname");
            return (Criteria) this;
        }

        public Criteria andBeginorderIsNull() {
            addCriterion("beginOrder is null");
            return (Criteria) this;
        }

        public Criteria andBeginorderIsNotNull() {
            addCriterion("beginOrder is not null");
            return (Criteria) this;
        }

        public Criteria andBeginorderEqualTo(Integer value) {
            addCriterion("beginOrder =", value, "beginorder");
            return (Criteria) this;
        }

        public Criteria andBeginorderNotEqualTo(Integer value) {
            addCriterion("beginOrder <>", value, "beginorder");
            return (Criteria) this;
        }

        public Criteria andBeginorderGreaterThan(Integer value) {
            addCriterion("beginOrder >", value, "beginorder");
            return (Criteria) this;
        }

        public Criteria andBeginorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("beginOrder >=", value, "beginorder");
            return (Criteria) this;
        }

        public Criteria andBeginorderLessThan(Integer value) {
            addCriterion("beginOrder <", value, "beginorder");
            return (Criteria) this;
        }

        public Criteria andBeginorderLessThanOrEqualTo(Integer value) {
            addCriterion("beginOrder <=", value, "beginorder");
            return (Criteria) this;
        }

        public Criteria andBeginorderIn(List<Integer> values) {
            addCriterion("beginOrder in", values, "beginorder");
            return (Criteria) this;
        }

        public Criteria andBeginorderNotIn(List<Integer> values) {
            addCriterion("beginOrder not in", values, "beginorder");
            return (Criteria) this;
        }

        public Criteria andBeginorderBetween(Integer value1, Integer value2) {
            addCriterion("beginOrder between", value1, value2, "beginorder");
            return (Criteria) this;
        }

        public Criteria andBeginorderNotBetween(Integer value1, Integer value2) {
            addCriterion("beginOrder not between", value1, value2, "beginorder");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceIsNull() {
            addCriterion("purchasePrice is null");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceIsNotNull() {
            addCriterion("purchasePrice is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceEqualTo(Double value) {
            addCriterion("purchasePrice =", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceNotEqualTo(Double value) {
            addCriterion("purchasePrice <>", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceGreaterThan(Double value) {
            addCriterion("purchasePrice >", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("purchasePrice >=", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceLessThan(Double value) {
            addCriterion("purchasePrice <", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceLessThanOrEqualTo(Double value) {
            addCriterion("purchasePrice <=", value, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceIn(List<Double> values) {
            addCriterion("purchasePrice in", values, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceNotIn(List<Double> values) {
            addCriterion("purchasePrice not in", values, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceBetween(Double value1, Double value2) {
            addCriterion("purchasePrice between", value1, value2, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPurchasepriceNotBetween(Double value1, Double value2) {
            addCriterion("purchasePrice not between", value1, value2, "purchaseprice");
            return (Criteria) this;
        }

        public Criteria andPackIsNull() {
            addCriterion("pack is null");
            return (Criteria) this;
        }

        public Criteria andPackIsNotNull() {
            addCriterion("pack is not null");
            return (Criteria) this;
        }

        public Criteria andPackEqualTo(String value) {
            addCriterion("pack =", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotEqualTo(String value) {
            addCriterion("pack <>", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackGreaterThan(String value) {
            addCriterion("pack >", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackGreaterThanOrEqualTo(String value) {
            addCriterion("pack >=", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLessThan(String value) {
            addCriterion("pack <", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLessThanOrEqualTo(String value) {
            addCriterion("pack <=", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLike(String value) {
            addCriterion("pack like", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotLike(String value) {
            addCriterion("pack not like", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackIn(List<String> values) {
            addCriterion("pack in", values, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotIn(List<String> values) {
            addCriterion("pack not in", values, "pack");
            return (Criteria) this;
        }

        public Criteria andPackBetween(String value1, String value2) {
            addCriterion("pack between", value1, value2, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotBetween(String value1, String value2) {
            addCriterion("pack not between", value1, value2, "pack");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}