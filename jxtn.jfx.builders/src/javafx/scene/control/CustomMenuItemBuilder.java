// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link CustomMenuItem}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CustomMenuItemBuilder<Z extends CustomMenuItem, B extends CustomMenuItemBuilder<Z, B>>
        extends javafx.scene.control.MenuItemBuilder<Z, B>
{

    protected boolean hasContent;
    protected javafx.scene.Node valContent;

    protected boolean hasHideOnClick;
    protected boolean valHideOnClick;

    protected boolean boundContent;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvContent;

    protected boolean boundHideOnClick;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvHideOnClick;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasContent)
            instance.setContent(this.valContent);
        if (this.hasHideOnClick)
            instance.setHideOnClick(this.valHideOnClick);
        if (this.boundContent)
            instance.contentProperty().bind(this.obsrvContent);
        if (this.boundHideOnClick)
            instance.hideOnClickProperty().bind(this.obsrvHideOnClick);
    }

    /**
     * 設定屬性{@link CustomMenuItem#setContent}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B content(javafx.scene.Node value)
    {
        this.hasContent = true;
        this.valContent = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CustomMenuItem#setHideOnClick}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B hideOnClick(boolean value)
    {
        this.hasHideOnClick = true;
        this.valHideOnClick = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link CustomMenuItem#contentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindContent(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        assert (source != null);
        this.boundContent = true;
        this.obsrvContent = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link CustomMenuItem#hideOnClickProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindHideOnClick(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundHideOnClick = true;
        this.obsrvHideOnClick = source;
        return (B) this;
    }

    /**
     * 建構{@link CustomMenuItem}物件
     *
     * @return 新的{@link CustomMenuItem}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public CustomMenuItem build()
    {
        CustomMenuItem instance = new CustomMenuItem();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
