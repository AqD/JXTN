// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.effect;

/**
 * {@link Bloom}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class BloomBuilder<Z extends Bloom, B extends BloomBuilder<Z, B>>
        extends javafx.scene.effect.EffectBuilder<Z, B>
{

    protected boolean hasInput;
    protected javafx.scene.effect.Effect valInput;

    protected boolean hasThreshold;
    protected double valThreshold;

    protected boolean boundInput;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> obsrvInput;

    protected boolean boundThreshold;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvThreshold;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasInput)
            instance.setInput(this.valInput);
        if (this.hasThreshold)
            instance.setThreshold(this.valThreshold);
        if (this.boundInput)
            instance.inputProperty().bind(this.obsrvInput);
        if (this.boundThreshold)
            instance.thresholdProperty().bind(this.obsrvThreshold);
    }

    /**
     * 設定屬性{@link Bloom#setInput}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B input(javafx.scene.effect.Effect value)
    {
        this.hasInput = true;
        this.valInput = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Bloom#setThreshold}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B threshold(double value)
    {
        this.hasThreshold = true;
        this.valThreshold = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Bloom#inputProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindInput(javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> source)
    {
        assert (source != null);
        this.boundInput = true;
        this.obsrvInput = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Bloom#thresholdProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindThreshold(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundThreshold = true;
        this.obsrvThreshold = source;
        return (B) this;
    }

    /**
     * 建構{@link Bloom}物件
     *
     * @return 新的{@link Bloom}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Bloom build()
    {
        Bloom instance = new Bloom();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
