// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene;

/**
 * {@link SubScene}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class SubSceneBuilder<Z extends SubScene, B extends SubSceneBuilder<Z, B>>
        extends javafx.scene.NodeBuilder<Z, B>
{

    protected boolean hasCamera;
    protected javafx.scene.Camera valCamera;

    protected boolean hasFill;
    protected javafx.scene.paint.Paint valFill;

    protected boolean hasHeight;
    protected double valHeight;

    protected boolean hasRoot;
    protected javafx.scene.Parent valRoot;

    protected boolean hasWidth;
    protected double valWidth;

    protected boolean boundCamera;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Camera> obsrvCamera;

    protected boolean boundFill;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Paint> obsrvFill;

    protected boolean boundHeight;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvHeight;

    protected boolean boundRoot;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Parent> obsrvRoot;

    protected boolean boundWidth;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvWidth;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasCamera)
            instance.setCamera(this.valCamera);
        if (this.hasFill)
            instance.setFill(this.valFill);
        if (this.hasHeight)
            instance.setHeight(this.valHeight);
        if (this.hasRoot)
            instance.setRoot(this.valRoot);
        if (this.hasWidth)
            instance.setWidth(this.valWidth);
        if (this.boundCamera)
            instance.cameraProperty().bind(this.obsrvCamera);
        if (this.boundFill)
            instance.fillProperty().bind(this.obsrvFill);
        if (this.boundHeight)
            instance.heightProperty().bind(this.obsrvHeight);
        if (this.boundRoot)
            instance.rootProperty().bind(this.obsrvRoot);
        if (this.boundWidth)
            instance.widthProperty().bind(this.obsrvWidth);
    }

    /**
     * 設定屬性{@link SubScene#setCamera}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B camera(javafx.scene.Camera value)
    {
        this.hasCamera = true;
        this.valCamera = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#setFill}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B fill(javafx.scene.paint.Paint value)
    {
        this.hasFill = true;
        this.valFill = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#setHeight}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B height(double value)
    {
        this.hasHeight = true;
        this.valHeight = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#setRoot}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B root(javafx.scene.Parent value)
    {
        this.hasRoot = true;
        this.valRoot = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#setWidth}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B width(double value)
    {
        this.hasWidth = true;
        this.valWidth = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#cameraProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindCamera(javafx.beans.value.ObservableValue<? extends javafx.scene.Camera> source)
    {
        assert (source != null);
        this.boundCamera = true;
        this.obsrvCamera = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#fillProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindFill(javafx.beans.value.ObservableValue<? extends javafx.scene.paint.Paint> source)
    {
        assert (source != null);
        this.boundFill = true;
        this.obsrvFill = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#heightProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindHeight(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundHeight = true;
        this.obsrvHeight = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#rootProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindRoot(javafx.beans.value.ObservableValue<? extends javafx.scene.Parent> source)
    {
        assert (source != null);
        this.boundRoot = true;
        this.obsrvRoot = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link SubScene#widthProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindWidth(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundWidth = true;
        this.obsrvWidth = source;
        return (B) this;
    }

    /**
     * 建構{@link SubScene}物件
     *
     * @return 新的{@link SubScene}物件實體
     */
    @SuppressWarnings("unchecked")
    public SubScene build(javafx.scene.Parent arg0, double arg1, double arg2)
    {
        SubScene instance = new SubScene(arg0, arg1, arg2);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
