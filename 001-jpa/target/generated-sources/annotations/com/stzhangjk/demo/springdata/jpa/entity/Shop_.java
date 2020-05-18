package com.stzhangjk.demo.springdata.jpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Shop.class)
public abstract class Shop_ extends com.stzhangjk.demo.springdata.jpa.entity.BaseEntity_ {

	public static volatile SingularAttribute<Shop, String> name;
	public static volatile SingularAttribute<Shop, String> title;
	public static volatile SingularAttribute<Shop, Date> openTime;

	public static final String NAME = "name";
	public static final String TITLE = "title";
	public static final String OPEN_TIME = "openTime";

}

