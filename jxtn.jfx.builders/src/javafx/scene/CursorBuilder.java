// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene;

/**
 * {@link Cursor}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CursorBuilder<Z extends Cursor, B extends CursorBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{
    private boolean applied;
    public void applyTo(Cursor instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        //
        this.applied = true;
    }
}
