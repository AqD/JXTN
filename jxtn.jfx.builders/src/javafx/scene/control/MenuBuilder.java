// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link Menu}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class MenuBuilder<Z extends Menu, B extends MenuBuilder<Z, B>>
        extends javafx.scene.control.MenuItemBuilder<Z, B>
{

    protected boolean hasItems;
    protected java.util.Collection<javafx.scene.control.MenuItem> valItems;

    protected boolean hasOnHidden;
    protected javafx.event.EventHandler<javafx.event.Event> valOnHidden;

    protected boolean hasOnHiding;
    protected javafx.event.EventHandler<javafx.event.Event> valOnHiding;

    protected boolean hasOnShowing;
    protected javafx.event.EventHandler<javafx.event.Event> valOnShowing;

    protected boolean hasOnShown;
    protected javafx.event.EventHandler<javafx.event.Event> valOnShown;

    protected boolean boundOnHidden;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrvOnHidden;

    protected boolean boundOnHiding;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrvOnHiding;

    protected boolean boundOnShowing;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrvOnShowing;

    protected boolean boundOnShown;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> obsrvOnShown;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasItems)
            instance.getItems().setAll(this.valItems);
        if (this.hasOnHidden)
            instance.setOnHidden(this.valOnHidden);
        if (this.hasOnHiding)
            instance.setOnHiding(this.valOnHiding);
        if (this.hasOnShowing)
            instance.setOnShowing(this.valOnShowing);
        if (this.hasOnShown)
            instance.setOnShown(this.valOnShown);
        if (this.boundOnHidden)
            instance.onHiddenProperty().bind(this.obsrvOnHidden);
        if (this.boundOnHiding)
            instance.onHidingProperty().bind(this.obsrvOnHiding);
        if (this.boundOnShowing)
            instance.onShowingProperty().bind(this.obsrvOnShowing);
        if (this.boundOnShown)
            instance.onShownProperty().bind(this.obsrvOnShown);
    }

    /**
     * 設定集合屬性{@link Menu#getItems}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B items(java.util.Collection<javafx.scene.control.MenuItem> value)
    {
        this.hasItems = true;
        this.valItems = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Menu#getItems}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B items(javafx.scene.control.MenuItem... value)
    {
        this.hasItems = true;
        this.valItems = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#setOnHidden}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onHidden(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnHidden = true;
        this.valOnHidden = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#setOnHiding}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onHiding(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnHiding = true;
        this.valOnHiding = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#setOnShowing}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onShowing(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnShowing = true;
        this.valOnShowing = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#setOnShown}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onShown(javafx.event.EventHandler<javafx.event.Event> value)
    {
        this.hasOnShown = true;
        this.valOnShown = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#onHiddenProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOnHidden(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        assert (source != null);
        this.boundOnHidden = true;
        this.obsrvOnHidden = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#onHidingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOnHiding(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        assert (source != null);
        this.boundOnHiding = true;
        this.obsrvOnHiding = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#onShowingProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOnShowing(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        assert (source != null);
        this.boundOnShowing = true;
        this.obsrvOnShowing = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Menu#onShownProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOnShown(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.event.Event>> source)
    {
        assert (source != null);
        this.boundOnShown = true;
        this.obsrvOnShown = source;
        return (B) this;
    }

    /**
     * 建構{@link Menu}物件
     *
     * @return 新的{@link Menu}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Menu build()
    {
        Menu instance = new Menu();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
