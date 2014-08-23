// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link TabPane}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TabPaneBuilder<Z extends TabPane, B extends TabPaneBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    protected boolean hasRotateGraphic;
    protected boolean valRotateGraphic;

    protected boolean hasSelectionModel;
    protected javafx.scene.control.SingleSelectionModel<javafx.scene.control.Tab> valSelectionModel;

    protected boolean hasSide;
    protected javafx.geometry.Side valSide;

    protected boolean hasTabClosingPolicy;
    protected javafx.scene.control.TabPane.TabClosingPolicy valTabClosingPolicy;

    protected boolean hasTabMaxHeight;
    protected double valTabMaxHeight;

    protected boolean hasTabMaxWidth;
    protected double valTabMaxWidth;

    protected boolean hasTabMinHeight;
    protected double valTabMinHeight;

    protected boolean hasTabMinWidth;
    protected double valTabMinWidth;

    protected boolean hasTabs;
    protected java.util.Collection<javafx.scene.control.Tab> valTabs;

    protected boolean boundRotateGraphic;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvRotateGraphic;

    protected boolean boundSelectionModel;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.control.SingleSelectionModel<javafx.scene.control.Tab>> obsrvSelectionModel;

    protected boolean boundSide;
    protected javafx.beans.value.ObservableValue<? extends javafx.geometry.Side> obsrvSide;

    protected boolean boundTabClosingPolicy;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.control.TabPane.TabClosingPolicy> obsrvTabClosingPolicy;

    protected boolean boundTabMaxHeight;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvTabMaxHeight;

    protected boolean boundTabMaxWidth;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvTabMaxWidth;

    protected boolean boundTabMinHeight;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvTabMinHeight;

    protected boolean boundTabMinWidth;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvTabMinWidth;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasRotateGraphic)
            instance.setRotateGraphic(this.valRotateGraphic);
        if (this.hasSelectionModel)
            instance.setSelectionModel(this.valSelectionModel);
        if (this.hasSide)
            instance.setSide(this.valSide);
        if (this.hasTabClosingPolicy)
            instance.setTabClosingPolicy(this.valTabClosingPolicy);
        if (this.hasTabMaxHeight)
            instance.setTabMaxHeight(this.valTabMaxHeight);
        if (this.hasTabMaxWidth)
            instance.setTabMaxWidth(this.valTabMaxWidth);
        if (this.hasTabMinHeight)
            instance.setTabMinHeight(this.valTabMinHeight);
        if (this.hasTabMinWidth)
            instance.setTabMinWidth(this.valTabMinWidth);
        if (this.hasTabs)
            instance.getTabs().setAll(this.valTabs);
        if (this.boundRotateGraphic)
            instance.rotateGraphicProperty().bind(this.obsrvRotateGraphic);
        if (this.boundSelectionModel)
            instance.selectionModelProperty().bind(this.obsrvSelectionModel);
        if (this.boundSide)
            instance.sideProperty().bind(this.obsrvSide);
        if (this.boundTabClosingPolicy)
            instance.tabClosingPolicyProperty().bind(this.obsrvTabClosingPolicy);
        if (this.boundTabMaxHeight)
            instance.tabMaxHeightProperty().bind(this.obsrvTabMaxHeight);
        if (this.boundTabMaxWidth)
            instance.tabMaxWidthProperty().bind(this.obsrvTabMaxWidth);
        if (this.boundTabMinHeight)
            instance.tabMinHeightProperty().bind(this.obsrvTabMinHeight);
        if (this.boundTabMinWidth)
            instance.tabMinWidthProperty().bind(this.obsrvTabMinWidth);
    }

    /**
     * 設定屬性{@link TabPane#setRotateGraphic}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B rotateGraphic(boolean value)
    {
        this.hasRotateGraphic = true;
        this.valRotateGraphic = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TabPane#setSelectionModel}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selectionModel(javafx.scene.control.SingleSelectionModel<javafx.scene.control.Tab> value)
    {
        this.hasSelectionModel = true;
        this.valSelectionModel = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TabPane#setSide}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B side(javafx.geometry.Side value)
    {
        this.hasSide = true;
        this.valSide = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TabPane#setTabClosingPolicy}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B tabClosingPolicy(javafx.scene.control.TabPane.TabClosingPolicy value)
    {
        this.hasTabClosingPolicy = true;
        this.valTabClosingPolicy = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TabPane#setTabMaxHeight}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B tabMaxHeight(double value)
    {
        this.hasTabMaxHeight = true;
        this.valTabMaxHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TabPane#setTabMaxWidth}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B tabMaxWidth(double value)
    {
        this.hasTabMaxWidth = true;
        this.valTabMaxWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TabPane#setTabMinHeight}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B tabMinHeight(double value)
    {
        this.hasTabMinHeight = true;
        this.valTabMinHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link TabPane#setTabMinWidth}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B tabMinWidth(double value)
    {
        this.hasTabMinWidth = true;
        this.valTabMinWidth = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TabPane#getTabs}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B tabs(java.util.Collection<javafx.scene.control.Tab> value)
    {
        this.hasTabs = true;
        this.valTabs = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link TabPane#getTabs}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B tabs(javafx.scene.control.Tab... value)
    {
        this.hasTabs = true;
        this.valTabs = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link TabPane#rotateGraphicProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindRotateGraphic(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundRotateGraphic = true;
        this.obsrvRotateGraphic = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TabPane#selectionModelProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindSelectionModel(javafx.beans.value.ObservableValue<? extends javafx.scene.control.SingleSelectionModel<javafx.scene.control.Tab>> source)
    {
        assert (source != null);
        this.boundSelectionModel = true;
        this.obsrvSelectionModel = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TabPane#sideProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindSide(javafx.beans.value.ObservableValue<? extends javafx.geometry.Side> source)
    {
        assert (source != null);
        this.boundSide = true;
        this.obsrvSide = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TabPane#tabClosingPolicyProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindTabClosingPolicy(javafx.beans.value.ObservableValue<? extends javafx.scene.control.TabPane.TabClosingPolicy> source)
    {
        assert (source != null);
        this.boundTabClosingPolicy = true;
        this.obsrvTabClosingPolicy = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TabPane#tabMaxHeightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindTabMaxHeight(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundTabMaxHeight = true;
        this.obsrvTabMaxHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TabPane#tabMaxWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindTabMaxWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundTabMaxWidth = true;
        this.obsrvTabMaxWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TabPane#tabMinHeightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindTabMinHeight(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundTabMinHeight = true;
        this.obsrvTabMinHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link TabPane#tabMinWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindTabMinWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundTabMinWidth = true;
        this.obsrvTabMinWidth = source;
        return (B) this;
    }

    /**
     * 建構{@link TabPane}物件
     *
     * @return 新的{@link TabPane}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public TabPane build()
    {
        TabPane instance = new TabPane();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
