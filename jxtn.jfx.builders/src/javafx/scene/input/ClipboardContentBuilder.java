// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.input;

/**
 * {@link ClipboardContent}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ClipboardContentBuilder<Z extends ClipboardContent, B extends ClipboardContentBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{
    private boolean applied;
    public void applyTo(ClipboardContent instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        //
        this.applied = true;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ClipboardContent build()
    {
        ClipboardContent instance = new ClipboardContent();
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
