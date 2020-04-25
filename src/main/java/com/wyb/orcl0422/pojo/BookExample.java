package com.wyb.orcl0422.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBIdIsNull() {
            addCriterion("B_ID is null");
            return (Criteria) this;
        }

        public Criteria andBIdIsNotNull() {
            addCriterion("B_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBIdEqualTo(String value) {
            addCriterion("B_ID =", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotEqualTo(String value) {
            addCriterion("B_ID <>", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThan(String value) {
            addCriterion("B_ID >", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThanOrEqualTo(String value) {
            addCriterion("B_ID >=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThan(String value) {
            addCriterion("B_ID <", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThanOrEqualTo(String value) {
            addCriterion("B_ID <=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLike(String value) {
            addCriterion("B_ID like", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotLike(String value) {
            addCriterion("B_ID not like", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdIn(List<String> values) {
            addCriterion("B_ID in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotIn(List<String> values) {
            addCriterion("B_ID not in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdBetween(String value1, String value2) {
            addCriterion("B_ID between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotBetween(String value1, String value2) {
            addCriterion("B_ID not between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBNameIsNull() {
            addCriterion("B_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBNameIsNotNull() {
            addCriterion("B_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBNameEqualTo(String value) {
            addCriterion("B_NAME =", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotEqualTo(String value) {
            addCriterion("B_NAME <>", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThan(String value) {
            addCriterion("B_NAME >", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameGreaterThanOrEqualTo(String value) {
            addCriterion("B_NAME >=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThan(String value) {
            addCriterion("B_NAME <", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLessThanOrEqualTo(String value) {
            addCriterion("B_NAME <=", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameLike(String value) {
            addCriterion("B_NAME like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotLike(String value) {
            addCriterion("B_NAME not like", value, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameIn(List<String> values) {
            addCriterion("B_NAME in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotIn(List<String> values) {
            addCriterion("B_NAME not in", values, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameBetween(String value1, String value2) {
            addCriterion("B_NAME between", value1, value2, "bName");
            return (Criteria) this;
        }

        public Criteria andBNameNotBetween(String value1, String value2) {
            addCriterion("B_NAME not between", value1, value2, "bName");
            return (Criteria) this;
        }

        public Criteria andBIntroduceIsNull() {
            addCriterion("B_INTRODUCE is null");
            return (Criteria) this;
        }

        public Criteria andBIntroduceIsNotNull() {
            addCriterion("B_INTRODUCE is not null");
            return (Criteria) this;
        }

        public Criteria andBIntroduceEqualTo(String value) {
            addCriterion("B_INTRODUCE =", value, "bIntroduce");
            return (Criteria) this;
        }

        public Criteria andBIntroduceNotEqualTo(String value) {
            addCriterion("B_INTRODUCE <>", value, "bIntroduce");
            return (Criteria) this;
        }

        public Criteria andBIntroduceGreaterThan(String value) {
            addCriterion("B_INTRODUCE >", value, "bIntroduce");
            return (Criteria) this;
        }

        public Criteria andBIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("B_INTRODUCE >=", value, "bIntroduce");
            return (Criteria) this;
        }

        public Criteria andBIntroduceLessThan(String value) {
            addCriterion("B_INTRODUCE <", value, "bIntroduce");
            return (Criteria) this;
        }

        public Criteria andBIntroduceLessThanOrEqualTo(String value) {
            addCriterion("B_INTRODUCE <=", value, "bIntroduce");
            return (Criteria) this;
        }

        public Criteria andBIntroduceLike(String value) {
            addCriterion("B_INTRODUCE like", value, "bIntroduce");
            return (Criteria) this;
        }

        public Criteria andBIntroduceNotLike(String value) {
            addCriterion("B_INTRODUCE not like", value, "bIntroduce");
            return (Criteria) this;
        }

        public Criteria andBIntroduceIn(List<String> values) {
            addCriterion("B_INTRODUCE in", values, "bIntroduce");
            return (Criteria) this;
        }

        public Criteria andBIntroduceNotIn(List<String> values) {
            addCriterion("B_INTRODUCE not in", values, "bIntroduce");
            return (Criteria) this;
        }

        public Criteria andBIntroduceBetween(String value1, String value2) {
            addCriterion("B_INTRODUCE between", value1, value2, "bIntroduce");
            return (Criteria) this;
        }

        public Criteria andBIntroduceNotBetween(String value1, String value2) {
            addCriterion("B_INTRODUCE not between", value1, value2, "bIntroduce");
            return (Criteria) this;
        }

        public Criteria andBAuthorIsNull() {
            addCriterion("B_AUTHOR is null");
            return (Criteria) this;
        }

        public Criteria andBAuthorIsNotNull() {
            addCriterion("B_AUTHOR is not null");
            return (Criteria) this;
        }

        public Criteria andBAuthorEqualTo(String value) {
            addCriterion("B_AUTHOR =", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorNotEqualTo(String value) {
            addCriterion("B_AUTHOR <>", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorGreaterThan(String value) {
            addCriterion("B_AUTHOR >", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("B_AUTHOR >=", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorLessThan(String value) {
            addCriterion("B_AUTHOR <", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorLessThanOrEqualTo(String value) {
            addCriterion("B_AUTHOR <=", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorLike(String value) {
            addCriterion("B_AUTHOR like", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorNotLike(String value) {
            addCriterion("B_AUTHOR not like", value, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorIn(List<String> values) {
            addCriterion("B_AUTHOR in", values, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorNotIn(List<String> values) {
            addCriterion("B_AUTHOR not in", values, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorBetween(String value1, String value2) {
            addCriterion("B_AUTHOR between", value1, value2, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andBAuthorNotBetween(String value1, String value2) {
            addCriterion("B_AUTHOR not between", value1, value2, "bAuthor");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(BigDecimal value) {
            addCriterion("COUNT =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(BigDecimal value) {
            addCriterion("COUNT <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(BigDecimal value) {
            addCriterion("COUNT >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COUNT >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(BigDecimal value) {
            addCriterion("COUNT <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COUNT <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<BigDecimal> values) {
            addCriterion("COUNT in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<BigDecimal> values) {
            addCriterion("COUNT not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUNT between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUNT not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andBorrowFlagIsNull() {
            addCriterion("BORROW_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andBorrowFlagIsNotNull() {
            addCriterion("BORROW_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowFlagEqualTo(BigDecimal value) {
            addCriterion("BORROW_FLAG =", value, "borrowFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowFlagNotEqualTo(BigDecimal value) {
            addCriterion("BORROW_FLAG <>", value, "borrowFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowFlagGreaterThan(BigDecimal value) {
            addCriterion("BORROW_FLAG >", value, "borrowFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowFlagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BORROW_FLAG >=", value, "borrowFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowFlagLessThan(BigDecimal value) {
            addCriterion("BORROW_FLAG <", value, "borrowFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowFlagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BORROW_FLAG <=", value, "borrowFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowFlagIn(List<BigDecimal> values) {
            addCriterion("BORROW_FLAG in", values, "borrowFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowFlagNotIn(List<BigDecimal> values) {
            addCriterion("BORROW_FLAG not in", values, "borrowFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowFlagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BORROW_FLAG between", value1, value2, "borrowFlag");
            return (Criteria) this;
        }

        public Criteria andBorrowFlagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BORROW_FLAG not between", value1, value2, "borrowFlag");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("PIC_URL is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("PIC_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("PIC_URL =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("PIC_URL <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("PIC_URL >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_URL >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("PIC_URL <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("PIC_URL <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("PIC_URL like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("PIC_URL not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("PIC_URL in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("PIC_URL not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("PIC_URL between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("PIC_URL not between", value1, value2, "picUrl");
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