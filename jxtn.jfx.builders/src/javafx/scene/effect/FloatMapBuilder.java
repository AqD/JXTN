// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.effect;

/**
 * {@link FloatMap}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link FloatMap})
 * @param <B> 建構器本身的型態(需繼承{@link FloatMapBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class FloatMapBuilder<Z extends FloatMap, B extends FloatMapBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    private boolean hasHeight;
    private int valHeight;

    private boolean hasWidth;
    private int valWidth;

    private boolean boundHeight;
    private javafx.beans.value.ObservableValue<? extends Integer> obsrvHeight;

    private boolean boundWidth;
    private javafx.beans.value.ObservableValue<? extends Integer> obsrvWidth;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasHeight)
            instance.setHeight(this.valHeight);
        if (this.hasWidth)
            instance.setWidth(this.valWidth);
        if (this.boundHeight)
            instance.heightProperty().bind(this.obsrvHeight);
        if (this.boundWidth)
            instance.widthProperty().bind(this.obsrvWidth);
    }

    /**
     * 設定屬性{@link FloatMap#setHeight(int)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B height(int value)
    {
        this.hasHeight = true;
        this.valHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link FloatMap#setWidth(int)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B width(int value)
    {
        this.hasWidth = true;
        this.valWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link FloatMap#heightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHeight(javafx.beans.value.ObservableValue<? extends Integer> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundHeight = true;
        this.obsrvHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link FloatMap#widthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindWidth(javafx.beans.value.ObservableValue<? extends Integer> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundWidth = true;
        this.obsrvWidth = source;
        return (B) this;
    }

    /**
     * 建構{@link FloatMap}物件
     *
     * @return 新的{@link FloatMap}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public FloatMap build()
    {
        FloatMap instance = new FloatMap();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
