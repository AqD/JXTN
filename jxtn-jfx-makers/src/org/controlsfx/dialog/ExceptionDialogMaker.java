// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package org.controlsfx.dialog;

/**
 * {@link ExceptionDialog}建構器。
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version controlsfx-8.40.12.jar
 * @param <Z> 要建構的物件型態(需繼承{@link ExceptionDialog})
 * @param <B> 建構器本身的型態(需繼承{@link ExceptionDialogMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public class ExceptionDialogMaker<Z extends ExceptionDialog, B extends ExceptionDialogMaker<Z, B>>
        extends javafx.scene.control.DialogMaker<javafx.scene.control.ButtonType, Z, B>
        implements ExceptionDialogMakerExt<Z, B>
{

    @Override
    public void applyTo(Z instance)
    {
        super.applyTo(instance);
    }

    /**
     * 建構{@link ExceptionDialog}物件。
     *
     * @return 新的{@link ExceptionDialog}物件實體
     */
    @SuppressWarnings("unchecked")
    public ExceptionDialog build(java.lang.Throwable arg0)
    {
        ExceptionDialog instance = new ExceptionDialog(arg0);
        this.applyTo((Z) instance);
        this.doAfterBuild((Z) instance);
        return instance;
    }
}
