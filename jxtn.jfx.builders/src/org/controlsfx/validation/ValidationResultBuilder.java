// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.validation;

/**
 * {@link ValidationResult}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ValidationResultBuilder<Z extends ValidationResult, B extends ValidationResultBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link ValidationResult}物件
     *
     * @return 新的{@link ValidationResult}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ValidationResult build()
    {
        ValidationResult instance = new ValidationResult();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
