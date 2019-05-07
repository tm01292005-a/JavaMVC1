package com.example.mybatisdemo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Table1Example {

	/** OrderBy有無 */
	protected String orderByClause;

	/** Distinct有無 */
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public Table1Example() {
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

		public Criteria andColumn1IsNull() {
			addCriterion("COLUMN1 is null");
			return (Criteria) this;
		}

		public Criteria andColumn1IsNotNull() {
			addCriterion("COLUMN1 is not null");
			return (Criteria) this;
		}

		public Criteria andColumn1EqualTo(String value) {
			addCriterion("COLUMN1 =", value, "column1");
			return (Criteria) this;
		}

		public Criteria andColumn1NotEqualTo(String value) {
			addCriterion("COLUMN1 <>", value, "column1");
			return (Criteria) this;
		}

		public Criteria andColumn1GreaterThan(String value) {
			addCriterion("COLUMN1 >", value, "column1");
			return (Criteria) this;
		}

		public Criteria andColumn1GreaterThanOrEqualTo(String value) {
			addCriterion("COLUMN1 >=", value, "column1");
			return (Criteria) this;
		}

		public Criteria andColumn1LessThan(String value) {
			addCriterion("COLUMN1 <", value, "column1");
			return (Criteria) this;
		}

		public Criteria andColumn1LessThanOrEqualTo(String value) {
			addCriterion("COLUMN1 <=", value, "column1");
			return (Criteria) this;
		}

		public Criteria andColumn1Like(String value) {
			addCriterion("COLUMN1 like", value, "column1");
			return (Criteria) this;
		}

		public Criteria andColumn1NotLike(String value) {
			addCriterion("COLUMN1 not like", value, "column1");
			return (Criteria) this;
		}

		public Criteria andColumn1In(List<String> values) {
			addCriterion("COLUMN1 in", values, "column1");
			return (Criteria) this;
		}

		public Criteria andColumn1NotIn(List<String> values) {
			addCriterion("COLUMN1 not in", values, "column1");
			return (Criteria) this;
		}

		public Criteria andColumn1Between(String value1, String value2) {
			addCriterion("COLUMN1 between", value1, value2, "column1");
			return (Criteria) this;
		}

		public Criteria andColumn1NotBetween(String value1, String value2) {
			addCriterion("COLUMN1 not between", value1, value2, "column1");
			return (Criteria) this;
		}

		public Criteria andColumn2IsNull() {
			addCriterion("COLUMN2 is null");
			return (Criteria) this;
		}

		public Criteria andColumn2IsNotNull() {
			addCriterion("COLUMN2 is not null");
			return (Criteria) this;
		}

		public Criteria andColumn2EqualTo(BigDecimal value) {
			addCriterion("COLUMN2 =", value, "column2");
			return (Criteria) this;
		}

		public Criteria andColumn2NotEqualTo(BigDecimal value) {
			addCriterion("COLUMN2 <>", value, "column2");
			return (Criteria) this;
		}

		public Criteria andColumn2GreaterThan(BigDecimal value) {
			addCriterion("COLUMN2 >", value, "column2");
			return (Criteria) this;
		}

		public Criteria andColumn2GreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("COLUMN2 >=", value, "column2");
			return (Criteria) this;
		}

		public Criteria andColumn2LessThan(BigDecimal value) {
			addCriterion("COLUMN2 <", value, "column2");
			return (Criteria) this;
		}

		public Criteria andColumn2LessThanOrEqualTo(BigDecimal value) {
			addCriterion("COLUMN2 <=", value, "column2");
			return (Criteria) this;
		}

		public Criteria andColumn2In(List<BigDecimal> values) {
			addCriterion("COLUMN2 in", values, "column2");
			return (Criteria) this;
		}

		public Criteria andColumn2NotIn(List<BigDecimal> values) {
			addCriterion("COLUMN2 not in", values, "column2");
			return (Criteria) this;
		}

		public Criteria andColumn2Between(BigDecimal value1, BigDecimal value2) {
			addCriterion("COLUMN2 between", value1, value2, "column2");
			return (Criteria) this;
		}

		public Criteria andColumn2NotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("COLUMN2 not between", value1, value2, "column2");
			return (Criteria) this;
		}

		public Criteria andColumn3IsNull() {
			addCriterion("COLUMN3 is null");
			return (Criteria) this;
		}

		public Criteria andColumn3IsNotNull() {
			addCriterion("COLUMN3 is not null");
			return (Criteria) this;
		}

		public Criteria andColumn3EqualTo(Date value) {
			addCriterion("COLUMN3 =", value, "column3");
			return (Criteria) this;
		}

		public Criteria andColumn3NotEqualTo(Date value) {
			addCriterion("COLUMN3 <>", value, "column3");
			return (Criteria) this;
		}

		public Criteria andColumn3GreaterThan(Date value) {
			addCriterion("COLUMN3 >", value, "column3");
			return (Criteria) this;
		}

		public Criteria andColumn3GreaterThanOrEqualTo(Date value) {
			addCriterion("COLUMN3 >=", value, "column3");
			return (Criteria) this;
		}

		public Criteria andColumn3LessThan(Date value) {
			addCriterion("COLUMN3 <", value, "column3");
			return (Criteria) this;
		}

		public Criteria andColumn3LessThanOrEqualTo(Date value) {
			addCriterion("COLUMN3 <=", value, "column3");
			return (Criteria) this;
		}

		public Criteria andColumn3In(List<Date> values) {
			addCriterion("COLUMN3 in", values, "column3");
			return (Criteria) this;
		}

		public Criteria andColumn3NotIn(List<Date> values) {
			addCriterion("COLUMN3 not in", values, "column3");
			return (Criteria) this;
		}

		public Criteria andColumn3Between(Date value1, Date value2) {
			addCriterion("COLUMN3 between", value1, value2, "column3");
			return (Criteria) this;
		}

		public Criteria andColumn3NotBetween(Date value1, Date value2) {
			addCriterion("COLUMN3 not between", value1, value2, "column3");
			return (Criteria) this;
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

	public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}