package com.stzhangjk.demo.springdata.jpa.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(BaseEntity.class)
public abstract class BaseEntity_ {

	public static volatile SingularAttribute<BaseEntity, Date> createTime;
	public static volatile SingularAttribute<BaseEntity, Date> updateTime;
	public static volatile SingularAttribute<BaseEntity, Long> id;

	public static final String CREATE_TIME = "createTime";
	public static final String UPDATE_TIME = "updateTime";
	public static final String ID = "id";

}

