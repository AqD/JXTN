// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.tools;

/**
 * {@link Utils}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.12.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Utils})
 * @param <B> 建構器本身的型態(需繼承{@link UtilsMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class UtilsMaker<Z extends Utils, B extends UtilsMaker<Z, B>>
        extends jxtn.jfx.makers.AbstractMaker<Z, B>
        implements UtilsMakerExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link Utils}物件。
     *
     * @return 新的{@link Utils}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Utils build()
    {
        Utils instance = new Utils();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
