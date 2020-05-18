package com.stzhangjk.demo.springdata.jpa.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Vip.class)
public abstract class Vip_ extends com.stzhangjk.demo.springdata.jpa.entity.BaseEntity_ {

	public static volatile SingularAttribute<Vip, Shop> shop;
	public static volatile SingularAttribute<Vip, Integer> integral;
	public static volatile SingularAttribute<Vip, User> user;

	public static final String SHOP = "shop";
	public static final String INTEGRAL = "integral";
	public static final String USER = "user";

}

