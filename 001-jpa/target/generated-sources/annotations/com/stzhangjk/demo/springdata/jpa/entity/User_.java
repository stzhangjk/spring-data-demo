package com.stzhangjk.demo.springdata.jpa.entity;

import com.stzhangjk.demo.springdata.jpa.entity.User.Gender;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ extends com.stzhangjk.demo.springdata.jpa.entity.BaseEntity_ {

	public static volatile SingularAttribute<User, Gender> gender;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, String> email;

	public static final String GENDER = "gender";
	public static final String NAME = "name";
	public static final String EMAIL = "email";

}

