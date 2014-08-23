// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.shape;

/**
 * {@link MeshView}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version jfxrt.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class MeshViewBuilder<Z extends MeshView, B extends MeshViewBuilder<Z, B>>
        extends javafx.scene.shape.Shape3DBuilder<Z, B>
{
    private boolean applied;

    protected boolean hasMesh;
    protected javafx.scene.shape.Mesh valMesh;

    protected boolean boundMesh;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.shape.Mesh> obsrvMesh;
    public void applyTo(MeshView instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        if (this.hasMesh)
            instance.setMesh(this.valMesh);
        if (this.boundMesh)
            instance.meshProperty().bind(this.obsrvMesh);
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public B mesh(javafx.scene.shape.Mesh value)
    {
        this.hasMesh = true;
        this.valMesh = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindMesh(javafx.beans.value.ObservableValue<? extends javafx.scene.shape.Mesh> source)
    {
        assert (source != null);
        this.boundMesh = true;
        this.obsrvMesh = source;
        return (B) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MeshView build()
    {
        MeshView instance = new MeshView();
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
