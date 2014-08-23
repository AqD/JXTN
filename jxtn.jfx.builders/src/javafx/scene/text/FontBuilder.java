// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.text;

/**
 * {@link Font}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class FontBuilder<Z extends Font, B extends FontBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link Font}物件
     *
     * @return 新的{@link Font}物件實體
     */
    @SuppressWarnings("unchecked")
    public Font build(double arg0)
    {
        Font instance = new Font(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
