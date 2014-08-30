// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link PasswordField}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link PasswordField})
 * @param <B> 建構器本身的型態(需繼承{@link PasswordFieldBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PasswordFieldBuilder<Z extends PasswordField, B extends PasswordFieldBuilder<Z, B>>
        extends javafx.scene.control.TextFieldBuilder<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link PasswordField}物件
     *
     * @return 新的{@link PasswordField}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public PasswordField build()
    {
        PasswordField instance = new PasswordField();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
