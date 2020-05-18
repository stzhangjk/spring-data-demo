package com.stzhangjk.demo.springdata.jpa.specification;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

@Component
public class CommonSpec<E> {
    /**
     * 小于等于
     */
    public <T extends Comparable> Specification<E> lessThanOrEqualTo(String attributeName, T valueToCompare) {
        return (Specification<E>) (root, query, cb) -> cb.lessThanOrEqualTo(root.get(attributeName), valueToCompare);
    }

    /**
     * 大于等于
     */
    public <T extends Comparable> Specification<E> greaterThanOrEqualTo(String attributeName, T valueToCompare) {
        return (Specification<E>) (root, query, cb) -> cb.greaterThanOrEqualTo(root.get(attributeName), valueToCompare);
    }

    /**
     * 等于
     */
    public <T extends Comparable> Specification<E> equal(String attributeName, T valueToCompare) {
        return (Specification<E>) (root, query, cb) -> cb.equal(root.get(attributeName), valueToCompare);
    }

    /**
     * 字符串模糊匹配
     */
    public Specification<E> like(String attributeName, String valueToCompare) {
        return (Specification<E>) (root, query, cb) -> cb.like(root.get(attributeName), valueToCompare);
    }
}
