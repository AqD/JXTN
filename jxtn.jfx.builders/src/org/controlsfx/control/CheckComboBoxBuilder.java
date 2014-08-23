// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link CheckComboBox}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class CheckComboBoxBuilder<T extends java.lang.Object, Z extends CheckComboBox<T>, B extends CheckComboBoxBuilder<T, Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    protected boolean hasCheckModel;
    protected javafx.scene.control.MultipleSelectionModel<T> valCheckModel;

    protected boolean hasItems;
    protected java.util.Collection<T> valItems;

    protected boolean boundCheckModel;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.control.MultipleSelectionModel<T>> obsrvCheckModel;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasCheckModel)
            instance.setCheckModel(this.valCheckModel);
        if (this.hasItems)
            instance.getItems().setAll(this.valItems);
        if (this.boundCheckModel)
            instance.checkModelProperty().bind(this.obsrvCheckModel);
    }

    /**
     * 設定屬性{@link CheckComboBox#setCheckModel}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B checkModel(javafx.scene.control.MultipleSelectionModel<T> value)
    {
        this.hasCheckModel = true;
        this.valCheckModel = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link CheckComboBox#getItems}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B items(java.util.Collection<T> value)
    {
        this.hasItems = true;
        this.valItems = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link CheckComboBox#getItems}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B items(T... value)
    {
        this.hasItems = true;
        this.valItems = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 設定屬性{@link CheckComboBox#checkModelProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindCheckModel(javafx.beans.value.ObservableValue<? extends javafx.scene.control.MultipleSelectionModel<T>> source)
    {
        assert (source != null);
        this.boundCheckModel = true;
        this.obsrvCheckModel = source;
        return (B) this;
    }

    /**
     * 建構{@link CheckComboBox}物件
     *
     * @return 新的{@link CheckComboBox}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public CheckComboBox<T> build()
    {
        CheckComboBox<T> instance = new CheckComboBox<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
