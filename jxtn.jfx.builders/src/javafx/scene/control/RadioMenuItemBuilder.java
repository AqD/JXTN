// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link RadioMenuItem}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class RadioMenuItemBuilder<Z extends RadioMenuItem, B extends RadioMenuItemBuilder<Z, B>>
        extends javafx.scene.control.MenuItemBuilder<Z, B>
{

    protected boolean hasSelected;
    protected boolean valSelected;

    protected boolean hasToggleGroup;
    protected javafx.scene.control.ToggleGroup valToggleGroup;

    protected boolean boundSelected;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvSelected;

    protected boolean boundToggleGroup;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.control.ToggleGroup> obsrvToggleGroup;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasSelected)
            instance.setSelected(this.valSelected);
        if (this.hasToggleGroup)
            instance.setToggleGroup(this.valToggleGroup);
        if (this.boundSelected)
            instance.selectedProperty().bind(this.obsrvSelected);
        if (this.boundToggleGroup)
            instance.toggleGroupProperty().bind(this.obsrvToggleGroup);
    }

    /**
     * 設定屬性{@link RadioMenuItem#setSelected(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B selected(boolean value)
    {
        this.hasSelected = true;
        this.valSelected = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link RadioMenuItem#setToggleGroup(javafx.scene.control.ToggleGroup)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B toggleGroup(javafx.scene.control.ToggleGroup value)
    {
        this.hasToggleGroup = true;
        this.valToggleGroup = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link RadioMenuItem#selectedProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindSelected(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundSelected = true;
        this.obsrvSelected = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link RadioMenuItem#toggleGroupProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindToggleGroup(javafx.beans.value.ObservableValue<? extends javafx.scene.control.ToggleGroup> source)
    {
        assert (source != null);
        this.boundToggleGroup = true;
        this.obsrvToggleGroup = source;
        return (B) this;
    }

    /**
     * 建構{@link RadioMenuItem}物件
     *
     * @return 新的{@link RadioMenuItem}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public RadioMenuItem build()
    {
        RadioMenuItem instance = new RadioMenuItem();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
