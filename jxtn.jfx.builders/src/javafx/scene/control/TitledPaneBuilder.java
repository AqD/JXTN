// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link TitledPane}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TitledPaneBuilder<Z extends TitledPane, B extends TitledPaneBuilder<Z, B>>
        extends javafx.scene.control.LabeledBuilder<Z, B>
{

    protected boolean hasAnimated;
    protected boolean valAnimated;

    protected boolean hasCollapsible;
    protected boolean valCollapsible;

    protected boolean hasContent;
    protected javafx.scene.Node valContent;

    protected boolean hasExpanded;
    protected boolean valExpanded;

    protected boolean boundAnimated;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvAnimated;

    protected boolean boundCollapsible;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvCollapsible;

    protected boolean boundContent;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvContent;

    protected boolean boundExpanded;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvExpanded;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAnimated)
            instance.setAnimated(this.valAnimated);
        if (this.hasCollapsible)
            instance.setCollapsible(this.valCollapsible);
        if (this.hasContent)
            instance.setContent(this.valContent);
        if (this.hasExpanded)
            instance.setExpanded(this.valExpanded);
        if (this.boundAnimated)
            instance.animatedProperty().bind(this.obsrvAnimated);
        if (this.boundCollapsible)
            instance.collapsibleProperty().bind(this.obsrvCollapsible);
        if (this.boundContent)
            instance.contentProperty().bind(this.obsrvContent);
        if (this.boundExpanded)
            instance.expandedProperty().bind(this.obsrvExpanded);
    }

    /**
     * 設定屬性{@link TitledPane#setAnimated}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B animated(boolean value)
    {
        this.hasAnimated = true;
        this.valAnimated = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TitledPane#setCollapsible}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B collapsible(boolean value)
    {
        this.hasCollapsible = true;
        this.valCollapsible = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TitledPane#setContent}
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
     * 設定屬性{@link TitledPane#setExpanded}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B expanded(boolean value)
    {
        this.hasExpanded = true;
        this.valExpanded = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TitledPane#animatedProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindAnimated(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundAnimated = true;
        this.obsrvAnimated = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TitledPane#collapsibleProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindCollapsible(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundCollapsible = true;
        this.obsrvCollapsible = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TitledPane#contentProperty}的連結
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
     * 設定屬性{@link TitledPane#expandedProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindExpanded(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundExpanded = true;
        this.obsrvExpanded = source;
        return (B) this;
    }

    /**
     * 建構{@link TitledPane}物件
     *
     * @return 新的{@link TitledPane}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public TitledPane build()
    {
        TitledPane instance = new TitledPane();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
