// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.paint;

/**
 * {@link RadialGradient}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class RadialGradientBuilder<Z extends RadialGradient, B extends RadialGradientBuilder<Z, B>>
        extends javafx.scene.paint.PaintBuilder<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link RadialGradient}物件
     *
     * @return 新的{@link RadialGradient}物件實體
     */
    @SuppressWarnings("unchecked")
    public RadialGradient build(double arg0, double arg1, double arg2, double arg3, double arg4, boolean arg5, javafx.scene.paint.CycleMethod arg6, java.util.List<javafx.scene.paint.Stop> arg7)
    {
        RadialGradient instance = new RadialGradient(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
