// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link GridCell}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6_20.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class GridCellBuilder<T extends java.lang.Object, Z extends GridCell<T>, B extends GridCellBuilder<T, Z, B>>
        extends javafx.scene.control.IndexedCellBuilder<T, Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link GridCell}物件
     *
     * @return 新的{@link GridCell}物件實體
     */
    @Override
    @SuppressWarnings("unchecked")
    public GridCell<T> build()
    {
        GridCell<T> instance = new GridCell<T>();
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
