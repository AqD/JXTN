// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link Polyline}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PolylineBuilder<Z extends Polyline, B extends PolylineBuilder<Z, B>>
        extends javafx.scene.shape.ShapeBuilder<Z, B>
{

    protected boolean hasPoints;
    protected java.util.Collection<java.lang.Double> valPoints;

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
        if (this.hasPoints)
            instance.getPoints().setAll(this.valPoints);
    }

    /**
     * 設定集合屬性{@link Polyline#getPoints}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SuppressWarnings("unchecked")
    public B points(java.util.Collection<java.lang.Double> value)
    {
        this.hasPoints = true;
        this.valPoints = value;
        return (B) this;
    }

    /**
     * 設定集合屬性{@link Polyline#getPoints}的內容
     *
     * @param value 新的集合內容
     * @return 目前的建構器(this)
     */
    @SafeVarargs
    @SuppressWarnings("unchecked")
    public final B points(java.lang.Double... value)
    {
        this.hasPoints = true;
        this.valPoints = java.util.Arrays.asList(value);
        return (B) this;
    }

    /**
     * 建構{@link Polyline}物件
     *
     * @return 新的{@link Polyline}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public Polyline build()
    {
        Polyline instance = new Polyline();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
