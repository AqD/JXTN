// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link SplitMenuButton}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SplitMenuButtonBuilder<Z extends SplitMenuButton, B extends SplitMenuButtonBuilder<Z, B>>
        extends javafx.scene.control.MenuButtonBuilder<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link SplitMenuButton}物件
     *
     * @return 新的{@link SplitMenuButton}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public SplitMenuButton build()
    {
        SplitMenuButton instance = new SplitMenuButton();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
