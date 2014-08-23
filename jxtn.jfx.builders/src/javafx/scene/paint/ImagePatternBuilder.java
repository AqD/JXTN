// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.paint;

/**
 * {@link ImagePattern}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ImagePatternBuilder<Z extends ImagePattern, B extends ImagePatternBuilder<Z, B>>
        extends javafx.scene.paint.PaintBuilder<Z, B>
{
    private boolean applied;
    public void applyTo(ImagePattern instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public ImagePattern build(javafx.scene.image.Image arg0)
    {
        ImagePattern instance = new ImagePattern(arg0);
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
