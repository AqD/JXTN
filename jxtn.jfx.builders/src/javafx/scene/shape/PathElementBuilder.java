// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link PathElement}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link PathElement})
 * @param <B> 建構器本身的型態(需繼承{@link PathElementBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PathElementBuilder<Z extends PathElement, B extends PathElementBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    private boolean hasAbsolute;
    private boolean valAbsolute;

    private boolean boundAbsolute;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrvAbsolute;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAbsolute)
            instance.setAbsolute(this.valAbsolute);
        if (this.boundAbsolute)
            instance.absoluteProperty().bind(this.obsrvAbsolute);
    }

    /**
     * 設定屬性{@link PathElement#setAbsolute(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B absolute(boolean value)
    {
        this.hasAbsolute = true;
        this.valAbsolute = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PathElement#absoluteProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindAbsolute(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundAbsolute = true;
        this.obsrvAbsolute = source;
        return (B) this;
    }
}
