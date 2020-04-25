package com.wyb.orcl0422.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowExample() {
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

        public Criteria andBorrowIdIsNull() {
            addCriterion("BORROW_ID is null");
            return (Criteria) this;
        }

        public Criteria andBorrowIdIsNotNull() {
            addCriterion("BORROW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowIdEqualTo(String value) {
            addCriterion("BORROW_ID =", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotEqualTo(String value) {
            addCriterion("BORROW_ID <>", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdGreaterThan(String value) {
            addCriterion("BORROW_ID >", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdGreaterThanOrEqualTo(String value) {
            addCriterion("BORROW_ID >=", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdLessThan(String value) {
            addCriterion("BORROW_ID <", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdLessThanOrEqualTo(String value) {
            addCriterion("BORROW_ID <=", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdLike(String value) {
            addCriterion("BORROW_ID like", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotLike(String value) {
            addCriterion("BORROW_ID not like", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdIn(List<String> values) {
            addCriterion("BORROW_ID in", values, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotIn(List<String> values) {
            addCriterion("BORROW_ID not in", values, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdBetween(String value1, String value2) {
            addCriterion("BORROW_ID between", value1, value2, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotBetween(String value1, String value2) {
            addCriterion("BORROW_ID not between", value1, value2, "borrowId");
            return (Criteria) this;
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

        public Criteria andBorrowTimeIsNull() {
            addCriterion("BORROW_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeIsNotNull() {
            addCriterion("BORROW_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeEqualTo(Date value) {
            addCriterion("BORROW_TIME =", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeNotEqualTo(Date value) {
            addCriterion("BORROW_TIME <>", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeGreaterThan(Date value) {
            addCriterion("BORROW_TIME >", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BORROW_TIME >=", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeLessThan(Date value) {
            addCriterion("BORROW_TIME <", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeLessThanOrEqualTo(Date value) {
            addCriterion("BORROW_TIME <=", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeIn(List<Date> values) {
            addCriterion("BORROW_TIME in", values, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeNotIn(List<Date> values) {
            addCriterion("BORROW_TIME not in", values, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeBetween(Date value1, Date value2) {
            addCriterion("BORROW_TIME between", value1, value2, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeNotBetween(Date value1, Date value2) {
            addCriterion("BORROW_TIME not between", value1, value2, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
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