// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

/**
 * {@link TreeTablePosition}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class TreeTablePositionBuilder<S extends java.lang.Object, T extends java.lang.Object, Z extends TreeTablePosition<S, T>, B extends TreeTablePositionBuilder<S, T, Z, B>>
        extends javafx.scene.control.TablePositionBaseBuilder<javafx.scene.control.TreeTableColumn<S, T>, Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link TreeTablePosition}物件
     *
     * @return 新的{@link TreeTablePosition}物件實體
     */
    @SuppressWarnings("unchecked")
    public TreeTablePosition<S, T> build(javafx.scene.control.TreeTableView<S> arg0, int arg1, javafx.scene.control.TreeTableColumn<S, T> arg2)
    {
        TreeTablePosition<S, T> instance = new TreeTablePosition<S, T>(arg0, arg1, arg2);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
