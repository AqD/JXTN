// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.transform;

/**
 * {@link Affine}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class AffineBuilder<Z extends Affine, B extends AffineBuilder<Z, B>>
        extends javafx.scene.transform.TransformBuilder<Z, B>
{

    protected boolean hasMxx;
    protected double valMxx;

    protected boolean hasMxy;
    protected double valMxy;

    protected boolean hasMxz;
    protected double valMxz;

    protected boolean hasMyx;
    protected double valMyx;

    protected boolean hasMyy;
    protected double valMyy;

    protected boolean hasMyz;
    protected double valMyz;

    protected boolean hasMzx;
    protected double valMzx;

    protected boolean hasMzy;
    protected double valMzy;

    protected boolean hasMzz;
    protected double valMzz;

    protected boolean hasToTransform;
    protected javafx.scene.transform.Transform valToTransform;

    protected boolean hasTx;
    protected double valTx;

    protected boolean hasTy;
    protected double valTy;

    protected boolean hasTz;
    protected double valTz;

    protected boolean boundMxx;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMxx;

    protected boolean boundMxy;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMxy;

    protected boolean boundMxz;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMxz;

    protected boolean boundMyx;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMyx;

    protected boolean boundMyy;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMyy;

    protected boolean boundMyz;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMyz;

    protected boolean boundMzx;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMzx;

    protected boolean boundMzy;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMzy;

    protected boolean boundMzz;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvMzz;

    protected boolean boundTx;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvTx;

    protected boolean boundTy;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvTy;

    protected boolean boundTz;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvTz;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasMxx)
            instance.setMxx(this.valMxx);
        if (this.hasMxy)
            instance.setMxy(this.valMxy);
        if (this.hasMxz)
            instance.setMxz(this.valMxz);
        if (this.hasMyx)
            instance.setMyx(this.valMyx);
        if (this.hasMyy)
            instance.setMyy(this.valMyy);
        if (this.hasMyz)
            instance.setMyz(this.valMyz);
        if (this.hasMzx)
            instance.setMzx(this.valMzx);
        if (this.hasMzy)
            instance.setMzy(this.valMzy);
        if (this.hasMzz)
            instance.setMzz(this.valMzz);
        if (this.hasToTransform)
            instance.setToTransform(this.valToTransform);
        if (this.hasTx)
            instance.setTx(this.valTx);
        if (this.hasTy)
            instance.setTy(this.valTy);
        if (this.hasTz)
            instance.setTz(this.valTz);
        if (this.boundMxx)
            instance.mxxProperty().bind(this.obsrvMxx);
        if (this.boundMxy)
            instance.mxyProperty().bind(this.obsrvMxy);
        if (this.boundMxz)
            instance.mxzProperty().bind(this.obsrvMxz);
        if (this.boundMyx)
            instance.myxProperty().bind(this.obsrvMyx);
        if (this.boundMyy)
            instance.myyProperty().bind(this.obsrvMyy);
        if (this.boundMyz)
            instance.myzProperty().bind(this.obsrvMyz);
        if (this.boundMzx)
            instance.mzxProperty().bind(this.obsrvMzx);
        if (this.boundMzy)
            instance.mzyProperty().bind(this.obsrvMzy);
        if (this.boundMzz)
            instance.mzzProperty().bind(this.obsrvMzz);
        if (this.boundTx)
            instance.txProperty().bind(this.obsrvTx);
        if (this.boundTy)
            instance.tyProperty().bind(this.obsrvTy);
        if (this.boundTz)
            instance.tzProperty().bind(this.obsrvTz);
    }

    /**
     * 設定屬性{@link Affine#setMxx}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B mxx(double value)
    {
        this.hasMxx = true;
        this.valMxx = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#setMxy}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B mxy(double value)
    {
        this.hasMxy = true;
        this.valMxy = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#setMxz}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B mxz(double value)
    {
        this.hasMxz = true;
        this.valMxz = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#setMyx}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B myx(double value)
    {
        this.hasMyx = true;
        this.valMyx = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#setMyy}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B myy(double value)
    {
        this.hasMyy = true;
        this.valMyy = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#setMyz}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B myz(double value)
    {
        this.hasMyz = true;
        this.valMyz = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#setMzx}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B mzx(double value)
    {
        this.hasMzx = true;
        this.valMzx = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#setMzy}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B mzy(double value)
    {
        this.hasMzy = true;
        this.valMzy = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#setMzz}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B mzz(double value)
    {
        this.hasMzz = true;
        this.valMzz = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#setToTransform}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B toTransform(javafx.scene.transform.Transform value)
    {
        this.hasToTransform = true;
        this.valToTransform = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#setTx}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B tx(double value)
    {
        this.hasTx = true;
        this.valTx = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#setTy}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B ty(double value)
    {
        this.hasTy = true;
        this.valTy = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#setTz}
     *
     * @param value 新的屬性值
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B tz(double value)
    {
        this.hasTz = true;
        this.valTz = value;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#mxxProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMxx(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMxx = true;
        this.obsrvMxx = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#mxyProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMxy(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMxy = true;
        this.obsrvMxy = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#mxzProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMxz(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMxz = true;
        this.obsrvMxz = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#myxProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMyx(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMyx = true;
        this.obsrvMyx = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#myyProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMyy(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMyy = true;
        this.obsrvMyy = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#myzProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMyz(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMyz = true;
        this.obsrvMyz = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#mzxProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMzx(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMzx = true;
        this.obsrvMzx = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#mzyProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMzy(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMzy = true;
        this.obsrvMzy = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#mzzProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindMzz(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundMzz = true;
        this.obsrvMzz = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#txProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindTx(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundTx = true;
        this.obsrvTx = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#tyProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindTy(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundTy = true;
        this.obsrvTy = source;
        return (B) this;
    }

    /**
     * 設定屬性{@link Affine#tzProperty}的連結
     *
     * @param value 新的屬性連結(單向)
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B bindTz(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundTz = true;
        this.obsrvTz = source;
        return (B) this;
    }

    /**
     * 建構{@link Affine}物件
     *
     * @return 新的{@link Affine}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Affine build()
    {
        Affine instance = new Affine();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
