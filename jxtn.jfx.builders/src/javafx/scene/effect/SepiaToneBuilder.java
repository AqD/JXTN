// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.effect;

/**
 * {@link SepiaTone}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SepiaToneBuilder<Z extends SepiaTone, B extends SepiaToneBuilder<Z, B>>
        extends javafx.scene.effect.EffectBuilder<Z, B>
{

    protected boolean hasInput;
    protected javafx.scene.effect.Effect valInput;

    protected boolean hasLevel;
    protected double valLevel;

    protected boolean boundInput;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.effect.Effect> obsrvInput;

    protected boolean boundLevel;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvLevel;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasInput)
            instance.setInput(this.valInput);
        if (this.hasLevel)
            instance.setLevel(this.valLevel);
        if (this.boundInput)
            instance.inputProperty().bind(this.obsrvInput);
        if (this.boundLevel)
            instance.levelProperty().bind(this.obsrvLevel);
    }

    /**
     * 設定屬性{@link SepiaTone#setInput(javafx.scene.effect.Effect)}
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
     * 設定屬性{@link SepiaTone#setLevel(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B level(double value)
    {
        this.hasLevel = true;
        this.valLevel = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SepiaTone#inputProperty}的連結
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
     * 設定屬性{@link SepiaTone#levelProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindLevel(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundLevel = true;
        this.obsrvLevel = source;
        return (B) this;
    }

    /**
     * 建構{@link SepiaTone}物件
     *
     * @return 新的{@link SepiaTone}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public SepiaTone build()
    {
        SepiaTone instance = new SepiaTone();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
