// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link Separator}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SeparatorBuilder<Z extends Separator, B extends SeparatorBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{

    protected boolean hasHalignment;
    protected javafx.geometry.HPos valHalignment;

    protected boolean hasOrientation;
    protected javafx.geometry.Orientation valOrientation;

    protected boolean hasValignment;
    protected javafx.geometry.VPos valValignment;

    protected boolean boundHalignment;
    protected javafx.beans.value.ObservableValue<? extends javafx.geometry.HPos> obsrvHalignment;

    protected boolean boundOrientation;
    protected javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> obsrvOrientation;

    protected boolean boundValignment;
    protected javafx.beans.value.ObservableValue<? extends javafx.geometry.VPos> obsrvValignment;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasHalignment)
            instance.setHalignment(this.valHalignment);
        if (this.hasOrientation)
            instance.setOrientation(this.valOrientation);
        if (this.hasValignment)
            instance.setValignment(this.valValignment);
        if (this.boundHalignment)
            instance.halignmentProperty().bind(this.obsrvHalignment);
        if (this.boundOrientation)
            instance.orientationProperty().bind(this.obsrvOrientation);
        if (this.boundValignment)
            instance.valignmentProperty().bind(this.obsrvValignment);
    }

    /**
     * 設定屬性{@link Separator#setHalignment(javafx.geometry.HPos)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B halignment(javafx.geometry.HPos value)
    {
        this.hasHalignment = true;
        this.valHalignment = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Separator#setOrientation(javafx.geometry.Orientation)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B orientation(javafx.geometry.Orientation value)
    {
        this.hasOrientation = true;
        this.valOrientation = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Separator#setValignment(javafx.geometry.VPos)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B valignment(javafx.geometry.VPos value)
    {
        this.hasValignment = true;
        this.valValignment = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Separator#halignmentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindHalignment(javafx.beans.value.ObservableValue<? extends javafx.geometry.HPos> source)
    {
        assert (source != null);
        this.boundHalignment = true;
        this.obsrvHalignment = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Separator#orientationProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOrientation(javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> source)
    {
        assert (source != null);
        this.boundOrientation = true;
        this.obsrvOrientation = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Separator#valignmentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindValignment(javafx.beans.value.ObservableValue<? extends javafx.geometry.VPos> source)
    {
        assert (source != null);
        this.boundValignment = true;
        this.obsrvValignment = source;
        return (B) this;
    }

    /**
     * 建構{@link Separator}物件
     *
     * @return 新的{@link Separator}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Separator build()
    {
        Separator instance = new Separator();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
