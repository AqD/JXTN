// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link ClosePath}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ClosePathBuilder<Z extends ClosePath, B extends ClosePathBuilder<Z, B>>
        extends javafx.scene.shape.PathElementBuilder<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link ClosePath}物件
     *
     * @return 新的{@link ClosePath}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public ClosePath build()
    {
        ClosePath instance = new ClosePath();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
