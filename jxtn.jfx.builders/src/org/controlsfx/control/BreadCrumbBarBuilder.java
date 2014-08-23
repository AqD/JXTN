// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link BreadCrumbBar}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class BreadCrumbBarBuilder<T extends java.lang.Object, Z extends BreadCrumbBar<T>, B extends BreadCrumbBarBuilder<T, Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    protected boolean hasAutoNavigationEnabled;
    protected boolean valAutoNavigationEnabled;

    protected boolean hasCrumbFactory;
    protected javafx.util.Callback<javafx.scene.control.TreeItem<T>, javafx.scene.control.Button> valCrumbFactory;

    protected boolean hasOnCrumbAction;
    protected javafx.event.EventHandler<org.controlsfx.control.BreadCrumbBar.BreadCrumbActionEvent<T>> valOnCrumbAction;

    protected boolean hasSelectedCrumb;
    protected javafx.scene.control.TreeItem<T> valSelectedCrumb;

    protected boolean boundAutoNavigationEnabled;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvAutoNavigationEnabled;

    protected boolean boundCrumbFactory;
    protected javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TreeItem<T>, javafx.scene.control.Button>> obsrvCrumbFactory;

    protected boolean boundOnCrumbAction;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<org.controlsfx.control.BreadCrumbBar.BreadCrumbActionEvent<T>>> obsrvOnCrumbAction;

    protected boolean boundSelectedCrumb;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.control.TreeItem<T>> obsrvSelectedCrumb;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAutoNavigationEnabled)
            instance.setAutoNavigationEnabled(this.valAutoNavigationEnabled);
        if (this.hasCrumbFactory)
            instance.setCrumbFactory(this.valCrumbFactory);
        if (this.hasOnCrumbAction)
            instance.setOnCrumbAction(this.valOnCrumbAction);
        if (this.hasSelectedCrumb)
            instance.setSelectedCrumb(this.valSelectedCrumb);
        if (this.boundAutoNavigationEnabled)
            instance.autoNavigationEnabledProperty().bind(this.obsrvAutoNavigationEnabled);
        if (this.boundCrumbFactory)
            instance.crumbFactoryProperty().bind(this.obsrvCrumbFactory);
        if (this.boundOnCrumbAction)
            instance.onCrumbActionProperty().bind(this.obsrvOnCrumbAction);
        if (this.boundSelectedCrumb)
            instance.selectedCrumbProperty().bind(this.obsrvSelectedCrumb);
    }

    /**
     * 設定屬性{@link BreadCrumbBar#setAutoNavigationEnabled}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B autoNavigationEnabled(boolean value)
    {
        this.hasAutoNavigationEnabled = true;
        this.valAutoNavigationEnabled = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link BreadCrumbBar#setCrumbFactory}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B crumbFactory(javafx.util.Callback<javafx.scene.control.TreeItem<T>, javafx.scene.control.Button> value)
    {
        this.hasCrumbFactory = true;
        this.valCrumbFactory = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link BreadCrumbBar#setOnCrumbAction}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onCrumbAction(javafx.event.EventHandler<org.controlsfx.control.BreadCrumbBar.BreadCrumbActionEvent<T>> value)
    {
        this.hasOnCrumbAction = true;
        this.valOnCrumbAction = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link BreadCrumbBar#setSelectedCrumb}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectedCrumb(javafx.scene.control.TreeItem<T> value)
    {
        this.hasSelectedCrumb = true;
        this.valSelectedCrumb = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link BreadCrumbBar#autoNavigationEnabledProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindAutoNavigationEnabled(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundAutoNavigationEnabled = true;
        this.obsrvAutoNavigationEnabled = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link BreadCrumbBar#crumbFactoryProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindCrumbFactory(javafx.beans.value.ObservableValue<? extends javafx.util.Callback<javafx.scene.control.TreeItem<T>, javafx.scene.control.Button>> source)
    {
        assert (source != null);
        this.boundCrumbFactory = true;
        this.obsrvCrumbFactory = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link BreadCrumbBar#onCrumbActionProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOnCrumbAction(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<org.controlsfx.control.BreadCrumbBar.BreadCrumbActionEvent<T>>> source)
    {
        assert (source != null);
        this.boundOnCrumbAction = true;
        this.obsrvOnCrumbAction = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link BreadCrumbBar#selectedCrumbProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindSelectedCrumb(javafx.beans.value.ObservableValue<? extends javafx.scene.control.TreeItem<T>> source)
    {
        assert (source != null);
        this.boundSelectedCrumb = true;
        this.obsrvSelectedCrumb = source;
        return (B) this;
    }

    /**
     * 建構{@link BreadCrumbBar}物件
     *
     * @return 新的{@link BreadCrumbBar}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public BreadCrumbBar<T> build()
    {
        BreadCrumbBar<T> instance = new BreadCrumbBar<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
