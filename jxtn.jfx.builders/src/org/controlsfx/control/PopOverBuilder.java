// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.control;

/**
 * {@link PopOver}建構器
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.0.6.jar
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class PopOverBuilder<Z extends PopOver, B extends PopOverBuilder<Z, B>>
        extends javafx.scene.control.PopupControlBuilder<Z, B>
{
    private boolean applied;

    protected boolean hasArrowIndent;
    protected double valArrowIndent;

    protected boolean hasArrowLocation;
    protected org.controlsfx.control.PopOver.ArrowLocation valArrowLocation;

    protected boolean hasArrowSize;
    protected double valArrowSize;

    protected boolean hasContentNode;
    protected javafx.scene.Node valContentNode;

    protected boolean hasCornerRadius;
    protected double valCornerRadius;

    protected boolean hasDetachable;
    protected boolean valDetachable;

    protected boolean hasDetached;
    protected boolean valDetached;

    protected boolean hasDetachedTitle;
    protected java.lang.String valDetachedTitle;

    protected boolean boundArrowIndent;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvArrowIndent;

    protected boolean boundArrowLocation;
    protected javafx.beans.value.ObservableValue<? extends org.controlsfx.control.PopOver.ArrowLocation> obsrvArrowLocation;

    protected boolean boundArrowSize;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvArrowSize;

    protected boolean boundContentNode;
    protected javafx.beans.value.ObservableValue<? extends javafx.scene.Node> obsrvContentNode;

    protected boolean boundCornerRadius;
    protected javafx.beans.value.ObservableValue<? extends Double> obsrvCornerRadius;

    protected boolean boundDetachable;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvDetachable;

    protected boolean boundDetached;
    protected javafx.beans.value.ObservableValue<? extends Boolean> obsrvDetached;

    protected boolean boundDetachedTitle;
    protected javafx.beans.value.ObservableValue<? extends String> obsrvDetachedTitle;
    public void applyTo(PopOver instance)
    {
        super.applyTo(instance);
        if (this.applied)
            throw new IllegalStateException();
        if (this.hasArrowIndent)
            instance.setArrowIndent(this.valArrowIndent);
        if (this.hasArrowLocation)
            instance.setArrowLocation(this.valArrowLocation);
        if (this.hasArrowSize)
            instance.setArrowSize(this.valArrowSize);
        if (this.hasContentNode)
            instance.setContentNode(this.valContentNode);
        if (this.hasCornerRadius)
            instance.setCornerRadius(this.valCornerRadius);
        if (this.hasDetachable)
            instance.setDetachable(this.valDetachable);
        if (this.hasDetached)
            instance.setDetached(this.valDetached);
        if (this.hasDetachedTitle)
            instance.setDetachedTitle(this.valDetachedTitle);
        if (this.boundArrowIndent)
            instance.arrowIndentProperty().bind(this.obsrvArrowIndent);
        if (this.boundArrowLocation)
            instance.arrowLocationProperty().bind(this.obsrvArrowLocation);
        if (this.boundArrowSize)
            instance.arrowSizeProperty().bind(this.obsrvArrowSize);
        if (this.boundContentNode)
            instance.contentNodeProperty().bind(this.obsrvContentNode);
        if (this.boundCornerRadius)
            instance.cornerRadiusProperty().bind(this.obsrvCornerRadius);
        if (this.boundDetachable)
            instance.detachableProperty().bind(this.obsrvDetachable);
        if (this.boundDetached)
            instance.detachedProperty().bind(this.obsrvDetached);
        if (this.boundDetachedTitle)
            instance.detachedTitleProperty().bind(this.obsrvDetachedTitle);
        //
        this.applied = true;
    }

    @SuppressWarnings("unchecked")
    public B arrowIndent(double value)
    {
        this.hasArrowIndent = true;
        this.valArrowIndent = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B arrowLocation(org.controlsfx.control.PopOver.ArrowLocation value)
    {
        this.hasArrowLocation = true;
        this.valArrowLocation = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B arrowSize(double value)
    {
        this.hasArrowSize = true;
        this.valArrowSize = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B contentNode(javafx.scene.Node value)
    {
        this.hasContentNode = true;
        this.valContentNode = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B cornerRadius(double value)
    {
        this.hasCornerRadius = true;
        this.valCornerRadius = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B detachable(boolean value)
    {
        this.hasDetachable = true;
        this.valDetachable = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B detached(boolean value)
    {
        this.hasDetached = true;
        this.valDetached = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B detachedTitle(java.lang.String value)
    {
        this.hasDetachedTitle = true;
        this.valDetachedTitle = value;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindArrowIndent(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundArrowIndent = true;
        this.obsrvArrowIndent = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindArrowLocation(javafx.beans.value.ObservableValue<? extends org.controlsfx.control.PopOver.ArrowLocation> source)
    {
        assert (source != null);
        this.boundArrowLocation = true;
        this.obsrvArrowLocation = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindArrowSize(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundArrowSize = true;
        this.obsrvArrowSize = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindContentNode(javafx.beans.value.ObservableValue<? extends javafx.scene.Node> source)
    {
        assert (source != null);
        this.boundContentNode = true;
        this.obsrvContentNode = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindCornerRadius(javafx.beans.value.ObservableValue<? extends Double> source)
    {
        assert (source != null);
        this.boundCornerRadius = true;
        this.obsrvCornerRadius = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindDetachable(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundDetachable = true;
        this.obsrvDetachable = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindDetached(javafx.beans.value.ObservableValue<? extends Boolean> source)
    {
        assert (source != null);
        this.boundDetached = true;
        this.obsrvDetached = source;
        return (B) this;
    }

    @SuppressWarnings("unchecked")
    public B bindDetachedTitle(javafx.beans.value.ObservableValue<? extends String> source)
    {
        assert (source != null);
        this.boundDetachedTitle = true;
        this.obsrvDetachedTitle = source;
        return (B) this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PopOver build()
    {
        PopOver instance = new PopOver();
        this.applyTo(instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
