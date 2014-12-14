// @formatter:off
/*
 * Unlicensed, generated by javafx.ftl
 */

package javafx.scene.control;

import java.util.Collection;

import javafx.scene.Node;
import javafx.stage.Modality;
import javafx.stage.StageStyle;
import javafx.stage.Window;

/**
 * {@link Dialog}建構器延伸（供客製化）
 *
 * @author JarReflectionDataLoader-1.0.0
 * @version openjfx-dialogs-1.0.2.jar
 * @param <Z> 要建構的物件型態(需繼承{@link Dialog})
 * @param <B> 建構器本身的型態(需繼承{@link DialogMaker})
 */
@javax.annotation.Generated("Generated by javafx.ftl")
@SuppressWarnings("all")
public interface DialogMakerExt<R extends java.lang.Object, Z extends Dialog<R>, B extends DialogMaker<R, Z, B>>
        extends jxtn.jfx.makers.AbstractMakerExt<Z, B>
{
    default B buttonTypes(Collection<? extends ButtonType> buttonTypes)
    {

        this.self().afterBuild(d -> d.getDialogPane().getButtonTypes().addAll(buttonTypes));
        return this.self();
    }

    default B buttonTypes(ButtonType... buttonTypes)
    {

        this.self().afterBuild(d -> d.getDialogPane().getButtonTypes().addAll(buttonTypes));
        return this.self();
    }

    default B content(Node content)
    {

        this.self().afterBuild(d -> d.getDialogPane().setContent(content));
        return this.self();
    }

    default B expandableContent(Node content)
    {

        this.self().afterBuild(d -> d.getDialogPane().setExpandableContent(content));
        return this.self();
    }

    default B modality(Modality modality)
    {
        this.self().afterBuild(d -> d.initModality(modality));
        return this.self();
    }

    default B owner(Window window)
    {
        this.self().afterBuild(d -> d.initOwner(window));
        return this.self();
    }

    default B style(StageStyle style)
    {
        this.self().afterBuild(d -> d.initStyle(style));
        return this.self();
    }
}
