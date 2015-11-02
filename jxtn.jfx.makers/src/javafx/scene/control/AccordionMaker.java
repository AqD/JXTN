// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link Accordion}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Accordion})
 * @param <B> 建構器本身的型態(需繼承{@link AccordionMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class AccordionMaker<Z extends Accordion, B extends AccordionMaker<Z, B>>
        extends javafx.scene.control.ControlMaker<Z, B>
        implements AccordionMakerExt<Z, B>
{

    private boolean hasExpandedPane;
    private javafx.scene.control.TitledPane valExpandedPane;

    private boolean hasPanes;
    private java.util.Collection<javafx.scene.control.TitledPane> valPanes;

    private boolean bound1ExpandedPane;
    private boolean bound2ExpandedPane;
    private javafx.beans.value.ObservableValue<? extends javafx.scene.control.TitledPane> obsrv1ExpandedPane;
    private javafx.beans.property.Property<javafx.scene.control.TitledPane> obsrv2ExpandedPane;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasExpandedPane)
            instance.setExpandedPane(this.valExpandedPane);
        if (this.hasPanes)
            instance.getPanes().addAll(this.valPanes);
        if (this.bound1ExpandedPane)
            instance.expandedPaneProperty().bind(this.obsrv1ExpandedPane);
        if (this.bound2ExpandedPane)
            instance.expandedPaneProperty().bindBidirectional(this.obsrv2ExpandedPane);
    }

    /**
     * 設定屬性{@link Accordion#setExpandedPane(javafx.scene.control.TitledPane)}。
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B expandedPane(javafx.scene.control.TitledPane value)
    {
        this.hasExpandedPane = true;
        this.valExpandedPane = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Accordion#getPanes}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     * @deprecated 屬性值並非{@link javafx.collections.ObservableList}
     */
    @Deprecated
    @SuppressWarnings("unchecked")
    public final B panes(java.util.Collection<? extends javafx.scene.control.TitledPane> value)
    {
        this.hasPanes = true;
        this.valPanes = (java.util.Collection<javafx.scene.control.TitledPane>) value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Accordion#getPanes}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B panes(javafx.scene.control.TitledPane... value)
    {
        this.hasPanes = true;
        this.valPanes = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Accordion#getPanes}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B panesAdd(java.util.Collection<? extends javafx.scene.control.TitledPane> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasPanes = true;
        if (this.valPanes == null)
            this.valPanes = new java.util.ArrayList<>(value.size());
        this.valPanes.addAll(value);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Accordion#getPanes}的內容。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B panesAdd(javafx.scene.control.TitledPane... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasPanes = true;
        if (this.valPanes == null)
            this.valPanes = new java.util.ArrayList<>(value.length);
        this.valPanes.addAll(java.util.Arrays.asList(value));
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Accordion#getPanes}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B panesAddNonNull(java.util.Collection<? extends javafx.scene.control.TitledPane> value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasPanes = true;
        if (this.valPanes == null)
            this.valPanes = new java.util.ArrayList<>(value.size());
        for (javafx.scene.control.TitledPane i : value)
            if (i != null)
                this.valPanes.add(i);
        return (B) this;
    }

    /**
     * 增加集合屬性{@link Accordion#getPanes}的內容，排除null項目。
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B panesAddNonNull(javafx.scene.control.TitledPane... value)
    {
        java.util.Objects.requireNonNull(value);
        this.hasPanes = true;
        if (this.valPanes == null)
            this.valPanes = new java.util.ArrayList<>(value.length);
        for (javafx.scene.control.TitledPane i : value)
            if (i != null)
                this.valPanes.add(i);
        return (B) this;
    }

    /**
     * 設定屬性{@link Accordion#expandedPaneProperty}的連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindExpandedPane(javafx.beans.value.ObservableValue<? extends javafx.scene.control.TitledPane> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ExpandedPane = true;
        this.obsrv1ExpandedPane = source;
        this.bound2ExpandedPane = false;
        this.obsrv2ExpandedPane = null;
        return (B) this;
    }

    /**
     * 設定屬性{@link Accordion#expandedPaneProperty}的雙向連結。
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindBidirectionalExpandedPane(javafx.beans.property.Property<javafx.scene.control.TitledPane> source)
    {
        java.util.Objects.requireNonNull(source);
        this.bound1ExpandedPane = false;
        this.obsrv1ExpandedPane = null;
        this.bound2ExpandedPane = true;
        this.obsrv2ExpandedPane = source;
        return (B) this;
    }

    /**
     * 建構{@link Accordion}物件。
     *
     * @return 新的{@link Accordion}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Accordion build()
    {
        Accordion instance = new Accordion();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }

    /**
     * 建構{@link Accordion}物件。
     *
     * @return 新的{@link Accordion}物件實體
     */
    @SuppressWarnings("unchecked")
    public Accordion build(javafx.scene.control.TitledPane[] arg0)
    {
        Accordion instance = new Accordion(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
