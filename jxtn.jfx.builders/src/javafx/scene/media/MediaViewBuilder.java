// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.media;

/**
 * {@link MediaView}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class MediaViewBuilder<Z extends MediaView, B extends MediaViewBuilder<Z, B>>
        extends javafx.scene.NodeBuilder<Z, B>
{

    protected boolean hasFitHeight;
    protected double valFitHeight;

    protected boolean hasFitWidth;
    protected double valFitWidth;

    protected boolean hasMediaPlayer;
    protected javafx.scene.media.MediaPlayer valMediaPlayer;

    protected boolean hasOnError;
    protected javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent> valOnError;

    protected boolean hasPreserveRatio;
    protected boolean valPreserveRatio;

    protected boolean hasSmooth;
    protected boolean valSmooth;

    protected boolean hasViewport;
    protected javafx.geometry.Rectangle2D valViewport;

    protected boolean hasX;
    protected double valX;

    protected boolean hasY;
    protected double valY;

    protected boolean boundFitHeight;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvFitHeight;

    protected boolean boundFitWidth;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvFitWidth;

    protected boolean boundMediaPlayer;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.media.MediaPlayer> obsrvMediaPlayer;

    protected boolean boundOnError;
    protected javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent>> obsrvOnError;

    protected boolean boundPreserveRatio;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvPreserveRatio;

    protected boolean boundSmooth;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvSmooth;

    protected boolean boundViewport;
    protected javafx.beans.value.ObservableValue<? extends javafx.geometry.Rectangle2D> obsrvViewport;

    protected boolean boundX;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvX;

    protected boolean boundY;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvY;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasFitHeight)
            instance.setFitHeight(this.valFitHeight);
        if (this.hasFitWidth)
            instance.setFitWidth(this.valFitWidth);
        if (this.hasMediaPlayer)
            instance.setMediaPlayer(this.valMediaPlayer);
        if (this.hasOnError)
            instance.setOnError(this.valOnError);
        if (this.hasPreserveRatio)
            instance.setPreserveRatio(this.valPreserveRatio);
        if (this.hasSmooth)
            instance.setSmooth(this.valSmooth);
        if (this.hasViewport)
            instance.setViewport(this.valViewport);
        if (this.hasX)
            instance.setX(this.valX);
        if (this.hasY)
            instance.setY(this.valY);
        if (this.boundFitHeight)
            instance.fitHeightProperty().bind(this.obsrvFitHeight);
        if (this.boundFitWidth)
            instance.fitWidthProperty().bind(this.obsrvFitWidth);
        if (this.boundMediaPlayer)
            instance.mediaPlayerProperty().bind(this.obsrvMediaPlayer);
        if (this.boundOnError)
            instance.onErrorProperty().bind(this.obsrvOnError);
        if (this.boundPreserveRatio)
            instance.preserveRatioProperty().bind(this.obsrvPreserveRatio);
        if (this.boundSmooth)
            instance.smoothProperty().bind(this.obsrvSmooth);
        if (this.boundViewport)
            instance.viewportProperty().bind(this.obsrvViewport);
        if (this.boundX)
            instance.xProperty().bind(this.obsrvX);
        if (this.boundY)
            instance.yProperty().bind(this.obsrvY);
    }

    /**
     * 設定屬性{@link MediaView#setFitHeight}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fitHeight(double value)
    {
        this.hasFitHeight = true;
        this.valFitHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#setFitWidth}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fitWidth(double value)
    {
        this.hasFitWidth = true;
        this.valFitWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#setMediaPlayer}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B mediaPlayer(javafx.scene.media.MediaPlayer value)
    {
        this.hasMediaPlayer = true;
        this.valMediaPlayer = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#setOnError}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B onError(javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent> value)
    {
        this.hasOnError = true;
        this.valOnError = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#setPreserveRatio}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B preserveRatio(boolean value)
    {
        this.hasPreserveRatio = true;
        this.valPreserveRatio = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#setSmooth}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B smooth(boolean value)
    {
        this.hasSmooth = true;
        this.valSmooth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#setViewport}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B viewport(javafx.geometry.Rectangle2D value)
    {
        this.hasViewport = true;
        this.valViewport = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#setX}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B x(double value)
    {
        this.hasX = true;
        this.valX = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#setY}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B y(double value)
    {
        this.hasY = true;
        this.valY = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#fitHeightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindFitHeight(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundFitHeight = true;
        this.obsrvFitHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#fitWidthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindFitWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundFitWidth = true;
        this.obsrvFitWidth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#mediaPlayerProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMediaPlayer(javafx.beans.value.ObservableValue<? extends javafx.scene.media.MediaPlayer> source)
    {
        assert (source != null);
        this.boundMediaPlayer = true;
        this.obsrvMediaPlayer = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#onErrorProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindOnError(javafx.beans.value.ObservableValue<? extends javafx.event.EventHandler<javafx.scene.media.MediaErrorEvent>> source)
    {
        assert (source != null);
        this.boundOnError = true;
        this.obsrvOnError = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#preserveRatioProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindPreserveRatio(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundPreserveRatio = true;
        this.obsrvPreserveRatio = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#smoothProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindSmooth(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundSmooth = true;
        this.obsrvSmooth = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#viewportProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindViewport(javafx.beans.value.ObservableValue<? extends javafx.geometry.Rectangle2D> source)
    {
        assert (source != null);
        this.boundViewport = true;
        this.obsrvViewport = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#xProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindX(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundX = true;
        this.obsrvX = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link MediaView#yProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindY(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundY = true;
        this.obsrvY = source;
        return (B) this;
    }

    /**
     * 建構{@link MediaView}物件
     *
     * @return 新的{@link MediaView}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public MediaView build()
    {
        MediaView instance = new MediaView();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
