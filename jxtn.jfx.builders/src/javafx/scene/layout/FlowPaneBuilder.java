// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.layout;

/**
 * {@link FlowPane}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link FlowPane})
 * @param <B> 建構器本身的型態(需繼承{@link FlowPaneBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class FlowPaneBuilder<Z extends FlowPane, B extends FlowPaneBuilder<Z, B>>
        extends javafx.scene.layout.PaneBuilder<Z, B>
{

    private boolean hasAlignment;
    private javafx.geometry.Pos valAlignment;

    private boolean hasColumnHalignment;
    private javafx.geometry.HPos valColumnHalignment;

    private boolean hasHgap;
    private double valHgap;

    private boolean hasOrientation;
    private javafx.geometry.Orientation valOrientation;

    private boolean hasPrefWrapLength;
    private double valPrefWrapLength;

    private boolean hasRowValignment;
    private javafx.geometry.VPos valRowValignment;

    private boolean hasVgap;
    private double valVgap;

    private boolean boundAlignment;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Pos> obsrvAlignment;

    private boolean boundColumnHalignment;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.HPos> obsrvColumnHalignment;

    private boolean boundHgap;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvHgap;

    private boolean boundOrientation;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> obsrvOrientation;

    private boolean boundPrefWrapLength;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvPrefWrapLength;

    private boolean boundRowValignment;
    private javafx.beans.value.ObservableValue<? extends javafx.geometry.VPos> obsrvRowValignment;

    private boolean boundVgap;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvVgap;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAlignment)
            instance.setAlignment(this.valAlignment);
        if (this.hasColumnHalignment)
            instance.setColumnHalignment(this.valColumnHalignment);
        if (this.hasHgap)
            instance.setHgap(this.valHgap);
        if (this.hasOrientation)
            instance.setOrientation(this.valOrientation);
        if (this.hasPrefWrapLength)
            instance.setPrefWrapLength(this.valPrefWrapLength);
        if (this.hasRowValignment)
            instance.setRowValignment(this.valRowValignment);
        if (this.hasVgap)
            instance.setVgap(this.valVgap);
        if (this.boundAlignment)
            instance.alignmentProperty().bind(this.obsrvAlignment);
        if (this.boundColumnHalignment)
            instance.columnHalignmentProperty().bind(this.obsrvColumnHalignment);
        if (this.boundHgap)
            instance.hgapProperty().bind(this.obsrvHgap);
        if (this.boundOrientation)
            instance.orientationProperty().bind(this.obsrvOrientation);
        if (this.boundPrefWrapLength)
            instance.prefWrapLengthProperty().bind(this.obsrvPrefWrapLength);
        if (this.boundRowValignment)
            instance.rowValignmentProperty().bind(this.obsrvRowValignment);
        if (this.boundVgap)
            instance.vgapProperty().bind(this.obsrvVgap);
    }

    /**
     * 設定屬性{@link FlowPane#setAlignment(javafx.geometry.Pos)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B alignment(javafx.geometry.Pos value)
    {
        this.hasAlignment = true;
        this.valAlignment = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link FlowPane#setColumnHalignment(javafx.geometry.HPos)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B columnHalignment(javafx.geometry.HPos value)
    {
        this.hasColumnHalignment = true;
        this.valColumnHalignment = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link FlowPane#setHgap(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B hgap(double value)
    {
        this.hasHgap = true;
        this.valHgap = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link FlowPane#setOrientation(javafx.geometry.Orientation)}
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
     * 設定屬性{@link FlowPane#setPrefWrapLength(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B prefWrapLength(double value)
    {
        this.hasPrefWrapLength = true;
        this.valPrefWrapLength = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link FlowPane#setRowValignment(javafx.geometry.VPos)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B rowValignment(javafx.geometry.VPos value)
    {
        this.hasRowValignment = true;
        this.valRowValignment = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link FlowPane#setVgap(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B vgap(double value)
    {
        this.hasVgap = true;
        this.valVgap = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link FlowPane#alignmentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindAlignment(javafx.beans.value.ObservableValue<? extends javafx.geometry.Pos> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundAlignment = true;
        this.obsrvAlignment = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link FlowPane#columnHalignmentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindColumnHalignment(javafx.beans.value.ObservableValue<? extends javafx.geometry.HPos> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundColumnHalignment = true;
        this.obsrvColumnHalignment = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link FlowPane#hgapProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindHgap(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundHgap = true;
        this.obsrvHgap = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link FlowPane#orientationProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindOrientation(javafx.beans.value.ObservableValue<? extends javafx.geometry.Orientation> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundOrientation = true;
        this.obsrvOrientation = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link FlowPane#prefWrapLengthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindPrefWrapLength(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundPrefWrapLength = true;
        this.obsrvPrefWrapLength = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link FlowPane#rowValignmentProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindRowValignment(javafx.beans.value.ObservableValue<? extends javafx.geometry.VPos> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundRowValignment = true;
        this.obsrvRowValignment = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link FlowPane#vgapProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindVgap(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundVgap = true;
        this.obsrvVgap = source;
        return (B) this;
    }

    /**
     * 建構{@link FlowPane}物件
     *
     * @return 新的{@link FlowPane}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public FlowPane build()
    {
        FlowPane instance = new FlowPane();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
