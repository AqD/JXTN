// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.media;

/**
 * {@link Media}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class MediaBuilder<Z extends Media, B extends MediaBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    protected boolean hasOnError;
    protected java.lang.Runnable valOnError;

    protected boolean hasTracks;
    protected java.util.Collection<javafx.scene.media.Track> valTracks;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasOnError)
            instance.setOnError(this.valOnError);
        if (this.hasTracks)
            instance.getTracks().setAll(this.valTracks);
    }

    /**
     * 設定屬性{@link Media#setOnError}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onError(java.lang.Runnable value)
    {
        this.hasOnError = true;
        this.valOnError = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Media#getTracks}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B tracks(java.util.Collection<javafx.scene.media.Track> value)
    {
        this.hasTracks = true;
        this.valTracks = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Media#getTracks}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B tracks(javafx.scene.media.Track... value)
    {
        this.hasTracks = true;
        this.valTracks = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 建構{@link Media}物件
     *
     * @return 新的{@link Media}物件實體
     */
    @SuppressWarnings("unchecked")
    public Media build(java.lang.String arg0)
    {
        Media instance = new Media(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
