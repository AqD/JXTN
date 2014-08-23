// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link ProgressIndicator}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ProgressIndicatorBuilder<Z extends ProgressIndicator, B extends ProgressIndicatorBuilder<Z, B>>
        extends javafx.scene.control.ControlBuilder<Z, B>
{
    private boolean applied;

    protected boolean hasProgress;
    protected double valProgress;

    protected boolean boundProgress;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvProgress;
    public void applyTo(ProgressIndicator instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        if (this.hasProgress)
            instance.setProgress(this.valProgress);
        if (this.boundProgress)
            instance.progressProperty().bind(this.obsrvProgress);
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public B progress(double value)
    {
        this.hasProgress = true;
        this.valProgress = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindProgress(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundProgress = true;
        this.obsrvProgress = source;
        return (B) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ProgressIndicator build()
    {
        ProgressIndicator instance = new ProgressIndicator();
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
