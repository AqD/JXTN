// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene;

/**
 * {@link LightBase}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link LightBase})
 * @param <B> 建構器本身的型態(需繼承{@link LightBaseBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class LightBaseBuilder<Z extends LightBase, B extends LightBaseBuilder<Z, B>>
        extends javafx.scene.NodeBuilder<Z, B>
        implements LightBaseBuilderExt<Z, B>
{

    private boolean hasColor;
    private javafx.scene.paint.Color valColor;

    private boolean hasLightOn;
    private boolean valLightOn;

    private boolean hasScope;
    private java.util.Collection<javafx.scene.Node> valScope;

    private boolean bound1Color;
    private boolean bound2Color;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Color> obsrv1Color;
    private javafx.beans.property.Property<javafx.scene.paint.Color> obsrv2Color;

    private boolean bound1LightOn;
    private boolean bound2LightOn;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrv1LightOn;
    private javafx.beans.property.Property<Boolean> obsrv2LightOn;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasColor)
            instance.setColor(this.valColor);
        if (this.hasLightOn)
            instance.setLightOn(this.valLightOn);
        if (this.hasScope)
            instance.getScope().addAll(this.valScope);
        if (this.bound1Color)
            instance.colorProperty().bind(this.obsrv1Color);
        if (this.bound2Color)
            instance.colorProperty().bindBidirectional(this.obsrv2Color);
        if (this.bound1LightOn)
            instance.lightOnProperty().bind(this.obsrv1LightOn);
        if (this.bound2LightOn)
            instance.lightOnProperty().bindBidirectional(this.obsrv2LightOn);
    }

    /**
     * 設定屬性{@link LightBase#setColor(javafx.scene.paint.Color)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B color(javafx.scene.paint.Color value)
    {
        this.hasColor = true;
        this.valColor = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link LightBase#setLightOn(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B lightOn(boolean value)
    {
        this.hasLightOn = true;
        this.valLightOn = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link LightBase#getScope}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     * @deprecated 屬性值並非{@link javafx.collections.ObservableList}
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public final B scope(java.util.Collection<javafx.scene.Node> value)
    {
        this.hasScope = true;
        this.valScope = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link LightBase#getScope}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B scope(javafx.scene.Node... value)
    {
        this.hasScope = true;
        this.valScope = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link LightBase#getScope}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B scopeAdd(java.util.Collection<javafx.scene.Node> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasScope = true;
        if (this.valScope == null)
            this.valScope = new java.util.ArrayList<>(value.size());
        this.valScope.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link LightBase#getScope}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B scopeAdd(javafx.scene.Node... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasScope = true;
        if (this.valScope == null)
            this.valScope = new java.util.ArrayList<>(value.length);
        this.valScope.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 設定屬性{@link LightBase#colorProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindColor(javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Color> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Color = true;
        this.obsrv1Color = source;
        this.bound2Color = false;
        this.obsrv2Color = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link LightBase#colorProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalColor(javafx.beans.property.Property<javafx.scene.paint.Color> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1Color = false;
        this.obsrv1Color = null;
        this.bound2Color = true;
        this.obsrv2Color = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link LightBase#lightOnProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindLightOn(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1LightOn = true;
        this.obsrv1LightOn = source;
        this.bound2LightOn = false;
        this.obsrv2LightOn = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link LightBase#lightOnProperty}的雙向連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalLightOn(javafx.beans.property.Property<Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1LightOn = false;
        this.obsrv1LightOn = null;
        this.bound2LightOn = true;
        this.obsrv2LightOn = source;
        return (B) this;
    }
}
