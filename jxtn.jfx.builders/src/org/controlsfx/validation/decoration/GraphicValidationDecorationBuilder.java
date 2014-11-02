// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.validation.decoration;

/**
 * {@link GraphicValidationDecoration}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.20.8.jar
 * @param <Z> 要建構的物件型態(需繼承{@link GraphicValidationDecoration})
 * @param <B> 建構器本身的型態(需繼承{@link GraphicValidationDecorationBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class GraphicValidationDecorationBuilder<Z extends GraphicValidationDecoration, B extends GraphicValidationDecorationBuilder<Z, B>>
        extends org.controlsfx.validation.decoration.AbstractValidationDecorationBuilder<Z, B>
        implements GraphicValidationDecorationBuilderExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link GraphicValidationDecoration}物件。
     *
     * @return 新的{@link GraphicValidationDecoration}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public GraphicValidationDecoration build()
    {
        GraphicValidationDecoration instance = new GraphicValidationDecoration();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
