package org.checkerframework.checker.testchecker.ainfer.qual;

import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.SubtypeOf;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * AinferDefaultType is used to test the relaxInference option. Toy type system for testing field
 * inference. This annotation cannot be used in source code.
 *
 * @see AinferSibling1
 * @see AinferSibling2
 * @see AinferParent
 * @see AinferTop
 */
@SubtypeOf({AinferTop.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@DefaultQualifierInHierarchy
public @interface AinferDefaultType {}
