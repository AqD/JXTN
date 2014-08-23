// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.input;

/**
 * {@link TouchPoint}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TouchPointBuilder<Z extends TouchPoint, B extends TouchPointBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link TouchPoint}物件
     *
     * @return 新的{@link TouchPoint}物件實體
     */
    @SuppressWarnings("unchecked")
    public TouchPoint build(int arg0, javafx.scene.input.TouchPoint.State arg1, double arg2, double arg3, double arg4, double arg5, javafx.event.EventTarget arg6, javafx.scene.input.PickResult arg7)
    {
        TouchPoint instance = new TouchPoint(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
