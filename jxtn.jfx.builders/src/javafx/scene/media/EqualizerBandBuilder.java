// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.media;

/**
 * {@link EqualizerBand}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class EqualizerBandBuilder<Z extends EqualizerBand, B extends EqualizerBandBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    protected boolean hasBandwidth;
    protected double valBandwidth;

    protected boolean hasCenterFrequency;
    protected double valCenterFrequency;

    protected boolean hasGain;
    protected double valGain;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasBandwidth)
            instance.setBandwidth(this.valBandwidth);
        if (this.hasCenterFrequency)
            instance.setCenterFrequency(this.valCenterFrequency);
        if (this.hasGain)
            instance.setGain(this.valGain);
    }

    /**
     * 設定屬性{@link EqualizerBand#setBandwidth}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bandwidth(double value)
    {
        this.hasBandwidth = true;
        this.valBandwidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link EqualizerBand#setCenterFrequency}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B centerFrequency(double value)
    {
        this.hasCenterFrequency = true;
        this.valCenterFrequency = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link EqualizerBand#setGain}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B gain(double value)
    {
        this.hasGain = true;
        this.valGain = value;
        return (B) this;
    }

    /**
     * 建構{@link EqualizerBand}物件
     *
     * @return 新的{@link EqualizerBand}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public EqualizerBand build()
    {
        EqualizerBand instance = new EqualizerBand();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
