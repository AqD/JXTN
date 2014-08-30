// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.decoration;

/**
 * {@link StyleClassDecoration}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 * @param <Z> 要建構的物件型態(需繼承{@link StyleClassDecoration})
 * @param <B> 建構器本身的型態(需繼承{@link StyleClassDecorationBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class StyleClassDecorationBuilder<Z extends StyleClassDecoration, B extends StyleClassDecorationBuilder<Z, B>>
        extends org.controlsfx.control.decoration.DecorationBuilder<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link StyleClassDecoration}物件
     *
     * @return 新的{@link StyleClassDecoration}物件實體
     */
    @SuppressWarnings("unchecked")
    public StyleClassDecoration build(java.lang.String[] arg0)
    {
        StyleClassDecoration instance = new StyleClassDecoration(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
