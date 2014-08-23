// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.layout;

/**
 * {@link BackgroundFill}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class BackgroundFillBuilder<Z extends BackgroundFill, B extends BackgroundFillBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{
    private boolean applied;
    public void applyTo(BackgroundFill instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public BackgroundFill build(javafx.scene.paint.Paint arg0, javafx.scene.layout.CornerRadii arg1, javafx.geometry.Insets arg2)
    {
        BackgroundFill instance = new BackgroundFill(arg0, arg1, arg2);
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
