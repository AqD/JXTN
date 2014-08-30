// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene;

/**
 * {@link PerspectiveCamera}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 * @param <Z> 要建構的物件型態(需繼承{@link PerspectiveCamera})
 * @param <B> 建構器本身的型態(需繼承{@link PerspectiveCameraBuilder})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PerspectiveCameraBuilder<Z extends PerspectiveCamera, B extends PerspectiveCameraBuilder<Z, B>>
        extends javafx.scene.CameraBuilder<Z, B>
{

    private boolean hasFieldOfView;
    private double valFieldOfView;

    private boolean hasVerticalFieldOfView;
    private boolean valVerticalFieldOfView;

    private boolean boundFieldOfView;
    private javafx.beans.value.ObservableValue<? extends Double> obsrvFieldOfView;

    private boolean boundVerticalFieldOfView;
    private javafx.beans.value.ObservableValue<? extends Boolean> obsrvVerticalFieldOfView;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasFieldOfView)
            instance.setFieldOfView(this.valFieldOfView);
        if (this.hasVerticalFieldOfView)
            instance.setVerticalFieldOfView(this.valVerticalFieldOfView);
        if (this.boundFieldOfView)
            instance.fieldOfViewProperty().bind(this.obsrvFieldOfView);
        if (this.boundVerticalFieldOfView)
            instance.verticalFieldOfViewProperty().bind(this.obsrvVerticalFieldOfView);
    }

    /**
     * 設定屬性{@link PerspectiveCamera#setFieldOfView(double)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fieldOfView(double value)
    {
        this.hasFieldOfView = true;
        this.valFieldOfView = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PerspectiveCamera#setVerticalFieldOfView(boolean)}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B verticalFieldOfView(boolean value)
    {
        this.hasVerticalFieldOfView = true;
        this.valVerticalFieldOfView = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link PerspectiveCamera#fieldOfViewProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindFieldOfView(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundFieldOfView = true;
        this.obsrvFieldOfView = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link PerspectiveCamera#verticalFieldOfViewProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public final B bindVerticalFieldOfView(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        java.util.Objects.requireNonNull(source);
        this.boundVerticalFieldOfView = true;
        this.obsrvVerticalFieldOfView = source;
        return (B) this;
    }

    /**
     * 建構{@link PerspectiveCamera}物件
     *
     * @return 新的{@link PerspectiveCamera}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public PerspectiveCamera build()
    {
        PerspectiveCamera instance = new PerspectiveCamera();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
