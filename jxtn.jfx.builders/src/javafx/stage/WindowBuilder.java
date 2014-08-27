// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.stage;

/**
 * {@link Window}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class WindowBuilder<Z extends Window, B extends WindowBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    protected boolean hasEventDispatcher;
    protected javafx.event.EventDispatcher valEventDispatcher;

    protected boolean hasHeight;
    protected double valHeight;

    protected boolean hasOnCloseRequest;
    protected javafx.event.EventHandler<javafx.stage.WindowEvent> valOnCloseRequest;

    protected boolean hasOnHidden;
    protected javafx.event.EventHandler<javafx.stage.WindowEvent> valOnHidden;

    protected boolean hasOnHiding;
    protected javafx.event.EventHandler<javafx.stage.WindowEvent> valOnHiding;

    protected boolean hasOnShowing;
    protected javafx.event.EventHandler<javafx.stage.WindowEvent> valOnShowing;

    protected boolean hasOnShown;
    protected javafx.event.EventHandler<javafx.stage.WindowEvent> valOnShown;

    protected boolean hasOpacity;
    protected double valOpacity;

    protected boolean hasWidth;
    protected double valWidth;

    protected boolean hasX;
    protected double valX;

    protected boolean hasY;
    protected double valY;

    protected boolean boundEventDispatcher;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventDispatcher> obsrvEventDispatcher;

    protected boolean boundOnCloseRequest;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.stage.WindowEvent>> obsrvOnCloseRequest;

    protected boolean boundOnHidden;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.stage.WindowEvent>> obsrvOnHidden;

    protected boolean boundOnHiding;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.stage.WindowEvent>> obsrvOnHiding;

    protected boolean boundOnShowing;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.stage.WindowEvent>> obsrvOnShowing;

    protected boolean boundOnShown;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.stage.WindowEvent>> obsrvOnShown;

    protected boolean boundOpacity;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvOpacity;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasEventDispatcher)
            instance.setEventDispatcher(this.valEventDispatcher);
        if (this.hasHeight)
            instance.setHeight(this.valHeight);
        if (this.hasOnCloseRequest)
            instance.setOnCloseRequest(this.valOnCloseRequest);
        if (this.hasOnHidden)
            instance.setOnHidden(this.valOnHidden);
        if (this.hasOnHiding)
            instance.setOnHiding(this.valOnHiding);
        if (this.hasOnShowing)
            instance.setOnShowing(this.valOnShowing);
        if (this.hasOnShown)
            instance.setOnShown(this.valOnShown);
        if (this.hasOpacity)
            instance.setOpacity(this.valOpacity);
        if (this.hasWidth)
            instance.setWidth(this.valWidth);
        if (this.hasX)
            instance.setX(this.valX);
        if (this.hasY)
            instance.setY(this.valY);
        if (this.boundEventDispatcher)
            instance.eventDispatcherProperty().bind(this.obsrvEventDispatcher);
        if (this.boundOnCloseRequest)
            instance.onCloseRequestProperty().bind(this.obsrvOnCloseRequest);
        if (this.boundOnHidden)
            instance.onHiddenProperty().bind(this.obsrvOnHidden);
        if (this.boundOnHiding)
            instance.onHidingProperty().bind(this.obsrvOnHiding);
        if (this.boundOnShowing)
            instance.onShowingProperty().bind(this.obsrvOnShowing);
        if (this.boundOnShown)
            instance.onShownProperty().bind(this.obsrvOnShown);
        if (this.boundOpacity)
            instance.opacityProperty().bind(this.obsrvOpacity);
    }

    /**
     * 設定屬性{@link Window#setEventDispatcher(javafx.event.EventDispatcher)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B eventDispatcher(javafx.event.EventDispatcher value)
    {
        this.hasEventDispatcher = true;
        this.valEventDispatcher = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Window#setHeight(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B height(double value)
    {
        this.hasHeight = true;
        this.valHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Window#setOnCloseRequest(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onCloseRequest(javafx.event.EventHandler<javafx.stage.WindowEvent> value)
    {
        this.hasOnCloseRequest = true;
        this.valOnCloseRequest = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Window#setOnHidden(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onHidden(javafx.event.EventHandler<javafx.stage.WindowEvent> value)
    {
        this.hasOnHidden = true;
        this.valOnHidden = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Window#setOnHiding(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onHiding(javafx.event.EventHandler<javafx.stage.WindowEvent> value)
    {
        this.hasOnHiding = true;
        this.valOnHiding = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Window#setOnShowing(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onShowing(javafx.event.EventHandler<javafx.stage.WindowEvent> value)
    {
        this.hasOnShowing = true;
        this.valOnShowing = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Window#setOnShown(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onShown(javafx.event.EventHandler<javafx.stage.WindowEvent> value)
    {
        this.hasOnShown = true;
        this.valOnShown = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Window#setOpacity(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B opacity(double value)
    {
        this.hasOpacity = true;
        this.valOpacity = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Window#setWidth(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B width(double value)
    {
        this.hasWidth = true;
        this.valWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Window#setX(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B x(double value)
    {
        this.hasX = true;
        this.valX = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Window#setY(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B y(double value)
    {
        this.hasY = true;
        this.valY = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Window#eventDispatcherProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindEventDispatcher(javafx.beans.value.ObservableValue<? extends javafx.event.EventDispatcher> source)
    {
        assert (source != null);
        this.boundEventDispatcher = true;
        this.obsrvEventDispatcher = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Window#onCloseRequestProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOnCloseRequest(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.stage.WindowEvent>> source)
    {
        assert (source != null);
        this.boundOnCloseRequest = true;
        this.obsrvOnCloseRequest = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Window#onHiddenProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOnHidden(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.stage.WindowEvent>> source)
    {
        assert (source != null);
        this.boundOnHidden = true;
        this.obsrvOnHidden = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Window#onHidingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOnHiding(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.stage.WindowEvent>> source)
    {
        assert (source != null);
        this.boundOnHiding = true;
        this.obsrvOnHiding = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Window#onShowingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOnShowing(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.stage.WindowEvent>> source)
    {
        assert (source != null);
        this.boundOnShowing = true;
        this.obsrvOnShowing = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Window#onShownProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOnShown(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.stage.WindowEvent>> source)
    {
        assert (source != null);
        this.boundOnShown = true;
        this.obsrvOnShown = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Window#opacityProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOpacity(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundOpacity = true;
        this.obsrvOpacity = source;
        return (B) this;
    }
}
