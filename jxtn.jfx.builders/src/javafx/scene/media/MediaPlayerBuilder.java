// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.media;

/**
 * {@link MediaPlayer}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link MediaPlayer})
 * @param <B> 建構器本身的型態(需繼承{@link MediaPlayerBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class MediaPlayerBuilder<Z extends MediaPlayer, B extends MediaPlayerBuilder<Z, B>>
        extends jxtn.jfx.builders.AbstractBuilder<Z, B>
{

    private boolean hasAudioSpectrumInterval;
    private double valAudioSpectrumInterval;

    private boolean hasAudioSpectrumListener;
    private javafx.scene.media.AudioSpectrumListener valAudioSpectrumListener;

    private boolean hasAudioSpectrumNumBands;
    private int valAudioSpectrumNumBands;

    private boolean hasAudioSpectrumThreshold;
    private int valAudioSpectrumThreshold;

    private boolean hasAutoPlay;
    private boolean valAutoPlay;

    private boolean hasBalance;
    private double valBalance;

    private boolean hasCycleCount;
    private int valCycleCount;

    private boolean hasMute;
    private boolean valMute;

    private boolean hasOnEndOfMedia;
    private java.lang.Runnable valOnEndOfMedia;

    private boolean hasOnError;
    private java.lang.Runnable valOnError;

    private boolean hasOnHalted;
    private java.lang.Runnable valOnHalted;

    private boolean hasOnMarker;
    private javafx.event.EventHandler<javafx.scene.media.MediaMarkerEvent> valOnMarker;

    private boolean hasOnPaused;
    private java.lang.Runnable valOnPaused;

    private boolean hasOnPlaying;
    private java.lang.Runnable valOnPlaying;

    private boolean hasOnReady;
    private java.lang.Runnable valOnReady;

    private boolean hasOnRepeat;
    private java.lang.Runnable valOnRepeat;

    private boolean hasOnStalled;
    private java.lang.Runnable valOnStalled;

    private boolean hasOnStopped;
    private java.lang.Runnable valOnStopped;

    private boolean hasRate;
    private double valRate;

    private boolean hasStartTime;
    private javafx.util.Duration valStartTime;

    private boolean hasStopTime;
    private javafx.util.Duration valStopTime;

    private boolean hasVolume;
    private double valVolume;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasAudioSpectrumInterval)
            instance.setAudioSpectrumInterval(this.valAudioSpectrumInterval);
        if (this.hasAudioSpectrumListener)
            instance.setAudioSpectrumListener(this.valAudioSpectrumListener);
        if (this.hasAudioSpectrumNumBands)
            instance.setAudioSpectrumNumBands(this.valAudioSpectrumNumBands);
        if (this.hasAudioSpectrumThreshold)
            instance.setAudioSpectrumThreshold(this.valAudioSpectrumThreshold);
        if (this.hasAutoPlay)
            instance.setAutoPlay(this.valAutoPlay);
        if (this.hasBalance)
            instance.setBalance(this.valBalance);
        if (this.hasCycleCount)
            instance.setCycleCount(this.valCycleCount);
        if (this.hasMute)
            instance.setMute(this.valMute);
        if (this.hasOnEndOfMedia)
            instance.setOnEndOfMedia(this.valOnEndOfMedia);
        if (this.hasOnError)
            instance.setOnError(this.valOnError);
        if (this.hasOnHalted)
            instance.setOnHalted(this.valOnHalted);
        if (this.hasOnMarker)
            instance.setOnMarker(this.valOnMarker);
        if (this.hasOnPaused)
            instance.setOnPaused(this.valOnPaused);
        if (this.hasOnPlaying)
            instance.setOnPlaying(this.valOnPlaying);
        if (this.hasOnReady)
            instance.setOnReady(this.valOnReady);
        if (this.hasOnRepeat)
            instance.setOnRepeat(this.valOnRepeat);
        if (this.hasOnStalled)
            instance.setOnStalled(this.valOnStalled);
        if (this.hasOnStopped)
            instance.setOnStopped(this.valOnStopped);
        if (this.hasRate)
            instance.setRate(this.valRate);
        if (this.hasStartTime)
            instance.setStartTime(this.valStartTime);
        if (this.hasStopTime)
            instance.setStopTime(this.valStopTime);
        if (this.hasVolume)
            instance.setVolume(this.valVolume);
    }

    /**
     * 設定屬性{@link MediaPlayer#setAudioSpectrumInterval(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B audioSpectrumInterval(double value)
    {
        this.hasAudioSpectrumInterval = true;
        this.valAudioSpectrumInterval = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setAudioSpectrumListener(javafx.scene.media.AudioSpectrumListener)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B audioSpectrumListener(javafx.scene.media.AudioSpectrumListener value)
    {
        this.hasAudioSpectrumListener = true;
        this.valAudioSpectrumListener = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setAudioSpectrumNumBands(int)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B audioSpectrumNumBands(int value)
    {
        this.hasAudioSpectrumNumBands = true;
        this.valAudioSpectrumNumBands = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setAudioSpectrumThreshold(int)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B audioSpectrumThreshold(int value)
    {
        this.hasAudioSpectrumThreshold = true;
        this.valAudioSpectrumThreshold = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setAutoPlay(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B autoPlay(boolean value)
    {
        this.hasAutoPlay = true;
        this.valAutoPlay = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setBalance(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B balance(double value)
    {
        this.hasBalance = true;
        this.valBalance = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setCycleCount(int)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B cycleCount(int value)
    {
        this.hasCycleCount = true;
        this.valCycleCount = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setMute(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B mute(boolean value)
    {
        this.hasMute = true;
        this.valMute = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setOnEndOfMedia(java.lang.Runnable)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onEndOfMedia(java.lang.Runnable value)
    {
        this.hasOnEndOfMedia = true;
        this.valOnEndOfMedia = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setOnError(java.lang.Runnable)}
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
     * 設定屬性{@link MediaPlayer#setOnHalted(java.lang.Runnable)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onHalted(java.lang.Runnable value)
    {
        this.hasOnHalted = true;
        this.valOnHalted = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setOnMarker(javafx.event.EventHandler)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onMarker(javafx.event.EventHandler<javafx.scene.media.MediaMarkerEvent> value)
    {
        this.hasOnMarker = true;
        this.valOnMarker = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setOnPaused(java.lang.Runnable)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onPaused(java.lang.Runnable value)
    {
        this.hasOnPaused = true;
        this.valOnPaused = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setOnPlaying(java.lang.Runnable)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onPlaying(java.lang.Runnable value)
    {
        this.hasOnPlaying = true;
        this.valOnPlaying = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setOnReady(java.lang.Runnable)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onReady(java.lang.Runnable value)
    {
        this.hasOnReady = true;
        this.valOnReady = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setOnRepeat(java.lang.Runnable)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onRepeat(java.lang.Runnable value)
    {
        this.hasOnRepeat = true;
        this.valOnRepeat = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setOnStalled(java.lang.Runnable)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onStalled(java.lang.Runnable value)
    {
        this.hasOnStalled = true;
        this.valOnStalled = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setOnStopped(java.lang.Runnable)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onStopped(java.lang.Runnable value)
    {
        this.hasOnStopped = true;
        this.valOnStopped = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setRate(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B rate(double value)
    {
        this.hasRate = true;
        this.valRate = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setStartTime(javafx.util.Duration)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B startTime(javafx.util.Duration value)
    {
        this.hasStartTime = true;
        this.valStartTime = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setStopTime(javafx.util.Duration)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B stopTime(javafx.util.Duration value)
    {
        this.hasStopTime = true;
        this.valStopTime = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaPlayer#setVolume(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B volume(double value)
    {
        this.hasVolume = true;
        this.valVolume = value;
        return (B) this;
    }

    /**
     * 建構{@link MediaPlayer}物件
     *
     * @return 新的{@link MediaPlayer}物件實體
     */
    @SuppressWarnings("unchecked")
    public MediaPlayer build(javafx.scene.media.Media arg0)
    {
        MediaPlayer instance = new MediaPlayer(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
