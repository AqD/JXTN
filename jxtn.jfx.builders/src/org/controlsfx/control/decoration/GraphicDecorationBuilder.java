// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.decoration;

/**
 * {@link GraphicDecoration}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.20.8.jar
 * @param <Z> 要建構的物件型態(需繼承{@link GraphicDecoration})
 * @param <B> 建構器本身的型態(需繼承{@link GraphicDecorationBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class GraphicDecorationBuilder<Z extends GraphicDecoration, B extends GraphicDecorationBuilder<Z, B>>
        extends org.controlsfx.control.decoration.DecorationBuilder<Z, B>
        implements GraphicDecorationBuilderExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link GraphicDecoration}物件。
     *
     * @return 新的{@link GraphicDecoration}物件實體
     */
    @SuppressWarnings("unchecked")
    public GraphicDecoration build(javafx.scene.Node arg0)
    {
        GraphicDecoration instance = new GraphicDecoration(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link GraphicDecoration}物件。
     *
     * @return 新的{@link GraphicDecoration}物件實體
     */
    @SuppressWarnings("unchecked")
    public GraphicDecoration build(javafx.scene.Node arg0, javafx.geometry.Pos arg1)
    {
        GraphicDecoration instance = new GraphicDecoration(arg0, arg1);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link GraphicDecoration}物件。
     *
     * @return 新的{@link GraphicDecoration}物件實體
     */
    @SuppressWarnings("unchecked")
    public GraphicDecoration build(javafx.scene.Node arg0, javafx.geometry.Pos arg1, double arg2, double arg3)
    {
        GraphicDecoration instance = new GraphicDecoration(arg0, arg1, arg2, arg3);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
