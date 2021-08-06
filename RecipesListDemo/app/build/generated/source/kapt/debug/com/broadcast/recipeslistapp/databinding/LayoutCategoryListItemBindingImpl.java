package com.broadcast.recipeslistapp.databinding;
import com.broadcast.recipeslistapp.R;
import com.broadcast.recipeslistapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutCategoryListItemBindingImpl extends LayoutCategoryListItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutCategoryListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private LayoutCategoryListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[0]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.cardView.setTag(null);
        this.categoryImage.setTag(null);
        this.categoryTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.recipe == variableId) {
            setRecipe((com.broadcast.recipeslistapp.models.Recipe) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRecipe(@Nullable com.broadcast.recipeslistapp.models.Recipe Recipe) {
        updateRegistration(0, Recipe);
        this.mRecipe = Recipe;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.recipe);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeRecipe((com.broadcast.recipeslistapp.models.Recipe) object, fieldId);
        }
        return false;
    }
    private boolean onChangeRecipe(com.broadcast.recipeslistapp.models.Recipe Recipe, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String recipeImageUrl = null;
        java.lang.String recipeTitle = null;
        com.broadcast.recipeslistapp.models.Recipe recipe = mRecipe;

        if ((dirtyFlags & 0x3L) != 0) {



                if (recipe != null) {
                    // read recipe.image_url
                    recipeImageUrl = recipe.getImage_url();
                    // read recipe.title
                    recipeTitle = recipe.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.broadcast.recipeslistapp.util.BindingAdapterKt.loadImage(this.categoryImage, recipeImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.categoryTitle, recipeTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): recipe
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}