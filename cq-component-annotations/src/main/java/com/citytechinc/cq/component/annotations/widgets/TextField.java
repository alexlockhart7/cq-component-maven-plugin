package com.citytechinc.cq.component.annotations.widgets;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Represents a Widget of type CQ.Ext.form.TextField
 *
 */
@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.FIELD, ElementType.METHOD })
public @interface TextField {

}
