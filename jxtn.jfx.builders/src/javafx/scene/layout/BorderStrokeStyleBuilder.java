// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.layout;

/**
 * {@link BorderStrokeStyle}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class BorderStrokeStyleBuilder<Z extends BorderStrokeStyle, B extends BorderStrokeStyleBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link BorderStrokeStyle}物件
     *
     * @return 新的{@link BorderStrokeStyle}物件實體
     */
    @SuppressWarnings("unchecked")
    public BorderStrokeStyle build(javafx.scene.shape.StrokeType arg0, javafx.scene.shape.StrokeLineJoin arg1, javafx.scene.shape.StrokeLineCap arg2, double arg3, double arg4, java.util.List<java.lang.Double> arg5)
    {
        BorderStrokeStyle instance = new BorderStrokeStyle(arg0, arg1, arg2, arg3, arg4, arg5);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
