// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.layout;

/**
 * {@link Border}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Border})
 * @param <B> 建構器本身的型態(需繼承{@link BorderBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class BorderBuilder<Z extends Border, B extends BorderBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link Border}物件
     *
     * @return 新的{@link Border}物件實體
     */
    @SuppressWarnings("unchecked")
    public Border build(javafx.scene.layout.BorderImage[] arg0)
    {
        Border instance = new Border(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
