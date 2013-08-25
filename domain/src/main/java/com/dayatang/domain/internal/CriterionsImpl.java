package com.dayatang.domain.internal;

import com.dayatang.domain.QueryCriterion;
import java.util.Collection;


/**
 * 一个工具类，作为各种查询条件的工厂
 * @author yyang (<a href="mailto:gdyangyu@gmail.com">gdyangyu@gmail.com</a>)
 *
 */
public class CriterionsImpl {

	private CriterionsImpl() {
	}

	public static QueryCriterion eq(String propName, Object value) {
		return new EqCriterion(propName, value);
	}
	
	public static QueryCriterion notEq(String propName, Object value) {
		return new NotEqCriterion(propName, value);
	}
	
	public static QueryCriterion ge(String propName, Comparable<?> value) {
		return new GeCriterion(propName, value);
	}
	
	public static QueryCriterion gt(String propName, Comparable<?> value) {
		return new GtCriterion(propName, value);
	}
	
	public static QueryCriterion le(String propName, Comparable<?> value) {
		return new LeCriterion(propName, value);
	}
	
	public static QueryCriterion lt(String propName, Comparable<?> value) {
		return new LtCriterion(propName, value);
	}
	
	public static QueryCriterion eqProp(String propName1, String propName2) {
		return new EqPropCriterion(propName1, propName2);
	}
	
	public static QueryCriterion notEqProp(String propName1, String propName2) {
		return new NotEqPropCriterion(propName1, propName2);
	}
	
	public static QueryCriterion gtProp(String propName1, String propName2) {
		return new GtPropCriterion(propName1, propName2);
	}
	
	public static QueryCriterion geProp(String propName1, String propName2) {
		return new GePropCriterion(propName1, propName2);
	}
	
	public static QueryCriterion ltProp(String propName1, String propName2) {
		return new LtPropCriterion(propName1, propName2);
	}
	
	public static QueryCriterion leProp(String propName1, String propName2) {
		return new LePropCriterion(propName1, propName2);
	}
	
	public static QueryCriterion sizeEq(String propName, int size) {
		return new SizeEqCriterion(propName, size);
	}
	
	public static QueryCriterion sizeNotEq(String propName, int size) {
		return new SizeNotEqCriterion(propName, size);
	}
	
	public static QueryCriterion sizeGt(String propName, int size) {
		return new SizeGtCriterion(propName, size);
	}
	
	public static QueryCriterion sizeGe(String propName, int size) {
		return new SizeGeCriterion(propName, size);
	}
	
	public static QueryCriterion sizeLt(String propName, int size) {
		return new SizeLtCriterion(propName, size);
	}
	
	public static QueryCriterion sizeLe(String propName, int size) {
		return new SizeLeCriterion(propName, size);
	}

	public static QueryCriterion containsText(String propName, String value) {
		return new ContainsTextCriterion(propName, value);
	}

	public static QueryCriterion startsWithText(String propName, String value) {
		return new StartsWithTextCriterion(propName, value);
	}

	public static QueryCriterion in(String propName, Collection<?> value) {
		return new InCriterion(propName, value);
	}

	public static QueryCriterion in(String propName, Object[] value) {
		return new InCriterion(propName, value);
	}

	public static QueryCriterion notIn(String propName, Collection<?> value) {
		return new NotInCriterion(propName, value);
	}

	public static QueryCriterion notIn(String propName, Object[] value) {
		return new NotInCriterion(propName, value);
	}

	public static QueryCriterion between(String propName, Comparable<?> from, Comparable<?> to) {
		return new BetweenCriterion(propName, from, to);
	}
	
	public static QueryCriterion isNull(String propName) {
		return new IsNullCriterion(propName);
	}
	
	public static QueryCriterion notNull(String propName) {
		return new NotNullCriterion(propName);
	}
	
	public static QueryCriterion isEmpty(String propName) {
		return new IsEmptyCriterion(propName);
	}
	
	public static QueryCriterion notEmpty(String propName) {
		return new NotEmptyCriterion(propName);
	}
	
	public static QueryCriterion not(QueryCriterion criterion) {
		return new NotCriterion(criterion);
	}
	
	public static QueryCriterion and(QueryCriterion... criterions) {
		return new AndCriterion(criterions);
	}
	
	public static QueryCriterion or(QueryCriterion... criterions) {
		return new OrCriterion(criterions);
	}
	
}