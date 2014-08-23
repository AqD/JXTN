// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.layout;

/**
 * {@link ColumnConstraints}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ColumnConstraintsBuilder<Z extends ColumnConstraints, B extends ColumnConstraintsBuilder<Z, B>>
        extends javafx.scene.layout.ConstraintsBaseBuilder<Z, B>
{
    private boolean applied;

    protected boolean hasFillWidth;
    protected boolean valFillWidth;

    protected boolean hasHalignment;
    protected javafx.geometry.HPos valHalignment;

    protected boolean hasHgrow;
    protected javafx.scene.layout.Priority valHgrow;

    protected boolean hasMaxWidth;
    protected double valMaxWidth;

    protected boolean hasMinWidth;
    protected double valMinWidth;

    protected boolean hasPercentWidth;
    protected double valPercentWidth;

    protected boolean hasPrefWidth;
    protected double valPrefWidth;

    protected boolean boundFillWidth;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvFillWidth;

    protected boolean boundHalignment;
    protected javafx.beans.value.ObservableValue<? extends javafx.geometry.HPos> obsrvHalignment;

    protected boolean boundHgrow;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.layout.Priority> obsrvHgrow;

    protected boolean boundMaxWidth;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMaxWidth;

    protected boolean boundMinWidth;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMinWidth;

    protected boolean boundPercentWidth;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvPercentWidth;

    protected boolean boundPrefWidth;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvPrefWidth;
    public void applyTo(ColumnConstraints instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        if (this.hasFillWidth)
            instance.setFillWidth(this.valFillWidth);
        if (this.hasHalignment)
            instance.setHalignment(this.valHalignment);
        if (this.hasHgrow)
            instance.setHgrow(this.valHgrow);
        if (this.hasMaxWidth)
            instance.setMaxWidth(this.valMaxWidth);
        if (this.hasMinWidth)
            instance.setMinWidth(this.valMinWidth);
        if (this.hasPercentWidth)
            instance.setPercentWidth(this.valPercentWidth);
        if (this.hasPrefWidth)
            instance.setPrefWidth(this.valPrefWidth);
        if (this.boundFillWidth)
            instance.fillWidthProperty().bind(this.obsrvFillWidth);
        if (this.boundHalignment)
            instance.halignmentProperty().bind(this.obsrvHalignment);
        if (this.boundHgrow)
            instance.hgrowProperty().bind(this.obsrvHgrow);
        if (this.boundMaxWidth)
            instance.maxWidthProperty().bind(this.obsrvMaxWidth);
        if (this.boundMinWidth)
            instance.minWidthProperty().bind(this.obsrvMinWidth);
        if (this.boundPercentWidth)
            instance.percentWidthProperty().bind(this.obsrvPercentWidth);
        if (this.boundPrefWidth)
            instance.prefWidthProperty().bind(this.obsrvPrefWidth);
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public B fillWidth(boolean value)
    {
        this.hasFillWidth = true;
        this.valFillWidth = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B halignment(javafx.geometry.HPos value)
    {
        this.hasHalignment = true;
        this.valHalignment = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B hgrow(javafx.scene.layout.Priority value)
    {
        this.hasHgrow = true;
        this.valHgrow = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B maxWidth(double value)
    {
        this.hasMaxWidth = true;
        this.valMaxWidth = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B minWidth(double value)
    {
        this.hasMinWidth = true;
        this.valMinWidth = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B percentWidth(double value)
    {
        this.hasPercentWidth = true;
        this.valPercentWidth = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B prefWidth(double value)
    {
        this.hasPrefWidth = true;
        this.valPrefWidth = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindFillWidth(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundFillWidth = true;
        this.obsrvFillWidth = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindHalignment(javafx.beans.value.ObservableValue<? extends javafx.geometry.HPos> source)
    {
        assert (source != null);
        this.boundHalignment = true;
        this.obsrvHalignment = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindHgrow(javafx.beans.value.ObservableValue<? extends javafx.scene.layout.Priority> source)
    {
        assert (source != null);
        this.boundHgrow = true;
        this.obsrvHgrow = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindMaxWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMaxWidth = true;
        this.obsrvMaxWidth = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindMinWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMinWidth = true;
        this.obsrvMinWidth = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindPercentWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundPercentWidth = true;
        this.obsrvPercentWidth = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindPrefWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundPrefWidth = true;
        this.obsrvPrefWidth = source;
        return (B) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ColumnConstraints build()
    {
        ColumnConstraints instance = new ColumnConstraints();
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
