// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control.decoration;

/**
 * {@link Decoration}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class DecorationBuilder<Z extends Decoration, B extends DecorationBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{
    private boolean applied;
    public void applyTo(Decoration instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        //
        this.applied = true;
    }
}
