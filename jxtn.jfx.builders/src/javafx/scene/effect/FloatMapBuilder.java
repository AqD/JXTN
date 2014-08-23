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
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class FloatMapBuilder<Z extends FloatMap, B extends FloatMapBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    protected boolean hasHeight;
    protected int valHeight;

    protected boolean hasWidth;
    protected int valWidth;

    protected boolean boundHeight;
    protected javafx.beans.value.ObservableValue<? extends Integer> obsrvHeight;

    protected boolean boundWidth;
    protected javafx.beans.value.ObservableValue<? extends Integer> obsrvWidth;

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
     * 設定屬性{@link FloatMap#setHeight}
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
     * 設定屬性{@link FloatMap#setWidth}
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
    public B bindHeight(javafx.beans.value.ObservableValue<? extends Integer> source)
    {
        assert (source != null);
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
    public B bindWidth(javafx.beans.value.ObservableValue<? extends Integer> source)
    {
        assert (source != null);
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
