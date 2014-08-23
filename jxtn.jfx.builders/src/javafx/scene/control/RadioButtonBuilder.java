// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link RadioButton}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class RadioButtonBuilder<Z extends RadioButton, B extends RadioButtonBuilder<Z, B>>
        extends javafx.scene.control.ToggleButtonBuilder<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link RadioButton}物件
     *
     * @return 新的{@link RadioButton}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public RadioButton build()
    {
        RadioButton instance = new RadioButton();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
