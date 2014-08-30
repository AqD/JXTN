// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.validation.decoration;

/**
 * {@link StyleClassValidationDecoration}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 * @param <Z> 要建構的物件型態(需繼承{@link StyleClassValidationDecoration})
 * @param <B> 建構器本身的型態(需繼承{@link StyleClassValidationDecorationBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class StyleClassValidationDecorationBuilder<Z extends StyleClassValidationDecoration, B extends StyleClassValidationDecorationBuilder<Z, B>>
        extends org.controlsfx.validation.decoration.AbstractValidationDecorationBuilder<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link StyleClassValidationDecoration}物件
     *
     * @return 新的{@link StyleClassValidationDecoration}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public StyleClassValidationDecoration build()
    {
        StyleClassValidationDecoration instance = new StyleClassValidationDecoration();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
