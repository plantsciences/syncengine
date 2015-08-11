package com.percero.agents.sync.metadata.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({METHOD, FIELD}) 
@Retention(RUNTIME)

public @interface PropertyInterface {

	Class<?> entityInterfaceClass();
	String propertyName();
	PropertyInterfaceParam[] params();

}